package com.mycompany.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.googlecode.aviator.AviatorEvaluator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText("0");
    }
    public void bt2(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText(editText.getText().toString()+"/");
    }
    public void bt3(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText(editText.getText().toString()+"*");
    }
    public void bt4(View view) {
        EditText editText =findViewById(R.id.tv_result);
            editText.setText(editText.getText().toString().substring(0,editText.getText().length()-1));
        if (editText.getText().length()==0)
        {
            editText.setText("0");
        }
    }
    public void bt5(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("7");
        }
        else{
            editText.setText(editText.getText().toString()+"7");
        }
    }
    public void bt6(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("8");
        }
        else{
            editText.setText(editText.getText().toString()+"8");
        }
    }
    public void bt7(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("9");
        }
        else{
            editText.setText(editText.getText().toString()+"9");
        }
    }
    public void bt8(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText(editText.getText().toString()+"-");
    }
    public void bt9(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("4");
        }
        else{
            editText.setText(editText.getText().toString()+"5");
        }
    }
    public void bt10(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("5");
        }
        else{
            editText.setText(editText.getText().toString()+"11");
        }
    }
    public void bt11(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("6");
        }
        else{
            editText.setText(editText.getText().toString()+"6");
        }
    }
    public void bt12(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText(editText.getText().toString()+"+");
    }
    public void bt13(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("1");
        }
        else{
            editText.setText(editText.getText().toString()+"1");
        }
    }
    public void bt14(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("2");
        }
        else{
            editText.setText(editText.getText().toString()+"2");
        }
    }
    public void bt15(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("3");
        }
        else{
            editText.setText(editText.getText().toString()+"3");
        }
    }
    public void bt20(View view) {
        EditText editText =findViewById(R.id.tv_result);
        try {
            Double result= (Double)AviatorEvaluator.exec(editText.getText().toString());
            editText.setText(String.valueOf(result));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void bt17(View view) {
        EditText editText =findViewById(R.id.tv_result);
        try {
            Double result= (Double) AviatorEvaluator.exec(editText.getText().toString());
            editText.setText(String.valueOf(result*0.01));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void bt18(View view) {
        EditText editText =findViewById(R.id.tv_result);
        if (editText.getText().toString().equals("0")&&editText.getText().toString().length()==1)
        {
            editText.setText("0");
        }
        else{
            editText.setText(editText.getText().toString()+"0");
        }
    }
    public void bt19(View view) {
        EditText editText =findViewById(R.id.tv_result);
        editText.setText(editText.getText().toString()+".");
    }
}