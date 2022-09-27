package com.example.titledpaneaccordion;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Titled Pane / Accordion");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2 ,1);

        //Declaracion de un objeto TitledPane

        TitledPane tp = new TitledPane("My Titled Pane", new Button("Irrelevante"));
        tp.setAnimated(false);
        tp.setCollapsible(false);
        tp.setExpanded(false);
        grid.add(tp, 0,1);

        //Titled Pane con formulario

        TitledPane tp2 = new TitledPane();
        GridPane grid2 = new GridPane();
        grid2.setVgap(4);
        grid2.setPadding(new Insets(5, 5, 5, 5));
        grid2.add(new Label("First Name: "), 0, 0);
        grid2.add(new TextField(), 1, 0);
        grid2.add(new Label("Last Name: "), 0, 1);
        grid2.add(new TextField(), 1, 1);
        grid2.add(new Label("Email: "), 0, 2);
        grid2.add(new TextField(), 1, 2);
        tp2.setText("Titled Pane Formulario");
        tp2.setContent(grid2);
        grid.add(tp2, 0,2);

        //Ejemplo de ComboBox editable



        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Ejemplos sobre el componente ComboBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}