package chapter8_witharraylist;

import java.util.ArrayList;

class Animal
{
	public void move()
	{
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() // ������� �� �� �ִ� �޼���
	{
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal
{
	public void move()
	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void Hunting()
	{
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal
{
	public void move()
	{
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying()
	{
		System.out.println("�������� ���� �ֽ��ϴ�.");
	}
}

class Bear extends Animal
{
	public void move()
	{
		System.out.println("���� �̵��մϴ�.");
	}
	
	public void biting()
	{
		System.out.println("���� ����ϴ�.");
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
		
		// test.moveAnimal(new Human()); �� ���� public void moveAnimal(Animal animal) �ڵ尡 1set��� ������
		// �̴� Animal animal = new Human(); �� �ǹ̰� �ϸƻ����Ѵ�.
	}
	
	public void moveAnimal(Animal animal)
	{
		animal.move(); // �ڵ�� �̰� �� ��������, ����� 3���� ���´� (�����~, ȣ���̰�~, ��������~)
		// �� ������ �ڵ尡 �������� ��Ÿ���ٰ� �� �� �ִ� ���̴�.
		
		// animal. ���� ������ ����� readBook�� �ҷ���������� ������ �ʴ´�. (�ٿ�ĳ������ ���� �ʾ�����)
		// �� ��� �̷��� �ذ��ϸ�, if���� ���� �ٿ�ĳ���õ� animal�� �޼��尡 Human�� ��� human�� readBook() �޼��带 �����ϵ��� ����.
		if (animal instanceof Human) // instanceof �� ���� �ٿ�ĳ������ ���ش�.
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
			System.out.println("�������� �ʴ� ����Դϴ�."); // ���� ����
		}
	}
}
