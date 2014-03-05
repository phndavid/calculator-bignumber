package model;
/**
 * 
 * @author Nelson David Padilla Hernandez - Santiado De Los Rios
 *
 */
public interface IBigNumber {

	/**
	 * Descripcion: Este metodo permite realizar la suma de dos BigNumber.
	 * @param bigNum BigNumber a sumar.
	 * @return retorna un BigNumber con el resultado de la suma.
	 */
	public BigNumber add(BigNumber bigNum);

	/**
	 * Descripcion: Este metod permite realizar la resta de dos BigNumber.
	 * @param bigNum BigNumber a restar.
	 * @return retorna un BigNumber con el resultado de la resta.
	 */
	public BigNumber substract(BigNumber bigNum);

	/**
	 * Descripcion: Este metod permite realizar la multiplicacion de dos BigNumber.
	 * @param bigNum BigNumber a multiplicar.
	 * @return retorna un BigNumber con el resultado de la multiplicacion.
	 */
	public BigNumber multiply(BigNumber bigNum);

	/**
	 * Descripcion: Este metodo permite realizar la divicion de dos BigNumber
	 * @param bigNum BigNumber divisor.
	 * @return retorna un BigNumber con el resultado de la division.
	 */
	public BigNumber divide(BigNumber bigNum);

	/**
	 * Descripcion:Este metodo permite realizar el modulo entre dos BigNumber
	 * @param bigNum BigNumber modulo
	 * @return retorna un BigNumber con el resultado del modulo.
	 */
	public BigNumber module(BigNumber bigNum);

	/**
	 * Descripcion: Este metodo permite realizar la comparacion de logitudes  de dos arreglos de bytes(BigNumbers)
	 * @param arrayA  Arreglo de bytes a comparar
	 * @param arrayB Arreglo de bytes a comparar
	 * @return retorna -1,si el arrayA es menor que arrayB. retorna 1, si el arrayA es mayor que el arrayB y retorna 0 si las longitudes son iguales.
	 */
	public int byteArrayCompare(byte[] arrayA, byte[] arrayB);

	/**
	 * Descripcion:Este metodo consultar si dos BigNumber son iguales.
	 * @param bigNum BigNumber a comparar.
	 * @return retorna true si son iguales, y false en caso contrario.
	 */
	public boolean equalsNumber(BigNumber bigNum);

	/**
	 * Descripcion:Este metodo permite  comparar dos BigNumber, retornado el mayor.
	 * @param bigNum BigNumber  a comparar.
	 * @return retorna  false si el BigNumber pasado como parametro es menor, y true en caso contrario.
	 */
	public boolean compareBigNumber(BigNumber bigNum);

	/**
	 * Descripcion:Este metodo permite convertir  una cadena en un arreglo de byte[]
	 * @param number Cadena a convertir.
	 * @return retorna un arreglo de bytes[ ].
	 */
	public byte[] convertStringToArrayByte(String number);


	/**
	 * Descripcion:Este metodo permite sacarle el valor absoluto a un numero.
	 * @param number byte numero a convertir
	 * @return retorna el nuevo numero  positivo.
	 */
	public byte absoluteValute(byte number);

	/**
	 * Descripcion:Este metodo permite eliminar ceros de una cadena.
	 * @param entry cadena a modificar.
	 * @return retorna una cadena de texto sin ceros al comiezo.
	 */
	public String deleteZeros(String entry);


	/**
	 * Descripcion: Este metodo permite consultar si un  BigNumber es  negativo o positivo.
	 * @return retorna true si el numero es positivo, false si el numero es negativo.
	 */
	public boolean isNegative();

	/**
	 * Descripcion: Este metodo permite consultar si  los elementos de un arreglo de bytes son cero.
	 * @param bigNum arreglo de elementos a consultar.
	 * @return retorna true si el numero es cero, false en caso contrario.
	 */
	public boolean isZero(byte[] bigNum);
	
	/**
	 * Descripcion: Este metodo permite modificar un arreglo de byte
	 * @param digits nuevo arreglo de byte.
	 */
	public void setDigits(byte[] digits);

	/**
	 * Descripcion: Este metodo retorna un arreglo de byte del BigNumber
	 * @return retorna el arreglo de byte[].
	 */
	public byte[] getByte();

	/**
	 * Descripcion: Este metodo convierte un arreglo de bytes[] a una cadena de texto.
	 * @return Cadena de texto con el numero.
	 */
	public String toString();
}
