/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Singleton singleton = Singleton.getSingleton(); //Registrando el state como variable global
        singleton.setStage(primaryStage);
        Modelo modelo = new Modelo(); 
        ControladorVista1 controlador = new ControladorVista1(modelo); //Invocando al controlador principal
        controlador.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
