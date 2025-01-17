package ch08.generic;


public class GenericTest {
	public static void main(String[] args) {

		Apple apple = new Apple("한국",2000);
		Apple banana = new Apple("일본",3000);
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box2.setFruit(banana);
		System.out.println(box2.getFruit());
	}
}
