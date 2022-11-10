package thirdLab.server.dao;

import by.bsuir.vt3.server.dao.impl.*;

public final class DaoFactory {
	private static final DaoFactory instance = new DaoFactory();
	private final StudentFileDao studentDao = new StudentFileDaoImpl();
	private final ArchiveProfileDao archiveProfileDao = new ArchiveProfileDaoImpl();
	
	private DaoFactory() {}
	
	public StudentFileDao getStudentFileDao() {
		return studentDao;
	}
	
	public ArchiveProfileDao getArchiveProfileDao() {
		return archiveProfileDao;
	}
	
	public static DaoFactory getInstance() {
		return instance;
	}
}

