package First;

public class Doctor 
{
	private int id;
	private String name;
	private String demail;
	private Pateints ps;
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
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public Pateints getPs() {
		return ps;
	}
	public void setPs(Pateints ps) {
		this.ps = ps;
	}
	
	
	public void disp()
	{
		System.out.println("Doctor id is "+id);
		System.out.println("Doctor name is "+name);
		System.out.println("doctor mail is "+demail);
		
		System.out.println("patient id is "+ps.getId());
		System.out.println("patient name is "+ps.getName());		
		System.out.println("patient desease is "+ps.getDi());

	}
}
