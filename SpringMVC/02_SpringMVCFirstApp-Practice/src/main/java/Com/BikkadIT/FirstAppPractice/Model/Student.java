package Com.BikkadIT.FirstAppPractice.Model;

public class Student {

	
	private int Sid;
	private String Sname;
	private String Saddress;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Saddress=" + Saddress + "]";
	}
	
	
}
