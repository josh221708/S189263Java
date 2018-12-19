package task;

import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import http.GetRequester;

public class TaskUrlReqester {
	
	public JsonArray retreveTaskUrls (String studentid ) throws IOException{
		
	
GetRequester requester = new GetRequester();
// {"id":"s189263","tasks":["/task/7805","/task/4839","/task/3590","/task/6939","/task/8283","/task/1876","/task/7207","/task/3767","/task/9078","/task/4456"]}
String initialconnection = requester.sendGetRequest("/student?id="+studentid);


JsonParser jsonParser = new JsonParser();
JsonElement firstrespose = jsonParser.parse(initialconnection);
JsonObject firstresposeobject = firstrespose.getAsJsonObject();
JsonArray taskurls = firstresposeobject.get("tasks").getAsJsonArray();
return taskurls;
	}
}
