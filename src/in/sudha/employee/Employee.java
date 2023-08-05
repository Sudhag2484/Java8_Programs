package in.sudha.employee;

public class Employee {
	int id;
	String name;
	String gender;
	int age;
	double sal;
	int yearOfJoin;
	String dept;
	
	public Employee(int id, String name,  int age,String gender,String dept, int yearOfJoin,double sal ) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.sal = sal;
		this.yearOfJoin = yearOfJoin;
		this.dept = dept;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", sal=" + sal
				+ ", yearOfJoin=" + yearOfJoin + ", dept=" + dept + "]";
	}
	

}
