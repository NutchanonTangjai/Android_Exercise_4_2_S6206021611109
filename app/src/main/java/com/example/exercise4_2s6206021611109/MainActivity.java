//6206021611109 ณัฐชนน ต่างใจ
package com.example.exercise4_2s6206021611109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numText;
    private Button buttonUp;
    private Button buttonDown;
    private Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numText = (TextView) findViewById(R.id.numText);
        buttonUp = (Button) findViewById(R.id.buttonUp);
        buttonDown = (Button) findViewById(R.id.buttonDown);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonUp.setOnClickListener(this);
        buttonDown.setOnClickListener(this);
        buttonReset.setOnClickListener(this);

    }

    public void up(){
        int newnum = Integer.parseInt(numText.getText().toString());
        newnum++;
        String mes = Integer.toString(newnum);
        numText.setText(mes);
        if((newnum) % 5 == 0){
            Toast.makeText( this, mes + " is Divided by 5",Toast.LENGTH_LONG).show();
        }
    }
    public void down(){
        int newnum = Integer.parseInt(numText.getText().toString());
        newnum--;
        String mes = Integer.toString(newnum);
        numText.setText(mes);
        if ((newnum) % 5 == 0) {
            Toast.makeText(this, mes + " is Divided by 5", Toast.LENGTH_LONG).show();
        }

    }
    public void reset(){
        int newnum = Integer.parseInt(numText.getText().toString());
        newnum = 0;
        String mes = Integer.toString(newnum);
        numText.setText(mes);
        if((newnum) % 5 == 0){
            Toast.makeText( this, mes + " is Divided by 5",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v)
    {
        if (v == buttonUp) {
            up();
        }
        if (v == buttonDown) {
            down();
        }
        if (v == buttonReset) {
            reset();
        }
    }
}