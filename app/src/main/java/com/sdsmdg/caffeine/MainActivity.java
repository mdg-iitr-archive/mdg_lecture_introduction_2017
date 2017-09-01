package com.sdsmdg.caffeine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button incrementBtn, decrementBtn;
    TextView tvCounter;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementBtn = (Button) findViewById(R.id.increment);
        decrementBtn = (Button) findViewById(R.id.decrement);
        tvCounter = (TextView) findViewById(R.id.textView);

        tvCounter.setText(Integer.toString(count));
        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvCounter.setText(Integer.toString(count));
            }
        });
        decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvCounter.setText(Integer.toString(count));
            }
        });

    }
}
