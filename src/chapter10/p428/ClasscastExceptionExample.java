package chapter10.p428;

public class ClasscastExceptionExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		cd(d); //changeDog

		Cat c = new Cat();
		cd(c);
	}
	
	public static void cd(Ani a) {
		if(a instanceof Dog) {
			Dog d = (Dog) a;
		}
	}
}

class Ani {}
class Dog extends Ani {}
class Cat extends Ani {}


