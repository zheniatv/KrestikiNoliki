package com.example.krestikinoliki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // final String KRESTIK = "X";
    //final String NOLIK = "0";
    String firstMove[] = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    String sekondMove[] = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    String textbutton;
    String compareString = "X";
    String statusMove1;
    String statusMove2;
    String statusMove3;
    String statusMove4;
    String statusMove5;
    String statusMove6;
    String statusMove7;
    String statusMove8;
    String statusMove9;
    int[] humanMoveValue = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] androidMoveValue = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] generalMoveValue = {humanMoveValue[0] + androidMoveValue[0],
            humanMoveValue[1] + androidMoveValue[1], humanMoveValue[2] + androidMoveValue[2],
            humanMoveValue[3] + androidMoveValue[3], humanMoveValue[4] + androidMoveValue[4],
            humanMoveValue[5] + androidMoveValue[5], humanMoveValue[6] + androidMoveValue[6],
            humanMoveValue[7] + androidMoveValue[7], humanMoveValue[8] + androidMoveValue[8]};


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
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;
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
    int[] statusLinijHuman = {humanMoveValue[0] + humanMoveValue[1] + humanMoveValue[2],
            humanMoveValue[3] + humanMoveValue[4] + humanMoveValue[5],
            humanMoveValue[6] + humanMoveValue[7] + humanMoveValue[8],
            humanMoveValue[0] + humanMoveValue[3] + humanMoveValue[6],
            humanMoveValue[1] + humanMoveValue[4] + humanMoveValue[7],
            humanMoveValue[2] + humanMoveValue[5] + humanMoveValue[8],
            humanMoveValue[0] + humanMoveValue[4] + humanMoveValue[8],
            humanMoveValue[2] + humanMoveValue[4] + humanMoveValue[6]};
    int[] statusLinijandroid = {androidMoveValue[0] + androidMoveValue[1] + androidMoveValue[2],
            androidMoveValue[3] + androidMoveValue[4] + androidMoveValue[5],
            androidMoveValue[6] + androidMoveValue[7] + androidMoveValue[8],
            androidMoveValue[0] + androidMoveValue[3] + androidMoveValue[6],
            androidMoveValue[1] + androidMoveValue[4] + androidMoveValue[7],
            androidMoveValue[2] + androidMoveValue[5] + androidMoveValue[8],
            androidMoveValue[0] + androidMoveValue[4] + androidMoveValue[8],
            androidMoveValue[2] + androidMoveValue[4] + androidMoveValue[6]};
    int[] statusLinijgeneral = {generalMoveValue[0] + generalMoveValue[1] + generalMoveValue[2],
            generalMoveValue[3] + generalMoveValue[4] + generalMoveValue[5],
            generalMoveValue[6] + generalMoveValue[7] + generalMoveValue[8],
            generalMoveValue[0] + generalMoveValue[3] + generalMoveValue[6],
            generalMoveValue[1] + generalMoveValue[4] + generalMoveValue[7],
            generalMoveValue[2] + generalMoveValue[5] + generalMoveValue[8],
            generalMoveValue[0] + generalMoveValue[4] + generalMoveValue[8],
            generalMoveValue[2] + generalMoveValue[4] + generalMoveValue[6]};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = (Button) findViewById(R.id.buttonStart);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
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
                textView11.setText("" + firstPlay);
                //buttonStart.setEnabled ( false );
                firstPlay = true;
                if   (firstPlay == true) {
                    textView2.setText ( "Ваш ход" );

                    textView5.setText ( Arrays.toString (humanMoveValue)+"05");
                    textView6.setText ( Arrays.toString (androidMoveValue)+"06");
                    textView7.setText ( Arrays.toString (generalMoveValue)+"07");
                    textView4.setText (humanUp+" ");
                    textView8.setText  (humanRight +" ");
                    textView9.setText (humanRldio + "  ");
                    textView10.setText  (humanMoveValue[8] +" ");


                    button1.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick(View view) {
                            //if (androidMoveValue[0]!=1)
                            button1.setText ( "X" );
                            humanMoveValue[0]=1;
                            generalMoveValue[0]=1;
                            quantityMove++;
                            button1.setEnabled ( false );
                            Random random3 = new Random();
                            int rnd3 = random3.nextInt(100);


                            if(quantityMove==7){

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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );


                                    if(generalMoveValue[1]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "0agg4" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[0]+generalMoveValue[4]+generalMoveValue[8]!=3&&humanLrdio == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0agg4" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0agg4" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "0agg" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0agg" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0agg" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "0agg" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "0agg" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "0agg" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }

                            }
                            else if (quantityMove==3) {

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
                                        button2.setText ( "0a" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0d" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "0f" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLeft==2){
                                    if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0g" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0h" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else {
                                        button5.setText ( "0j" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanLrdio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0k" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0l" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else {
                                        button4.setText ( "0;" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else {
                                    button7.setText ( "0;" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                            }
                            else if(quantityMove==1){
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "0z" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "0x" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "0c" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "0v" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "0b" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 13 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "0n" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 16 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "0m" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (humanMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0," );
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
                            if(quantityMove==7) {
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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[2]!=1) {
                                        button3.setText ( "0agg4" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                    else{
                                        button1.setText ( "0agg4" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[1]+generalMoveValue[4]+generalMoveValue[7]!=3&&humanCenter  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "0agg4" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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


                                if (humanUp ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[2]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0ko" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0ko" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0ko" );
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



                            else if (quantityMove==3) {

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
                                        button1.setText ( "0100" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0101" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else   {
                                        button5.setText ( "0103" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }
                                else if(humanCenter==2){
                                    if (generalMoveValue[ 4] == 0) {
                                        button5.setText ( "0104" );
                                        androidMoveValue[ 4] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                    else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0105" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else {
                                        button9.setText ( "0106" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }
                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[ 6 ] == 0){
                                    button7.setText ( "0;" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0;" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );

                                }


                            }
                            else if(quantityMove==1){


                                if (rnd3 <= 3 && generalMoveValue[0]==0) {
                                    button1.setText("01" );
                                    androidMoveValue[0]=1;
                                    generalMoveValue[0]=1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 6 && generalMoveValue[2]==0) {
                                    button3.setText("03" );
                                    androidMoveValue[2]=1;
                                    generalMoveValue[2]=1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 9 && generalMoveValue[3]==0) {
                                    button4.setText("04" );
                                    androidMoveValue[3]=1;
                                    generalMoveValue[3]=1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 12 && generalMoveValue[5]==0) {
                                    button6.setText("05" );
                                    androidMoveValue[5]=1;
                                    generalMoveValue[5]=1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 15 && generalMoveValue[6]==0) {
                                    button7.setText("06" );
                                    androidMoveValue[6]=1;
                                    generalMoveValue[6]=1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 18 && generalMoveValue[7]==0) {
                                    button8.setText("07" );
                                    androidMoveValue[7]=1;
                                    generalMoveValue[7]=1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if (rnd3 <= 21 && generalMoveValue[8]==0) {
                                    button9.setText("08" );
                                    androidMoveValue[8]=1;
                                    generalMoveValue[8]=1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                }
                                else if(generalMoveValue[4]==0) {
                                    button5.setText ( "09" );
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


                            if(quantityMove==7){
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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[0]+generalMoveValue[1]+generalMoveValue[2]!=3&&humanUp == 2) {

                                    if(generalMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                        button1.setText ( "0agg4" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }




                                }

                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0agg4" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button6.setText ( "0agg4" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[2]+generalMoveValue[4]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0agg4" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }

                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[1]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[1]!=1) {
                                    button2.setText ( "0agg1" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0agg3" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0agg4" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "0agg5" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0agg6" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0agg7" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "0agg8" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "0agg9" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                            }

                            else if (quantityMove == 3) {

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
                                        button2.setText ( "0300" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0301" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0303" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRight == 2) {
                                    if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0304" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0305" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0306" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0307" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0308" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0309" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }

                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0;" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }

                            }
                            else if(quantityMove==1) {
                                if (rnd3 <= 3 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "00" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "010" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "011" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "013" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "014" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "015" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "016" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "017" );
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
                            if(quantityMove==7){
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
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[3]+generalMoveValue[4]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "0agg4" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[0]+generalMoveValue[3]+generalMoveValue[6]!=3&&humanLeft  == 2) {

                                        if(generalMoveValue[0]==1 && generalMoveValue[6]!=1) {
                                            button7.setText ( "0agg4" );
                                            androidMoveValue[ 6 ] = 1;
                                            generalMoveValue[ 6 ] = 1;
                                            quantityMove++;
                                            button7.setEnabled ( false );
                                        }
                                        else{
                                            button1.setText ( "0agg4" );
                                            androidMoveValue[ 0 ] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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



                                if (humanLeft ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[0] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[0] != 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }


                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0ko" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0ko" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0ko" );
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


                            else if (quantityMove == 3) {
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
                                        button5.setText ( "0400" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0401" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0403" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0404" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0405" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0406" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                }

                                else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[ 2 ] == 0){
                                    button3.setText ( "0;" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else {
                                    button9.setText ( "0;" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );

                                }


                            }
                            else if(quantityMove==1){
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "018" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "019" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "030" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "031" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "033" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "034" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "035" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "036" );
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

                            if(quantityMove==7){

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
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[4]+generalMoveValue[3]+generalMoveValue[5]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[3]==1 && generalMoveValue[5]!=1) {
                                        button6.setText ( "0agg4" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    }
                                    else{
                                        button4.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }




                                }

                                else if (generalMoveValue[4]+generalMoveValue[1]+generalMoveValue[7]!=3&&humanCenter == 2) {



                                    if(generalMoveValue[1]==1 && generalMoveValue[7]!=1) {
                                        button8.setText ( "0agg4" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    }
                                    else{
                                        button2.setText ( "0agg4" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[2]+generalMoveValue[6]!=3&&humanRldio  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[6]!=1) {
                                        button7.setText ( "0agg4" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0agg4" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[4]+generalMoveValue[0]+generalMoveValue[8]!=3&&humanLrdio  == 2) {

                                    if(generalMoveValue[0]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0agg4" );
                                        androidMoveValue[ 8] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button1.setText ( "0agg4" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
                                    androidMoveValue[ 8] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                            }


                            else if (quantityMove == 5) {
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
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 1 ] != 1 && androidMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 1 ] == 1 && androidMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && androidMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 6 ] == 1 && generalMoveValue[ 7 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 6 ] != 1 && androidMoveValue[ 7 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                } else if (androidMoveValue[ 0 ] == 1 && androidMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 0 ] == 1 && generalMoveValue[ 3 ] != 1 && androidMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 0 ] != 1 && androidMoveValue[ 3 ] == 1 && androidMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && androidMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (androidMoveValue[ 2 ] == 1 && generalMoveValue[ 5 ] != 1 && androidMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (generalMoveValue[ 2 ] != 1 && androidMoveValue[ 5 ] == 1 && androidMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                } else if (humanMoveValue[ 0 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 8 ] == 1 && generalMoveValue[ 0 ] != 1) {
                                    button2.setText ( "0agg1" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 1 ] == 1 && generalMoveValue[ 7 ] != 1) {
                                    button8.setText ( "0agg3" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 7 ] == 1 && generalMoveValue[ 1 ] != 1) {
                                    button2.setText ( "0agg4" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0agg5" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0agg6" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 5 ] == 1 && generalMoveValue[ 3 ] != 1) {
                                    button4.setText ( "0agg5" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 3 ] == 1 && generalMoveValue[ 5 ] != 1) {
                                    button6.setText ( "0agg6" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] != 1) {
                                    button3.setText ( "0g6" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 1 ] != 1 && generalMoveValue[ 2 ] == 1) {
                                    button2.setText ( "0g6" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 1 ] == 1 && generalMoveValue[ 2 ] == 1) {
                                    button1.setText ( "0g6" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0g6" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] == 1 && humanMoveValue[ 5 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button6.setText ( "0g6" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                } else if (humanMoveValue[ 2 ] != 1 && humanMoveValue[ 5 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button3.setText ( "0g6" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] != 1) {
                                    button9.setText ( "0g6" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] == 1 && humanMoveValue[ 7 ] != 1 && generalMoveValue[ 8 ] == 1) {
                                    button8.setText ( "0g6" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                } else if (humanMoveValue[ 6 ] != 1 && humanMoveValue[ 7 ] == 1 && generalMoveValue[ 8 ] == 1) {
                                    button7.setText ( "0g6" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] != 1) {
                                    button7.setText ( "0g6" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] == 1 && humanMoveValue[ 3 ] != 1 && generalMoveValue[ 6 ] == 1) {
                                    button4.setText ( "0g6" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                } else if (humanMoveValue[ 0 ] != 1 && humanMoveValue[ 3 ] == 1 && generalMoveValue[ 6 ] == 1) {
                                    button1.setText ( "0g6" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }


                            else if (quantityMove == 3) {

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
                                        button4.setText ( "0500" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0501" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0503" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "0504" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 7 ] == 0) {
                                        button8.setText ( "0505" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else {
                                        button3.setText ( "0506" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }
                                } else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0507" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0508" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0509" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0510" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0511" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0513" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                }

                            }

                            else if (quantityMove == 1) {
                                if (rnd3 <= 15 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "037" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 30 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "038" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 45 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "038" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 60 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "040" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 70 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "041" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 80 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "043" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 90 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "044" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;

                                } else if (generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "045" );
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
                            Random random3 = new Random ( );
                            int rnd3 = random3.nextInt ( 100 );

                            if(quantityMove==7){
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
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[5]+generalMoveValue[4]+generalMoveValue[3]!=3&&humanMiddle == 2) {

                                    if(generalMoveValue[4]==1 && generalMoveValue[3]!=1) {
                                        button4.setText ( "0agg4" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    }
                                    else{
                                        button5.setText ( "0agg4" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }




                                }


                                else if (generalMoveValue[2]+generalMoveValue[5]+generalMoveValue[8]!=3&&humanRight  == 2) {

                                    if(generalMoveValue[2]==1 && generalMoveValue[8]!=1) {
                                        button9.setText ( "0agg4" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                    else{
                                        button3.setText ( "0agg4" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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

                                if (humanRight ==3 || humanMiddle == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }


                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && androidMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[6] == 1 && generalMoveValue[7] != 1 && androidMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6] != 1 && androidMoveValue[7] == 1 && androidMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 && humanMoveValue[7] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[6] == 1 &&  generalMoveValue[7] != 1 && humanMoveValue[8]==1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if( generalMoveValue[6] != 1 && humanMoveValue[7] == 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 && humanMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if(humanMoveValue[1] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[1] != 1 && humanMoveValue[4] == 1 && humanMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[3]!=1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[3]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[2] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[2] != 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0ko" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0ko" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0ko" );
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


                            else   if (quantityMove == 3) {

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
                                        button5.setText ( "0400" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0401" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button7.setText ( "0403" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                } else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0404" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0405" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0406" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }

                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else if (generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0;" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else {
                                    button7.setText ( "0;" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );

                                }


                            } else if (quantityMove == 1) {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "046" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "047" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "048" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "049" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "050" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "051" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "053" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "054" );
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

                            if(quantityMove==7) {
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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3 &&humanBottom == 2) {

                                        if(generalMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                            button9.setText ( "0agg4" );
                                            androidMoveValue[ 8 ] = 1;
                                            generalMoveValue[ 8 ] = 1;
                                            quantityMove++;
                                            button9.setEnabled ( false );
                                        }
                                        else{
                                            button8.setText ( "0agg4" );
                                            androidMoveValue[ 7 ] = 1;
                                            generalMoveValue[ 7 ] = 1;
                                            quantityMove++;
                                            button8.setEnabled ( false );
                                        }




                                }

                                else if (generalMoveValue[6]+generalMoveValue[3]+generalMoveValue[0]!=3&&humanLeft == 2) {

                                        if(generalMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0agg4" );
                                            androidMoveValue[ 0] = 1;
                                            generalMoveValue[ 0 ] = 1;
                                            quantityMove++;
                                            button1.setEnabled ( false );
                                        }
                                        else{
                                            button4.setText ( "0agg4" );
                                            androidMoveValue[ 3 ] = 1;
                                            generalMoveValue[ 3 ] = 1;
                                            quantityMove++;
                                            button4.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[6]+generalMoveValue[4]+generalMoveValue[2]!=3 &&humanRldio  == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                            button3.setText ( "0agg4" );
                                            androidMoveValue[ 2 ] = 1;
                                            generalMoveValue[ 2 ] = 1;
                                            quantityMove++;
                                            button3.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0agg4" );
                                            androidMoveValue[ 4 ] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }

                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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




                                if (humanBottom ==3 || humanLeft ==3 || humanRldio == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[8]!=1) {
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if (humanMoveValue[8]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "0agg" );
                                    androidMoveValue[ 7] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0agg" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[3]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0agg" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[3]!=1) {
                                    button4.setText ( "0agg" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[0]==0) {
                                    button1.setText ( "0agg" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0) {
                                    button9.setText ( "0agg" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }



                            }

                            else if (quantityMove == 3) {


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
                                        button8.setText ( "0300" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0301" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0303" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanLeft == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0304" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 3 ] == 0) {
                                        button4.setText ( "0305" );
                                        androidMoveValue[ 3 ] = 1;
                                        generalMoveValue[ 3 ] = 1;
                                        quantityMove++;
                                        button4.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0306" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanRldio == 2) {
                                    if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0307" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0308" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0309" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else {
                                    button3.setText ( "0;" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }

                            } else if (quantityMove == 1) {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "055" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "056" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "057" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "058" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "059" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "060" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "061" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "063" );
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
                            if(quantityMove==7){

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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[6]+generalMoveValue[7]+generalMoveValue[8]!=3&&humanBottom == 2) {

                                        if(generalMoveValue[6]==1 && generalMoveValue[8]!=1) {
                                            button9.setText ( "0agg4" );
                                            androidMoveValue[ 8 ] = 1;
                                            generalMoveValue[ 8 ] = 1;
                                            quantityMove++;
                                            button9.setEnabled ( false );
                                        }
                                        else{
                                            button7.setText ( "0agg4" );
                                            androidMoveValue[ 6 ] = 1;
                                            generalMoveValue[ 6 ] = 1;
                                            quantityMove++;
                                            button7.setEnabled ( false );
                                        }




                                }


                                else if (generalMoveValue[7]+generalMoveValue[4]+generalMoveValue[1]!=3&&humanCenter  == 2) {

                                        if(generalMoveValue[0]==1 && generalMoveValue[6]!=1) {
                                            button2.setText ( "0agg4" );
                                            androidMoveValue[ 1 ] = 1;
                                            generalMoveValue[ 1 ] = 1;
                                            quantityMove++;
                                            button2.setEnabled ( false );
                                        }
                                        else{
                                            button5.setText ( "0agg4" );
                                            androidMoveValue[ 4] = 1;
                                            generalMoveValue[ 4 ] = 1;
                                            quantityMove++;
                                            button5.setEnabled ( false );
                                        }


                                    }
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[8]==0){
                                    button9.setText ( "0xxx" );
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


                                if (humanBottom ==3 || humanCenter == 3 ){

                                    textView2.setText ( "Победа!!!" );
                                }

                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[5] != 1 && androidMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[5] == 1 && androidMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[4] != 1 && androidMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[4] == 1 && androidMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }

                                else if(humanMoveValue[3] == 1 && humanMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if(humanMoveValue[3] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[3] != 1 && humanMoveValue[4] == 1 && humanMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[1] != 1 && humanMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[1] == 1 && humanMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[3] != 1 && humanMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[3] == 1 && humanMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[5] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[5] != 1 && humanMoveValue[8]==1 ){
                                    button6.setText ( "0aff" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[5] == 1 && humanMoveValue[8]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 && humanMoveValue[4] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(humanMoveValue[0] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[8]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[0] != 1 && humanMoveValue[4] == 1 && humanMoveValue[8]==1 ){
                                    button1.setText ( "0aff" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 && humanMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(humanMoveValue[2] == 1 &&  generalMoveValue[4] != 1 && humanMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( generalMoveValue[2] != 1 && humanMoveValue[4] == 1 && humanMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if( humanMoveValue[4] == 1 && generalMoveValue[1]!=1 ){
                                    button2.setText ( "0aff" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 && humanMoveValue[1]==1 ){
                                    button5.setText ( "0aff" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if( humanMoveValue[6] == 1 && generalMoveValue[8]!=1 ){
                                    button9.setText ( "0aff" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }
                                else if(  generalMoveValue[6] != 1 && humanMoveValue[8]==1 ){
                                    button7.setText ( "0aff" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if(  generalMoveValue[4] != 1 ){
                                    button5.setText ( "0ko" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if(  generalMoveValue[8] != 1 ){
                                    button9.setText ( "0ko" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    quantityMove++;
                                    button9.setEnabled ( false );
                                }   else if(  generalMoveValue[6] != 1 ){
                                    button7.setText ( "0ko" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }   else if(  generalMoveValue[2] != 1 ){
                                    button3.setText ( "0ko" );
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



                           else if (quantityMove == 3) {

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
                                        button7.setText ( "0400" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else if (generalMoveValue[ 8 ] == 0) {
                                        button9.setText ( "0401" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0403" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                } else if (humanCenter == 2) {
                                    if (generalMoveValue[ 1 ] == 0) {
                                        button2.setText ( "0404" );
                                        androidMoveValue[ 1 ] = 1;
                                        generalMoveValue[ 1 ] = 1;
                                        quantityMove++;
                                        button2.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0405" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else {
                                        button9.setText ( "0406" );
                                        androidMoveValue[ 8 ] = 1;
                                        generalMoveValue[ 8 ] = 1;
                                        quantityMove++;
                                        button9.setEnabled ( false );
                                    }

                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a100" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                } else if (generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "0;" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                } else {
                                    button3.setText ( "0;" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );

                                }


                            } else if (quantityMove == 1) {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "064" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "065" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "066" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "067" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "068" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "069" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 8 ] == 0) {
                                    button9.setText ( "070" );
                                    androidMoveValue[ 8 ] = 1;
                                    generalMoveValue[ 8 ] = 1;
                                    button9.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "071" );
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
                            if(quantityMove==7) {

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
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanBottom == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0agg4" );
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
                                            button3.setText ( "0agg4" );
                                            androidMoveValue[ 2 ] = 1;
                                            generalMoveValue[2 ] = 1;
                                            quantityMove++;
                                            button3.setEnabled ( false );
                                        }
                                        else{
                                            button6.setText ( "0agg4" );
                                            androidMoveValue[ 5 ] = 1;
                                            generalMoveValue[ 5 ] = 1;
                                            quantityMove++;
                                            button6.setEnabled ( false );
                                        }




                                }
                                else if (generalMoveValue[8]+generalMoveValue[4]+generalMoveValue[0]!=3&&humanLrdio  == 2) {

                                        if(generalMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                            button1.setText ( "0agg4" );
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
                                else if (generalMoveValue[0]==0){
                                    button1.setText ( "0xxx" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (generalMoveValue[1]==0){
                                    button2.setText ( "0xxx" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button2.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0){
                                    button3.setText ( "0xxx" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[3]==0){
                                    button4.setText ( "0xxx" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    quantityMove++;
                                    button4.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0xxx" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[5]==0){
                                    button6.setText ( "0xxx" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0){
                                    button7.setText ( "0xxx" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (generalMoveValue[7]==0){
                                    button8.setText ( "0xxx" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
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


                                if (humanUp ==3 || humanRight ==3 || humanRldio == 3 ){
                                    textView2.setText ( "Победа!!!" );
                                }
                                else if (androidMoveValue[3] == 1 && androidMoveValue[4] == 1 && generalMoveValue[5]!=1 ){
                                    button6.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[3] == 1 && generalMoveValue[4] != 1 && androidMoveValue[5]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[3] != 1 && androidMoveValue[4] == 1 && androidMoveValue[5]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[1] == 1 && generalMoveValue[2]!=1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[1] != 1 && androidMoveValue[2]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[1] == 1 && androidMoveValue[2]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );

                                }
                                else if (androidMoveValue[2] == 1 && androidMoveValue[4] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[2] == 1 && generalMoveValue[4] != 1 && androidMoveValue[6]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[2] != 1 && androidMoveValue[4] == 1 && androidMoveValue[6]==1 ){
                                    button3.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && androidMoveValue[3] == 1 && generalMoveValue[6]!=1 ){
                                    button7.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[0] == 1 && generalMoveValue[3] != 1 && androidMoveValue[6]==1 ){
                                    button4.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[0] != 1 && androidMoveValue[3] == 1 && androidMoveValue[6]==1 ){
                                    button1.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && androidMoveValue[4] == 1 && generalMoveValue[7]!=1 ){
                                    button8.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (androidMoveValue[1] == 1 && generalMoveValue[4] != 1 && androidMoveValue[7]==1 ){
                                    button5.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (generalMoveValue[1] != 1 && androidMoveValue[4] == 1 && androidMoveValue[7]==1 ){
                                    button2.setText ( "0aff" );
                                    textView2.setText ( "Ты проиграл. :(" );
                                }
                                else if (humanMoveValue[6]==1 && generalMoveValue[7]!=1) {
                                    button8.setText ( "0aff1" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    quantityMove++;
                                    button8.setEnabled ( false );
                                }
                                else if (humanMoveValue[7]==1 && generalMoveValue[6]!=1) {
                                    button7.setText ( "0agg" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }
                                else if (humanMoveValue[4]==1 && generalMoveValue[0]!=1) {
                                    button1.setText ( "0agg" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }
                                else if (humanMoveValue[0]==1 && generalMoveValue[4]!=1) {
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (humanMoveValue[2]==1 && generalMoveValue[5]!=1) {
                                    button6.setText ( "0agg" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    quantityMove++;
                                    button6.setEnabled ( false );
                                }
                                else if (humanMoveValue[5]==1 && generalMoveValue[2]!=1) {
                                    button3.setText ( "0agg" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[4]==0){
                                    button5.setText ( "0agg" );
                                    androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }
                                else if (generalMoveValue[2]==0) {
                                    button3.setText ( "0agg" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    quantityMove++;
                                    button3.setEnabled ( false );
                                }
                                else if (generalMoveValue[6]==0) {
                                    button7.setText ( "0agg" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    quantityMove++;
                                    button7.setEnabled ( false );
                                }


                            }

                            else if (quantityMove == 3) {

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
                                        button8.setText ( "0300" );
                                        androidMoveValue[ 7 ] = 1;
                                        generalMoveValue[ 7 ] = 1;
                                        quantityMove++;
                                        button8.setEnabled ( false );
                                    } else if (generalMoveValue[ 6 ] == 0) {
                                        button7.setText ( "0301" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0303" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                               else if (humanRight == 2) {
                                    if (generalMoveValue[ 2 ] == 0) {
                                        button3.setText ( "0304" );
                                        androidMoveValue[ 2 ] = 1;
                                        generalMoveValue[ 2 ] = 1;
                                        quantityMove++;
                                        button3.setEnabled ( false );
                                    } else if (generalMoveValue[ 5 ] == 0) {
                                        button6.setText ( "0305" );
                                        androidMoveValue[ 5 ] = 1;
                                        generalMoveValue[ 5 ] = 1;
                                        quantityMove++;
                                        button6.setEnabled ( false );
                                    } else {
                                        button5.setText ( "0306" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    }
                                }

                               else if (humanLrdio == 2) {
                                    if (generalMoveValue[ 0 ] == 0) {
                                        button1.setText ( "0307" );
                                        androidMoveValue[ 0 ] = 1;
                                        generalMoveValue[ 0 ] = 1;
                                        quantityMove++;
                                        button1.setEnabled ( false );
                                    } else if (generalMoveValue[ 4 ] == 0) {
                                        button5.setText ( "0308" );
                                        androidMoveValue[ 4 ] = 1;
                                        generalMoveValue[ 4 ] = 1;
                                        quantityMove++;
                                        button5.setEnabled ( false );
                                    } else if(generalMoveValue[ 6 ]==0){
                                        button7.setText ( "0309" );
                                        androidMoveValue[ 6 ] = 1;
                                        generalMoveValue[ 6 ] = 1;
                                        quantityMove++;
                                        button7.setEnabled ( false );
                                    }
                                }

                               else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "0a10" );
                                   androidMoveValue[ 4 ] = 1;
                                    generalMoveValue[ 4 ] = 1;
                                    quantityMove++;
                                    button5.setEnabled ( false );
                                }

                               else {
                                    button1.setText ( "0end" );
                                   androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    quantityMove++;
                                    button1.setEnabled ( false );
                                }

                            }

                            else if (quantityMove==1) {
                                if (rnd3 <= 3 && generalMoveValue[ 1 ] == 0) {
                                    button2.setText ( "073" );
                                    androidMoveValue[ 1 ] = 1;
                                    generalMoveValue[ 1 ] = 1;
                                    button2.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 6 && generalMoveValue[ 2 ] == 0) {
                                    button3.setText ( "074" );
                                    androidMoveValue[ 2 ] = 1;
                                    generalMoveValue[ 2 ] = 1;
                                    button3.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 9 && generalMoveValue[ 3 ] == 0) {
                                    button4.setText ( "075" );
                                    androidMoveValue[ 3 ] = 1;
                                    generalMoveValue[ 3 ] = 1;
                                    button4.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 12 && generalMoveValue[ 5 ] == 0) {
                                    button6.setText ( "076" );
                                    androidMoveValue[ 5 ] = 1;
                                    generalMoveValue[ 5 ] = 1;
                                    button6.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 15 && generalMoveValue[ 6 ] == 0) {
                                    button7.setText ( "077" );
                                    androidMoveValue[ 6 ] = 1;
                                    generalMoveValue[ 6 ] = 1;
                                    button7.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 18 && generalMoveValue[ 7 ] == 0) {
                                    button8.setText ( "078" );
                                    androidMoveValue[ 7 ] = 1;
                                    generalMoveValue[ 7 ] = 1;
                                    button8.setEnabled ( false );
                                    quantityMove++;
                                } else if (rnd3 <= 21 && generalMoveValue[ 0 ] == 0) {
                                    button1.setText ( "079" );
                                    androidMoveValue[ 0 ] = 1;
                                    generalMoveValue[ 0 ] = 1;
                                    button1.setEnabled ( false );
                                    quantityMove++;
                                } else if (generalMoveValue[ 4 ] == 0) {
                                    button5.setText ( "080" );
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
                   //buttonStart.setEnabled (false);
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
                    else if (rnd2 <= 12) {
                        button4.setText("X" );
                        androidMoveValue[3]=1;
                        generalMoveValue[3]=1;
                        button4.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 15) {
                        button6.setText("X" );
                        androidMoveValue[5]=1;
                        generalMoveValue[5]=1;
                        button6.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 18) {
                        button7.setText("X" );
                        androidMoveValue[6]=1;
                        generalMoveValue[6]=1;
                        button7.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 21) {
                        button8.setText("X" );
                        androidMoveValue[7]=1;
                        generalMoveValue[7]=1;
                        button8.setEnabled ( false );
                        quantityMove++;
                    }
                    else if (rnd2 <= 24) {
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






                }

            }

        });




    }
}

   /* if  (humanUp==0|| humanMiddle==0|| humanBottom==0|| humanLeft==0|| humanCenter==0|| humanRight==0|| humanLrdio==0|| humanRldio==0){
            textView2.setText ( "Победа!!!" );
            }*/

                     //       textView5.setText ("zaeblo");
  /*                  statusMove1 = button1.getText().toString ();
                            statusMove2 = button2.getText().toString ();
                            statusMove3 = button3.getText().toString ();
                            statusMove4 = button4.getText().toString ();
                            statusMove5 = button5.getText().toString ();
                            statusMove6 = button6.getText().toString ();
                            statusMove7 = button7.getText().toString ();
                            statusMove8 = button8.getText().toString ();
                            statusMove9 = button9.getText().toString ();
                            textView5.setText ("zaeblo");
                            textView10.setText ((statusMove1)+(statusMove2)+(statusMove3)+(statusMove4)+(statusMove5)+(statusMove6)+(statusMove7)+(statusMove8)+(statusMove9));
                            button1.setEnabled ( false );
                            button2.setEnabled ( false );
                            button3.setEnabled ( false );
                            button4.setEnabled ( false );
                            button5.setEnabled ( false );
                            button6.setEnabled ( false );
                            button7.setEnabled ( false );
                            button8.setEnabled ( false );
                            button9.setEnabled ( false );
                                                                 else if (generalMoveValue[3]==0){
                                     button4.setText ( "0" );
                                     humanMoveValue[3]=1;
                                     generalMoveValue[3]=1;
                                     quantityMove++;
                                     button3.setEnabled ( false );
                                 }
                                     else if (generalMoveValue[6]==0){
                                         button7.setText ( "0" );
                                         humanMoveValue[6]=1;
                                         generalMoveValue[6]=1;
                                         quantityMove++;
                                         button3.setEnabled ( false );
                                     }
                                     else if (generalMoveValue[8]==0){
                                         button9.setText ( "0" );
                                         humanMoveValue[8]=1;
                                         generalMoveValue[8]=1;
                                         quantityMove++;
                                         button3.setEnabled ( false );
                                     }
                                     else if (generalMoveValue[5]==0){
                                         button6.setText ( "0" );
                                         humanMoveValue[5]=1;
                                         generalMoveValue[5]=1;
                                         quantityMove++;
                                         button3.setEnabled ( false );
                                     }
                                     else if (generalMoveValue[7]==0){
                                         button8.setText ( "0" );
                                         humanMoveValue[7]=1;
                                         generalMoveValue[7]=1;
                                         quantityMove++;
                                         button3.setEnabled ( false );
                                     }


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




//    String statusMove1 = (button1.getText().toString ());
 //                   textView5.setText ( statusMove1+"Y" );
 //                           String statusMove2 = (button2.getText().toString ());
   //                         textView6.setText ( statusMove2+"Y" );
     //                       String statusMove3 = (button3.getText().toString ());
       //                     textView7.setText ( statusMove3+"Y" );
         //                   String statusMove4 = (button4.getText().toString ());
           //                 textView8.setText ( statusMove4+"Y" );
*/




   //     textbutton = (button1.getText().toString ());
    //            if(compareString.equals(textbutton)){
     //           button5.setText ( "0"  );

      //          }


    //String statusMove1 = (button1.getText().toString ());
    // String statusMove2 = (button2.getText().toString ());
    // String statusMove3 = (button3.getText().toString ());
    //  String statusMove4 = (button4.getText().toString ());
    //  String statusMove5 = (button5.getText().toString ());
    //   String statusMove6 = (button6.getText().toString ());
    //   String statusMove7 = (button7.getText().toString ());
    //    String statusMove8 = (button8.getText().toString ());
    //    String statusMove9 = (button9.getText().toString ());
    //    textView5.setText (statusMove5);
    //    textView6.setText (statusMove6);
    //     textView7.setText (statusMove7);
    //    textView8.setText (statusMove8);
   // String statusMove1 = (button1.getText().toString ());
 //   String statusMove2 = (button2.getText().toString ());
 //   String statusMove3 = (button3.getText().toString ());
////    String statusMove4 = (button4.getText().toString ());
 //   String statusMove5 = (button5.getText().toString ());
 //   String statusMove6 = (button6.getText().toString ());
//    String statusMove7 = (button7.getText().toString ());
//    String statusMove8 = (button8.getText().toString ());
 //   String statusMove9 = (button9.getText().toString ());
 //       textView5.setText (statusMove5);
 //               textView6.setText (statusMove6);
 //               textView7.setText (statusMove7);
 //               textView8.setText (statusMove8);



//textView5.setText ( (button1.getText().toString ()));
//   textView5.setText (textbutton = (button2.getText().toString ()));
//    textView5.setText (textbutton = (button3.getText().toString ()));
//    textView5.setText (textbutton = (button4.getText().toString ()));
//    textView5.setText (textbutton = (button5.getText().toString ()));
//    textView5.setText (textbutton = (button6.getText().toString ()));
//   textView5.setText (textbutton = (button7.getText().toString ()));
//   textView5.setText (textbutton = (button8.getText().toString ()));
//   textView5.setText (textbutton = (button9.getText().toString ()));
//   textView6.setText ( Arrays.toString (androidMoveValue));
//   textView7.setText ( Arrays.toString (generalMoveValue));
//  textView8.setText ( Arrays.toString (statusLinijHuman));
//  textView9.setText ( Arrays.toString (statusLinijandroid));
//textView10.setText ( Arrays.toString (statusLinijgeneral));


//if(humanMoveValue[0]==1||humanMoveValue[1]==1||humanMoveValue[2]==1||humanMoveValue[3]==1||humanMoveValue[4] == 1||humanMoveValue[5] == 1||humanMoveValue[6] == 1||humanMoveValue[7] == 1||humanMoveValue[8]==1)

//      @Override
                  //      public void onClick(View view) {
                   //         button1.setText(KRESTIK);
                 //           humanMoveValue[0]=1;
                 //           generalMoveValue[0]=1;
                //        }
                //    });
              //      button2.setOnClickListener(new View.OnClickListener() {
               //         @Override
               //         public void onClick(View view) {
                 //           button2.setText(KRESTIK);
               //             humanMoveValue[1]=1;
                //            generalMoveValue[1]=1;



                 //       }
                 //   });


               // summaH = 0;
              //  for(int i=0; i<humanMoveValue.length; i++) {
              //      summaH=summaH+humanMoveValue[i];
             //   }





               // if(summaH == 1 && humanMoveValue[4]!=1){
              //      button5.setText(NOLIK);
              //  }

              //  textView5.setText ( Arrays.toString (humanMoveValue));
              //  textView6.setText ( Arrays.toString (androidMoveValue));
             //   textView7.setText ( Arrays.toString (generalMoveValue));
             //   textView8.setText ( Arrays.toString (statusLinijHuman));
             //   textView9.setText ( Arrays.toString (statusLinijandroid));
              //  textView10.setText ( Arrays.toString (statusLinijgeneral));
       // textView5.setText ( Arrays.toString (humanMoveValue));
         //       textView6.setText ( Arrays.toString (androidMoveValue));
           //     textView7.setText ( Arrays.toString (generalMoveValue));
             //   textView8.setText ( Arrays.toString (statusLinijHuman));
               // textView9.setText ( Arrays.toString (statusLinijandroid));
                //textView10.setText ( Arrays.toString (statusLinijgeneral));




