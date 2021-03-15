package edu.cs.birzeit.fisrtappsubmition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView weight ;
    private TextView height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connector();
    }

    private void connector() {
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
    }
    public void cal_onclick(View view) {
        String w = weight.getText().toString();
        String h = height.getText().toString();
        if(!w.isEmpty() && !h.isEmpty()) {
            double result = Double.parseDouble(w) / (Double.parseDouble(h) * Double.parseDouble(h));
            Toast.makeText(this, "BMI is : " + String.valueOf(result), Toast.LENGTH_SHORT).show();
        }
    }
}