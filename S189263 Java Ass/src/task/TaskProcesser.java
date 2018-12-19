package task;

import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import http.GetRequester;
import http.PostRequester;

public class TaskProcesser {
private JsonParser jsonParser = new JsonParser();
private GetRequester requester = new GetRequester();

public void processurls(JsonArray taskurls) throws IOException {
String taskURL = null;

	for (JsonElement element : taskurls) {
		taskURL = processesTask( element);
}
}

 String processesTask( JsonElement element)
		throws IOException {
	String taskURL = null;
	 try {
		taskURL = element.getAsString();
		

//{"instruction":"add","parameters":[5841,7157],"response URL":"/answer/7805"}
		String firsttask = requester.sendGetRequest(taskURL);
		JsonObject firsttastrespose = jsonParser.parse(firsttask).getAsJsonObject();
		String awnserurl = firsttastrespose.get("response URL").getAsString(); // /awnser/7805
		String instuction = firsttastrespose.get("instruction").getAsString(); // add

		JsonArray parametrers = firsttastrespose.get("parameters").getAsJsonArray();
InstuctionHandler instuctionhandler = new InstuctionHandler ();
		String awnser = instuctionhandler.instuction(instuction, parametrers.get(0).getAsString(), parametrers.get(1).getAsString());
		

		PostRequester postrequester = new PostRequester();
		postrequester.sendPostRequest(awnserurl, awnser);
	} catch (IOException e) {
		System.out.println("not a vallid instuction");
		PostRequester postrequester = new PostRequester();
		postrequester.sendPostRequest(taskURL, "Error not vallid insution");
		
	} catch (IllegalStateException e) {
		System.out.println("Error Invaild Json");
		PostRequester postrequester = new PostRequester();
		postrequester.sendPostRequest(taskURL, "Error invailid Json");
	}
	return taskURL;
}
}
