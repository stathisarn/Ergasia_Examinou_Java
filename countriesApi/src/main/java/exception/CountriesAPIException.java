package exception;

public class CountriesAPIException extends Exception {
	public CountriesAPIException() {
        super();
    }

    public CountriesAPIException(String message) {
        super(message);
    }

    public CountriesAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public CountriesAPIException(Throwable cause) {
        super(cause);
    }

    protected CountriesAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}