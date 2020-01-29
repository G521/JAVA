package lesson.logIn;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class demo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root =new Group();
        Scene scene=new Scene(root);
        TextField text=new TextField();
        text.setText("这是个文本框");
        text.setLayoutX(100);
        text.setLayoutY(200);
        text.setPrefSize(500,500);
        root.getChildren().add(text);
        stage.setScene(scene);
        text.setFont(Font.font("宋体"));
        Tooltip tooltip=new Tooltip("这是提示");
        text.setTooltip(tooltip);
        text.setPromptText("请输入7个文字");
        text.setFocusTraversable(false);
        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if (t1.length()>=7){
                    text.setText(s);
                }
            }
        });
        KeyCombination key=new KeyCodeCombination(KeyCode.K,KeyCombination.SHIFT_DOWN);
        scene.getAccelerators().put(key, new Runnable() {
            @Override
            public void run() {
                System.out.println("哈哈！");
            }
        });
        PasswordField password =new PasswordField();
        root.getChildren().add(password);
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setTitle("lesson12");
        stage.show();
    }
}
