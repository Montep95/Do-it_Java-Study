package chapter8_witharraylist;

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
	
	public void readBook() // 사람만이 할 수 있는 메서드
	{
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal
{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void Hunting()
	{
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal
{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying()
	{
		System.out.println("독수리가 날고 있습니다.");
	}
}

class Bear extends Animal
{
	public void move()
	{
		System.out.println("곰이 이동합니다.");
	}
	
	public void biting()
	{
		System.out.println("곰이 베어뭅니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		test.moveAnimal(new Bear());
	
		Animal[] animalList = new Animal[4];
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
		
		// animal. 까지 쳤을때 사람의 readBook을 불러오고싶지만 나오지 않는다. (다운캐스팅이 되지 않아있음)
		// 이 경우 이렇게 해결하며, if문을 통해 다운캐스팅된 animal의 메서드가 Human일 경우 human의 readBook() 메서드를 수행하도록 지정.
		if (animal instanceof Human) // instanceof 를 통해 다운캐스팅을 해준다.
		{
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Tiger)
		{
			Tiger tiger = (Tiger)animal;
			tiger.Hunting();
		}
		else if (animal instanceof Eagle)
		{
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else if (animal instanceof Bear)
		{
			Bear bear = (Bear)animal;
			bear.biting();
		}
		else
		{
			System.out.println("지원되지 않는 기능입니다."); // 예외 지정
		}
	}
}
