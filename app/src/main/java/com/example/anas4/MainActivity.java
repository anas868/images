package com.example.anas4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView pec;
    int n =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pec =findViewById(R.id.pec);
    }

    public void left(View view) {
        if(n ==5){
            pec.setImageResource(R.drawable.f4);
            n--;
        }
        else {
            if(n ==4){
                pec.setImageResource(R.drawable.f3);
                n--;
            }
            else {
                if(n ==3){
                    pec.setImageResource(R.drawable.f1);
                    n--;
                }
                else {
                    if(n ==2){
                        pec.setImageResource(R.drawable.f1);
                        n--;
                    }
                    else{
                        pec.setImageResource(R.drawable.f5);
                        n =5;
                    }
                }
            }
        }
    }

    public void right(View view) {
        if(n ==1){
            pec.setImageResource(R.drawable.f2);
            n++;
        }
        else {
            if(n ==2){
                pec.setImageResource(R.drawable.f3);
                n++;
            }
            else {
                if(n ==3){
                    pec.setImageResource(R.drawable.f4);
                    n++;
                }
                else {
                    if(n ==4){
                        pec.setImageResource(R.drawable.f5);
                        n++;
                    }
                    else{
                        pec.setImageResource(R.drawable.f1);
                        n =1;
                    }
                }
            }
        }
    }
}