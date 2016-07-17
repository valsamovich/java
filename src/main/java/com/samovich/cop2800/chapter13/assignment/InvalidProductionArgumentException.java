
/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */
public class InvalidProductionArgumentException extends Exception
{
	private static final long serialVersionUID = 1L;
	public InvalidProductionArgumentException()
	{
		super("An invalid argument for this method was received.");
	}
	
	public InvalidProductionArgumentException(String msg)
	{
		super(msg);
	}
}
