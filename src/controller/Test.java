package controller;

import util.NumbersList;

public class Test {

	public Test() 
	{
		NumbersList<Integer> numberList = new NumbersList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			numberList.addNumber(i);
			System.out.println(numberList.getBigNumber().toString());
		}
		
	}

	public static void main(String[] args) 
	{
		Test test = new Test();
	}

}
