package src;

import java.util.*;

public class Teste {
    
    public static void main(String[] args) {
        
        MaximizaLucro teste = new MaximizaLucro();
        Caminhao caminhao = new Caminhao(2500);
        teste.funcaoOtimizacao(caminhao);
    }
}

