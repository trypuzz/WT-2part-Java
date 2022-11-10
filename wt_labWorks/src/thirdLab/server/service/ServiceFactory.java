package thirdLab.server.service;

import by.bsuir.vt3.server.service.impl.*;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	private final ServerService serverService = new ServerServiceImpl();
	
	private ServiceFactory() {}
	
	public ServerService getServerService() {
		return serverService;
	}
	
	public static ServiceFactory getInstance() {
		return instance;
	}
}

