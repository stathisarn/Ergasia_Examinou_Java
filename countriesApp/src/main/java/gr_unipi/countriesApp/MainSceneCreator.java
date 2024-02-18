package gr_unipi.countriesApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

// MainSceneCreator class responsible for creating the main scene of the application
public class MainSceneCreator extends SceneCreator {

    // Root FlowPane to hold the main scene elements
    FlowPane rootFlowPane;

    // Buttons for searching all countries and searching by parameter
    Button allButton, paramButton;

    // Constructor to initialize the main scene with specified width and height
    public MainSceneCreator(double width, double height) {
        super(width, height);

        // Initialize the root FlowPane and buttons
        rootFlowPane = new FlowPane();
        allButton = new Button("Search all countries");
        paramButton = new Button("Search by parameter");

        // Set properties for the root FlowPane
        rootFlowPane.setHgap(10);
        rootFlowPane.setAlignment(Pos.CENTER);
        rootFlowPane.getChildren().addAll(allButton, paramButton);

        // Event handler for the "Search all countries" button
        allButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create and set countries scene
                SceneCreator countriesSceneCreator = new CountriesSceneCreator(650, 300);
                App.countriesScene = countriesSceneCreator.createScene();
                if (App.primaryStage != null && App.countriesScene != null) {
                    App.primaryStage.setScene(App.countriesScene);
                    App.primaryStage.setTitle("All Countries");
                }
            }
        });

        // Event handler for the "Search by parameter" button
        paramButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create and set search by parameter scene
                SceneCreator searchByParamSceneCreator = new SearchByParameterSceneCreator(650, 300);
                App.countriesScene = searchByParamSceneCreator.createScene();
                if (App.primaryStage != null && App.countriesScene != null) {
                    App.primaryStage.setScene(App.countriesScene);
                    App.primaryStage.setTitle("Search By Parameter");
                }
            }
        });
    }

    // Method to create the main scene
    @Override
    Scene createScene() {
        return new Scene(rootFlowPane, 1600, 1000); // Return the main scene with specified dimensions
    }
}
