package thirdLab.client.controller.impl;

import java.util.Scanner;

import by.bsuir.vt3.beans.*;
import by.bsuir.vt3.client.controller.*;

public class ClientControllerImpl implements ClientController {
	String localAuthToken;
	Scanner sc;
	
	@Override
	public Request createRequest() {
		if(sc == null) {
			sc = new Scanner(System.in);
		}
		
		if(localAuthToken == null) {
			return loginRequest();
		}
		while(true) {
			System.out.println("Choose what to do: ");
			System.out.println("1: get student with specific id.");
			System.out.println("2: get all students.");
			System.out.println("3: add new sudent.");
			System.out.println("4: edit existing student.");
			int nextRequest = sc.nextInt();
			switch (nextRequest) {
			case 1:
				return getRequest();
				
			case 2:
				return getAllRequest();
			
			case 3:
				return addRequest();
				
			case 4:
				return editRequest();
			
			default:
				System.out.println("Wrong menu option, try again.");
				break;
			}
		}
	}

	@Override
	public void processResponse(Response response) {
		ResponseType responseType = response.getResponseType();
		
		switch (response.getRequestType()) {
		case LOGIN:
			if(responseType == ResponseType.PASS) {
				localAuthToken = response.getParams()[0];
			}
			System.out.println(response.getResponseMessage());
			break;
			
		case GET: case GET_ALL:
			if(responseType == ResponseType.PASS) {
				StudentFile[] students = response.getStudents();
				System.out.println(response.getResponseMessage());
				for(StudentFile student : students) {
					System.out.println(student.toString());
				}
			} else {
				System.out.println(response.getResponseMessage());
			}
			break;
			
		case LOGOUT:
			if(responseType == ResponseType.PASS) {	
				localAuthToken = null;
			}
			System.out.println(response.getResponseMessage());
			break;
			
		case ADD: case EDIT: default:
			System.out.println(response.getResponseMessage());
			break;
		}
		
	}
	
	private Request loginRequest() {
		System.out.print("Login screen.\n Enter your username: ");
		String username = sc.nextLine();

		System.out.print("Enter password: ");
		String password = sc.nextLine();
		
		Request request = new Request();
		request.setRequestType(RequestType.LOGIN);
		request.setParams(new String[] {username, password});
		return request;
	}
	
	private Request getRequest() {
		Request request = new Request();
		request.setAuthToken(localAuthToken);
		request.setRequestType(RequestType.GET);
		System.out.print("Enter existing student id: ");
		int id = sc.nextInt();
		request.setParams(new String[] {Integer.toString(id)});
		return request;
	}
	
	private Request getAllRequest() {
		Request request = new Request();
		request.setAuthToken(localAuthToken);
		request.setRequestType(RequestType.GET_ALL);
		return request;
	}
	
	private Request addRequest() {
		Request request = new Request();
		request.setAuthToken(localAuthToken);
		request.setRequestType(RequestType.ADD);
		StudentFile student = new StudentFile();
		System.out.print("Enter student name: ");
		student.setName(sc.next());
		System.out.print("Enter student average grade: ");
		student.setAvgGrade(sc.nextDouble());
		request.setStudent(student);
		return request;
	}
	
	private Request editRequest() {
		Request request = new Request();
		request.setAuthToken(localAuthToken);
		request.setRequestType(RequestType.EDIT);
		StudentFile student = new StudentFile();
		System.out.print("Enter student id: ");
		student.setId(sc.nextInt());
		System.out.print("Enter new student name: ");
		student.setName(sc.next());
		System.out.print("Enter new student average grade: ");
		student.setAvgGrade(sc.nextDouble());
		request.setStudent(student);
		return request;
	}
}
