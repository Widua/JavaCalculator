package Controllers;


import Main.Calculate;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private double mem1=0.0, mem2=0.0;
    private char calc=0;

    @FXML
    Button Btn1, Btn2, Btn3, Btn4, Btn5,Btn6,Btn7, Btn8, Btn9,Btn0; // Number Buttons

    @FXML
    Button Btnp,Btnm,Btnmu,Btneq, Btndiv, Btndot, Btnpm, Btncls;  // Function Buttons

    @FXML
    Label TxtF; //Text Label


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { TxtF.setText("0"); }

    // Actions of Numbers Buttons

    public void Btn1Clicked(){

        if(TxtF.getText().equals("0")){
            TxtF.setText("1");
        }else{
            TxtF.setText(TxtF.getText()+"1");
        }

    }

    public void Btn2Clicked(){

        if(TxtF.getText().equals("0")){
            TxtF.setText("2");
        }else{
            TxtF.setText(TxtF.getText()+"2");
        }

    }

    public void Btn3Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("3");
        }else{
            TxtF.setText(TxtF.getText()+"3");
        }
    }

    public void Btn4Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("4");
        }else{
            TxtF.setText(TxtF.getText()+"4");
        }

    }

    public void Btn5Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("5");
        }else{
            TxtF.setText(TxtF.getText()+"5");
        }


    }

    public void Btn6Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("6");
        }else{
            TxtF.setText(TxtF.getText()+"6");
        }

    }

    public void Btn7Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("7");
        }else{
            TxtF.setText(TxtF.getText()+"7");
        }

    }

    public void Btn8Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("8");
        }else{
            TxtF.setText(TxtF.getText()+"8");
        }
    }

    public void Btn9Clicked(){
        if(TxtF.getText().equals("0")){
            TxtF.setText("9");
        }else{
            TxtF.setText(TxtF.getText()+"9");
        }

    }

    public void Btn0Clicked(){
        if(!TxtF.getText().equals("0")){
            TxtF.setText(TxtF.getText()+"0");
        }
    }


    // Action of Math operations Buttons

    public void BtnpClicked(){
        mem1= Double.valueOf(TxtF.getText());
        calc='+';
        TxtF.setText("0");
    }

    public void BtnmClicked(){
        mem1= Double.valueOf(TxtF.getText());
        calc='-';
        TxtF.setText("0");
    }

    public void BtnmuClicked(){
        mem1= Double.valueOf(TxtF.getText());
        calc='*';
        TxtF.setText("0");
    }

    public void BtndivClicked(){
        mem1= Double.valueOf(TxtF.getText());
        calc='/';
        TxtF.setText("0");
    }

    //Action of Special Buttons

    public void BtnclsClicked(){
        TxtF.setText("0");
    }

    public void BtnpmClicked(){
        if (TxtF.getText().contains("-")) {
            TxtF.setText(TxtF.getText().replaceFirst("-",""));
        } else {
            TxtF.setText('-'+TxtF.getText());
        }

    }

    public void BtndotClicked(){
        if(!TxtF.getText().contains(".")){
            TxtF.setText(TxtF.getText()+".");
        }

    }

    //Action of Equal button

    public void BtneqClicked(){
        mem2= Double.valueOf(TxtF.getText());

            Calculate calculate = new Calculate(mem1, mem2);
            if(calc == '+'){
               TxtF.setText(String.valueOf(calculate.ADD()));
            }else if (calc=='-'){
                TxtF.setText(String.valueOf(calculate.SUBTRACT()));
            }else if (calc=='*'){
                TxtF.setText(String.valueOf(calculate.MULTIPLY()));
            }else if (calc=='/'){
                TxtF.setText(calculate.DIVIDE());
            }





    }

    }




