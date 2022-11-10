package thirdLab.server.main;

import java.io.*;
import java.net.*;

public class Server extends Thread {
	private int port;
	
	@Override
	public void run() {
		startServer();
	}
	
	public void startServer() {
		this.setPort(6666);
		try (ServerSocket serverSock = new ServerSocket(port)){
			while(true) {
				Socket socket = serverSock.accept();
				ServerThread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (IOException e) {
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
