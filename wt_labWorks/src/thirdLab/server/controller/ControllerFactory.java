package thirdLab.server.controller;

import by.bsuir.vt3.server.controller.impl.ServerControllerImpl;

public final class ControllerFactory {
	private static final ControllerFactory instance = new ControllerFactory();
	private final ServerController serverController = new ServerControllerImpl();
	
	private ControllerFactory() {}
	
	public ServerController getServerController() {
		return serverController;
	}
	
	public static ControllerFactory getInstance() {
		return instance;
	}
}
