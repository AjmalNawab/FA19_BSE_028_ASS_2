package com.example.fa19_bse_028_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_back,btn_open;
    TextView textView;

    int pin= 9907;
    int tr =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn0=findViewById(R.id.btn_0);
       btn1=findViewById(R.id.btn_1);
       btn2=findViewById(R.id.btn_2);
       btn3=findViewById(R.id.btn_3);
       btn4=findViewById(R.id.btn_4);
       btn5=findViewById(R.id.btn_5);
       btn6=findViewById(R.id.btn_6);
       btn7=findViewById(R.id.btn_7);
       btn8=findViewById(R.id.btn_8);
       btn9=findViewById(R.id.btn_9);
       btn_back=findViewById(R.id.btn_back);
       btn_open=findViewById(R.id.btn_open);
       textView=findViewById(R.id.textView);
       ;


       btn0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String str= textView.getText().toString();
               textView.setText(str+"0");
           }
       });


       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String str= textView.getText().toString();
               textView.setText(str+"1");
           }
       });


       btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"2");
            }
        });


       btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"3");
            }
        });


       btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"4");
            }
        });


       btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"5");
            }
        });


       btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"6");
            }
        });


       btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"7");
            }
        });


       btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"8");
            }
        });


       btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                textView.setText(str+"9");
            }
        });


       btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str= textView.getText().toString();
                str = str.substring(0, str.length() - 1);

                textView.setText(str);

            }
        });


       btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter Any Pin",Toast.LENGTH_SHORT).show();
                }

                else if (textView.getText().toString().length()<4)
                {
                    Toast.makeText(MainActivity.this,"Please Enter at least 4 digits",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    int x= Integer.parseInt(textView.getText().toString());

                    if(x==pin)
                    {
                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        finish();
                        startActivity(intent);
                    }

                    else
                    {
                        tr++;

                        if (tr==3)
                        {
                            finish();
                        }

                        else
                        {
                            Toast.makeText(MainActivity.this,"Wrong Key! Please Try Again",Toast.LENGTH_SHORT).show();
                            textView.setText("");
                        }
                    }
                }

            }
        });
    }
}