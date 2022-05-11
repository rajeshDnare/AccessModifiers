package AccessModPack01;

public class AccessModClass021 extends AccessModClass01 { //child class within same package
	public static void main(String[] args) {
		AccessModClass01 p = new AccessModClass01();
		System.out.println(p.a);
//		System.out.println(p.b); //private variables are not accessible outside the class
		System.out.println(p.c);
		System.out.println(p.d);

		p.print01();
//		p.print02(); //private methods are not accessible outside the class
		p.print03();
		p.print04();
	}

}
