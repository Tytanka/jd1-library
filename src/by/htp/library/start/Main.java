package by.htp.library.start;

import by.htp.library.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		String request, response;
		
		request = "REGISTRATION login=aaa password=bbb name=Ivan";

		response = controller.action(request);
		
		System.out.println(response);

		request = "AUTHORIZATION login=aaa password=bbb";

		response = controller.action(request);
		
		System.out.println(response);
	
	}

}
