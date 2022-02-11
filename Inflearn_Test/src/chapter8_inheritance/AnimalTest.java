package chapter8_inheritance;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal
{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal
{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
		// test.moveAnimal(new Human()); 와 밑의 public void moveAnimal(Animal animal) 코드가 1set라고 했을때
		// 이는 Animal animal = new Human(); 과 의미가 일맥상통한다.
	}
	
	public void moveAnimal(Animal animal)
	{
		animal.move(); // 코드는 이것 한 줄이지만, 결과는 3줄이 나온다 (사람이~, 호랑이가~, 독수리가~)
		// 이 한줄의 코드가 다형성을 나타낸다고 할 수 있는 것이다.
		
	}
}
