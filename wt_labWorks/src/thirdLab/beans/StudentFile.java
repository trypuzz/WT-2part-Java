package thirdLab.beans;

import java.io.Serializable;
import jakarta.xml.bind.annotation.*;

@SuppressWarnings("serial")
@XmlRootElement(name="student")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentFile implements Serializable {
	@XmlElement
	private int id;
	@XmlElement
	private String name;
	@XmlElement
	private double avgGrade;
	
	public StudentFile(int id, String name, float avgGrade) {
		super();
		this.id = id;
		this.name = name;
		this.avgGrade = avgGrade;
	}
	
	public StudentFile() {
		super();
		this.id = 0;
		this.name = "NoName";
		this.avgGrade = 0.0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvgGrade() {
		return avgGrade;
	}
	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	@Override
	public String toString(){
		return String.format("Id:%d, Name:%s, Average Grade:%.2f", getId(),getName(),getAvgGrade());
	}
}
