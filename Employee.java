package springbootproject2;

//create a project of employee showing constructor injection (empid, empname, designation)


public class Employee //class name
{
  private int empid;   //data members
  private String empname;
  private String designation;

  public Employee(int empid, String empname, String designation)//we use constructors
  {
      this.empid = empid;
      this.empname = empname;
      this.designation = designation;
  }

//we use getter and setter in this
  
	public int getEmpid()
	{
		return empid;
	}

	public void setEmpid(int empid)
	{
		this.empid = empid;
	}

	public String getEmpname()
	{
		return empname;
	}

	public void setEmpname(String empname)
	{
		this.empname = empname;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	void display()
	{  
	    System.out.println(empid+" "+empname+" "+designation);  
	}  
}
	
	
	

