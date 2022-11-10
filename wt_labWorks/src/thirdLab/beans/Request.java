package thirdLab.beans;

import java.io.*;

@SuppressWarnings("serial")
public class Request implements Serializable{
	private RequestType requestType;
	private String authToken;
	private String[] params;
	private StudentFile student;
	
	public Request() {
		this.requestType = null;
		this.authToken = null;
		this.params = null;
		this.setStudent(null);
	}

	public RequestType getRequestType() {
		return this.requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String[] getParams() {
		return params;
	}

	public void setParams(String[] params) {
		this.params = params;
	}

	public StudentFile getStudent() {
		return student;
	}

	public void setStudent(StudentFile student) {
		this.student = student;
	}
}
