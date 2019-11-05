package m.nicholas.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnfindRestaurantsButton;
    private EditText etLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLocation = findViewById(R.id.locationEditText);
        btnfindRestaurantsButton = findViewById(R.id.findRestaurantsButton);
        btnfindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,RestaurantActivity.class);
//                startActivity(intent);
                String location = etLocation.getText().toString();
                etLocation.setText("");
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                intent.putExtra("location",location);
                startActivity(intent);
        }
        });

    }
}
