
public class Session4Assignment3 {

	public static void main(String[] args) {

		Employees e1=new Employees();
		e1.setEmpName("Employee 1");
		e1.setEmpCode("E0001");
		e1.setEmpMobile("1234567890");
; 
		System.out.println("Details of First Employee are :-> \nName : "+e1.getEmpName()+"\n"+"Code : "+e1.getEmpCode()+"\n"+"Mobile : " + e1.getEmpMobile());
	}

}

class Employees
{
	private String EmpName;
	private String EmpCode;
	private String EmpMobile;
	
	public String getEmpName()
	{
		return EmpName;
	}
	public void setEmpName(String value)
	{
		EmpName=value;
	}
	
	public String getEmpCode()
	{
		return EmpCode;
	}
	public void setEmpCode(String value)
	{
		EmpCode=value;
	}
	
	public String getEmpMobile()
	{
		return EmpMobile;
	}
	public void setEmpMobile(String value)
	{
		EmpMobile=value;
	}
	
	
}
