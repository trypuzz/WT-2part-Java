package thirdLab.server.service;

import java.util.List;
import by.bsuir.vt3.beans.*;

public interface ServerService {
	String login(String userame, String password);
	AccountType getAccountType(String authToken);
	void logout(String authToken);
	List<StudentFile> getAll();
	StudentFile get(int id);
	boolean add(StudentFile student);
	boolean edit(StudentFile changedStudent);
}
