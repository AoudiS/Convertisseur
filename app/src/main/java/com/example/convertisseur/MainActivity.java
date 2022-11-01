package com.example.convertisseur;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boutton ;
    private TextView text1 ;
    private EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutton = findViewById(R.id.button2);
        text1 = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextTextPersonName);

        boutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int DT = Integer.parseInt(s);

                double euro = 0.31 * DT ;
                text1.setText("The euro value is : "+euro+"€ 😄");
                Toast.makeText(MainActivity.this, "value : " + euro , Toast.LENGTH_SHORT).show();


            }
        });
    }
}