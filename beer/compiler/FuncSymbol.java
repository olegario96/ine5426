package compiler;

import java.util.ArrayList;

public class FuncSymbol extends Symbol {

	//Lista com os tipos dos parametros
 	public ArrayList<String> paramType = new ArrayList<>();

 	//Tipo de retorno
	public SymbolType returnType;

	public FuncSymbol(SymbolType returnType, ArrayList<String> paramType) {
		super(SymbolType.FUNCTION, false, false);
		this.returnType = returnType;
		this.paramType = paramType;
	}

}
