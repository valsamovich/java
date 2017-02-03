package org.samovich.cop2800.chapter13.serialization;

import org.samovich.cop2800.chapter13.serialization.HrlyEmployee;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class RunPayroll{
	public static void main(String [] args) throws Exception {
			// *** create the output stream *********
		ObjectOutputStream oos  = null;
		File fobj = null;
		FileOutputStream fos = null;
		try{
			fobj = new File("payroll.dat");
			fos = new FileOutputStream(fobj);
			oos = new ObjectOutputStream (fos);
			
			try
			{
				do {
					HrlyEmployee worker = new HrlyEmployee();
					// ******** get employee data and write to the file *********
					getEmployeeData(worker);
					oos.writeObject(worker);
				}while (moreDataToEnter());
			}//end inner try block
			finally{
				if (oos != null)
					oos.close();
			}
		}//end outer try block
		catch (IOException ex){
			System.err.println ("IOException when creating output stream");
			System.err.println (ex.getMessage());
			System.exit (-1);  //end application with "abnormal" return code
		}
		catch (Exception ex){
			System.err.println ("Exception when creating output stream");
			System.err.println (ex.getMessage());
			System.exit (-2);  //end application with "abnormal" return code
		}		

			// ******** create the input stream *********
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(fobj);
			ois = new ObjectInputStream (fis);
			
			// ******** read from the file and re-create objects *********
			try
			{
				HrlyEmployee worker = new HrlyEmployee();
				worker = (HrlyEmployee)ois.readObject();
				do 
				{
					printPay(worker);
					worker = (HrlyEmployee)ois.readObject();
				}while (true);//this creates an infinite loop that will end when an end
							//of file exception is thrown
			}//end inner try
			finally
			{
				if (oos != null)
					ois.close();
			}
		}//end outer try
		catch (EOFException ex){}  //catch the end of file exception but don't do anything
		catch (IOException ex){
			System.err.println ("IOException when creating input stream");
			System.err.println (ex.getMessage());
			System.exit (-5);  //end application with "abnormal" return code
		}
		catch (Exception ex){
			System.err.println ("Exception when creating input stream");
			System.err.println (ex.getMessage());
			System.exit (-6);  //end application with "abnormal" return code
		}
	}//end main method
	
			//prompt for each piece of employee data and read input form user.  update object
	public static void getEmployeeData(HrlyEmployee worker){
		String temp = JOptionPane.showInputDialog
			(null, "Enter employee name", "Employee Name Data", JOptionPane.QUESTION_MESSAGE);
		worker.setName(temp);
		temp = JOptionPane.showInputDialog
			(null, "Enter worker's SSN number (no dashes)", "Employee SSN", JOptionPane.QUESTION_MESSAGE);
		worker.setSSN(Long.parseLong(temp));
		temp = JOptionPane.showInputDialog
			(null, "Enter hours worked", "Employee Work Hours", JOptionPane.QUESTION_MESSAGE);
		worker.setHours(Double.parseDouble(temp));
		temp = JOptionPane.showInputDialog
			(null, "Enter employee rate", "Employee Rate Data", JOptionPane.QUESTION_MESSAGE);
		worker.setRate(Double.parseDouble(temp));
	}
		//print employee data
	public static void printPay(HrlyEmployee arg){
		System.out.println(arg);
		System.out.println("Gross salary is: " + arg.calcPay());
	}
		//check to see if user whats to enter more data
	public static boolean moreDataToEnter(){
		int returnValue = JOptionPane.showConfirmDialog(null, "Do you want to enter more data?", 
				"Employee Data",  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		return returnValue == 0? true : false;
	}
}