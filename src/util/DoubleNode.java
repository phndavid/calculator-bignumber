package util;

public abstract class  DoubleNode<N> {

	
	private DoubleNode<N> previousNode;
	private N previousNumber;
	
	private N nextNumber;
	private DoubleNode<N> nextNode;
	
	
	
	public DoubleNode(N number)
	{
	nextNode = (DoubleNode<N>) number;
	
	}

	public N getNext()
	{
		return nextNumber;
	}

	public void setNext(DoubleNode<N> number2)
	{
		this.nextNode =  number2;
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
