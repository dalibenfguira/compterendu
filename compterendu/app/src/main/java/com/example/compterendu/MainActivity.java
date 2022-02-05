package com.example.compterendu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private TextView Text1;
    private TextView Text2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1 = (TextView) findViewById(R.id.txt);
        Text1.setText("Hello");
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DONE", Toast.LENGTH_LONG).show();
                Text2=(TextView) findViewById(R.id.txt1);
                Text2.setText("WELCOME DALI");
            }
        });
    }
}