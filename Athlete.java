package day7collection;

public class Athlete {
private int jno;
private String name;
private double timing;

public Athlete() {}
public Athlete(int jno, String name, double timing) {
	this.jno = jno;
	this.name = name;
	this.timing = timing;
}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTiming() {
	return timing;
}
public void setTiming(double timing) {
	this.timing = timing;
}
@Override
public String toString() {
	return "Athlete [jno=" + jno + ", name=" + name + ", timing=" + timing + "]";
}


}
