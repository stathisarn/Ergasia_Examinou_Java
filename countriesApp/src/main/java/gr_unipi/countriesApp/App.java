package gr_unipi.countriesApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    // Stage
    static Stage primaryStage;

    // Scenes
    static Scene mainScene, countriesScene, searchByParameterScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Create main scene
        SceneCreator mainSceneCreator = new MainSceneCreator(1600, 1000);
        mainScene = mainSceneCreator.createScene();

        // Create countries scene
        SceneCreator countriesSceneCreator = new CountriesSceneCreator(1600, 1000);
        countriesScene = countriesSceneCreator.createScene();

        // Set main scene to primary stage
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("MainFX Window");
        primaryStage.show();
    }

    // Method to switch to countries scene
    public static void switchToCountriesScene() {
        primaryStage.setScene(countriesScene);
        primaryStage.setTitle("Countries Scene");
    }

    // Method to switch to main scene
    public static void switchToMainScene() {
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("MainFX Window");
    }

    // Method to switch to search by parameter scene
    public static void switchToSearchByParameterScene() {
        if (searchByParameterScene == null) {
            SceneCreator searchByParameterSceneCreator = new SearchByParameterSceneCreator(1600, 1000); // Adjust the width and height as needed
            searchByParameterScene = searchByParameterSceneCreator.createScene();
        }
        primaryStage.setScene(searchByParameterScene);
        primaryStage.setTitle("Search by Parameter");
    }

    public static void main(String[] args) {
        launch();
    }
}
