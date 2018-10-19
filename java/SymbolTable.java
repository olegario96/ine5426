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
        for(String id : symbols.keySet()) {
            System.out.println(id + " " +  symbols.get(id).type);
        }
    }

}