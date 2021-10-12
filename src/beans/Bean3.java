package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bean3 {
	private String string3 = "";
	private String string4 = null;
	private int int5 = 0;
	private Double double6 = new Double(0);
	private Double double7 = null;
	private List<Integer> listInteger;
	private List<Bean1> listBean1;
	private Map<Integer, String> map;
	private Map<Integer, Bean1> map2;
	private Set<Bean1> map3;
	
	
	

	public Set<Bean1> getMap3() {
		return map3;
	}

	public void setMap3(Set<Bean1> map3) {
		this.map3 = map3;
	}

	public Map<Integer, Bean1> getMap2() {
		return map2;
	}

	public void setMap2(Map<Integer, Bean1> map2) {
		this.map2 = map2;
	}

	public List<Bean1> getListBean1() {
		return listBean1;
	}

	public void setListBean1(List<Bean1> listBean1) {
		this.listBean1 = listBean1;
	}

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
		return "Bean3 [string3=" + string3 + ", string4=" + string4 + ", int5=" + int5 + ", double6=" + double6
				+ ", double7=" + double7 + ", listInteger=" + listInteger + ", listBean1=" + listBean1 + ", map=" + map
				+ ", map2=" + map2 + ", map3=" + map3 + "]";
	}

}
