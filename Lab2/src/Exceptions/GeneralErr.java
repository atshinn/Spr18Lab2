package Exceptions;

public class GeneralErr extends Exception {
	public static final int URL=0,NULL_INPUT=1,INVALID_INPUT=2,REQ_METHOD=3;
	public static final String 
			NO = "Url is not supported by this application",
			nullIn="Must enter something into textfields",
			invalidIn="Alphabetic input only",
			invalidReqMeth="Request Method not supported";
	
	protected int err;
	protected String msg;
	
	protected GeneralErr(int err,String msg) {
		this.err = err;
		this.msg = msg;
	}
	
	public int getErrCode() {
		return this.err;
		
	}
	
	public String getErrMsg() {
		return this.msg;
		
	}
}