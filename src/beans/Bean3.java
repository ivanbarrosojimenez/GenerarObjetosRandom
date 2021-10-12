package beans;

import java.util.List;
import java.util.Map;

public class Bean3 {
	private String string3 = "";
	private String string4 = null;
	private int int5 = 0;
	private Double double6 = new Double(0);
	private Double double7 =null;
	private List<Integer> listInteger;
	private Map<Integer, String> map;
	
	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public List<Integer> getListInteger() {
		return listInteger;
	}


	public void setListInteger(List<Integer> listInteger) {
		this.listInteger = listInteger;
	}


	public Bean3() {
	}


	public String getString3() {
		return string3;
	}


	public void setString3(String string3) {
		this.string3 = string3;
	}


	public String getString4() {
		return string4;
	}


	public void setString4(String string4) {
		this.string4 = string4;
	}


	public int getInt5() {
		return int5;
	}


	public void setInt5(int int5) {
		this.int5 = int5;
	}


	public Double getDouble6() {
		return double6;
	}


	public void setDouble6(Double double6) {
		this.double6 = double6;
	}


	public Double getDouble7() {
		return double7;
	}


	public void setDouble7(Double double7) {
		this.double7 = double7;
	}


	@Override
	public String toString() {
		return "Bean2 [string3=" + string3 + ", string4=" + string4 + ", int5=" + int5 + ", double6=" + double6
				+ ", double7=" + double7 + ", listInteger=" + listInteger + "]";
	}




	
	

	
	
}
