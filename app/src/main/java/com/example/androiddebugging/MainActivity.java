package com.example.androiddebugging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView averageTV;
    private Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        averageTV = findViewById(R.id.averageTV);
        calculateBtn = findViewById(R.id.calculateBtn);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] numbers = new int[] {3,2,4};
                double average = getAverage(numbers);

                averageTV.setText("Average: "+average);
            }
        });
    }

    private double getAverage(int[] numbers) {

        int sum = 0;

        for (int i = 0; i <numbers.length; i++){
            sum = sum + numbers[i];
        }

        double result = (double)sum / numbers.length;

        return result;
    }
}
