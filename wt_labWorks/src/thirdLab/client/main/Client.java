package thirdLab.client.main;

import java.net.*;
import java.io.*;

import by.bsuir.vt3.beans.Response;
import by.bsuir.vt3.client.controller.*;
import by.bsuir.vt3.client.controller.impl.ClientControllerImpl;

public class Client extends Thread{
	private Socket sock;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;
	private int port;
	private ClientController clientController;
	
	@Override
	public void run() {
		try {
			this.setPort(6666);
			sock = new Socket("localhost", port);
			outputStream = new ObjectOutputStream(sock.getOutputStream());
			inputStream = new ObjectInputStream(sock.getInputStream());
			clientController = new ClientControllerImpl();
			while(true) {
				outputStream.writeObject(clientController.createRequest());
				clientController.processResponse((Response)inputStream.readObject());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
