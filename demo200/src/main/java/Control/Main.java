package Control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author sowme
 */
public class Main extends Application {

    public static Stage primaryStage;
    /*
    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Panel1FXML.fxml")));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }*/
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/Panel1FXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //stage.setTitle("Sus Among!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        //primaryStage.getIcons().add(new Image(("file:src/main/resources/com/example/demo4/amongus_icon.png")));
    }

    public static void main(String[] args) {
        launch();
    }

}
