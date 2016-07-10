package com.samovich.cop2800.chapter12.exception;/*
AUTHOR: Dick Grant
PURPOSE: Demonstrate the use of a custom exception.  The class below throws an OutOfSequenceException
when the array it receives as argument in the constructor is not in ascending sequence.  Note the 
constructor just throws the exception. It does not resort the array. The constructor leaves
the decision as to how to handle the exception to the calling method.
SOURCE:D:\chap15\chap15_code_examples\Taxes.java
*/

public class Taxes {
	private int []rateTable = {0, 0,0,0,0};//default array values
		//constructor that can throw exception
	public Taxes (int [ ] tbl) throws OutOfSequenceException { 
		int ctr = 0;
		for ( ;ctr < tbl.length - 1; ctr++)
		{
			if (tbl[ctr] <= tbl[ctr+ 1] )//if element is in sequence..
				rateTable[ctr] = tbl[ctr];//move it to object array
		else	//element is not in sequence so...
			//throw exception if elements in array are not in ascending sequence
			throw new OutOfSequenceException
				("Tax table out of sequence at element # " + ctr);
		}
		rateTable[ctr] = tbl[ctr];//move last element into table
	}
	public String toString()	{
		return "[0] = " + rateTable[0] +
			   "[1] = " + rateTable[1] +
			   "[2] = " + rateTable[2] +
			   "[3] = " + rateTable[3] +
			   "[4] = " + rateTable[4] ;
	}
}
