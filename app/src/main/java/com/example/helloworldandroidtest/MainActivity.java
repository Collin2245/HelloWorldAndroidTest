package com.example.helloworldandroidtest;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);



        //TextView myLabel = this.findViewById(R.id.myLabel);
        //myLabel.setText("Mr.Gonzales coins: " + currency);
    }





    public void ClickButtonPressed(View v)
    {


        TextView numeratorView = this.findViewById(R.id.AnswerNum);
        TextView denominatorView = this.findViewById(R.id.AnswerDenom);
        //TextView myLabel = this.findViewById(R.id.myLabel);

       // myLabel.setText("Mr.Gonzales coins: " + currency);
        EditText N1 = this.findViewById(R.id.N1);
        EditText D1 = this.findViewById(R.id.D1);
        EditText N2 = this.findViewById(R.id.N2);
        EditText D2 = this.findViewById(R.id.D2);



        if(TextUtils.isEmpty(N1.getText().toString())|| TextUtils.isEmpty(D1.getText().toString()) ||
                TextUtils.isEmpty(N2.getText().toString()) || TextUtils.isEmpty(D2.getText().toString()))
            {
            numeratorView.setText("ERROR");
            denominatorView.setText("INPUT TEXT");
        }
        else
        {

            int IN1 = Integer.parseInt(N1.getText().toString());
            int ID1 = Integer.parseInt(D1.getText().toString());
            int IN2 = Integer.parseInt(N2.getText().toString());
            int ID2 = Integer.parseInt(D2.getText().toString());

            Fraction fraction1 = new Fraction(IN1,ID1);
            Fraction fraction2 = new Fraction(IN2,ID2);


            Fraction answer = fraction1.add(fraction2);
            answer.reduceEuclidean();
            String newNumerator = Integer.toString(answer.numerator);
            String newDenominator = Integer.toString(answer.denominator);
            numeratorView.setText(newNumerator);
            denominatorView.setText(newDenominator);

        }

    }






}
