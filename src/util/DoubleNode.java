package util;

public class DoubleNode<N> {

	private DoubleNode<N> next; 
	private DoubleNode<N> previous; 
	private N number; 
	
	public DoubleNode(N number) { 
		this.number = number; 
	}
	public DoubleNode<N> getNext(){
		return next;
	}
	public void setNext(DoubleNode<N> next){
		this.next = next;
	}
	public DoubleNode<N> getPrevious(){
		return previous;
	}
	public void setPrevious(DoubleNode<N> previous){
		this.previous = previous;
	}
	public N getNumber(){
		return number;
	}
	public void setNumber(N number){
		this.number = number;
	}
	
}
