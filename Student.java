package day7collection;

public class Student implements Comparable<Student>{

	private int rno; // Data member1 Instance Variable
	private String sname; // Data member2 Instance Variable
	private double per; // Data member3 Instance Variable

	public Student() {
	}

	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	static void demo() {
		System.out.println("hi");
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		if(per<o.getPer())
//			return 1;
//		else if(per>o.per)
//			return -1;
//		else 
//		return 0;
//	}
	
	@Override
	public int compareTo(Student o) {
		return sname.compareTo(o.getSname());
	}

}
