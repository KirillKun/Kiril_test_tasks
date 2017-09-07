import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;
	private static int nextId = 1;

	public Student(int id, String fullName, Date birthDate, double avgMark) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = nextId;
		nextId++;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {

	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {

	}

	public double getAvgMark() {
		return AvgMark;

	}

	public void setAvgMark(double avgMark) {
		
	}

	@Override
	public boolean equals(Object o) {

	}

	@Override
	public int hashCode() {

	}

	@Override
	public int compareTo(Object o) {

	}
}