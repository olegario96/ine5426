package com.joao;

class VarSymbol extends Symbol {

    public Integer size;
    public boolean initialized;

    public VarSymbol(Integer size, boolean initialized) {

        super(SymbolType.VAR);

        this.size = size;
        this.initialized = initialized;

    }

    public boolean global = false;

    public VarSymbol(Integer size, Boolean initialized, boolean global) {
        super(SymbolType.VAR);

        this.size = size;
        this.initialized = initialized;

        this.global = global;
    }

    public boolean param = false;
    public VarSymbol(Integer size, boolean initialized, boolean global, boolean param) {
        super(SymbolType.VAR);

        this.size = size;
        this.initialized = initialized;

        this.global = global;

        this.param = param;
    }
}
