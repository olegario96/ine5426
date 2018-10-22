package beer.compiler.errors;

import java.util.ArrayList;

public class BeerErrors {
    public boolean throwOnError = true;

    protected ArrayList<BeerSemanticError> errors = new ArrayList<>();

    public BeerErrors() {
        new BeerErrors(true);
    }

    public ArrayList<BeerSemanticError> getErrors() {
        return errors;
    }

    public BeerErrors(boolean throwOnError) {
        this.throwOnError = throwOnError;
    }

    public void push(BeerSemanticError e) {
        errors.add(e);

        String message = "Semantic error on line "+e.getLine()+": "+e.getMessage();

        if (throwOnError) {
            //throw new BeerSemanticException(message);
        } else {
            System.out.println(message);
        }
    }
}
