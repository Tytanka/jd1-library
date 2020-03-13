package by.htp.library.controller.impl;

import java.io.IOException;

import by.htp.library.bean.User;
import by.htp.library.controller.Command;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class RegistrationCommand implements Command {

	
	@Override
	public String execute(String request) {
		String response;
		String[] array = request.split(" ");
		if (array.length < 2) {
			response = "Not enough information in request(Need \"command login numberOfAccount amount isItBlocked\")...";
			return response;
		}

		String login = array[1];
		String password = array[2];
		String name = array[3];
	
		UserService service = ServiceProvider.getInstance().getUserService();
		User user = new User(login,password);
		
		try {

			service.registration(user);

			response = "Successfully added! (" + login + ")";
		
		} catch (ServiceException e) {

			response = "Something wrong...";

		}
		return response;
	}

}
