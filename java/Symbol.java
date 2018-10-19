public class Symbol {

    public SymbolType type;
    public boolean nonNative;
    public boolean initialized;

    Symbol(SymbolType type, boolean nonNative, boolean initialized) {
        this.type = type;
        this.nonNative = nonNative;
        this.initialized = initialized;
    }
}
