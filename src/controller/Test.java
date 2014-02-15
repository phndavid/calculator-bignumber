package controller;

import util.DoubleNode;
import util.NumbersList;

public class Test {

	public Test() 
	{
		NumbersList numberList = new NumbersList();
		
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
