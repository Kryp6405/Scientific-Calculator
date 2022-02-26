package com.example.newcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainLay;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, B1, B2, B3, B4, B5, B6, B7, bC, bM, p1, p2;
    TextView t, name;
    String finalAnswer;
    int i, j;
    boolean clear, calcDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLay = findViewById(R.id.mainLay);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);
        B6 = findViewById(R.id.B6);
        B7 = findViewById(R.id.B7);
        bC = findViewById(R.id.bC);
        bM = findViewById(R.id.bM);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        t = findViewById(R.id.t);
        name = findViewById(R.id.name);
        clear = false;
        calcDone = false;

        //starting color settings for the calculator
        mainLay.setBackgroundColor(Color.BLACK);
        t.setTextColor(Color.WHITE);
        name.setTextColor(Color.WHITE);
        b1.setBackgroundColor(Color.rgb(76,76,76));
        b2.setBackgroundColor(Color.rgb(76,76,76));
        b3.setBackgroundColor(Color.rgb(76,76,76));
        b4.setBackgroundColor(Color.rgb(255,165,0));
        b5.setBackgroundColor(Color.rgb(76,76,76));
        b6.setBackgroundColor(Color.rgb(76,76,76));
        b7.setBackgroundColor(Color.rgb(76,76,76));
        b8.setBackgroundColor(Color.rgb(255,165,0));
        b9.setBackgroundColor(Color.rgb(76,76,76));
        B1.setBackgroundColor(Color.rgb(76,76,76));
        B2.setBackgroundColor(Color.rgb(76,76,76));
        B3.setBackgroundColor(Color.rgb(255,165,0));
        B4.setBackgroundColor(Color.rgb(169,169,169));
        B5.setBackgroundColor(Color.rgb(76,76,76));
        B6.setBackgroundColor(Color.rgb(169,169,169));
        B7.setBackgroundColor(Color.rgb(255,165,0));
        bC.setBackgroundColor(Color.rgb(169,169,169));
        bM.setBackgroundColor(Color.rgb(169,169,169));
        p1.setBackgroundColor(Color.rgb(169,169,169));
        p2.setBackgroundColor(Color.rgb(169,169,169));
        B4.setTextColor(Color.BLACK);
        B6.setTextColor(Color.BLACK);
        bC.setTextColor(Color.BLACK);
        bM.setTextColor(Color.BLACK);
        p1.setTextColor(Color.BLACK);
        p2.setTextColor(Color.BLACK);

        //high contrast mode button
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i%2 == 1) {
                    mainLay.setBackgroundColor(Color.WHITE);
                    t.setTextColor(Color.BLACK);
                    t.setTextColor(Color.BLACK);
                    name.setTextColor(Color.BLACK);
                    b1.setBackgroundColor(Color.rgb(230,230,230));
                    b2.setBackgroundColor(Color.rgb(230,230,230));
                    b3.setBackgroundColor(Color.rgb(230,230,230));
                    b4.setBackgroundColor(Color.rgb(0,255,255));
                    b5.setBackgroundColor(Color.rgb(230,230,230));
                    b6.setBackgroundColor(Color.rgb(230,230,230));
                    b7.setBackgroundColor(Color.rgb(230,230,230));
                    b8.setBackgroundColor(Color.rgb(0,255,255));
                    b9.setBackgroundColor(Color.rgb(230,230,230));
                    B1.setBackgroundColor(Color.rgb(230,230,230));
                    B2.setBackgroundColor(Color.rgb(230,230,230));
                    B3.setBackgroundColor(Color.rgb(0,255,255));
                    B4.setBackgroundColor(Color.rgb(130,130,130));
                    B5.setBackgroundColor(Color.rgb(230,230,230));
                    B6.setBackgroundColor(Color.rgb(130,130,130));
                    B7.setBackgroundColor(Color.rgb(0,255,255));
                    bC.setBackgroundColor(Color.rgb(130,130,130));
                    bM.setBackgroundColor(Color.rgb(130,130,130));
                    p1.setBackgroundColor(Color.rgb(130,130,130));
                    p2.setBackgroundColor(Color.rgb(130,130,130));
                    b1.setTextColor(Color.BLACK);
                    b2.setTextColor(Color.BLACK);
                    b3.setTextColor(Color.BLACK);
                    b4.setTextColor(Color.BLACK);
                    b5.setTextColor(Color.BLACK);
                    b6.setTextColor(Color.BLACK);
                    b7.setTextColor(Color.BLACK);
                    b8.setTextColor(Color.BLACK);
                    b9.setTextColor(Color.BLACK);
                    B1.setTextColor(Color.BLACK);
                    B2.setTextColor(Color.BLACK);
                    B3.setTextColor(Color.BLACK);
                    B4.setTextColor(Color.WHITE);
                    B5.setTextColor(Color.BLACK);
                    B6.setTextColor(Color.WHITE);
                    B7.setTextColor(Color.BLACK);
                    bC.setTextColor(Color.WHITE);
                    bM.setTextColor(Color.WHITE);
                    p1.setTextColor(Color.WHITE);
                    p2.setTextColor(Color.WHITE);
                }
                else{
                    mainLay.setBackgroundColor(Color.BLACK);
                    t.setTextColor(Color.WHITE);
                    name.setTextColor(Color.WHITE);
                    b1.setBackgroundColor(Color.rgb(76,76,76));
                    b2.setBackgroundColor(Color.rgb(76,76,76));
                    b3.setBackgroundColor(Color.rgb(76,76,76));
                    b4.setBackgroundColor(Color.rgb(255,165,0));
                    b5.setBackgroundColor(Color.rgb(76,76,76));
                    b6.setBackgroundColor(Color.rgb(76,76,76));
                    b7.setBackgroundColor(Color.rgb(76,76,76));
                    b8.setBackgroundColor(Color.rgb(255,165,0));
                    b9.setBackgroundColor(Color.rgb(76,76,76));
                    B1.setBackgroundColor(Color.rgb(76,76,76));
                    B2.setBackgroundColor(Color.rgb(76,76,76));
                    B3.setBackgroundColor(Color.rgb(255,165,0));
                    B4.setBackgroundColor(Color.rgb(169,169,169));
                    B5.setBackgroundColor(Color.rgb(76,76,76));
                    B6.setBackgroundColor(Color.rgb(169,169,169));
                    B7.setBackgroundColor(Color.rgb(255,165,0));
                    bC.setBackgroundColor(Color.rgb(169,169,169));
                    bM.setBackgroundColor(Color.rgb(169,169,169));
                    p1.setBackgroundColor(Color.rgb(169,169,169));
                    p2.setBackgroundColor(Color.rgb(169,169,169));
                    b1.setTextColor(Color.WHITE);
                    b2.setTextColor(Color.WHITE);
                    b3.setTextColor(Color.WHITE);
                    b4.setTextColor(Color.WHITE);
                    b5.setTextColor(Color.WHITE);
                    b6.setTextColor(Color.WHITE);
                    b7.setTextColor(Color.WHITE);
                    b8.setTextColor(Color.WHITE);
                    b9.setTextColor(Color.WHITE);
                    B1.setTextColor(Color.WHITE);
                    B2.setTextColor(Color.WHITE);
                    B3.setTextColor(Color.WHITE);
                    B4.setTextColor(Color.BLACK);
                    B5.setTextColor(Color.WHITE);
                    B6.setTextColor(Color.BLACK);
                    B7.setTextColor(Color.WHITE);
                    bC.setTextColor(Color.BLACK);
                    bM.setTextColor(Color.BLACK);
                    p1.setTextColor(Color.BLACK);
                    p2.setTextColor(Color.BLACK);
                }
            }
        });

        //2nd Mode for trig and exp
        bC.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                j++;
                if(j%2 == 1){
                    b1.setText("sin");
                    b1.setTextSize(20);
                    b2.setText("cos");
                    b2.setTextSize(20);
                    b3.setText("tan");
                    b3.setTextSize(20);
                    b5.setText("arcsin");
                    b5.setTextSize(12);
                    b6.setText("arccos");
                    b6.setTextSize(12);
                    b7.setText("arctan");
                    b7.setTextSize(12);
                    b9.setText("x^2");
                    b9.setTextSize(20);
                    B1.setText("x^3");
                    B1.setTextSize(20);
                    B2.setText("sqrt");
                    B2.setTextSize(18);
                    B5.setText("exp");
                    B5.setTextSize(20);
                }
                else{
                    b1.setText("1");
                    b1.setTextSize(31);
                    b2.setText("2");
                    b2.setTextSize(31);
                    b3.setText("3");
                    b3.setTextSize(31);
                    b5.setText("4");
                    b5.setTextSize(31);
                    b6.setText("5");
                    b6.setTextSize(31);
                    b7.setText("6");
                    b7.setTextSize(31);
                    b9.setText("7");
                    b9.setTextSize(31);
                    B1.setText("8");
                    B1.setTextSize(31);
                    B2.setText("9");
                    B2.setTextSize(31);
                    B5.setText("0");
                    B5.setTextSize(31);
                }

            }
        });

        //number 1 or sine
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("1");
                if(b1.getText().toString().equals("sin")){
                    t.setText("sin(");
                    clear = false;
                }
                else {
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("1");
                        else
                            t.append("1");
                        clear = false;
                    }
                    else
                        t.append("1");
                }
            }
        });

        //number 2 or cosine
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("2");
                if(b2.getText().toString().equals("cos")){
                    t.setText("cos(");
                    clear = false;
                }
                else {
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("2");
                        else
                            t.append("2");
                        clear = false;
                    }
                    else
                        t.append("2");
                }
            }
        });

        //number 3 or tan
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("3");
                if(b3.getText().toString().equals("tan")){
                    t.setText("tan(");
                    clear = false;
                }
                else {
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("3");
                        else
                            t.append("3");
                        clear = false;
                    }
                    else
                        t.append("3");
                }
            }
        });

        //number 4 or arcsine
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("4");
                if(b5.getText().toString().equals("arcsin")){
                    t.setText("arcsin(");
                    clear = false;
                }
                else{
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("4");
                        else
                            t.append("4");
                        clear = false;
                    }
                    else
                        t.append("4");
                }
            }
        });

        //number 5 or arccosine
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("5");
                if(b6.getText().toString().equals("arccos")){
                    t.setText("arccos(");
                    clear = false;
                }
                else {
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("5");
                        else
                            t.append("5");
                        clear = false;
                    }
                    else
                        t.append("5");
                }
            }
        });

        //number 6 or arctan
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("6");
                if(b7.getText().toString().equals("arctan")){
                    t.setText("arctan(");
                    clear = false;
                }
                else {
                    if (t.getText().equals("0") || clear) {
                        if(!(t.getText().toString().equals("(")))
                            t.setText("6");
                        else
                            t.append("6");
                        clear = false;
                    }
                    else
                        t.append("6");
                }
            }
        });

        //number 7 or x^2
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("7");
                if(t.getText().equals("0") || clear) {
                    if(!(t.getText().toString().equals("(")))
                        t.setText("7");
                    else
                        t.append("7");
                    clear = false;
                }
                else
                    t.append("7");
            }
        });

        //number 8 or x^3
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("8");
                if(t.getText().equals("0") || clear) {
                    if(!(t.getText().toString().equals("(")))
                        t.setText("8");
                    else
                        t.append("8");
                    clear = false;
                }
                else
                    t.append("8");
            }
        });

        //number 9 or sqrt
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("9");
                if(t.getText().equals("0") || clear) {
                    System.out.println(t.getText()+" "+clear);
                    if(!(t.getText().toString().equals("(")))
                        t.setText("9");
                    else
                        t.append("9");
                    clear = false;
                }
                else
                    t.append("9");
            }
        });

        //number 0 or exp
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("0");
                if(t.getText().equals("0") || clear) {
                    t.setText("0");
                    clear = false;
                }
                else
                    t.append("0");
            }
        });

        //clear
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("0");
                clear = true;
            }
        });

        //division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("/");
                t.append("/");
            }
        });

        //multiplication
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("*");
                t.append("*");
            }
        });

        //subtraction
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("-");
                t.append("-");
            }
        });

        //addition
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("+");
                t.append("+");
            }
        });

        //open parentheses
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2("(");
                t.append("(");
            }
        });

        //close parentheses
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrTxtForErr2(")");
                t.append(")");
            }
        });

        //equals
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (checkTrig() == false) {
                    ArrayList<String> a1 = new ArrayList<String>();
                    ArrayList<String> a2 = new ArrayList<String>();
                    a1 = convStrToArr("" + t.getText());
                    if (a1 != null && a1.size() == 1) {
                        t.setText(a1.get(0));
                    } else if (a1 != null && a1.get(0).equals("ERROR"))
                        t.setText("ERROR");
                    else {
                        a2 = recurMultDiv(a1);
                        if (a2 != null && a2.get(0).equals("ERROR"))
                            t.setText("ERROR");
                        else {
                            finalAnswer = recurPlusSub(a2);
                            //System.out.println(finalAnswer);
                            t.setText(finalAnswer);
                        }
                    }
                }

            }
        });
    }

    //recursively do mult and div operations for a given arraylist
    //return an arraylist containing only add and sub operations OR a final answer in index 0 of the arraylist
    public ArrayList<String> recurMultDiv(ArrayList<String> a) {
        ArrayList<String> temp = new ArrayList<String>();
        //System.out.println(a);

        for (int k = 1; k < a.size(); k+=2){
            if(a.get(k).equals("*") || a.get(k).equals("/")){
                if(a.get(k).equals("*")) {
                    temp.add(String.valueOf(Double.parseDouble(a.get(k-1))*Double.parseDouble(a.get(k+1))));
                }
                else if(a.get(k).equals("/")){
                    if(a.get(k+1).equals("0")){
                        temp.clear();
                        temp.add("ERROR");
                        return temp;
                    }
                    else{
                        temp.add(String.valueOf(Double.parseDouble(a.get(k - 1)) / Double.parseDouble(a.get(k + 1))));
                    }
                }
                for(int l = k+2; l < a.size(); l++){
                    temp.add(a.get(l));
                }
                break;
            }
            else{
                temp.add(a.get(k-1));
                temp.add(a.get(k));
                if(k+1 == a.size()-1)
                    temp.add(a.get(k+1));
            }
        }
        if(temp == null)
            return a;
        else if(a.size() != temp.size() && temp.size() > 1)
            return recurMultDiv(temp);
        else
            return temp;
    }

    //recursively do add and sub operations for a given arraylist
    //return final asnwer as a string
    public String recurPlusSub(ArrayList<String> a) {
        ArrayList<String> temp = new ArrayList<String>();
        //System.out.println(a);
        if(a.size() == 1)
            return a.get(0);

        for (int k = 1; k < a.size(); k+=2){
            if(a.get(k).equals("+") || a.get(k).equals("-")){
                if(a.get(k).equals("+")) {
                    temp.add(String.valueOf(Double.parseDouble(a.get(k-1))+Double.parseDouble(a.get(k+1))));
                }
                else if(a.get(k).equals("-")){
                    temp.add(String.valueOf(Double.parseDouble(a.get(k-1))-Double.parseDouble(a.get(k+1))));
                }
                if(k+2 < a.size()){
                    for(int l = k+2; l < a.size(); l++){
                        temp.add(a.get(l));
                    }
                }
                break;
            }
            else{
                temp.add(a.get(k-1));
                temp.add(a.get(k));
                if(k+1 == a.size()-1)
                    temp.add(a.get(k+1));
            }
        }
        //System.out.println(temp);
        if(temp == null)
            return a.toString();
        else if(a.size() != temp.size() && temp.size() > 1)
            return recurPlusSub(temp);
        else
            return temp.get(0);
    }

    //converts a string to and arraylist
    //takes care of parentheses by recursively simplifying the inside into just another string
    public ArrayList<String> convStrToArr(String s){
        ArrayList<String> newA = new ArrayList<String>();
        boolean conv = false;
        if(s == null){
            newA.add("ERROR");
            return newA;
        }
        if(s.charAt(0) == '-')
            s = "0"+s;
        if(s.charAt(0) == '+' || s.charAt(0) == '*' || s.charAt(0) == '/') {
            newA.add("ERROR");
            return newA;
        }
        else if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '*' || s.charAt(s.length()-1) == '/') {
            newA.add("ERROR");
            return newA;
        }

        int p1Index = s.indexOf("(");
        int p2Index = s.indexOf(")");
        if (p1Index < 1 && p2Index < 1) {//no para
            conv = true;
        }
        else if(p2Index < 1 || p1Index < 0){//one para
            newA.add("ERROR");
            return newA;
        }
        else if(p2Index > p1Index){//both para, second after first
            String pString = s.substring(p1Index + 1, p2Index);

            //System.out.println(pString);
            ArrayList<String> newP = new ArrayList<String>();
            ArrayList<String> newP2 = new ArrayList<String>();
            newP = convStrToArr(pString);
            if (newP != null && newP.get(0).equals("ERROR")){
                newA.clear();
                newA.add("ERROR");
                return newA;
            }
            else {
                newP2 = recurMultDiv(newP);
                if (newP2 != null && newP2.get(0).equals("ERROR")) {
                    newA.clear();
                    newA.add("ERROR");
                    return newA;
                }
                else {
                    s = s.substring(0,p1Index)+recurPlusSub(newP2)+s.substring(p2Index+1, s.length());
                    //System.out.println(s);
                    conv = true;
                }
            }
        }

        if(conv) {
            int index = 0;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == '+' || s.charAt(k) == '-' || s.charAt(k) == '*' || s.charAt(k) == '/') {
                    if (s.charAt(k + 1) == '+' || s.charAt(k + 1) == '-' || s.charAt(k + 1) == '*' || s.charAt(k + 1) == '/') {
                        newA.clear();
                        newA.add("ERROR");
                        return newA;
                    }
                    newA.add(s.substring(index, k));
                    newA.add(s.substring(k, k + 1));
                    index = k + 1;
                    k++;
                }
            }
            newA.add(s.substring(index));
            return newA;
        }
        else {
            newA.clear();
            newA.add("conv is false");
            return newA;
        }
    }

    //if the output is ERROR, then just replace the error with clicked button
    public void clrTxtForErr2(String s){
        if(t.getText().toString().trim().equals("ERROR") || t.getText().toString().trim().equals("0")) {
                t.setText("");
        }

    }

    //compute any trigonometric expression
    public boolean checkTrig(){
        String x = t.getText().toString();
        if(x != null && x.length() > 5) {
            if (x.substring(0, 3).equals("sin")) {
                String y = x.substring(4, x.length() - 1);
                //System.out.println(y);
                double z = Math.sin(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            } else if (x.substring(0, 3).equals("cos")) {
                String y = x.substring(4, x.length() - 1);
                //System.out.println(y);
                double z = Math.cos(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            } else if (x.substring(0, 3).equals("tan")) {
                String y = x.substring(4, x.length() - 1);
                //System.out.println(y);
                double z = Math.tan(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            } else if (x.substring(0, 6).equals("arcsin")) {
                String y = x.substring(7, x.length() - 1);
                //System.out.println(y);
                double z = Math.asin(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            } else if (x.substring(0, 6).equals("arccos")) {
                String y = x.substring(7, x.length() - 1);
                //System.out.println(y);
                double z = Math.acos(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            } else if (x.substring(0, 6).equals("arctan")) {
                String y = x.substring(7, x.length() - 1);
                //System.out.println(y);
                double z = Math.atan(Double.parseDouble(y));
                //System.out.println(z);
                t.setText(String.valueOf(z));
                return true;
            }
        }
        return false;
    }
}