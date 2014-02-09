package util;

public interface BigNum<N> {

	public void addNumber(BigNum<N> bigNum);

	public void remove();

	public void removeAll();

	public BigNum<N> getBigNumber();

}
