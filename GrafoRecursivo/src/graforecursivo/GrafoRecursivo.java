/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author UFG
 */

public class GrafoRecursivo {

    Nodo[] nodos;
    boolean[][] adyacencia;
    boolean[] visitado;

    public GrafoRecursivo(int tamano){
        nodos = new Nodo[tamano];
        adyacencia = new boolean[tamano][tamano];
        visitado = new boolean[tamano];
    }

    public void InsertarNodo(char valor){
        for (int i = 0; i < nodos.length; i++) {
            if(nodos[i] == null){
                nodos[i] = new Nodo(valor);
                return;
            }
        }
        System.out.println("Espacio insuficiente");
    }

    public void conectar(int origen, int destino){
        adyacencia[origen][destino] = true;
        adyacencia[destino][origen] = true;
    }


    public void dfs(int origen){

        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
        }
        recorrer(origen);
    }

    private void recorrer(int actual){

        visitado[actual] = true;
        System.out.print(nodos[actual].valor + " ");


        for(int i = 0; i < nodos.length; i++){
            if(adyacencia[actual][i] && !visitado[i]){
                recorrer(i);
            }
        }
    }
}
