package com.kh.chap05_constructor.model.vo;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/*
	 * ������
	 * public Ŭ������([�Ű�����, �Ű�����, ..]) {
	 * 
	 * }
	 * 
	 * * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. ��ü ������ ���ÿ� �Ű������� ���޹��� ������ �ʵ忡 �ٷ� �ʱ�ȭ�� ����
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 * 1. �ݵ�� �����ڸ��� Ŭ������� �����ؾߵ�(��/�ҹ��� ����)
	 * 2. ��ȯ���� �������� ����(���� ��ȯ���� ���� �Ǹ� �޼ҵ�� �ν��ع���)
	 * 3. �Ű����� �����ڸ� ��������� �ۼ��ϰ� �Ǹ� �⺻�����ڸ� JVM�� �ڵ����� ��������� ����
	 * 	    ��, ����Ѵ� ���� �⺻�����ڴ� �׻� �ۼ��ϴ� ���� ������!!
	 */
	public User() {
		// �⺻������ (�Ű����� ���� ������)
		// ���� ��ü �������� �������� �� �� ���
		//System.out.println("�̰� ���� �ǳ�?");
		// �⺻�����ڸ� �������� ���=> JVM�� �ڵ����� �������� ������ �׻� ��ü ���� ����!!
	}
	
	// �Ű����� ������
	// ��ü ������ ���ÿ� ���ް����� �Ű������� �޾Ƽ� �ش� �� �ʵ忡 �ʱ�ȭ�� ����
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		this(userId, userPwd, userName);
		/*
		 * ���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ�ϴ� ������ �����ڰ� �̹� ������ ���
		 * this() ������ Ȱ�� ����
		 * => ���� Ŭ���� ���� �����ڿ��� �Ǵٸ� ������ ȣ���ϰ��� �Ҷ� ����
		 * ** ���ǻ��� : �ݵ�� ù�ٿ� �ۼ��ؾߵ�!!
		 */
		this.age = age;
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "userId: " + userId + ", userPwd: " + userPwd + ", userName: " + 
	", age: " + age + ", gender: " + gender;
	}
}
