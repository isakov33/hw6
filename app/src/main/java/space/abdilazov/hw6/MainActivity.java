package space.abdilazov.hw6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.first_fl,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_fl, new SecondFragment()).commit();

    }
}