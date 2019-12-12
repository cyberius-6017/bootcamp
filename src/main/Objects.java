package main;

class Dog {
	int age;
	String breed;
	String color;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void bark() {
		System.out.println("Woof!");
	}

}

public class Objects {

	public static void main(String[] args) {

		Dog chihuahua = new Dog();
		chihuahua.setAge(17);
		chihuahua.setBreed("Chihuahua");
		chihuahua.setColor("Black");
		System.out.println(chihuahua.getAge());
		System.out.println(chihuahua.getBreed());
		System.out.println(chihuahua.getColor());
		chihuahua.bark();

		System.out.println();

		Dog golden = new Dog();
		golden.setAge(12);
		golden.setBreed("Golden");
		golden.setColor("Yellow");
		System.out.println(golden.getAge());
		System.out.println(golden.getBreed());
		System.out.println(golden.getColor());
		golden.bark();

	}

}
