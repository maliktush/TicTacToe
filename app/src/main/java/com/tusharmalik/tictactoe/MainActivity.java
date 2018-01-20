package com.tusharmalik.tictactoe;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,news;
    int chance=1;
    boolean isover=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
        btn6=findViewById(R.id.b6);
        btn7=findViewById(R.id.b7);
        btn8=findViewById(R.id.b8);
        btn9=findViewById(R.id.b9);
        btn1=findViewById(R.id.one);
        news=findViewById(R.id.r1);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn1.getText()=="") {
                    if (chance == 1) {
                        btn1.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn1.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn2.getText() == "") {
                    if (chance == 1) {
                        btn2.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn2.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn3.getText()=="") {
                    if (chance == 1) {
                        btn3.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn3.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn4.getText()=="") {
                    if (chance == 1) {

                        btn4.setText("X");
                        chance = 2;
                    } else if (chance == 2) {

                        btn4.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn5.getText()=="") {
                    if (chance == 1) {
                        btn5.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn5.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn6.getText()=="") {
                    if (chance == 1) {
                        btn6.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn6.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn7.getText()=="") {
                    if (chance == 1) {
                        btn7.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn7.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn8.getText()=="") {
                    if (chance == 1) {
                        btn8.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn8.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(btn9.getText()=="") {
                    if (chance == 1) {
                        btn9.setText("X");
                        chance = 2;
                    } else if (chance == 2) {
                        btn9.setText("0");
                        chance = 1;
                    }
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sorry this is not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void finish(){
        String a,b,c,d,e,f,g,h,i;
        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();
        if(a.equals(b)&&a.equals(c)&&a.equals("X")&&b.equals("X")&&c.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(a.equals(d)&&a.equals(g)&&a.equals("X")&&d.equals("X")&&g.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(a.equals(e)&&a.equals(i)&&a.equals("X")&&i.equals("X")&&e.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(b.equals(e)&&b.equals(h)&&h.equals("X")&&b.equals("X")&&e.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(c.equals(f)&&c.equals(i)&&c.equals("X")&&f.equals("X")&&i.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(c.equals(e)&&c.equals(g)&&c.equals("X")&&e.equals("X")&&g.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(d.equals(f)&&d.equals(e)&&d.equals("X")&&f.equals("X")&&e.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(g.equals(h)&&g.equals(i)&&g.equals("X")&&h.equals("X")&&i.equals("X")){
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        //0 wins starts here
        if(a.equals(b)&&a.equals(c)&&a.equals("0")&&b.equals("0")&&c.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(a.equals(d)&&a.equals(g)&&a.equals("0")&&d.equals("0")&&g.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(a.equals(e)&&a.equals(i)&&a.equals("0")&&i.equals("0")&&e.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(b.equals(e)&&b.equals(h)&&h.equals("0")&&b.equals("0")&&e.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(c.equals(f)&&c.equals(i)&&c.equals("0")&&f.equals("0")&&i.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(c.equals(e)&&c.equals(g)&&c.equals("0")&&e.equals("0")&&g.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(d.equals(f)&&d.equals(e)&&d.equals("0")&&f.equals("0")&&e.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(g.equals(h)&&g.equals(i)&&g.equals("0")&&h.equals("0")&&i.equals("0")){
            Toast.makeText(MainActivity.this, "Player 0 won", Toast.LENGTH_SHORT).show();
            isover=true;
        }
        if(isover==true){
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            isover=false;

        }
        if((a.equals("X")||a.equals("0")) && (b.equals("X")||b.equals("0")) &&
                (c.equals("X")||c.equals("0")) && (d.equals("X")||d.equals("0")) &&
                (e.equals("X")||e.equals("0")) && (f.equals("X")||f.equals("0")) &&
                (g.equals("X")||g.equals("0")) && (h.equals("X")||h.equals("0")) &&
                (i.equals("X")||i.equals("0")) && isover==false){
                       Toast.makeText(MainActivity.this, "Its a tie", Toast.LENGTH_SHORT).show();
            final Handler h1 = new Handler();
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                }
            };
            h1.postDelayed(r, 2500);
        }

    }
    }


