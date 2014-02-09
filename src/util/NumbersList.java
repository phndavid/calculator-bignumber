package util;

public  class NumbersList<N> implements IBigNum<N>{

	private DoubleNode<N> firstNode; 
	private DoubleNode<N> lastNode;
	
	private N firstNumber;
	private N lastNumber;
	
	public NumbersList(){
		
		firstNumber = (N) firstNode;
		lastNumber = (N) lastNode;
	}


	@Override
    public boolean searchNumber(N bigNum) {
	    // TODO Auto-generated method stub
	    return false;
    }


	@Override
    public void addNumber(N bigNum) {
		if(firstNumber == null)
		{	
			firstNumber = bigNum;
		}
		else
	    {
	    	bigNum.setNext(firstNumber);
	    	firstNumber = bigNum;
	    }
	    
    }


	@Override
    public int getSize() {
		Object actual =  firstNumber;
		int longitud = 0;
		while( actual != null )
		{
			longitud++;
			actual =    ((DoubleNode) actual).getNext();
		}
		return longitud;
    }
	@Override
    public boolean remove(N bigNum) {
	    // TODO Auto-generated method stub
	    return false;
    }


	@Override
    public void removeAll() {
	    // TODO Auto-generated method stub
	    
    }


	@Override
    public IBigNum<N> getListBigNumber() {
	    // TODO Auto-generated method stub
	    return null;
    }


	@Override
    public boolean equalsNumer(N bigNum) {
	    // TODO Auto-generated method stub
	    return false;
    }


	@Override
    public N cloneNumer() {
	    // TODO Auto-generated method stub
	    return null;
    }

	public String toString() {
		return "Numero:" + firstNumber;
	}


	@Override
    public N getBigNumber() {
	    
	    return firstNumber;
    }
	


	
	
	
	
	
}
