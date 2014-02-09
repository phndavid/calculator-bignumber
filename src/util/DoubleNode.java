package util;

public class DoubleNode<N> {

	private DoubleNode<N> nextNode;
	private DoubleNode<N> previousNode;
	
	private N nextNumber;
	private N previousNumber;;
	
	public DoubleNode()
	{
		nextNumber = (N) nextNode ;
		previousNumber = (N) previousNode ;
	}

	public N getNext()
	{
		return nextNumber;
	}

	public void setNext(N number2)
	{
		this.nextNumber = number2;
	}

	public N getPrevious()
	{
		return previousNumber;
	}

	public void setPrevious(DoubleNode<N> previous)
	{
		this.previousNode = previous;
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
