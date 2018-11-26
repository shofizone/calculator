package com.open.shofiul.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mButton1;
    private TextView mButton2;
    private TextView mButton3;
    private TextView mButton4;
    private TextView mButton5;
    private TextView mButton6;
    private TextView mButton7;
    private TextView mButton8;
    private TextView mButton9;
    private TextView mButton0;
    private TextView mButton00;
    private TextView mButtonDot;

    private TextView mTvResult, mTvSubResult;


    private ImageView mButtonBackspace;
    private ImageView mButtonEqual;
    private ImageView mButtonPercent;
    private ImageView mButtonPlus;
    private ImageView mButtonMinus;
    private ImageView mButtonMul;
    private ImageView mButtonDiv;
    private TextView mButtonAC;


    private double first,second,temp;
    private String operator;
    Boolean mIsResultCalculated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.open.shofiul.calculator.R.layout.activity_main);
        initButtons();
        initFucntions();
        initNumeric();

        mTvResult.setText("0");

    }

    private void initFucntions() {

        mButtonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = mTvResult.getText().toString();
                if(str!="0" && Integer.parseInt(str)>0){
                    mTvResult.setText(str.substring(0, str.length() - 1));
                }else if(Integer.parseInt(str)>0 && Integer.parseInt(str)<=9){
                    mTvResult.setText("0");
                }



            }
        });

        mButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvResult.setText("0");
                operator = "";
                mTvSubResult.setText("");
                first =0;
                second =0;
                temp=0;
            }
        });

        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();
                mTvSubResult.setText(str+ "+");
                first = Double.parseDouble(str);
                mTvResult.setText("0");
                operator = "+";

            }
        });

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();
                mTvSubResult.setText(str+ "-");
                first = Double.parseDouble(str);
                mTvResult.setText("0");
                operator = "-";

            }
        });

        mButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();
                mTvSubResult.setText(str+ "/");
                first = Double.parseDouble(str);
                mTvResult.setText("0");
                operator = "/";

            }
        });

        mButtonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();
                mTvSubResult.setText(str+ "*");
                first = Double.parseDouble(str);
                mTvResult.setText("0");
                operator = "*";

            }
        });
        mButtonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();
                second = Double.parseDouble(str);
                mTvResult.setText(((first*second)/100)+"");
                mIsResultCalculated = true;


            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();

                second = Double.parseDouble(str);
                if(second !=0 && operator != null){
                    mTvSubResult.setText(mTvSubResult.getText() + str);
                    switch (operator){
                        case "+":
                            mTvResult.setText((first+second)+"");
                            mIsResultCalculated = true;
                            break;

                        case "-":
                            mTvResult.setText((first-second)+"");
                            mIsResultCalculated = true;
                            break;

                        case "/":
                            mTvResult.setText((first/second)+"");
                            mIsResultCalculated = true;
                            break;
                        case"*":
                            mTvResult.setText((first*second)+"");
                            mIsResultCalculated = true;
                            break;

                        default:
                            break;
                    }
                }
                operator = "";

            }
        });




    }

    private void initNumeric() {

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("1");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "1");
                }
            }
        });



        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(mIsResultCalculated){
                    mTvResult.setText("2");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "2");
                }

            }
        });


        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mIsResultCalculated){
                    mTvResult.setText("3");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "3");
                }

            }
        });


        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("4");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "4");
                }

            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("5");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "5");
                }

            }
        });


        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("6");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "6");
                }

            }
        });


        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("7");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "7");
                }

            }
        });


        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("8");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "8");
                }

            }
        });


        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("9");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "9");
                }

            }
        });


        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("0");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "0");
                }

            }
        });


        mButton00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIsResultCalculated){
                    mTvResult.setText("00");
                    mIsResultCalculated =false;
                }else {
                    mTvResult.setText(mTvResult.getText()+ "00");
                }

            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = mTvResult.getText().toString();

                if(  str.indexOf(".")==-1)
                mTvResult.setText(str+ ".");

            }
        });




    }



    private void initButtons(){
        mTvResult = (TextView) findViewById(R.id.tv_result);
        mTvResult.setText("0");

        mTvSubResult = (TextView) findViewById(R.id.tv_sub_resut) ;
        mTvSubResult.setText("");

        mButton1 = (TextView) findViewById(R.id.bt_1);
        mButton2 = (TextView) findViewById(R.id.bt2);
        mButton3 = (TextView) findViewById(R.id.bt3);
        mButton4 = (TextView) findViewById(R.id.bt4);
        mButton5 = (TextView) findViewById(R.id.bt5);
        mButton6 = (TextView) findViewById(R.id.bt6);
        mButton7 = (TextView) findViewById(R.id.bt_7);
        mButton8 = (TextView) findViewById(R.id.bt_8);
        mButton9 = (TextView) findViewById(R.id.bt_9);
        mButton0 = (TextView) findViewById(R.id.bt_0);
        mButton00 = (TextView) findViewById(R.id.bt_00);
        mButtonDot = (TextView) findViewById(R.id.bt_dot);


        mButtonBackspace = (ImageView) findViewById(R.id.bt_back_space);
        mButtonEqual = (ImageView) findViewById(R.id.bt_equal);
        mButtonPercent = (ImageView) findViewById(R.id.bt_percent);
        mButtonPlus = (ImageView) findViewById(R.id.bt_plus);
        mButtonMul = (ImageView) findViewById(R.id.bt_mul);
        mButtonDiv = (ImageView) findViewById(R.id.bt_div);
        mButtonMinus = (ImageView) findViewById(R.id.bt_minus);
        mButtonAC = (TextView) findViewById(R.id.bt_ac);





    }
}
