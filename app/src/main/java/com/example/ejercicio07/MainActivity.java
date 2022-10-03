package com.example.ejercicio07;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Random rnd = new Random();
    int n;
    LinearLayout ll;
    Button b;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.linearLayout);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        n =6;
        anadeLayouts();
        int color=colorAleatorio();
      //  ultimoboton(color);
    }

    private void anadeLayouts() {

    int numBoton=0;
        for (int i = 0; i < n; i++) {
            ll=new LinearLayout(this);
            ll.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1));
            ll.setOrientation(LinearLayout.VERTICAL);
            ll.setId(View.generateViewId());

            for (int j = 0; j < n; j++) {

                b= new Button(this);
                b.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1));
                b.setBackgroundColor(colorAleatorio());
                b.setId(numBoton);
                ll.addView(b);
                numBoton++;
                //System.out.println(b.getId());
            }
            linearLayout.addView(ll);
        }

    }
    private void ultimoboton(int color){
        View view;
        Button b2= new
        int num=0;
        for (int i = 0; i < n; i++) {
            ll.getChildAt(i).setBackgroundColor(color);
            for (int j = 0; j < n; j++) {
       ;num++;
            }
        }

    }
    private int colorAleatorio() {
        int color;

        return color= Color.argb(255,rnd.nextInt(255), rnd.nextInt(255),rnd.nextInt(255));
    }
}