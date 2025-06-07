package ch11;

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double num);
}


public class LambdaPt {

	public static void main(String[] args) {
		
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {
			return a + b;
		};
		
		A a3 = (a, b) -> a + b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(2, 3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		B b1 = (double a) -> {
			System.out.println("a : " + a);
		};
		
		B b2 = a -> System.out.println("a : " + a);
		
		B b3 = System.out::println;
		
		b1.method(1.0);
		b2.method(2.0);
		b3.method(3.0);
		
		C c1 = () -> {
			return true;
		};
		
		C c2 = () -> false;
		
		boolean res1 = c1.method();
		boolean res2 = c2.method();
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		
		D d1 = () -> {
			System.out.println("d1 호출...");
		};
		
		D d2 = () -> System.out.println("d2 호출...");
		
		d1.method();
		d2.method();
		
 	}
}



















