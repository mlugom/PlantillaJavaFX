/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Estudiante
 */
public class ControladorVista2 {
    private Vista2 vista;
    private Modelo modelo;

    public ControladorVista2(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista2();
        this.vista.getBregresar().setOnAction(new EventoSiguiente());
    }
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    class EventoSiguiente implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVista1 controlador = new ControladorVista1(modelo);
            controlador.mostrarVista();
        }
        
    }
    
}
