package com.doctum.oc;
public class OperacaoComconjuntos {
    public int conjuntoA;
    public int conjuntoB;
    public int conjuntoC;
    public int conjuntoD;
    public int i;

    public OperacaoComconjuntos(int conjuntoA, int conjuntoB, int conjuntoC, int conjuntoD) {
        this.i = 0;
        this.conjuntoA = conjuntoA;
        this.conjuntoB = conjuntoB;
        this.conjuntoC = conjuntoC;
        this.conjuntoD = conjuntoD;
    }           
    
    public static boolean pertence(int elementoAPesquisar, int[] conjunto) {
        for (int elemento : conjunto) {
            if (elementoAPesquisar == elemento) {
                return true;
            }
        }
        return false;
    }
    
}
