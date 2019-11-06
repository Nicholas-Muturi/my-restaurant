package m.nicholas.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

@SuppressWarnings("ALL")
public class RestaurantActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView tvLocation;
    @BindView(R.id.restaurantsListView) ListView mListView;

    private String[] restaurants = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedRestaurant = ((TextView)view).getText().toString();
                Toast.makeText(RestaurantActivity.this,selectedRestaurant,Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        String passedLocation = intent.getStringExtra("location");
        tvLocation = findViewById(R.id.locationTextView);
        tvLocation.setText("Here are all the restaurants near: " +passedLocation);



    }
}
