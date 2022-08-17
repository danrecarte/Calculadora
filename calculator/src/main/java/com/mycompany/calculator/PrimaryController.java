package com.mycompany.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

@FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button six;

    @FXML
    private TextField textbox;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button division;

    @FXML
    private Button times;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    void addvalue(ActionEvent event) {
       textbox.setText(textbox.getText()+ ((Button)event.getSource()).getText());
       operacion = true;
    }

    @FXML
    void operation(ActionEvent event) {
        if (operacion){
            textbox.setText(textbox.getText()+ ((Button)event.getSource()).getText());
            operacion = false;
        }
    }

  

private boolean operacion = true;


    @FXML
    void cleaner(ActionEvent event) {
        textbox.setText("");
        operacion = true;
    }

  

    @FXML
    void equalitazer(ActionEvent event) {
        String operations = textbox.getText();
        ScriptEngineManager Manager = new ScriptEngineManager();
        ScriptEngine engine=manager.getEngineByName(shortname.js);
        catch(ScriptException|ParserException e){
            texbox.setText("");
        }
        
    }
}
