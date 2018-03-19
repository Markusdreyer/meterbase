import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestClass extends Application {
    private MeterArchive meterArchive = new MeterArchive();

    /*
     *  unfinished UI for the application.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MeterBase");

        meterArchive.populateList();

        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 300, 250));
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Find instrument");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("RegNr :");
        grid.add(userName, 0, 4);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 4);

        Button findButton = new Button("Find");
        Button showButton = new Button ("Show list");
        Button deleteButton = new Button ("Delete");

        HBox fButton = new HBox(5);
        HBox sButton = new HBox(5);
        HBox dButton = new HBox(5);
        dButton.getChildren().add(deleteButton);
        fButton.getChildren().add(findButton);
        sButton.getChildren().add(showButton);
        grid.add(sButton, 0, 2);
        grid.add(fButton, 0, 5);
        grid.add(dButton, 1, 5);


        findButton.setOnAction((event) -> {
                    String regNr = userTextField.getText();
                    System.out.println(meterArchive.getInstrument(regNr));
        });


        deleteButton.setOnAction((event) ->  {
                    String regNr = userTextField.getText();
                    System.out.println(meterArchive.deleteInstrument(regNr));

        });

        showButton.setOnAction((event) -> {
                    meterArchive.showList();
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}