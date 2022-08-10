/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.*;

public class MaximizaLucro {
    
    
    private static ArrayList<Objeto> listaObjetos;
    private static int solucao[];
    private static Caminhao caminhao;

    public MaximizaLucro() {
        
        caminhao = new Caminhao(2500);
        
        
        //alocar os objetos
        Objeto obj1 = new Objeto(1, 400, 200);
        Objeto obj2 = new Objeto(2, 500, 200);
        Objeto obj3 = new Objeto(3, 700, 300);
        Objeto obj4 = new Objeto(4, 900, 400);
        Objeto obj5 = new Objeto(5, 600, 400);
        
        listaObjetos = new ArrayList<>();
        
        //alocar objetos na lista
        listaObjetos.add(obj1);
        listaObjetos.add(obj2);
        listaObjetos.add(obj3);
        listaObjetos.add(obj4);
        listaObjetos.add(obj5);
        
        imprimeListaObjetos();
        //solucao passa a ser do mesmo tamanho que a lista de objetos
        solucao = new int[listaObjetos.size()];
        
    }
    
    public ArrayList<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(ArrayList<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public int[] getSolucao() {
        return solucao;
    }

    public void setSolucao(int[] solucao) {
        this.solucao = solucao;
    }
    
    public void imprimeListaObjetos()
    {
        System.out.println("Lista de Objetos: ");
        
        for(int i = 0; i < listaObjetos.size(); i++)
        {
            System.out.print(listaObjetos.get(i).getId() + "(" + listaObjetos.get(i).lucroPorPeso() + ")" + " | ");
        }
        System.out.println("\n");
    }
    
    public void imprimeVetorSolucao(){
        System.out.println("Vetor Solução: ");
        
        for(int i = 0; i < solucao.length; i++){
            System.out.print(solucao[i] + " | ");
        }
    }
    
    public void funcaoOtimizacao(Caminhao caminhao) {
        Objeto objeto = new Objeto();
        Collections.sort(listaObjetos, objeto);
        
        System.out.println("Ordenação");
        imprimeListaObjetos(); //vai exibir ordenado
        
        int i = 0;
        
        while(caminhao.massaTotalObjetos() <= caminhao.getCapacidade()){
            
            if(caminhao.massaTotalObjetos() + listaObjetos.get(i).getPeso() <= caminhao.getCapacidade()){
                
                if(caminhao.getObjetos().add(listaObjetos.get(i))){
                    solucao[listaObjetos.get(i).getId() - 1] = 1;
                } else{
                    solucao[listaObjetos.get(i).getId() -1] = 0;
                }
                //System.out.println(caminhao.getObjetos().get(i).getId());
            }
            i++; 
            if(i >= listaObjetos.size()){
                break;
            }
        }
        caminhao.imprimeListaObjetos();
        imprimeVetorSolucao();
    }
}
