package com.joao;

public class IRUtils {

    private static int t = 0;
    public static String newTempName() {
        return "%t_" + t++;
    }

    public static String getVarName(VarSymbol var) {
        if (var.global) {
            return "@v_" + var.hashCode();
        }
        return "%v_" + var.hashCode();
    }

    public static String getForIntName(ForIntSymbol fi) {
        return "%fi_" + fi.hashCode();
    }

    public static String newTempLabel() {
        return "l_" + t++;
    }

}