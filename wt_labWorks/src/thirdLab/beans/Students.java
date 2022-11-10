package thirdLab.beans;

import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
	@XmlElements({
		@XmlElement(name="student",type = StudentFile.class),
		})
	private List<StudentFile> students;


	public List<StudentFile> getStudents() {
		return students;
	}
	public void setStudents(List<StudentFile> students) {
		this.students = students;
	}
}
