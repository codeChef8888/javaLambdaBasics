package io.javaLambdaBasics;

public class TypeInference {

	public static void main(String[] args) {
		
		printLambda(s -> s.length());

	}
	
	public static void printLambda(StringlenghtLambda l) {
		
		System.out.println(l.getLength("Hellow World!"));
		
	}
	
	//inner class
	public interface StringlenghtLambda{
		int getLength(String s);
	}

}
