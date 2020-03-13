package by.htp.library.controller.impl;

import by.htp.library.controller.Command;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class AuthorizationCommand implements Command{

	/*@Override
	public String execute(String request) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	 @Override
	    public String execute(String request) {
	        String response;
	        String[] array = request.split(" ");
	        if (array.length < 3) {
	            response = "Not enough information in request(Need \"command login password\")...";
	            return response;
	        }
	        String login = array[1];
	        String password = array[2];
	       

	        UserService service = ServiceProvider.getInstance().getUserService();
	        try {
	         if (!service.authorization(login, password)) {
	                response = "Welcome!";
	            } else {
	                response = "Entered login or password is incorrect.";
	            }    
	        } catch (ServiceException e) {
	          
	            response = "Something wrong...";
	      
	        }

	        return response;
	    }
	}


