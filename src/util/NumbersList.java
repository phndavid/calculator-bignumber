package util;

public  class NumbersList<N> implements IBigNum<N>{

	private DoubleNode<N> firstNode; 
	private DoubleNode<N> lastNode;
	
	
	public NumbersList(){
		
	}


	@Override
    public boolean searchNumber(N bigNum) {
	    // TODO Auto-generated method stub
	    return false;
    }


	@SuppressWarnings("unchecked")
    @Override
    public void addNumber(N bigNum) {
		if(firstNode == null)
		{	
			firstNode = (DoubleNode<N>) bigNum;
		}
		else
	    {
			((DoubleNode<N>) bigNum).setNext((DoubleNode<N>) firstNode);
	    	firstNode = (DoubleNode<N>) bigNum;
	    }
	    
    }


	@Override
    public int getSize() {
		  int cant = 0;
	        DoubleNode<N> reco = firstNode;
	        while (reco != null) {
	            reco = (DoubleNode<N>) reco.getNext();
	            cant++;
	        }
	        return cant;
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
		return "Numero:" + firstNode;
	}


	@Override
    public N getBigNumber() {
	    
	    return null;
    }
	 public void imprimir ()
	    {
	       DoubleNode<N> reco = firstNode;
	        while (reco != null) {
	            System.out.print (reco.toString() + "-");
	            reco = (DoubleNode<N>) reco.getNext();
	        }
	        System.out.println();
	    }


	
	
	
	
	
}
