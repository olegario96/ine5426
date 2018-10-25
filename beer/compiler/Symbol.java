package beer.compiler;

import java.util.ArrayList;

public class Symbol {

    public SymbolType type;
    public boolean nonNative;
    public boolean initialized;
    public int sizeParameters;
    public ArrayList<String> typesParameters;

    Symbol(SymbolType type, boolean nonNative, boolean initialized) {
        this.type = type;
        this.nonNative = nonNative;
        this.initialized = initialized;
        this.sizeParameters = 0;
        this.typesParameters = new ArrayList<String>();
    }
}
