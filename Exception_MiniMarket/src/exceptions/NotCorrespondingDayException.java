package exceptions;

public class NotCorrespondingDayException extends Exception {

	private static final long serialVersionUID = 1L;
	public NotCorrespondingDayException(int penultimateNumber, int day){
		super(" your penultimate Number "+penultimateNumber+" not corresponds with odd or even number for today "+day);
	}
}
