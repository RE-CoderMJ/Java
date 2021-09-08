package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("만두", "시츄", 10);
		arr[1] = new Cat("여우", "코숏", "한국", "흰색");
		arr[2] = new Dog("칸쵸", "폼치", 5);
		arr[3] = new Cat("오복", "먼치킨", "미국", "노란색");
		arr[4] = new Cat("다복", "먼치킨", "체코", "회색");
		
		for(Animal a : arr) {
			a.speak();
		}

	}

}
