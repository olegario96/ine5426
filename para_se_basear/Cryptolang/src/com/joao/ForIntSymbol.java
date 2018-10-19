package com.joao;

class ForIntSymbol extends Symbol {

    public Integer max_val;

    public ForIntSymbol(Integer max_val) {

        super(SymbolType.FORINT);

        this.max_val = max_val;

    }

}
