class Employee extends Person
{
	private double annualSalary;
	private int joiningYear;
	private String nationalInsuranceNo;
	Employee(String name,double annualSalary,int joiningYear,String nationalInsuranceNo)
	{
		super(name);
		setAnnualSalary(annualSalary);
		setJoiningYear(joiningYear);
		setNationalInsuranceNo(nationalInsuranceNo);
	}
	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary=annualSalary;
	}
	public void setJoiningYear(int joiningYear)
	{
		this.joiningYear=joiningYear;
	}
	public void setNationalInsuranceNo(String nationalInsuranceNo)
	{
		this.nationalInsuranceNo=nationalInsuranceNo;
	}
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	public int getJoiningYear()
	{
		return joiningYear;
	}
	public String getNationalInsuranceNo()
	{
		return nationalInsuranceNo;
	}
	public String display()
	{
		return "Name :"+getName()+"\nAnnual Salary :"+getAnnualSalary()+"\nJoining Year :"+getJoiningYear()+"\nNational Insurance Number :"+getNationalInsuranceNo();
	}
}