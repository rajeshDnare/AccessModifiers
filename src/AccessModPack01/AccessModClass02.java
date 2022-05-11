package AccessModPack01;

public class AccessModClass02 { //non child class in same package

	public static void main(String[] args) {
		AccessModClass01 p = new AccessModClass01();
		System.out.println(p.a);
//		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);

		p.print01();
//		p.print02();
		p.print03();
		p.print04();

	}

}
