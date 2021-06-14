package com.example.findtheday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    TextView tv1;
    Button b1;
    int d,m,y,f=0,res=0;
    int check_leapyear(int y)
    {
        if (y % 400 == 0)
            return 1;
        if (y% 100 == 0)
            return 0;
        if (y% 4 == 0)
            return 1;
        return 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        b1 = (Button) findViewById(R.id.b1);
        tv1 = (TextView) findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
                d=Integer.parseInt(et1.getText().toString());
                m=Integer.parseInt(et2.getText().toString());
                y=Integer.parseInt(et3.getText().toString());
                if(m<1 || m>12)
                    tv1.setText("Invalid Input");
                else if(d>31 || d<1){
                    tv1.setText("Invalid Input");
                }
                else if(m==4 || m==6 || m==9 || m==11){
                    if(d>30)
                        tv1.setText("Invalid Input");
                    else{
                        if (m < 3)
                            y -= 1;

                        res = ((y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7);
                        if (res == 1)
                            tv1.setText("Monday");
                        else if (res == 2)
                            tv1.setText("Tuesday");
                        else if (res == 3)
                            tv1.setText("Wednesday");
                        else if (res == 4)
                            tv1.setText("Thursday");
                        else if (res == 5)
                            tv1.setText("Friday");
                        else if (res == 6)
                            tv1.setText("Saturday");
                        else if(res==0)
                            tv1.setText("Sunday");
                    }
                }
                else if(check_leapyear(y)==1){
                        if (m == 2) {
                            if (d > 29)
                                tv1.setText("Invalid Input");
                        }
                        else{
                            if (m < 3)
                                y -= 1;

                            res = ((y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7);
                       if (res == 1)
                            tv1.setText("Monday");
                        else if (res == 2)
                            tv1.setText("Tuesday");
                        else if (res == 3)
                            tv1.setText("Wednesday");
                        else if (res == 4)
                            tv1.setText("Thursday");
                        else if (res == 5)
                            tv1.setText("Friday");
                        else if (res == 6)
                            tv1.setText("Saturday");
                        else if(res==0)
                            tv1.setText("Sunday");
                        }
                    }
                else {
                    if (m == 2) {
                        if (d > 28)
                            tv1.setText("Invalid Input");
                        else {
                            if (m < 3)
                                y -= 1;

                            res = ((y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7);

                            if (res == 1)
                                tv1.setText("Monday");
                            else if (res == 2)
                                tv1.setText("Tuesday");
                            else if (res == 3)
                                tv1.setText("Wednesday");
                            else if (res == 4)
                                tv1.setText("Thursday");
                            else if (res == 5)
                                tv1.setText("Friday");
                            else if (res == 6)
                                tv1.setText("Saturday");
                            else if(res==0)
                                tv1.setText("Sunday");
                        }
                    }
                    else {
                        if (m < 3)
                            y -= 1;

                        res = ((y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7);

                       if (res == 1)
                            tv1.setText("Monday");
                        else if (res == 2)
                            tv1.setText("Tuesday");
                        else if (res == 3)
                            tv1.setText("Wednesday");
                        else if (res == 4)
                            tv1.setText("Thursday");
                        else if (res == 5)
                            tv1.setText("Friday");
                        else if (res == 6)
                            tv1.setText("Saturday");
                        else if(res==0)
                            tv1.setText("Sunday");
                    }
                }
            }
        });
    }
}
