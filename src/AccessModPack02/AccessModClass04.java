package AccessModPack02;

import AccessModPack01.AccessModClass01;

public class AccessModClass04 extends AccessModClass01 { //child class outside the package

	public static void main(String[] args) {
		AccessModClass04 p = new AccessModClass04();// child class object
		System.out.println(p.a);
//		System.out.println(p.b);
		System.out.println(p.c);
//		System.out.println(p.d);

		p.print01();
//		p.print02();
		p.print03();
//		p.print04();

	}

}
