import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> EmpList=new ArrayList <Employee>();
		Employee e1=new Employee(101,"Nikita",90000);
		Employee e2=new Employee(102,"Prajwal",80000);
		Employee e3=new Employee(103,"Nrupal",70000);
		
		EmpList.add(e1);
		EmpList.add(e2);
		EmpList.add(e3);
		//Display(EmpList);
	}
	
	public static void Display(List<Employee> EmpList){
		for(Employee e:EmpList)
		{
			//System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
			/*if(e.getEmpSalary()>70000)
			{
				System.out.println(e.getEmpSalary());
			}*/
			System.out.println(EmpList.toString());
		}
	}
	
	

}

