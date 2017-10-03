package com.doctum.oc;

public class Principal {
    public static void main(String[] args) {
        int[] conjuntoA = {1,3,5};
        int[] conjuntoB = {8,2};
        int[] conjuntoC = new int [20];
        int[] conjuntoD = new int [11];
        
        for(int i = 0 ; i < 20; i++){
            conjuntoC[i]=i+1;
        }
        for(int i = 0 ; i < 11; i++){
           conjuntoD[i]=i*10;
        }
        
        System.out.println("4 pertence ao conjunto A: " + OperacaoComconjuntos.pertence(4,conjuntoA));
        System.out.println("9 pertence ao conjunto B : " + OperacaoComconjuntos.pertence(9,conjuntoB));
        System.out.println("18 pertence ao conjunto C: " + OperacaoComconjuntos.pertence(18,conjuntoC));
        System.out.println("15 pertence ao conjunto B: " + OperacaoComconjuntos.pertence(15,conjuntoB));
        System.out.println("2 pertence ao conjunto A: " + OperacaoComconjuntos.pertence(2,conjuntoA));
        System.out.println("7 pertence ao conjunto C: " + OperacaoComconjuntos.pertence(7,conjuntoC));
        System.out.println("13 pertence ao conjunto C: " + OperacaoComconjuntos.pertence(13,conjuntoC));
        System.out.println("60 pertence ao conjunto C: " + OperacaoComconjuntos.pertence(60,conjuntoC));
        System.out.println("3 pertence ao conjunto C: " + OperacaoComconjuntos.pertence(3,conjuntoC));
        System.out.println("5 pertence ao conjunto D: " + OperacaoComconjuntos.pertence(5,conjuntoD));
        System.out.println("30 pertence ao conjunto D: " + OperacaoComconjuntos.pertence(30,conjuntoD));
        System.out.println("95 pertence ao conjunto D: " + OperacaoComconjuntos.pertence(95,conjuntoD));
    }
}
