package com.example.krestikinoliki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] humanMoveValue = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] androidMoveValue = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] generalMoveValue = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int humanUp;
    int humanMiddle;
    int humanBottom;
    int humanLeft;
    int humanCenter;
    int humanRight;
    int humanLrdio;
    int humanRldio;
    int androidUp;
    int androidMiddle;
    int androidBottom;
    int androidLeft;
    int androidCenter;
    int androidRight;
    int androidLrdio;
    int androidRldio;
    int quantityMove = 0;

    TextView textView2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        textView2 = (TextView) findViewById(R.id.textView2);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonStart = (Button) findViewById(R.id.buttonStart);


        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                boolean firstPlay = random.nextBoolean();
                if   (firstPlay == true) {
                    textView2.setText ( "Ваш ход" );

                    button1.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button1.setText ( "X" );
                            humanMoveValue[0]=1;
                            generalMoveValue[0]=1;
                            quantityMove++;
                            button1.setEnabled ( false );
                            Random random3 = new Random();
                            int rnd3 = random3.nextInt(100);

                            if     (quantityMove==9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                              if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                  textView2.setText ( "Победа!!!" );
                              }
                              textView2.setText ( "Ничья" );}
                            else if(quantityMove==7)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanUp==3|| humanLeft==3|| humanLrdio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );


                                    if(generalMoveValue[1]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[0]+generalMoveValue[4]+generalMoveValue[8]!=3&&humanLrdio == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if(quantityMove==5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanUp==3 || humanLeft ==3 || humanLrdio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                            }
                            else if(quantityMove==3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];



                                if (humanUp==2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLeft==2){
                                    if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLrdio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                            }
                            else if(quantityMove==1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 13 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 16 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (humanMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }

                            }
                        }
                    } );

                    button2.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button2.setText ( "X" );
                            humanMoveValue[1]=1;
                            generalMoveValue[1]=1;
                            quantityMove++;
                            button2.setEnabled ( false );
                            Random random3 = new Random();
                            int rnd3 = random3.nextInt(100);

                            if     (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if(quantityMove == 7)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanUp==3|| humanCenter==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                    else{
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[1]+generalMoveValue[4]+generalMoveValue[7]!=3&&humanCenter  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if(quantityMove == 5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[2]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                            }
                            else if(quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanUp==2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanCenter==2){
                                    if (generalMoveValue[ 4] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[ 6 ] == 0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );

                                }


                            }
                            else if(quantityMove == 1)  {


                                if (rnd3 <= 3 && generalMoveValue[0]==0) {
                                    button1.setText("0" );
                                    androidMoveValue[0]=1;
                                    generalMoveValue[0]=1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 6 && generalMoveValue[2]==0) {
                                    button3.setText("0" );
                                    androidMoveValue[2]=1;
                                    generalMoveValue[2]=1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 9 && generalMoveValue[3]==0) {
                                    button4.setText("0" );
                                    androidMoveValue[3]=1;
                                    generalMoveValue[3]=1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 12 && generalMoveValue[5]==0) {
                                    button6.setText("0" );
                                    androidMoveValue[5]=1;
                                    generalMoveValue[5]=1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 15 && generalMoveValue[6]==0) {
                                    button7.setText("0" );
                                    androidMoveValue[6]=1;
                                    generalMoveValue[6]=1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 18 && generalMoveValue[7]==0) {
                                    button8.setText("0" );
                                    androidMoveValue[7]=1;
                                    generalMoveValue[7]=1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 21 && generalMoveValue[8]==0) {
                                    button9.setText("0" );
                                    androidMoveValue[8]=1;
                                    generalMoveValue[8]=1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if(generalMoveValue[4]==0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button3.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button3.setText ( "X" );
                            humanMoveValue[ 2 ] = 1;
                            generalMoveValue[ 2 ] = 1;
                            quantityMove++;
                            button3.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanUp==3|| humanRight==3|| humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }




                                }

                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[2]+generalMoveValue[4]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }

                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if (quantityMove == 5)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];



                                if (humanUp == 2) {
                                    if (generalMoveValue[1] == 0) {
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRight == 2) {
                                    if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button4.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button4.setText ( "X" );
                            humanMoveValue[ 3 ] = 1;
                            generalMoveValue[ 3 ] = 1;
                            quantityMove++;
                            button4.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanLeft==3|| humanMiddle==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[3]+generalMoveValue[4]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                        if(generalMoveValue[0]==1 && generalMoveValue[6]!=1) {
                                            button7.setText ( "0" );
                                            androidMoveValue[ 6 ] = 1;
                                            generalMoveValue[ 6 ] = 1;
                                            quantityMove++;
                                            button7.setEnabled ( false );
                                        }
                                        else{
                                            button1.setText ( "0" );
                                            androidMoveValue[ 0 ] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if (quantityMove == 5)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];



                                if (humanLeft ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 3)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];
                                if (humanMiddle == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }

                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[ 2 ] == 0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );

                                }


                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button5.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button5.setText ( "X" );
                            humanMoveValue[ 4 ] = 1;
                            generalMoveValue[ 4 ] = 1;
                            quantityMove++;
                            button5.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanMiddle==3|| humanCenter==3||humanRldio==3 || humanLrdio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[4]+generalMoveValue[3]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }
                                    else{
                                        button4.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }




                                }

                                else if (generalMoveValue[4]+generalMoveValue[1]+generalMoveValue[7]!=3&&humanCenter == 2) {



                                    if(generalMoveValue[1]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[2]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[0]+generalMoveValue[8]!=3&&humanLrdio  == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if (quantityMove == 5)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanMiddle == 3 || humanCenter == 3 || humanLrdio == 3 || humanRldio == 3) {



                                    textView2.setText ( "Победа!!!" );
                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (humanMoveValue[ 0 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 8 ] == 1 && generalMoveValue[ 0 ] != 1) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 1 ] == 1 && generalMoveValue[ 7 ] != 1) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 7 ] == 1 && generalMoveValue[ 1 ] != 1) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 5 ] == 1 && generalMoveValue[ 3 ] != 1) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 3 ] == 1 && generalMoveValue[ 5 ] != 1) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] != 1 && generalMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] != 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] != 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] != 1 && generalMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanMiddle == 2) {
                                    if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                } else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }

                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 15 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 30 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 45 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 60 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 70 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 80 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 90 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;

                                } else if (generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button6.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button6.setText ( "X" );
                            humanMoveValue[ 5 ] = 1;
                            generalMoveValue[ 5 ] = 1;
                            quantityMove++;
                            button7.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanRight==3|| humanMiddle==3){
                                    textView2.setText ( "Победа!!!" );

                                }

                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[5]+generalMoveValue[4]+generalMoveValue[3]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[3]!=1) {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if (quantityMove == 5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanRight ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }


                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[3]!=1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[3]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[2] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[2] != 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanMiddle == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                }
                                else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else if (generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );

                                }


                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button7.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button7.setText ( "X" );
                            humanMoveValue[ 6 ] = 1;
                            generalMoveValue[ 6 ] = 1;
                            quantityMove++;
                            button7.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanBottom==3|| humanLeft==3|| humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3 &&humanBottom == 2) {

                                        if(generalMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                            button9.setText ( "0" );
                                            androidMoveValue[ 8 ] = 1;
                                            generalMoveValue[ 8 ] = 1;
                                            quantityMove++;
                                            button9.setEnabled ( false );
                                        }
                                        else{
                                            button8.setText ( "0" );
                                            androidMoveValue[ 7 ] = 1;
                                            generalMoveValue[ 7 ] = 1;
                                            quantityMove++;
                                            button8.setEnabled ( false );
                                        }




                                }

                                else if (generalMoveValue[6]+generalMoveValue[3]+generalMoveValue[0]!=3&&humanLeft == 2) {

                                        if(generalMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0" );
                                            androidMoveValue[ 0] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }
                                        else{
                                            button4.setText ( "0" );
                                            androidMoveValue[ 3 ] = 1;
                                            generalMoveValue[ 3 ] = 1;
                                            quantityMove++;
                                            button4.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[6]+generalMoveValue[4]+generalMoveValue[2]!=3 &&humanRldio  == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                            button3.setText ( "0" );
                                            androidMoveValue[ 2 ] = 1;
                                            generalMoveValue[ 2 ] = 1;
                                            quantityMove++;
                                            button3.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0" );
                                            androidMoveValue[ 4 ] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }

                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                            else if (quantityMove == 5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];




                                if (humanBottom ==3 || humanLeft ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }



                            }
                            else if (quantityMove == 3)  {


                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanBottom == 2) {
                                    if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button8.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button8.setText ( "X" );
                            humanMoveValue[ 7 ] = 1;
                            generalMoveValue[ 7 ] = 1;
                            quantityMove++;
                            button8.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanCenter==3|| humanBottom==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3&&humanBottom == 2) {

                                        if(generalMoveValue[6]==1 && generalMoveValue[8]!=1) {
                                            button9.setText ( "0" );
                                            androidMoveValue[ 8 ] = 1;
                                            generalMoveValue[ 8 ] = 1;
                                            quantityMove++;
                                            button9.setEnabled ( false );
                                        }
                                        else{
                                            button7.setText ( "0" );
                                            androidMoveValue[ 6 ] = 1;
                                            generalMoveValue[ 6 ] = 1;
                                            quantityMove++;
                                            button7.setEnabled ( false );
                                        }




                                }


                                else if (generalMoveValue[7]+generalMoveValue[4]+generalMoveValue[1]!=3&&humanCenter  == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[1]!=1) {
                                            button2.setText ( "0" );
                                            androidMoveValue[ 1 ] = 1;
                                            generalMoveValue[ 1 ] = 1;
                                            quantityMove++;
                                            button2.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0" );
                                            androidMoveValue[ 4] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }


                                    }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanBottom ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[1]!=1 ){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[1]==1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[6] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[6] != 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 ){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];



                                if (humanBottom == 2) {
                                    if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "0" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }

                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else if (generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );

                                }


                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }
                            }
                        }
                    } );

                    button9.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {

                            button9.setText ( "X" );
                            humanMoveValue[ 8 ] = 1;
                            generalMoveValue[ 8 ] = 1;
                            quantityMove++;
                            button9.setEnabled ( false );
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if      (quantityMove == 9)  {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if   (humanUp==3||humanMiddle==3 ||humanBottom==3 ||humanLeft==3 ||humanCenter==3|| humanRight==3|| humanLrdio==3 ||humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                textView2.setText ( "Ничья" );}
                            else if (quantityMove == 7)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanBottom==3|| humanRight==3|| humanLrdio==3) {
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanBottom == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0" );
                                            androidMoveValue[ 0 ] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0" );
                                            androidMoveValue[ 4 ] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }




                                }

                                else if (generalMoveValue[8]+generalMoveValue[5]+generalMoveValue[2]!=3&&humanRight == 2) {

                                        if(generalMoveValue[5]==1 && generalMoveValue[2]!=1) {
                                            button3.setText ( "0" );
                                            androidMoveValue[ 2 ] = 1;
                                            generalMoveValue[2 ] = 1;
                                            quantityMove++;
                                            button3.setEnabled ( false );
                                        }
                                        else{
                                            button6.setText ( "0" );
                                            androidMoveValue[ 5 ] = 1;
                                            generalMoveValue[ 5 ] = 1;
                                            quantityMove++;
                                            button6.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanLrdio  == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0" );
                                            androidMoveValue[ 0 ] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0" );
                                            androidMoveValue[ 4 ] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 5)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 3)  {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                               if (humanBottom == 2) {
                                    if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                               else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                               else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if(generalMoveValue[ 6 ]==0){
                                        button7.setText ( "0" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                }

                               else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                   androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                               else {
                                    button1.setText ( "0" );
                                   androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 1)  {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    button5.setEnabled ( false );
                                    quantityMove++;
                                }


                            }
                        }
                    } );
                }

                else{
                    textView2.setText("Начинает Android");
                    Random random2 = new Random();
                    int rnd2 = random2.nextInt(100);
                    if (rnd2 <= 3) {
                        button1.setText("X" );
                        androidMoveValue[0]=1;
                        generalMoveValue[0]=1;
                        button1.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 6) {
                        button2.setText("X" );
                        androidMoveValue[1]=1;
                        generalMoveValue[1]=1;
                        button2.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 9) {
                        button3.setText("X" );
                        androidMoveValue[2]=1;
                        generalMoveValue[2]=1;
                        button3.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 13) {
                        button4.setText("X" );
                        androidMoveValue[3]=1;
                        generalMoveValue[3]=1;
                        button4.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 16) {
                        button6.setText("X" );
                        androidMoveValue[5]=1;
                        generalMoveValue[5]=1;
                        button6.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 19) {
                        button7.setText("X" );
                        androidMoveValue[6]=1;
                        generalMoveValue[6]=1;
                        button7.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 22) {
                        button8.setText("X" );
                        androidMoveValue[7]=1;
                        generalMoveValue[7]=1;
                        button8.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 25) {
                        button9.setText("X" );
                        androidMoveValue[8]=1;
                        generalMoveValue[8]=1;
                        button9.setEnabled ( false );
                        quantityMove++;
                    }
                    else {
                        button5.setText("X" );
                        androidMoveValue[4]=1;
                        generalMoveValue[4]=1;
                        button5.setEnabled ( false );
                        quantityMove++;
                    }




                    button1.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button1.setText ( "0" );
                            humanMoveValue[ 0 ] = 1;
                            generalMoveValue[ 0 ] = 1;
                            quantityMove++;
                            button1.setEnabled ( false );

                            if      (quantityMove == 8) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];
                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];


                                if(humanUp==3|| humanLeft==3|| humanLrdio==3){
                                    textView2.setText ( "Победа!!!" );
                                }


                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }


                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                    if (generalMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                        else {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                }

                                else if (generalMoveValue[0]+generalMoveValue[4]+generalMoveValue[8]!=3&&humanLrdio == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                }
                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button3.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                            else if (quantityMove == 6) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanUp==3 || humanLeft ==3 || humanLrdio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];

                                if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanUp==2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLeft==2){
                                    if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLrdio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                }
                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 1 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 5 ] == 1 && androidMoveValue[ 3 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 5 ] == 1 && androidMoveValue[ 4 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 4 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 5 ] == 1 && androidMoveValue[ 2 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 6 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 2) {
                               if ( androidMoveValue[ 1 ] == 1 || androidMoveValue[ 7 ] == 1||androidMoveValue[ 3 ] == 1  || androidMoveValue[ 5 ] == 1 ) {
                                button5.setText ( "X" );
                                androidMoveValue[ 4 ] = 1;
                                generalMoveValue[ 4 ] = 1;
                                quantityMove++;
                                button5.setEnabled ( false );
                               }
                               else if ( androidMoveValue[ 2 ] == 1 ) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                                else if ( androidMoveValue[ 4 ] == 1 ) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                                else if ( androidMoveValue[ 6 ] == 1 ||androidMoveValue[ 8 ] == 1 ) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }



                        }
                        }
                    });
                    button2.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button2.setText ( "0" );
                            humanMoveValue[ 1 ] = 1;
                            generalMoveValue[ 1 ] = 1;
                            quantityMove++;
                            button2.setEnabled ( false );

                            if      (quantityMove == 8) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanUp==3|| humanCenter==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");

                                    }
                                    else{
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }


                                else if (generalMoveValue[1]+generalMoveValue[4]+generalMoveValue[7]!=3&&humanCenter  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }

                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");

                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                            else if (quantityMove == 6) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[2]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];
                                 if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                               else if (humanUp==2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanCenter==2){
                                    if (generalMoveValue[ 4] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 7] == 1 && humanMoveValue[ 5] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 0 && humanMoveValue[ 3] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 7] == 1 && humanMoveValue[ 6] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 7] == 1 && humanMoveValue[ 8] == 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 3] == 1 && humanMoveValue[ 5] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 5] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 3] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 5] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 3] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 8] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 2] == 1 && humanMoveValue[ 6] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );

                                }



                                 else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 0 ] == 1  && humanMoveValue[ 3 ] == 1){
                                     button5.setText ( "X" );
                                     androidMoveValue[ 4 ] = 1;
                                     generalMoveValue[ 4 ] = 1;
                                     quantityMove++;                                     button5.setEnabled ( false );
                                 }
                                 else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 0 ] == 1  && humanMoveValue[ 5 ] == 1){
                                     button5.setText ( "X" );
                                     androidMoveValue[ 4 ] = 1;
                                     generalMoveValue[ 4 ] = 1;
                                     quantityMove++;
                                     button5.setEnabled ( false );
                                 }
                                 else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 0 ] == 1  && humanMoveValue[ 6 ] == 1){
                                     button9.setText ( "X" );
                                     androidMoveValue[ 8 ] = 1;
                                     generalMoveValue[ 8 ] = 1;
                                     quantityMove++;
                                     button9.setEnabled ( false );
                                 }
                                 else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 0 ] == 1  && humanMoveValue[ 8 ] == 1){
                                     button7.setText ( "X" );
                                     androidMoveValue[ 6 ] = 1;
                                     generalMoveValue[ 6 ] = 1;
                                     quantityMove++;
                                     button7.setEnabled ( false );
                                 }


                            }
                            else if (quantityMove == 2) {
                               if ( androidMoveValue[ 0 ] == 1 ||androidMoveValue[ 8 ] == 1 ) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                               else if ( androidMoveValue[ 2 ] == 1||androidMoveValue[ 6 ] == 1||androidMoveValue[ 4 ] == 1   ) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                              else   if ( androidMoveValue[ 3 ] == 1||androidMoveValue[ 7 ] == 1||androidMoveValue[ 5 ] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                            }
                        }
                    });
                    button3.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button3.setText ( "0" );
                            humanMoveValue[ 2 ] = 1;
                            generalMoveValue[ 2 ] = 1;
                            quantityMove++;
                            button3.setEnabled ( false );

                            if      (quantityMove == 8) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanUp==3|| humanRight==3|| humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }

                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[2]+generalMoveValue[4]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }

                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                            else if (quantityMove == 6) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];

                                if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanUp == 2) {
                                    if (generalMoveValue[1] == 0) {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRight == 2) {
                                    if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );





                                    }
                                }

                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 1 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 5 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 4 ] == 1  && androidMoveValue[ 6 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 6 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 6 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 7 ] == 1 && androidMoveValue[ 6 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 2) {
                                if ( androidMoveValue[ 0 ] == 1||androidMoveValue[ 4 ] == 1 ||androidMoveValue[ 8] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if ( androidMoveValue[ 1]==1||androidMoveValue[ 3 ]==1 ||androidMoveValue[ 5 ]==1||androidMoveValue[ 7 ]==1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                                else if ( androidMoveValue[ 6 ] == 1 ) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }
                        }
                    });
                    button4.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button4.setText ( "0" );
                            humanMoveValue[ 3 ] = 1;
                            generalMoveValue[ 3 ] = 1;
                            quantityMove++;
                            button4.setEnabled ( false );

                            if      (quantityMove == 8) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanLeft==3|| humanMiddle==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[3]+generalMoveValue[4]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }


                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                            else if (quantityMove == 6) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];



                                if (humanLeft ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];

                                if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMiddle == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 7] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 7] == 1 && humanMoveValue[ 1] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }



                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 5] == 1 && humanMoveValue[ 7] == 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 5] == 1 && humanMoveValue[ 8] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                                else if(androidMoveValue[ 5] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 2] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 5] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 1] == 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }



                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 2] == 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 8] == 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 7] == 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );




                                }
                                else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 1] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 6] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 7] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );

                                }
                                else if (androidMoveValue[ 4 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 2 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                                else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 4 ] == 1  && humanMoveValue[ 8 ] == 1){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 2 ] == 1  && humanMoveValue[ 1 ] == 1){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }




                            }
                            else if (quantityMove == 2) {
                                if ( androidMoveValue[ 0 ] == 1||androidMoveValue[ 8 ] == 1 ) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if ( androidMoveValue[ 1]==1||androidMoveValue[ 3 ]==1 ||androidMoveValue[ 5 ]==1||androidMoveValue[ 7 ]==1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if ( androidMoveValue[ 2 ] == 1 ||androidMoveValue[ 4 ] == 1 ||androidMoveValue[ 6 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }

                        }
                    });
                    button5.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button5.setText ( "0" );
                            humanMoveValue[ 4 ] = 1;
                            generalMoveValue[ 4 ] = 1;
                            quantityMove++;
                            button5.setEnabled ( false );

                            if      (quantityMove == 8) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanMiddle==3|| humanCenter==3||humanRldio==3 || humanLrdio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[4]+generalMoveValue[3]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                        textView2.setText ("Ничья");

                                    }
                                    else{
                                        button4.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }

                                else if (generalMoveValue[4]+generalMoveValue[1]+generalMoveValue[7]!=3&&humanCenter == 2) {



                                    if(generalMoveValue[1]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[2]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[0]+generalMoveValue[8]!=3&&humanLrdio  == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "x" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                            else if (quantityMove == 6) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanMiddle == 3 || humanCenter == 3 || humanLrdio == 3 || humanRldio == 3) {



                                    textView2.setText ( "Победа!!!" );
                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (humanMoveValue[ 0 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 8 ] == 1 && generalMoveValue[ 0 ] != 1) {
                                    button2.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 1 ] == 1 && generalMoveValue[ 7 ] != 1) {
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 7 ] == 1 && generalMoveValue[ 1 ] != 1) {
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 5 ] == 1 && generalMoveValue[ 3 ] != 1) {
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 3 ] == 1 && generalMoveValue[ 5 ] != 1) {
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] != 1 && generalMoveValue[ 2 ] == 1) {
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] != 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button8.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] != 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] != 1 && generalMoveValue[ 6 ] == 1) {
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];
                                if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                              else if (humanMiddle == 2) {
                                    if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                } else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }






                            }
                            else if (quantityMove == 2) {

                                if ( androidMoveValue[ 1 ] == 1|| androidMoveValue[ 3 ] == 1 ||androidMoveValue[ 8 ] == 1 ) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                               else if ( androidMoveValue[ 2 ] == 1 ) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                              else  if ( androidMoveValue[ 5 ] == 1||androidMoveValue[ 7 ] == 1||androidMoveValue[ 0 ] == 1 ) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                               else if ( androidMoveValue[ 6 ] == 1 ) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                            }
                        }
                    });
                    button6.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button6.setText ( "0" );
                            humanMoveValue[ 5 ] = 1;
                            generalMoveValue[ 5 ] = 1;
                            quantityMove++;
                            button6.setEnabled ( false );

                            if      (quantityMove == 8) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanRight==3|| humanMiddle==3){
                                    textView2.setText ( "Победа!!!" );

                                }

                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[5]+generalMoveValue[4]+generalMoveValue[3]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[3]!=1) {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }


                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }


                            }
                            else if (quantityMove == 6) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if (humanRight ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }


                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[3]!=1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[3]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[2] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[2] != 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];
                                if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (humanMiddle == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                }
                                else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 7] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 7] == 1 && humanMoveValue[ 1] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }



                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 3] == 1 && humanMoveValue[ 7] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );

                                }
                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 3] == 1 && humanMoveValue[ 1] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                                else if(androidMoveValue[ 3] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 0] == 1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 3] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 6] == 1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }



                                else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 0] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );



                                }
                                else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 7] == 1) {
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 6] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 0] == 1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 1] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );





                                }
                                else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 8 ] == 1  && humanMoveValue[ 7 ] == 1){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                                else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 2 ] == 1  && humanMoveValue[ 1 ] == 1){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 4 ] == 1  && humanMoveValue[ 6 ] == 1){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 2) {
                                if ( androidMoveValue[ 0 ] == 1 ||androidMoveValue[ 8 ] == 1 ) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                               else if ( androidMoveValue[ 2 ] == 1||androidMoveValue[ 6 ] == 1||androidMoveValue[ 4 ] == 1   ) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                              else  if ( androidMoveValue[ 3 ] == 1||androidMoveValue[ 7 ] == 1||androidMoveValue[ 1 ] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                            }
                        }
                    });
                    button7.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button7.setText ( "0" );
                            humanMoveValue[ 6 ] = 1;
                            generalMoveValue[ 6 ] = 1;
                            quantityMove++;
                            button7.setEnabled ( false );

                             if      (quantityMove == 8) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanBottom==3|| humanLeft==3|| humanRldio==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3 &&humanBottom == 2) {

                                    if(generalMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }

                                else if (generalMoveValue[6]+generalMoveValue[3]+generalMoveValue[0]!=3&&humanLeft == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[6]+generalMoveValue[4]+generalMoveValue[2]!=3 &&humanRldio  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }

                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                            }
                             else if (quantityMove == 6) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];




                                if (humanBottom ==3 || humanLeft ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }



                            }
                             else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];

                                if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (humanBottom == 2) {
                                    if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "X" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }




                                else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 7 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 3 ] == 5 && androidMoveValue[ 4 ] == 1  && androidMoveValue[ 3 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 5 ] == 1 && androidMoveValue[ 2 ] == 1  && androidMoveValue[ 8 ] == 1){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 2 ] == 1){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 5 ] == 1 && androidMoveValue[ 2 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1  && androidMoveValue[ 4 ] == 1){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }

                            }
                             else if (quantityMove == 2) {
                                if ( androidMoveValue[ 2 ] == 1  ) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                               else if ( androidMoveValue[ 0 ] == 1||androidMoveValue[ 8 ] == 1||androidMoveValue[ 4 ] == 1   ) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                            else  if ( androidMoveValue[ 3 ] == 1||androidMoveValue[ 7 ] == 1||androidMoveValue[ 5 ] == 1||androidMoveValue[ 1 ] == 1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                            }
                        }
                    });
                    button8.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button8.setText ( "0" );
                            humanMoveValue[ 7 ] = 1;
                            generalMoveValue[ 7 ] = 1;
                            quantityMove++;
                            button8.setEnabled ( false );

                            if      (quantityMove == 8) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanCenter==3|| humanBottom==3){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3&&humanBottom == 2) {

                                    if(generalMoveValue[6]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                        textView2.setText ("Ничья");

                                    }
                                    else{
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }


                                else if (generalMoveValue[7]+generalMoveValue[4]+generalMoveValue[1]!=3&&humanCenter  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[1]!=1) {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }


                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }


                            }
                            else if (quantityMove == 6) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanBottom ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "x" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[1]!=1 ){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[1]==1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[6] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[6] != 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 ){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "X" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }   else if(  generalMoveValue[0] != 1 ){
                                    button1.setText ( "0ko" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];

                                            if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanBottom == 2) {
                                    if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "X" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else {
                                        button9.setText ( "X" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }

                                }


                                            else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 0] == 1) {
                                                button7.setText ( "X" );
                                                androidMoveValue[ 6 ] = 1;
                                                generalMoveValue[ 6 ] = 1;
                                                quantityMove++;
                                                button7.setEnabled ( false );

                                            }
                                            else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 2] == 1) {
                                                button9.setText ( "X" );
                                                androidMoveValue[ 8 ] = 1;
                                                generalMoveValue[ 8 ] = 1;
                                                quantityMove++;
                                                button9.setEnabled ( false );
                                            }

                                            else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 3] == 1) {
                                                button1.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button1.setEnabled ( false );
                                            }
                                            else if(androidMoveValue[ 4] == 1 && androidMoveValue[ 1] == 1 && humanMoveValue[ 5] == 1) {
                                                button9.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button9.setEnabled ( false );
                                            }




                                            else if(androidMoveValue[ 2] == 1 && androidMoveValue[ 8] == 1 && humanMoveValue[ 5] == 1) {
                                                button5.setText ( "X" );
                                                androidMoveValue[ 4 ] = 1;
                                                generalMoveValue[ 4 ] = 1;
                                                quantityMove++;
                                                button5.setEnabled ( false );

                                            }
                                            else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 3] == 1) {
                                                button5.setText ( "X" );
                                                androidMoveValue[ 4 ] = 1;
                                                generalMoveValue[ 4 ] = 1;
                                                quantityMove++;
                                                button5.setEnabled ( false );
                                            }






                                            else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 2] == 1) {
                                                button9.setText ( "X" );
                                                androidMoveValue[ 8 ] = 1;
                                                generalMoveValue[ 8 ] = 1;
                                                quantityMove++;
                                                button9.setEnabled ( false );
                                            }
                                            else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 8] == 1) {
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );
                                            }
                                            else if(androidMoveValue[ 0] == 1 && androidMoveValue[ 6] == 1 && humanMoveValue[ 7] == 1) {
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );




                                            }
                                            else if(androidMoveValue[ 3] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 5] == 1) {
                                                button7.setText ( "X" );
                                                androidMoveValue[ 6 ] = 1;
                                                generalMoveValue[ 6 ] = 1;
                                                quantityMove++;
                                                button7.setEnabled ( false );
                                            }
                                            else if(androidMoveValue[ 5] == 1 && androidMoveValue[ 4] == 1 && humanMoveValue[ 3] == 1) {
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );


                                            }
                                            else if (androidMoveValue[ 4 ] == 1 && androidMoveValue[ 8 ] == 1  && humanMoveValue[ 0 ] == 1){
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );
                                            }

                                            else if (androidMoveValue[ 4 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 2 ] == 1){
                                                button1.setText ( "X" );
                                                androidMoveValue[ 0 ] = 1;
                                                generalMoveValue[ 0 ] = 1;
                                                quantityMove++;
                                                button1.setEnabled ( false );




                                            }
                                            else if (androidMoveValue[ 8 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 0 ] == 1){
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );
                                            }
                                            else if (androidMoveValue[ 8 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 2 ] == 1){
                                                button1.setText ( "X" );
                                                androidMoveValue[ 0 ] = 1;
                                                generalMoveValue[ 0 ] = 1;
                                                quantityMove++;
                                                button1.setEnabled ( false );
                                            }
                                            else if (androidMoveValue[ 8 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 3 ] == 1){
                                                button3.setText ( "X" );
                                                androidMoveValue[ 2 ] = 1;
                                                generalMoveValue[ 2 ] = 1;
                                                quantityMove++;
                                                button3.setEnabled ( false );
                                            }
                                            else if (androidMoveValue[ 8 ] == 1 && androidMoveValue[ 6 ] == 1  && humanMoveValue[ 5 ] == 1){
                                                button5.setText ( "X" );
                                                androidMoveValue[ 4 ] = 1;
                                                generalMoveValue[ 4 ] = 1;
                                                quantityMove++;
                                                button5.setEnabled ( false );
                                            }



                            }
                            else if (quantityMove == 2) {
                                {
                                    if ( androidMoveValue[ 0 ] == 1 ||androidMoveValue[ 8 ] == 1 ) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else if ( androidMoveValue[ 2 ] == 1||androidMoveValue[ 6 ] == 1||androidMoveValue[ 4 ] == 1   ) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }
                                    else  if ( androidMoveValue[ 3 ] == 1||androidMoveValue[ 5 ] == 1||androidMoveValue[ 1 ] == 1) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }
                            }
                        }
                    });
                    button9.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            button9.setText ( "0" );
                            humanMoveValue[ 8 ] = 1;
                            generalMoveValue[ 8 ] = 1;
                            quantityMove++;
                            button9.setEnabled ( false );

                            if      (quantityMove == 8) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                if(humanBottom==3|| humanRight==3|| humanLrdio==3) {
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanBottom == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );

                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }

                                else if (generalMoveValue[8]+generalMoveValue[5]+generalMoveValue[2]!=3&&humanRight == 2) {

                                    if(generalMoveValue[5]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanLrdio  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }
                                    else{
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                        textView2.setText ("Ничья");
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "X" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "X" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                    textView2.setText ("Ничья");
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }

                            }
                            else if (quantityMove == 6) {

                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "X" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "X" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "X" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }


                            }
                            else if (quantityMove == 4) {
                                humanUp     = humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2];
                                humanMiddle = humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5];
                                humanBottom = humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8];
                                humanLeft   = humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6];
                                humanCenter = humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7];
                                humanRight  = humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8];
                                humanLrdio  = humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8];
                                humanRldio  = humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6];

                                androidUp     = androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2];
                                androidMiddle = androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5];
                                androidBottom = androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8];
                                androidLeft   = androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6];
                                androidCenter = androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7];
                                androidRight  = androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8];
                                androidLrdio  = androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8];
                                androidRldio  = androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6];
                                  if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "X" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanBottom == 2) {
                                    if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "X" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                                else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "X" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "X" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                                else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "X" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "X" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if(generalMoveValue[ 6 ]==0){
                                        button7.setText ( "X" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                }


                                  else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 7 ] == 1  && androidMoveValue[ 4 ] == 1){
                                      button3.setText ( "X" );
                                      androidMoveValue[ 2 ] = 1;
                                      generalMoveValue[ 2 ] = 1;
                                      quantityMove++;
                                      button3.setEnabled ( false );
                                  }
                                  else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 4 ] == 1  && androidMoveValue[ 5 ] == 1){
                                      button7.setText ( "X" );
                                      androidMoveValue[ 6 ] = 1;
                                      generalMoveValue[ 6 ] = 1;
                                      quantityMove++;
                                      button7.setEnabled ( false );
                                  }
                                  else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 6 ] == 1){
                                      button3.setText ( "X" );
                                      androidMoveValue[ 2 ] = 1;
                                      generalMoveValue[ 2 ] = 1;
                                      quantityMove++;
                                      button3.setEnabled ( false );
                                  }
                                  else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 2 ] == 1){
                                      button7.setText ( "X" );
                                      androidMoveValue[ 6 ] = 1;
                                      generalMoveValue[ 6 ] = 1;
                                      quantityMove++;
                                      button7.setEnabled ( false );
                                  }
                                  else if (humanMoveValue[ 3 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 4 ] == 1){
                                      button2.setText ( "X" );
                                      androidMoveValue[ 1 ] = 1;
                                      generalMoveValue[ 1 ] = 1;
                                      quantityMove++;
                                      button2.setEnabled ( false );
                                  }
                                  else if (humanMoveValue[ 1 ] == 1 && androidMoveValue[ 0 ] == 1  && androidMoveValue[ 4 ] == 1){
                                      button4.setText ( "X" );
                                      androidMoveValue[ 3 ] = 1;
                                      generalMoveValue[ 3 ] = 1;
                                      quantityMove++;
                                      button4.setEnabled ( false );
                                  }


                            }
                            else if (quantityMove == 2) {
                                if ( androidMoveValue[ 6 ] == 1||androidMoveValue[ 4 ] == 1 ||androidMoveValue[ 2] == 1) {
                                    button1.setText ( "X" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if ( androidMoveValue[ 1]==1||androidMoveValue[ 3 ]==1 ||androidMoveValue[ 5 ]==1||androidMoveValue[ 7 ]==1) {
                                    button5.setText ( "X" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                               else if ( androidMoveValue[ 0 ] == 1 ) {
                                    button7.setText ( "X" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }



                            }
                        }
                    });
                }
            }
        });
    }
}


