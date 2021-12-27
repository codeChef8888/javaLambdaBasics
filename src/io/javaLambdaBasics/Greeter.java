package io.javaLambdaBasics;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		Greeter greeter= new Greeter();
		
		Greeting lambdaGreeting= () -> System.out.print("Hellow World!");
		
		Greeting greetingInnerClass= new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hellow Niggas!!");
				
			}
		};
		
		greeter.greet(lambdaGreeting);
		
		greetingInnerClass.perform();
	}
	
}
