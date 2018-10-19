package com.joao;

import java.util.ArrayList;
import java.util.List;

class FunSymbol extends Symbol {

    public Integer n_params;
    public Integer return_size;
    public List<Integer> sizes = new ArrayList<>();
    public FunSymbol(Integer n_params, Integer return_size) {

        super(SymbolType.FUN);

        this.n_params = n_params;
        this.return_size = return_size;

    }

}
