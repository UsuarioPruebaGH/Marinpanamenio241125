/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrafoRecursivo grafo = new  GrafoRecursivo(4);
        
        grafo.InsertarNodo('A'); //0
        grafo.InsertarNodo('B'); //1
        grafo.InsertarNodo('C'); //2
        grafo.InsertarNodo('D'); //3
        
        grafo.conectar(0, 1); //ARISTA A, B
        grafo.conectar(0, 2); //ARISTA A, C
        grafo.conectar(1, 3); //ARISTA A, B
        grafo.conectar(2, 3);
        
        System.out.println("Recorrido dfs desde el nodo A");
        
        grafo.dfs(0);
    }
    
}
