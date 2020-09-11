package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    TextView textView2;
    TextView textView8;
    TextView textView9;
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

        public boolean topLeft1;
        public boolean topMiddle2;
        public boolean topRight3;
        public boolean middleLeft4;
        public boolean middleMiddle5;
        public boolean middleRight6;
        public boolean bottomLeft7;
        public boolean bottomMiddle8;
        public boolean bottomRight9;
        public boolean yourFirst;
        public boolean androidFirst;
    public boolean topLeft1X;
    public boolean topMiddle2X;
    public boolean topRight3X;
    public boolean middleLeft4X;
    public boolean middleMiddle5X;
    public boolean middleRight6X;
    public boolean bottomLeft7X;
    public boolean bottomMiddle8X;
    public boolean bottomRight9X;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);

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


        buttonStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Random random = new Random();
                int rnd = random.nextInt(10); //Случайная переменная для определения кто первый ходит
                textView.setText("" + (rnd + 1));
                if (rnd >= 5)
                {
                    textView2.setText("Ваш ход");
                    button1.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button1.setText("X");
                            topLeft1 = true;
                            yourFirst = true;
                            button5.setText("0");
                            topLeft1X = true;
                            middleMiddle5X=true;
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button2.setText("X");
                            topMiddle2 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            topMiddle2X=true;
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button3.setText("X");
                            topRight3 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            topRight3X=true;
                        }
                    });
                    button4.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button4.setText("X");
                            middleLeft4 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            middleLeft4X=true;
                        }
                    });
                    button5.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button5.setText("X");
                            middleMiddle5 = true;
                            yourFirst = true;
                            middleMiddle5X = true;
                                Random random = new Random();
                                int rnd3 = random.nextInt(100);

                                if (rnd3 <= 2)
                                {
                                    button2.setText("0");
                                    androidFirst=true;
                                    topMiddle2X=true;
                                }
                                else if (rnd3 <= 4)
                                {
                                    button4.setText("0");
                                    androidFirst=true;
                                    middleLeft4X=true;
                                }
                                else if (rnd3 <= 6)
                                {
                                    button6.setText("0");
                                    androidFirst=true;
                                    middleRight6X=true;
                                }
                                else if (rnd3 <= 8)
                                {
                                    button8.setText("0");
                                    androidFirst=true;
                                    bottomMiddle8X=true;
                                }
                                else if (rnd3 <= 30)
                                {
                                    button1.setText("0");
                                    androidFirst=true;
                                    topLeft1X=true;
                                }
                                else if (rnd3 <= 55)
                                {
                                    button3.setText("0");
                                    androidFirst=true;
                                    topRight3X=true;
                                }
                                else if (rnd3 <= 77)
                                {
                                    button7.setText("0");
                                    androidFirst=true;
                                    bottomLeft7X=true;
                                }
                                else
                                {
                                    button9.setText("0");
                                    androidFirst=true;
                                    bottomRight9X=true;
                                }

                        }
                    });
                    button6.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button6.setText("X");
                            middleRight6 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            middleRight6X=true;
                        }
                    });
                    button7.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button7.setText("X");
                            bottomLeft7 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            bottomLeft7X=true;
                        }
                    });
                    button8.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button8.setText("X");
                            bottomMiddle8 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            bottomMiddle8X=true;
                        }
                    });
                    button9.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            button9.setText("X");
                            bottomRight9 = true;
                            yourFirst = true;
                            button5.setText("0");
                            middleMiddle5X=true;
                            bottomRight9X=true;
                        }

                    });
                    if (yourFirst==true)

                    {
                        if (topLeft1 | topMiddle2 | topRight3 | middleLeft4 | middleRight6 | bottomLeft7 | bottomMiddle8 | bottomRight9 == true)
                        {
                            button5.setText("0");
                        }
                        else
                        {
                            button3.setText("0");
                        }
                    }
                    else
                    {
                        textView9.setText("Привет");
                    }



                }
                else
                    { textView2.setText("Начинает Android");
                        int rnd2 = random.nextInt(100); //Случайная переменная для определения первогохода андроид
                        textView8.setText(("" + (rnd2 + 1)));
                        textView9.setText("Привет");

                        if (rnd2 <= 3)
                        {
                            button1.setText("X");
                            androidFirst=true;
                            topLeft1X=true;
                        }
                        else if (rnd2 <= 6)
                        {
                            button2.setText("X");
                            androidFirst=true;
                            topMiddle2X=true;
                        }
                        else if (rnd2 <= 9)
                        {
                            button3.setText("X");
                            androidFirst=true;
                            topRight3X=true;
                        }
                        else if (rnd2 <= 12)
                        {
                            button4.setText("X");
                            androidFirst=true;
                            middleLeft4X=true;
                        }
                        else if (rnd2 <= 15)
                        {
                            button6.setText("X");
                            androidFirst=true;
                            middleRight6X=true;
                        }
                        else if (rnd2 <= 18)
                        {
                            button7.setText("X");
                            androidFirst=true;
                            bottomLeft7X=true;
                        }
                        else if (rnd2 <= 21)
                        {
                            button8.setText("X");
                            androidFirst=true;
                            bottomMiddle8X=true;
                        }
                        else if (rnd2 <= 24)
                        {
                            button9.setText("X");
                            androidFirst=true;
                            bottomRight9X=true;

                        }
                        else
                            {
                            button5.setText("X");
                            androidFirst=true;
                            middleMiddle5X = true;
                            }
                        button1.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                button1.setText("0");
                                topLeft1 = true;
                                yourFirst = true;
                                topLeft1X = true;

                            }
                        });
                        button2.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                button2.setText("0");
                                topMiddle2 = true;
                                yourFirst = true;
                                topMiddle2X = true;

                            }
                        });
                        button3.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                button3.setText("0");
                                topRight3 = true;
                                yourFirst = true;
                                topRight3X=true;

                            }
                        });
                        button4.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                button4.setText("0");
                                middleLeft4 = true;
                                yourFirst = true;
                                middleLeft4X=true;

                            }
                        });
                        button6.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                button6.setText("0");
                                middleRight6 = true;
                                yourFirst = true;
                                middleRight6X = true;

                            }
                        });

                                button7.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        button7.setText("0");
                                        bottomLeft7 = true;
                                        yourFirst = true;
                                        bottomLeft7X = true;

                                    }
                                });
                                button8.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        button8.setText("0");
                                        bottomMiddle8 = true;
                                        yourFirst = true;
                                        bottomMiddle8X=true;

                                    }
                                });
                                button9.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        button9.setText("0");
                                        bottomRight9 = true;
                                        yourFirst = true;
                                        bottomRight9X=true;

                                    }

                                });

                    }


            }

        });



    }

}