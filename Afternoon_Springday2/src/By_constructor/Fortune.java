package By_constructor;

public class Fortune
{

	private int Regid;
	private String iname;
	private String add;
	private Fortune_staff ft;
	
	
	public int getRegid() {
		return Regid;
	}
	public void setRegid(int regid) {
		Regid = regid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Fortune_staff getFt() {
		return ft;
	}
	public void setFt(Fortune_staff ft) {
		this.ft = ft;
	}
	
	
	public void disp()
	{
		
		System.out.println("Company id is :"+Regid );
		System.out.println("Company name is :"+iname );
		System.out.println("Company location is :"+add );
		
		
		System.out.println("Teacher id is "+ft.getTid());
		System.out.println("Teacher name is "+ft.getTname());
		System.out.println("Teacher Salary is "+ft.getTsal());
		

		System.out.println("Student id is :"+ft.getFs().getSid());
		System.out.println("Student name is :"+ft.getFs().getSname());
		System.out.println("Student batch is :"+ft.getFs().getBatch());
		System.out.println("Student domain is :"+ft.getFs().getDomain());

	}
	
	
	
}
