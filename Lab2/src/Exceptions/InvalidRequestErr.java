package Exceptions;

@SuppressWarnings("serial")
public class InvalidRequestErr extends GeneralErr{
	
	public InvalidRequestErr(int err,String msg) {
		super(err,msg);
		
	}

}
