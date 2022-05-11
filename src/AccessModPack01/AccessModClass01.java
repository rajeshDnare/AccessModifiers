package AccessModPack01;

 public class AccessModClass01 {
	public int a = 5;

	public void print01() {
		System.out.println("I am public method in class 01");
	}

	private int b = 10;

	private void print02() {
		System.out.println("I am private method in class 01");
	}

	protected int c = 15;

	protected void print03() {
		System.out.println("I am protected method in class 01");
	}

	int d = 20;

	void print04() {
		System.out.println("I am default method in class 01");
	}

}
