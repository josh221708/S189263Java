package task;
import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import http.GetRequester;
import http.PostRequester;

public class MainMethord {

	public static void main(String[] args) throws IOException {
		TaskUrlReqester urlreqester = new TaskUrlReqester();
		JsonArray taskurls = urlreqester.retreveTaskUrls("s189263");
		TaskProcesser processer = new TaskProcesser();
		processer.processurls(taskurls);
			
			//PrintWriter out = new parametrers 
		}
		//PrintWriter out = new PrintWriter(new FileWriter("K:\\location\\outputfile.txt"))); 
		//out.print("Hello "); 
		//out.println("world"); 
		//out.close();
	// code fixed - 19/12/18
	
}
