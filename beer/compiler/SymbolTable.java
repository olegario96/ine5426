package beer.compiler;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    public SymbolTable parent;
    private HashMap<String, Symbol> symbols = new HashMap<>();
    public String ir = "";

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public void add(String id, Symbol symbol) {
        this.symbols.put(id, symbol);
    }

    public Symbol lookup(String id) {
        return this.symbols.get(id);
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        String out = "";
        for(String id : symbols.keySet()) {
            out = out.concat(id + " " +  symbols.get(id).type+"\n");
        }
        return out.trim();
    }

}
