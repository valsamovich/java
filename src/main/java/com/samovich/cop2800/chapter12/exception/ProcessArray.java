	/*
AUTHOR: Dick Grant
PURPOSE: Demonstrate the use of try and catch blocks.  The class below attempts 
to create an object of the Taxes class.  However the Taxes class can throw an 
exception from its constructor if the array sent to the constructor is not in 
sequence.

The array taxArray is setup to be out of sequence. Therefore the try block will 
generate an OutOfSequenceException exception.  The catch block will "catch" 
this exception, resort the array and instantiate the object.
SOURCE:D:\chap15\chap15_code_examples\ProcessArray.java
*/
public class ProcessArray{
	public static void main (String [] args) { throws Exception
		int [] taxArray = {15, 29, 27, 33, 37};
		Taxes myTaxes = null;
		try {
			myTaxes = new Taxes(taxArray);
		}
		catch (OutOfSequenceException excep)		{
			System.out.println(excep.getMessage());//just for demo purposes
			System.out.println(myTaxes);//just for demo purposes
			resortArray(taxArray); //put the array in order
			myTaxes = new Taxes(taxArray);//now instantiate the object
		}	
		//process rest of code normally
		System.out.println(myTaxes);
		
	}
	public static void resortArray(int [ ]taxArray)	{
		//"resort" the array - just to save code and space
		taxArray[1] = 22;
		return;
	}
}
