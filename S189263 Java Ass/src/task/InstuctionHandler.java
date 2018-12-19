package task;

import java.io.IOException;

public class InstuctionHandler {
public String instuction (String instuction,String param1, String param2) throws IOException{
	String awnser = null;
	if (instuction.equals("add")) {
		Integer sum = Integer.valueOf(param1) + Integer.valueOf(param2);
		awnser = sum.toString();
	} else if (instuction.equals("multiply")) {
		Integer product = Integer.valueOf(param1) * Integer.valueOf(param2);
		awnser = product.toString();
	}

	else if (instuction.equals("concat")) {
		
		awnser = param1 + param2;
	} else {
		throw new IOException();
		

	}
	return awnser; 
}
	
}
