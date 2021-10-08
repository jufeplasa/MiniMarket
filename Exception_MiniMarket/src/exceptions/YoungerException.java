package exceptions;

public class YoungerException extends Exception {

	private static final long serialVersionUID = 1L;
	public YoungerException() {
		super("You are too young to enter in the mini market");
	}
}
