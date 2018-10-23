package beer.compiler.errors;

public class BeerSemanticException extends Exception {
    private static final long serialVersionUID = 12345678L;
    public BeerSemanticException(String message) {
        super(message);
    }
}
