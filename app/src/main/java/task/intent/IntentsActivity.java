package task.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class IntentsActivity extends AppCompatActivity {

    private void initializeWindow() {
        int dark_blue = ContextCompat.getColor(this, R.color.intents_dark_blue);
        getWindow().setNavigationBarColor(dark_blue);
        getWindow().setStatusBarColor(dark_blue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // setup the navigation bar and status bar
        this.initializeWindow();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.intents_main);
    }
}