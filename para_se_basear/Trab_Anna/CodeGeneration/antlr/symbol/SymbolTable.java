package symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable extends Symbol {

    private HashMap<String, Symbol> symbols = new HashMap<>(); // Maps an id to a symbol type
    public SymbolTable parent; // References parent table

    public SymbolTable(SymbolTable parent) {
        super(Symbol.SymbolType.OBJECT, -1);
        this.parent = parent;
    }

    public void put(String id, Symbol symbol) {
        symbols.put(id, symbol);
    }

    public Symbol lookup(String id) {
        return symbols.get(id);
    }

    public void printTable() {
        for(String id : symbols.keySet()) {
            System.out.println(id + " " +  symbols.get(id).type + " " + symbols.get(id).valueType + " " + symbols.get(id).size);
        }
    }

    public void importTable(SymbolTable another) {
        for(Map.Entry<String, Symbol> entry : another.symbols.entrySet()) {
            String key = entry.getKey();
            Symbol value = entry.getValue();
            this.put(key, value);
        }
    }

}
