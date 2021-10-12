package beans;

import java.util.List;

public class Bean1 {
	private String string1 = "";
	private String string2 = null;
	private int int1 = 0;
	private Double double1 = Double.valueOf(0);
	private Double double2 =null;
	private List<String> listString;
	private Bean2 bean2;
	private List<Bean2> listBean2;
	private boolean active;
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Bean2> getListBean2() {
		return listBean2;
	}

	public void setListBean2(List<Bean2> listBean2) {
		this.listBean2 = listBean2;
	}

	public Bean2 getBean2() {
		return bean2;
	}

	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}

	public Bean1(String string1, String string2, int int1, Double double1, Double double2, List<String> listString) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.int1 = int1;
		this.double1 = double1;
		this.double2 = double2;
		this.listString = listString;
	}
	
	public Bean1() {
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public int getInt1() {
		return int1;
	}
	public void setInt1(int int1) {
		this.int1 = int1;
	}
	public Double getDouble1() {
		return double1;
	}
	public void setDouble1(Double double1) {
		this.double1 = double1;
	}
	public Double getDouble2() {
		return double2;
	}
	public void setDouble2(Double double2) {
		this.double2 = double2;
	}
	public List<String> getListString() {
		return listString;
	}
	public void setListString(List<String> listString) {
		this.listString = listString;
	}

	@Override
	public String toString() {
		return "Bean1 [string1=" + string1 + ", string2=" + string2 + ", int1=" + int1 + ", double1=" + double1
				+ ", double2=" + double2 + ", listString=" + listString + ", bean2=" + bean2 + ", listBean2="
				+ listBean2 + ", active=" + active + "]";
	}



	
	
}
