package util;

public interface IBigNum<N> {

	
	public boolean searchNumber(N bigNum);

	public void addNumber(N bigNum);

	public boolean remove(N bigNum);

	public void removeAll();

	public IBigNum<N> getListBigNumber();
	
	public N getBigNumber();
	
	public boolean equalsNumer(N bigNum);
	
	public N cloneNumer();
	
	public int getSize();


	
}
