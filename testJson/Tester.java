package json;
public class Tester {
	private InfoType type;
	private String name;
	private boolean isStar;
	public Tester(InfoType type, String name, boolean isStar) {
		super();
		this.type = type;
		this.name = name;
		this.isStar = isStar;
	}
	
	public InfoType getType() {
		return type;
	}
	public void setType(InfoType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStar() {
		return isStar;
	}
	public void setStar(boolean isStar) {
		this.isStar = isStar;
	}
	@Override
	public String toString() {
		return "Tester [type=" + type + ", name=" + name + ", isStar=" + isStar + "]";
	}
}
