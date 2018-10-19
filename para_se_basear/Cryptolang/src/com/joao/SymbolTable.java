package com.joao;

import java.util.HashMap;

public class SymbolTable {

    public SymbolTable parent;
    private HashMap<String, Symbol> symbols = new HashMap<>();
    public String ir = "";

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public void add(String id, Symbol symbol) {
        symbols.put(id, symbol);
    }

    public Symbol lookup(String id) {
        return symbols.get(id);
    }

}