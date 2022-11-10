package thirdLab.beans;

import java.io.*;


@SuppressWarnings("serial")
public class Response implements Serializable {
	private ResponseType responseType;
	private RequestType requestType;
	private String responseMessage;
	private String[] params;
	private StudentFile[] students;
	
	public Response() {
		this.responseMessage = null;
		this.responseType = null;
		this.params = null;
		this.students = null;
	}
	
	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	public String[] getParams() {
		return params;
	}

	public void setParams(String[] params) {
		this.params = params;
	}

	public StudentFile[] getStudents() {
		return students;
	}

	public void setStudents(StudentFile[] students) {
		this.students = students;
	}
}
