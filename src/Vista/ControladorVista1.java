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
public class ControladorVista1 {
    private Vista1 vista;
    private Modelo modelo;

    public ControladorVista1(Modelo modelo) {
        this.modelo = modelo;
        this.vista = new Vista1();
        this.vista.getBsiguiente().setOnAction(new EventoSiguiente());
    }
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    class EventoSiguiente implements EventHandler<ActionEvent>{ //clase interna

        @Override
        public void handle(ActionEvent event) {
            ControladorVista2 controlador = new ControladorVista2(modelo);
            controlador.mostrarVista();
        }
        
    }
    
    
}
