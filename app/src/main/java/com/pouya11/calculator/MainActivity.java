package com.pouya11.calculator;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textF = (EditText) findViewById(R.id.textField);
        textF.setInputType(0);
        textV = (TextView) findViewById(R.id.label);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this,CONTEXT_RESTRICTED);
        dialog.setTitle("Calculator");
        dialog.setMessage("Welcome To Your Calculator");
        dialog.setIcon(R.drawable.icon);
        dialog.show();

    }

    String text, text2, alamat;
    Double number1, number2, result;
    EditText textF;
    TextView textV;

    public void button1(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"1");
    }
    public void button2(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"2");
    }
    public void button3(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"3");
    }
    public void button4(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"4");
    }
    public void button5(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"5");
    }
    public void button6(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"6");
    }
    public void button7(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"7");
    }
    public void button8(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"8");
    }
    public void button9(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"9");
    }
    public void button10(View view) {
        text =  textF.getText().toString();
            textF.setText(text+"0");
    }

    public void buttonResult(View view) {
        text2 = textF.getText().toString();
        if(text2.compareTo("")!=0 && text4.compareTo("")!=0) {
            number1 = Double.parseDouble(num1);
            number2 = Double.parseDouble(text2);
            if (alamat.compareTo("+") == 0) {
                result = number1 + number2;
                Toast.makeText(this, "Sum = "+result, Toast.LENGTH_LONG).show();
                textF.setText(String.valueOf(result) + "");
                textV.setText("");
                text4 = String.valueOf(result);

            } else if (alamat.compareTo("/") == 0) {
                result = number1 / number2;
                Toast.makeText(this,"Taghsim = "+result, Toast.LENGTH_LONG).show();
                textF.setText(String.valueOf(result) + "");
                textV.setText("");
                text4 = String.valueOf(result);
            } else if (alamat.compareTo("-") == 0) {
                result = number1 - number2;
                Toast.makeText(this,"Sub = "+result, Toast.LENGTH_LONG).show();
                textF.setText(String.valueOf(result) + "");
                textV.setText("");
                text4 = String.valueOf(result);
            } else if (alamat.compareTo("*") == 0) {
                result = number1 * number2;
                Toast.makeText(this,"Zarb = "+result, Toast.LENGTH_LONG).show();
                textF.setText(String.valueOf(result) + "");
                textV.setText("");
                text4 = String.valueOf(result);
            }
        }else{
            Toast.makeText(this,"Please Enter One Number !!!!",Toast.LENGTH_LONG).show();
        }
    }
    String num1;
    String  text4;
    public void buttonPlus(View view){
        num1 = textF.getText().toString();
        text4 = textF.getText().toString();
        if(num1.compareTo("")!=0 && text4.compareTo("")!=0) {
            alamat = "+";
            textF.setText("");
            text4 += "+";
            textV.setText(text4 + "");
        }else{
            Toast.makeText(this,"Please Enter One Number !!!!",Toast.LENGTH_LONG).show();
        }
    }
    public void buttonKam(View view) {
        num1 = textF.getText().toString();
        text4 = textF.getText().toString();
        if(num1.compareTo("")!=0 && text4.compareTo("")!=0){
        alamat = "-";
        textF.setText("");
        text4+="-";
        textV.setText(text4+"");
        }else{
            Toast.makeText(this,"Please Enter One Number !!!!",Toast.LENGTH_LONG).show();
        }
    }

    public void buttonZarb(View view) {
        num1 = textF.getText().toString();
        text4 = textF.getText().toString();
        if(num1.compareTo("")!=0 && text4.compareTo("")!=0) {
            alamat = "*";
            textF.setText("");
            text4 += "*";
            textV.setText(text4 + "");
        }else{
            Toast.makeText(this,"Please Enter One Number !!!!",Toast.LENGTH_LONG).show();
        }
    }

    public void buttonExit(View view) {
        System.exit(0);
    }

    public void buttonTaghsim(View view) {
        num1 = textF.getText().toString();
        text4 = textF.getText().toString();
        if(num1.compareTo("")!=0 && text4.compareTo("")!=0) {
            alamat = "/";
            textF.setText("");
            text4 += "/";
            textV.setText(text4 + "");
        }else{
            Toast.makeText(this,"Please Enter One Number !!!!",Toast.LENGTH_LONG).show();
        }
    }

    public void buttonRestart(View view) {
        textV.setText("");
        textF.setText("");
    }
    public void button_Dot(View view){
        text =  textF.getText().toString();
            textF.setText(text+".");
    }
    public void button_ce(View view){
        textF.setText(Double.parseDouble(textF.getText().toString().substring(0,Integer.parseInt(textF.getText().toString())-1))+"");
    }

}
