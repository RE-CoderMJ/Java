package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("����", "����", 10);
		arr[1] = new Cat("����", "�ڼ�", "�ѱ�", "���");
		arr[2] = new Dog("ĭ��", "��ġ", 5);
		arr[3] = new Cat("����", "��ġŲ", "�̱�", "�����");
		arr[4] = new Cat("�ٺ�", "��ġŲ", "ü��", "ȸ��");
		
		for(Animal a : arr) {
			a.speak();
		}

	}

}
