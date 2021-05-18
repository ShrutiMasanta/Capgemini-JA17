package personandsubclasses;

public class Staff extends Person {
	
	String school;
	double pay;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [Name="+getName()+"Address="+getAddress()+"school=" + school + ", pay=" + pay + "]";
	}

}
