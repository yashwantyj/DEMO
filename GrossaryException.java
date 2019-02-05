package yash.CAB;

public class GrossaryException extends Exception {
	private static final long serialVersionUID = 1L;
	public GrossaryException()
	{
		super();
	}
	public GrossaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public GrossaryException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	public GrossaryException(String message) 
	{
		super(message);			
	}
	public GrossaryException(Throwable cause) 
	{
		super(cause);			
	}

}
