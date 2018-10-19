package symbol;

public class Symbol {

	public enum SymbolType {
		VARIABLE,
		FUNCTION,
		OBJECT
	}

	public enum SymbolValueType {
		INT ("int"),
		DOUBLE ("double"),
		BOOLEAN ("boolean"),
		STRING ("string"),
		OBJECT ("object"),
		VOID ("void");

		private final String name;

	    private SymbolValueType(String s) {
	        name = s;
	    }

		public String toString() {
			return this.name;
	 	}
	}

    public SymbolType type; // Variable, function, object
    public SymbolValueType valueType;
    public Integer size = -1;

	public Symbol(SymbolType type, Integer size) {
        this.type = type;
        this.size = size;
    }

    public Symbol(SymbolType type, SymbolValueType valueType, Integer size) {
        this.type = type;
        this.valueType = valueType;
        this.size = size;
    }

}
