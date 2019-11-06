package m.nicholas.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.locationEditText) EditText etLocation;
    @BindView(R.id.findRestaurantsButton) Button btnfindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

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
