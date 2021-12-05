package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class tugasJavaFX2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnRegister = new Button("Register");

        Label firstNameLabel = new Label("First Name   ");
        Label llastNameLabel = new Label("Last Name   ");
        Label label_Email = new Label("E-Mail Address ");
        Label contactLabel = new Label("Contact No  ");
        Label passwordLabel = new Label("Password   ");
        Label confirmpasswordLabel = new Label("Confirm Password");

        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField emailField = new TextField();
        TextField contactField = new TextField();
        TextField passwordField = new TextField();
        TextField confirmPasswordField = new TextField();

        HBox firstNameHBox = new HBox();
        HBox lastNameHBox = new HBox();
        HBox emailHBox = new HBox();
        HBox contactHBox = new HBox();
        HBox passwordHBox = new HBox();
        HBox confirmPasswordHBox = new HBox();
        
        VBox VBoxLahan = new VBox();
        
        firstNameHBox.getChildren().addAll(firstNameLabel, firstNameField);
        firstNameHBox.setSpacing(50);

        lastNameHBox.getChildren().addAll(llastNameLabel, lastNameField);
        lastNameHBox.setSpacing(51);

        emailHBox.getChildren().addAll(label_Email, emailField);
        emailHBox.setSpacing(29);

        contactHBox.getChildren().addAll(contactLabel, contactField);
        contactHBox.setSpacing(49);

        passwordHBox.getChildren().addAll(passwordLabel, passwordField);
        passwordHBox.setSpacing(59);
        
        confirmPasswordHBox.getChildren().addAll(confirmpasswordLabel, confirmPasswordField);
        confirmPasswordHBox.setSpacing(14);

        VBoxLahan.getChildren().addAll(firstNameHBox, lastNameHBox, emailHBox, contactHBox, passwordHBox, confirmPasswordHBox);
        VBoxLahan.setSpacing(10);

        VBoxLahan.setLayoutX(30);
        VBoxLahan.setLayoutY(30);

        Group group = new Group();
        TilePane tp_Panel2 = new TilePane();
        
        tp_Panel2.getChildren().addAll(btnRegister);
        btnRegister.setStyle("-fx-background-color: #2c89fb ");
        btnRegister.textFillProperty();

        tp_Panel2.setLayoutX(180);
        tp_Panel2.setLayoutY(280);
        
        group.getChildren().addAll(VBoxLahan, tp_Panel2);
        
        Scene scene = new Scene(group, 600, 400);
        scene.setFill(Color.WHITE);

        primaryStage.setTitle("Registrasi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}