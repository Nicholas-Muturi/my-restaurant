package m.nicholas.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RestaurantActivity extends AppCompatActivity {
    private TextView tvLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        Intent intent = getIntent();
        String passedLocation = intent.getStringExtra("location");

        tvLocation = findViewById(R.id.locationTextView);
        tvLocation.setText("Here are all the restaurants near: " +passedLocation);
    }
}
