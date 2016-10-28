package kr.ac.hansung.spring.aop;

public class Cat implements AnimalType {

	// Dependency Injection으로 값을 넣음
	private String myName;

	public void setMyName(String myName) {
		this.myName = myName;
	}

	//JoinPoint
	@Override
	public void sound() {
		System.out.println("Cat name=" + myName + ": " + "Meow!");
	}
}