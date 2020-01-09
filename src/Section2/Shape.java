package Section2;

public class Shape {
	protected String shapeName;
	double calculateArea() {
		return 0.0;
	}
	public Shape() {
		super();
	}
	public Shape(String shapeName) {
		this.shapeName=shapeName;
	}
	public String getshapeName() {
		return shapeName;
	}
	public void setshapeName(String shapeName) {
		this.shapeName=shapeName;
	}

}
