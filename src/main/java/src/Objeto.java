package src;

import java.util.*;

public class Objeto implements Comparator<Objeto>{
    
    //todo objeto tem peso, lucro e um id
    private double peso;
    private double lucro;
    private int id;

    public Objeto() {
    }
    
    public Objeto(int id, double peso, double lucro) {
        this.peso = peso;
        this.lucro = lucro;
        this.id = id;
    }
    
    public double lucroPorPeso(){
        return (this.lucro / this.peso);
        
    } //a função de inserção deve levar isso em consideração
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    @Override
    public int compare(Objeto obj1, Objeto obj2) {
        
        if(obj1.lucroPorPeso() < obj2.lucroPorPeso()){
            return 1;
        }
        
        if(obj2.lucroPorPeso() < obj1.lucroPorPeso()){
            return -1;
        }
        
        return 0; //quando obj1 == obj2
    }
    
    
}
