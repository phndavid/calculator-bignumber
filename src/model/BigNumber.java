package model;

/**
 * 
 * @author Nelson David Padilla Hernandez - Santiago De Los Rios
 *
 */
public class BigNumber  implements IBigNumber
{

	private byte[ ] digits;
	private boolean signum; 
	
	public BigNumber(byte[ ] digits)
	{
		this.digits = digits;
	}
	public BigNumber(byte[] digits, boolean signum) { 
		this.digits = digits; 
		this.signum = signum;
		if(signum)
			this.digits[0] = (byte)(digits[0]*-1);
	}

	@Override
    public BigNumber add(BigNumber bigNum)
    {	
		byte[ ] temp;
		byte[ ] bytesBig = bigNum.getByte();
		if (bytesBig.length > this.digits.length) 
        { 
            temp = this.digits; 
            this.digits = bytesBig; 
            bytesBig = temp; 
        }
		
		int c = bytesBig.length-1;
		byte acarreo  = 0;
		String res ="";
		for (int i = digits.length-1; i >= 0; i--) 
		{
			byte bit = 0;
			if(c >= 0) 
				bit = bytesBig[c];
		
			 byte suma = (byte) (digits[i] + bit + acarreo); 
	         acarreo = (byte) (suma / 10); 
	         suma = (byte) (suma % 10); 
	         res = suma +res; 
	         c--;
		}
		if (acarreo != 0) 
	        res = acarreo + res; 
	    
		return new BigNumber(convertStringToArrayByte(res));
    }
	public byte[ ] convertStringToArrayByte(String number) 
	{	
	     byte[ ] result = new byte[number.length()];
	        for (int i = 0; i < result.length; i++) {
	        	char bit = number.charAt(i);
	        	String numBit = Character.toString(bit);
	            Byte elbite = new Byte(numBit);
	        	result[ i ] = elbite;	 
	        }
	        return result;
	}

	@Override
	public BigNumber multiply(BigNumber bigNum) 
	{
		byte[ ] bytesBig = bigNum.getByte();
	
		BigNumber[ ] arrayProductos = new BigNumber[bytesBig.length];
		int numZero = 0;
		for (int j = bytesBig.length -1 ; j >=0; j--)
		{

			byte acarreo  = 0;
			String res ="";
			BigNumber producto;
			for (int i = digits.length-1; i >= 0; i--) 
			{
					byte bit = 0;
					bit = bytesBig[j];
					byte suma = (byte) (digits[i] * bit + acarreo); 
			        acarreo = (byte) (suma / 10); 
			        suma = (byte) (suma % 10); 
			        res = suma +res; 
		      } 
			numZero++;
			if (acarreo != 0) 
		        res = acarreo + res;
			
			if( numZero > 1 && !(res.equals("0"))) 
			{
				for (int i = 1 ; i <numZero ; i++)
					res +=  "0";  
			}
			producto = new BigNumber(convertStringToArrayByte(res));
			arrayProductos[ j ] = producto;
		}
		
		BigNumber result = arrayProductos[arrayProductos.length-1];
		BigNumber bigAnt = arrayProductos[arrayProductos.length-1];
		for (int i = arrayProductos.length - 1; i >=0; i--)
		{
			if(i-1 >=0) 
			{
				result = arrayProductos[i-1].add(bigAnt);
				bigAnt = result;	
			}
		
		}				
		return result;	  
    }
	public BigNumber substract(BigNumber bigNum)
	{
		
		byte[ ] bytesBig = bigNum.getByte(); 	
		String res ="";
		byte resByte =0;	
		if(!compareBigNumber(bigNum)) 
		{
			int c = digits.length-1;
			if(isZero(bytesBig))
				return new BigNumber(bytesBig);
			
			System.out.println("A es < B");
			boolean menor = false;
			boolean seResto=false; 
			for (int i = bytesBig.length-1; i >= 0; i--) 
			{
				if(!seResto)
					resByte = bytesBig[i];
				
				byte bit = 0;
				if(c >= 0) 
					bit = digits[c];
				else
					bit = 0;
				if(resByte < bit) 
					{ 	
							byte sumaNeg = (byte) ((resByte+10)- bit);
							resByte = (byte) (bytesBig[ i -1] - 1);
							res = sumaNeg + res;
							seResto = true;
							menor = true;
							c--;
					}
					else 
					{
						byte suma  = 0;
						if(menor) 
							 suma = (byte) (resByte - bit);					
						else
							suma = absoluteValute((byte) ((bytesBig[i]) - bit));
							res = suma +res; 
						
						if(i>0) 
						{	
							if(c <= -1|| (bytesBig[i-1]-1>bit)) 
							{ 
								if(i>0)  
									resByte  = bytesBig[i-1];
								else 
									resByte = bytesBig[i];							
								}
							}
				         c--;
					}
			}
				String defi = deleteZeros(res);
				return new BigNumber((convertStringToArrayByte(defi)),true);
		}
		else 
		{
			if(isZero(digits))
				return new BigNumber(digits);

			System.out.println("A es > B");
			boolean menor = false;
			//boolean seResto=false; 
			int c = bytesBig.length-1;
				
			for (int i = digits.length-1; i >= 0; i--) 
			{
//				if(!seResto)
//					resByte = digits[i];
				
				byte bit = 0;
				if(c >= 0) 
					bit = bytesBig[c];
				else
					bit = 0;
				if(resByte < bit) 
					{ 	
							byte sumaNeg = (byte) ((resByte+10)- bit);
							resByte = (byte) (digits[ i -1] - 1);
							res = sumaNeg + res;
							//seResto = true;
							menor = true;
							c--;
					}
					else 
					{
						byte suma  = 0;
						if(menor) 
							 suma = (byte) (resByte - bit);					
						else
							suma = absoluteValute((byte) ((digits[i]) - bit));
							res = suma +res; 
						
						if(i>0)
						{	
							if(c <= -1|| (digits[i-1]-1>bit)) 
							{ 
								if(i>0)  
									resByte  = digits[i-1];
								else 
									resByte = digits[i];							
							}
						}
				        c--;
					}
			}
			
			return new BigNumber((convertStringToArrayByte(deleteZeros(res))));
		}
	}

	public byte[] cambiarArray(byte[] array) 
	{
		byte[] newArray = new byte[array.length-1];
		for (int i = 0; i < array.length; i++) {
	         digits[i] = array[i];
        }
		return newArray;
	}
	public BigNumber getBigNumber() {
		return this;
	}
	@Override
    public BigNumber divide(BigNumber bigNum) 
	{
		BigNumber bigNumber = this;
		String res = "";
		int can = 1;
		
		if(bigNum.getByte().length == 1 && bigNum.getByte()[0] == 1)
			return this;
		
		if(isZero(bigNum.getByte()))
				System.out.println("Macth Error");
		
		while(bigNumber.compareBigNumber(bigNum))
		{
	      bigNumber = bigNumber.substract(bigNum);
	      System.out.println("dive: "+bigNumber);
	      can++;
        }
				
		res = can+res;
		return new BigNumber(convertStringToArrayByte(res));
    }
	@Override
	public BigNumber module(BigNumber bigNum)
	{	
		//modulo = x-r*y. donde x es el numero de arriba,  y el de abajo y r el resultado de la division
		BigNumber r = this.divide(bigNum);
		BigNumber p = r.multiply(bigNum);
		BigNumber m = this.substract(p);
		return m;
	}

//	public boolean isMayor(BigNumber bigNum) { 
//		if(this.subtract(bigNum).getByte()[0]<0) { 
//			return false; 
//		}else { 
//			return true; 
//		}
//	}	

	@Override
    public boolean compareBigNumber(BigNumber bigNum) 
	{
		byte[ ] bytesBig = bigNum.getByte();
		if(byteArrayCompare(this.digits,bytesBig) == 1) 
		{ 
			return true; 
		}else if(byteArrayCompare(this.digits, bytesBig)== -1) 
		{ 
			return false; 
		}else
		{

			for (int i = 0; i < bytesBig.length; i++) 
			{
				byte up = digits[i];
				byte low = bytesBig[i];
				if(up > low) 
					return  true;
				else
					return false;
			}
		}
		
	    return false;
    }
	@Override
    public int byteArrayCompare(byte[] arrayA, byte[] arrayB)
	{
		 if (arrayA.length < arrayB.length)
		             return -1;
		 if (arrayA.length > arrayB.length)
		             return 1;

			         return 0;
    }
	
	@Override
    public boolean equalsNumber(BigNumber bigNum) 
	{    
		byte[] bytesBig = bigNum.getByte();
		int cont =0;
		if(this.digits.length == bytesBig.length) {
			for (int i = 0; i < bytesBig.length; i++) {
	        	if(digits[i] == bytesBig[i])
	        		cont++;
        	}
			if(cont == this.digits.length) { 
				return true;
			}
				
		}else { 
			return false; 
		}
		return false; 
    }
	
	@Override
	public byte absoluteValute(byte number) 
	{
		Byte elByte = new Byte(number); 
		if(Integer.signum(number)==-1) {
			elByte = (byte) (number * (-1));
			System.out.println("elBYte: " + elByte);
		}
		
		return elByte; 
	}
	@Override
	public String deleteZeros(String entry)
	{
		String cadena="";
		boolean empezarAConcatenar = false; 
			for (int i = 0; i < entry.length(); i++)
			{
				if(entry.charAt(i) !='0') {; 
					empezarAConcatenar = true; 
				}
				if(empezarAConcatenar) { 
					cadena += entry.charAt(i);
				}
			}
		return cadena; 
	}
	@Override
	public boolean isNegative()
	{ 
		if(signum)  
			return true; 
		else 
			return false; 
	}
	
	@Override
	public boolean isZero(byte[ ] bigNum) 
	{
		for (int i = bigNum.length-1; i >=0; i--) 
		{
			 if(bigNum[i] != 0) 
	        	return false;    
        }
		return true;
	}
	@Override
	public void setDigits(byte[] digits) 
	{
		this.digits = digits;
	}
	@Override
	public byte[ ] getByte() 
	{
		return digits;
	}
	
	@Override
	public String  toString() 
	{
		String toString = ""; 
		for (int i = 0; i < digits.length; i++) 
		{
	        toString += digits[i];
        }
		return toString;
	}
	
	

	
}
