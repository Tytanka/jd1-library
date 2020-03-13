package by.htp.library.dao.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

import by.htp.library.bean.User;
import by.htp.library.dao.DaoException;
import by.htp.library.dao.UserDao;

public class FileUserDao implements UserDao{
	private final static String PATH1 = "src/resources/users.txt";
	
	
	@Override
	public boolean authorization(String login, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registration(User user) throws DaoException{
			 
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(PATH1), true)))) {
		

	            pw.printf("\n%s %s;","логин" +user.getLogin(),"пароль"+ user.getPassword());

	            return true;

	        } catch (IOException e) {
	            throw new DaoException("Impossible to write to this file!");
	        }
	    }

	  
	    public String getFullFile() throws DaoException {
	        try {
	            return readFile();
	        } catch (IOException e) {
	            throw new DaoException("Impossible to read this file");
	        }
	    }

	    private String readFile() throws IOException {

	        StringBuilder stringBuilder = new StringBuilder();

	        try(BufferedReader  bufferedReader = new BufferedReader(new FileReader(PATH1))) {

	            String tmp;
	            while ((tmp = bufferedReader.readLine()) != null)
	                stringBuilder.append(tmp);
	        }

	        return  stringBuilder.toString();
	    }



	@Override
	public boolean changeUserStatus(int idUser, String newStatus) {
		// TODO Auto-generated method stub
		return false;
	}

}
