package space.abdilazov.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initText();
        intentGet();

    }

    private void initText() {
        textView = findViewById(R.id.tv_nameM);
    }

    private void intentGet() {
        String text = getIntent().getStringExtra("key");
        textView.setText(text);
    }
}