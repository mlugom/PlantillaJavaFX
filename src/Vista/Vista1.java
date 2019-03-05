/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Vista1 {
    private Scene escena;
    private VBox layout;
    private Label lnombre; 
    private Label lapellido;
    private TextField tnombre;
    private TextField tapellido;
    private Button bsiguiente;

    public Vista1() {
        this.layout = new VBox();
        this.lnombre = new Label("Nombre");
        this.lapellido = new Label("Apellido");
        this.tnombre = new TextField();
        this.tapellido = new TextField();
        this.bsiguiente = new Button("Siguiente");
        this.layout.getChildren().add(this.lnombre);
        this.layout.getChildren().add(this.tnombre);
        this.layout.getChildren().add(this.lapellido);
        this.layout.getChildren().add(this.tapellido);
        this.layout.getChildren().add(this.bsiguiente);
        this.escena = new Scene(layout, 200, 300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Vista 1");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getTnombre() {
        return tnombre;
    }

    public TextField getTapellido() {
        return tapellido;
    }

    public Button getBsiguiente() {
        return bsiguiente;
    }
    
}
