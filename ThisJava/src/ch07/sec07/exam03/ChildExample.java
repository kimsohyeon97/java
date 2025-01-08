package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		Child child =new Child();
		Parent parent =child;
		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		//parent.field2="data2";
		//parent.method3();
		
		Child child1 = (Child) parent;
		
		child1.field2="data2";
		child1.method3();
	}

}
