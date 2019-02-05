package ch.loway.oss.ari4java.tools;

public class ARIException extends Exception {

    private static final long serialVersionUID = 1L;

    public ARIException(String message) {
        this(message, true);
    }

    public ARIException(String message, boolean writableStackTrace) {
        super(message, null, true, writableStackTrace);
    }

    public ARIException(Throwable cause) {
        super(null, cause, true, true);
    }
}
