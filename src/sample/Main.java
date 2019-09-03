package sample;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage theStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("pacman.fxml"));
        theStage.setTitle( "Pacman" );

        
        Scene theScene = new Scene(SingletonGroup.getInstance());
        theStage.setScene(theScene);

        Canvas canvas = new Canvas( 1225, 600 );
        SingletonGroup.getInstance().getChildren().add(canvas);
        GameManager gameManager = new GameManager();

        gameManager.drawBoard();

        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.movePacman(event));
        theScene.addEventHandler(KeyEvent.KEY_RELEASED, event -> gameManager.stopPacman(event));
        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.restartGame(event));

        theStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
