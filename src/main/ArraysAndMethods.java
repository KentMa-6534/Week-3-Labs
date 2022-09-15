package main;

import java.util.Arrays;

public class ArraysAndMethods {

	public static void main(String[] args) {
		
		//Create an array with the following values 1, 5, 2, 8, 13, 6
		int[]array = {1,5,2,8,13,6};
		//Print out the first element in your array
		System.out.println(array[0]);
		//Print out the last element in your array 
		System.out.println(array[array.length-1]);
		//Print out the element in the array at position 6. What happens?
		//System.out.println(array[6]);
		//There is a java.lang.ArrayIndexOutOfBoundsException.
		
		//Print out the element in the array at position -1. What happens?
		//System.out.println(array[-1]);
		//There is a java.lang.ArrayIndexOutOfBoundsException.
		
		//Write a traditional for loop that prints out each element in the array
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//Write an enhanced for loop that prints out each element in the array
		for(int number:array) {
			System.out.println(number);
		}
		
		//Create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum = 0;
		for(int number:array) {
			sum+=number;
		}
		System.out.println(sum);
		
		//Create a new variable called average and assign the average value of the array to it
		double average = sum/array.length;
		System.out.println(average);
		
		//Write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int number:array) {
			if(number%2 !=0) {
				System.out.println(number);
			}
		}
		
		//Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[]names = {"Sam","Sally","Thomas","Robert"};
		
		//Calculate the sum of all letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		//Write and test a method that takes a String name and prints out a greeting, this method returns nothing
		nameGreeting("Mike");
		
		//Write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(returnGreeting("Sally"));
		
		//Analyze the difference between these two methods - What did you find? How are they different?
		//The void method only prints out the message with the String input, while the method without returns the
		//greeting as a String variable when it is initialized.
		
		//Write and test a method that takes a String and an int and returns true if numbers of letters in the string is greater than the int
		System.out.println(biggerString("Hello",4));
		
		//Write and test a method that takes an array of a string and a string and returns true if the string passed in
		//exists in the array
		String[]groceries = {"Apples","Bananas","Oranges","Pears"};
		System.out.println(checkArray(groceries,"Pears"));
		
		//Write and test a method that takes an array of int and returns the smallest number in the array
		int[]numbers = {1,2,3,4,5,6,7,8};
		System.out.println(smallest(numbers));
		
		//Write and test a method that takes an array of double and returns the average
		double[]decimals = {1.5,3.4,6.5,3.3};
		System.out.println(doubleAverage(decimals));
		
		//Write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string
		//in each position
		System.out.println(Arrays.toString(stringToInt(names)));
		
		//Write and test a method that takes an array of strings and returns true if the sum of letters for all strings with 
		//an even amount of letters is greater than the sum of those with an odd amount of letters
		
		System.out.println(evenVsOdd(names));
		
		//Write and test a method that takes a string and returns true if the string is a palindrome
		String word = "racecar";
		System.out.println(palindrome(word));
	}
	
		//Write and test a method that takes a String name and prints out a greeting, this method returns nothing
	public static void nameGreeting(String name) {
		System.out.println("Hello, "+name);
	}
	
		//Write and test a method that takes a String name and returns a greeting, do not print in the method
	public static String returnGreeting(String name) {
		String greeting = "Hello, "+name;
		return greeting;
	}
		
		//Write and test a method that takes a String and an int and returns true if numbers of letters in the string is greater than the int
	public static boolean biggerString(String word, int number) {
		boolean largerThanInt=false;
		if(word.length()>number) {
			largerThanInt = true;
		}
		else if (word.length()<number) {
			largerThanInt = false;
		}
		else {
			System.out.println("Both are equal");
		}
		return largerThanInt;
	}
		
		//Write and test a method that takes an array of a string and a string and returns true if the string passed in
		//exists in the array
	public static boolean checkArray(String[]groceries, String item) {
		boolean wordExists = false;
		for(int i =0; i<groceries.length;i++) {
			if(groceries[i].equals(item)) {
				wordExists = true;
				break;
			}
		}
		return wordExists;
	}
	
	//Write and test a method that takes an array of int and returns the smallest number in the array
	public static int smallest(int[]numbers) {
		int minValue = numbers[0];
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i]<minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	
	//Write and test a method that takes an array of double and returns the average
	public static double doubleAverage(double[]decimals) {
		double sum=0;
		double average;
		for(double numbers:decimals) {
			sum+=numbers;
		}
		return average = sum/decimals.length;
	}
	
	//Write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string
	//in each position
	public static int[] stringToInt(String[]names) {
		int[]numbers = new int [names.length];
		for(int i =0;i<names.length;i++) {
			numbers[i] = names[i].length();
		}
		return numbers;
	}
	
	//Write and test a method that takes an array of strings and returns true if the sum of letters for all strings with 
	//an even amount of letters is greater than the sum of those with an odd amount of letters
	public static boolean evenVsOdd(String[]names) {
		int evenSum = 0;
		int oddSum = 0;
		boolean isGreater;
		for(String name:names) {
			if(name.length()%2==0) {
				evenSum+=name.length();
			}
			else {
				oddSum+=name.length();
			}
		}
		if(evenSum>oddSum) {
			isGreater = true;
		}
		else {
			isGreater = false;
		}
		return isGreater;
	}
	
	//Write and test a method that takes a string and returns true if the string is a palindrome
	public static boolean palindrome(String word) {
		boolean isPalindrome;
		String reverseWord="";
		for(int i = word.length()-1;i>=0;i--) {
			reverseWord += word.charAt(i);
		}
		if(reverseWord.equals(word)) {
			isPalindrome = true;
		}
		else {
			isPalindrome = false;
		}
		return isPalindrome;
	}
}
