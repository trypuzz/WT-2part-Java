package thirdLab.main;

import by.bsuir.vt3.client.main.*;
import by.bsuir.vt3.server.main.*;

public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		Client client = new Client();
		
		server.run();
		client.run();
	}

}
