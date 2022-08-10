package src;

import java.util.*;

public class Caminhao {
    
    private int capacidade; //no nosso problema é de 2000 kg
    private ArrayList<Objeto> objetos = new ArrayList<Objeto>();
    
    public Caminhao(){
        
    }
    
    public Caminhao(int capacidade) {
        this.capacidade = capacidade;
        this.objetos = new ArrayList<>();
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }
    
    public double massaTotalObjetos(){
        double peso = 0;
        for(int i = 0; i < this.objetos.size(); i++){
             peso = peso + objetos.get(i).getPeso();
        }
        return peso;
    }
    
    public void insereObjeto(Objeto obj)
    {        
        this.objetos.add(obj);
    }
    
    public void imprimeListaObjetos()
    {
        System.out.print("Lista de Objetos Carregados: ");
        for(int i = 0; i < objetos.size(); i++)
        {
            System.out.print(objetos.get(i).getId() + "(" + objetos.get(i).lucroPorPeso() + ")" + " | ");
        }
        System.out.println("\n");
    }
    
}
