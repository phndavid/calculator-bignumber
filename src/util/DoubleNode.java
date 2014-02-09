package util;

public class DoubleNode<N> {

	
	private DoubleNode<N> previousNode;
	private N previousNumber;
	
	private N nextNumber;
	private DoubleNode<N> nextNode;
	
	
	
	public DoubleNode(N number)
	{
		nextNumber = number;
	
	}

	public N getNext()
	{
		return nextNumber;
	}

	public void setNext(N number2)
	{
		this.nextNumber = number2;
	}
	
	public N getNumber()
	{
		return nextNumber;
	}
	
	public void setNumber(N number)
	{
		this.nextNumber = number;
	}



}
