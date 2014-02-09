package util;

public interface IBigNum<N> {

	public boolean agregar(N element); 
	public boolean buscar(N element);
	public boolean eliminar(N element);

	public void addNumber(IBigNum<N> bigNum);

	public void remove();

	public void removeAll();

	public IBigNum<N> getBigNumber();
	
}
