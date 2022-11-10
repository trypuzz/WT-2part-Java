package thirdLab.server.dao;

import java.util.List;

import by.bsuir.vt3.beans.StudentFile;

public interface StudentFileDao {
	
	List<StudentFile> getAll();
	StudentFile get(int StudentId);
	boolean add(StudentFile student);
	boolean edit(StudentFile changedStudent);
}
