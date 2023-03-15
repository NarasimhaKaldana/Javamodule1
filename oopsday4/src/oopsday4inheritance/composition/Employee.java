package oopsday4inheritance.composition;

public class Employee extends Person{

	  private long empId;
	  private String deptno;
	  private double salary;
	  private Address residenceAddress;
	  private Address correspondenceAddress;
	  public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(long empId, String deptno, double salary) {
		super();
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String gender, int age,long empId,String deptno,double salary) {
		super(name, gender, age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
		
	}@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Employee ref = null;
		if(obj != null)
			ref = (Employee) obj;
		
		if(this.getEmpId() == ref.empId && this.getName().equals(ref.getName()) && this.getDeptno() == ref.deptno)
			return true;
		else
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code = this.hashCode()*32*((int)this.empId)*(this.getName().length())*this.deptno.length();
		return super.hashCode();
	}
}
