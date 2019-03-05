/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Estudiante
 */
public class Modelo {
    private int contador;

    public Modelo() {
        this.contador = 0;
    }
    
    public void subir(){
        this.contador++;
    }
    
    public void bajar(){
        this.contador--;
    }

    public int getContador() {
        return contador;
    }
    
}
