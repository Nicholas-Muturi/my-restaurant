package m.nicholas.myrestaurant.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import m.nicholas.myrestaurant.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.locationEditText) EditText etLocation;
    @BindView(R.id.findRestaurantsButton) Button btnfindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnfindRestaurantsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btnfindRestaurantsButton){
            String location = etLocation.getText().toString();
            etLocation.setText("");
            Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
            intent.putExtra("location",location);
            startActivity(intent);
        }
    }
}
