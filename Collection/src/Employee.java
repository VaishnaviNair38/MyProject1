
public class Employee {
	private int EmpId;
	private String EmpName;
	private double EmpSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
	}
	public int getEmpId() {
		return EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	@Override
	public String toString() {
		return (getEmpId()+"\t"+getEmpName()+"\t"+getEmpSalary());
	}
	
	
	

}
