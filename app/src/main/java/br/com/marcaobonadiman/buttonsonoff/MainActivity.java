package br.com.marcaobonadiman.buttonsonoff;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    private boolean flagBtn1, flagBtn2, flagBtn3, flagBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flagBtn1 = true;
        flagBtn2 = false;
        flagBtn3 = false;
        flagBtn4 = false;

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);

        btn1.setText(R.string.bancada);
        btn3.setText(R.string.bancada);
        btn4.setText(R.string.bancada);

        showBtn1();
        showBtn2();
        showBtn3();
        showBtn4();


        btn2.setOnClickListener((View v) -> {
            flagBtn1 = !flagBtn1;
            showBtn1();
        });

        btn2.setOnClickListener((View v) -> {
            flagBtn2 = !flagBtn2;
            showBtn2();
        });


        btn3.setOnClickListener((View v) -> {
            flagBtn3 = !flagBtn3;
            showBtn3();
        });

        btn4.setOnClickListener((View v) -> {
            flagBtn4 = !flagBtn4;
            showBtn4();
        });

    }

    private void showBtn1(){
        if (flagBtn1){
            btn1.setBackgroundResource(R.drawable.button_retang_on);
            btn1.setTextColor(Color.parseColor("#08bd0b")); // Verde
            btn1.setText(R.string.bancada);
        }else{
            btn1.setBackgroundResource(R.drawable.button_retang_off);
            btn1.setTextColor(Color.parseColor("#eb0920")); // Vermelho
            btn1.setText(R.string.bancada);
        }
    }

    @SuppressLint("SetTextI18n")
    private void showBtn2(){
        if (flagBtn2){
            btn2.setBackgroundResource(R.drawable.button_round_on);
            btn2.setTextColor(Color.parseColor("#08bd0b")); // Verde
            btn2.setText(R.string.on);
        }else{
            btn2.setBackgroundResource(R.drawable.button_round_off);
            btn2.setTextColor(Color.parseColor("#eb0920")); // Vermelho
            btn2.setText(R.string.off);
        }
    }

    private void showBtn3(){
        if (flagBtn3){
            btn3.setBackgroundResource(R.drawable.button_custon_ligado);
        }else{
            btn3.setBackgroundResource(R.drawable.button_custon_desligado);
        }
    }


    private void showBtn4(){
        if (flagBtn4){
            btn4.setBackgroundResource(R.drawable.button_custon_ligado_bb);
        }else{
            btn4.setBackgroundResource(R.drawable.button_custon_desligado_bb);
        }
    }

}