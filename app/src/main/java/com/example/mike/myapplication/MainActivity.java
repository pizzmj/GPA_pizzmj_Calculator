package com.example.mike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText grd1;
    EditText grd2;
    EditText grd3;
    EditText grd4;
    EditText grd5;
    TextView grdDisplay;
    View view;

    int gradeOne;
    int gradeTwo;
    int gradeThree;
    int gradeFour;
    int gradeFive;
    int gpu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grd1= findViewById(R.id.grade_one);
        grd2= findViewById(R.id.grade_two);
        grd3= findViewById(R.id.grade_three);
        grd4= findViewById(R.id.grade_four);
        grd5= findViewById(R.id.grade_five);
        Button button= findViewById(R.id.btn_compute);
        grdDisplay= findViewById(R.id.gpu_display);
        view= findViewById(R.id.main_view);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gradeOne= Integer.parseInt(grd1.getText().toString());
                gradeTwo= Integer.parseInt(grd2.getText().toString());
                gradeThree= Integer.parseInt(grd3.getText().toString());
                gradeFour= Integer.parseInt(grd4.getText().toString());
                gradeFive= Integer.parseInt(grd5.getText().toString());
                gpu= (gradeOne + gradeTwo + gradeThree + gradeFour+ gradeFive) / 5;
                grdDisplay.setText(String.valueOf(gpu));

                if(gpu < 60)
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                else if(gpu >= 60 && gpu <=79)
                    view.setBackgroundColor(getResources().getColor(R.color.yellow));
                else
                    view.setBackgroundColor(getResources().getColor(R.color.green));

            }
        });
    }
}
