package com.kh.chap02_hashSet.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() {}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1; 
		result = prime * result + age; // result = 31* 1 + 20 = 51
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// this vs obj
		
		if (this == obj) // ����ü�� �񱳴��ü�� �ּҰ��� ��ġ�� ���(���� ���� �����Ұ��� == �ʵ尪�� ��ġ�Ұ���) �� �ʵ�� ������ ���� �ʿ� ���� 
			return true;
		if (obj == null) // �񱳴���� null�ϰ�� ���� ��ġ�� ���� false��ȯ
			return false;
		if (getClass() != obj.getClass()) // ����ü�� Ŭ���� Ÿ�԰� �񱳴��ü�� Ŭ����Ÿ���� �ٸ� ��� ���� ��ġ�� ���� false ��ȯ
			return false;
		// �� ��ü�� �ּҰ��� �ٸ���, �񱳴��ü�� null�� �ƴϰ�(�������� ��ü)//�ٽõ��, �� ��ü�� Ŭ����Ÿ���� ��ġ�� ���
		
		Student other = (Student) obj;
		if (age != other.age) // ����ü�� age �ʵ�� ���޹��� ��ü�� age �ʵ尡 �ٸ� ��� false ��ȯ
			return false;
		
		if (name == null) { // �� ��ü�� name�ʵ尡 null�ϰ�� 
			if (other.name != null) // ���޹��� ��ü�� name�ʵ尡 null�� �ƴ� ��� false ��ȯ
				return false;		// null.equals->NullPointException �߻�����
		} else if (!name.equals(other.name)) // ����ü�� name�ʵ尡 null�� �ƴϰ� �� ���ڿ��� ���޹��� ��ü�� name�ʵ� ���ڿ��� ��ġ���� ���� ���
			return false;
		
		if (score != other.score) // ����ü�� score�ʵ�� ���޹��� ��ü�� score�ʵ尡 �ٸ� ��� false ��ȯ
			return false;
		return true;
	}
	
	
	/*
	@Override
	public int hashCode() { // ��� �ʵ忡 ��� ���� ��ġ�ϸ� ������ hashCode ��ȯ �ϵ���
		String str = name + age + score; // "����43100" / "�踻��2640" / "ȫ�浿2420" / "����43100"
		return str.hashCode();
	}
	
	// Student��ü.equals(Student��ü) �̷������� ȣ��ɰ���
	@Override
	public boolean equals(Object obj) { // ���� ��ü�� ���޹��� ��ü�� ���ʵ尪���� ��� ��ġ�ϸ� true/�ϳ��� ��ġ���� ������ false��ȯ
		
		// this(����ü)	vs	obj(���޹��� ��ü)
		// StudentŸ��		 ObjectŸ��
		
		Student other = (Student)obj;
		
		//	this(����ü)	vs	other(���޹�����ü)
		// this.name �� other.name ��ġ�ϴ���
		// this.age�� other.age ��ġ�ϴ���
		// this.score�� other.score ��ġ�ϴ���

		if(name.equals(other.name) && age == other.age && score == other.score) {
			return true;
		}else {
			return false;
		}
		
	}
	
	*/
	
}
