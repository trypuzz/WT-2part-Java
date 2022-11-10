package thirdLab.server.controller.impl;

import java.util.*;

import by.bsuir.vt3.beans.*;
import by.bsuir.vt3.server.controller.*;
import by.bsuir.vt3.server.service.*;

public class ServerControllerImpl implements ServerController {
	private Random rand = new Random();
	
	@Override
	public Response action(Request request) {
		ServerService serverService = ServiceFactory.getInstance().getServerService();
		if(request == null || request.getRequestType() == null) {
			return constructFailResponse(null, "Incorrect request or request type.");
		}
		
		switch(request.getRequestType()) {
		
		case LOGIN: {
			String[] params = request.getParams();
			if(params == null || params.length != 2) {
				return constructFailResponse(RequestType.LOGIN,"Incorrect request parameters.");
			}
			String newToken = serverService.login(params[0], params[1]);
			if(newToken == null) {
				return constructFailResponse(RequestType.LOGIN,"Incorrect login or password.");
			}
			Response response = constructPassResponse(RequestType.LOGIN, "Logged in.");
			response.setParams(new String[] {newToken});
			return response;
		} 
		
		case LOGOUT: {
			String authToken = request.getAuthToken();
			if(authToken == null) {
				return constructFailResponse(RequestType.LOGOUT,"Incorrect authentication token.");
			}
			serverService.logout(authToken);
			return constructPassResponse(RequestType.LOGOUT, "Logged out.");
		} 
		
		case GET: {
			String[] params = request.getParams();
			AccountType accountType = serverService.getAccountType(request.getAuthToken());
			if(accountType == null) {
				return constructFailResponse(RequestType.GET, "Incorrect authentication token.");
			}
			try {
				StudentFile student = serverService.get(Integer.parseInt(params[0]));
				if(student == null) {
					return constructFailResponse(RequestType.GET, "Student with given id wasn't found.");
				}
				Response response = constructPassResponse(RequestType.GET, "Student found:");
				response.setStudents(new StudentFile[] {student});
				return response;
			} catch(NullPointerException | NumberFormatException e) {
				return constructFailResponse(RequestType.GET, "Incorrect request parameter.");
			}
		}
		case GET_ALL:{
			AccountType accountType = serverService.getAccountType(request.getAuthToken());
			if(accountType == null) {
				return constructFailResponse(RequestType.GET_ALL, "Incorrect authentication token.");
			}
			try {
				List<StudentFile> students = serverService.getAll();
				Response response = constructPassResponse(RequestType.GET_ALL, "Students:");
				response.setStudents(students.toArray(new StudentFile[0]));
				return response;
			} catch (NullPointerException e) {
				return constructFailResponse(RequestType.GET_ALL, "Data error.");
			}
		}
			
		case ADD:{
			AccountType accountType = serverService.getAccountType(request.getAuthToken());
			if(accountType == null) {
				return constructFailResponse(RequestType.ADD, "Incorrect authentication token.");
			} else if(accountType != AccountType.ADMIN) {
				return constructFailResponse(RequestType.ADD, "Insufficient permissions.");
			}
			
			//bandages
			StudentFile student = request.getStudent();
			student.setId(rand.nextInt(0,Integer.MAX_VALUE));
			if(serverService.add(student)) {
				return constructPassResponse(RequestType.ADD, "Student added.");
			}
			return constructFailResponse(RequestType.ADD, "Failed to add student.");
		}
			
		case EDIT:{
			AccountType accountType = serverService.getAccountType(request.getAuthToken());
			if(accountType == null) {
				return constructFailResponse(RequestType.EDIT, "Incorrect authentication token.");
			} else if(accountType != AccountType.ADMIN) {
				return constructFailResponse(RequestType.EDIT, "Insufficient permissions.");
			}
			
			if(serverService.edit(request.getStudent())) {
				return constructPassResponse(RequestType.EDIT, "Student edited.");
			}
			return constructFailResponse(RequestType.EDIT, "Failed to edit student.");
		}
			
		default:
			return constructFailResponse(null, "Incorrect request or request type.");
		}
	}
	
	private Response constructFailResponse(RequestType requestType, String failMessage) {
		var response = new Response();
		response.setRequestType(requestType);
		response.setResponseType(ResponseType.FAIL);
		response.setResponseMessage(failMessage);
		return response;
	}
	
	private Response constructPassResponse(RequestType requestType, String passMessage) {
		var response = new Response();
		response.setRequestType(requestType);
		response.setResponseType(ResponseType.PASS);
		response.setResponseMessage(passMessage);
		return response;
	}
}
