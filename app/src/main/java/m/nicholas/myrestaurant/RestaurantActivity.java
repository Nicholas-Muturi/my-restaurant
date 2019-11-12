package m.nicholas.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import m.nicholas.myrestaurant.adapters.MyRestaurantArrayAdapter;

@SuppressWarnings("ALL")
public class RestaurantActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView tvLocation;
    @BindView(R.id.restaurantsListView) ListView mListView;
    private String[] restaurants = new String[] {"Sweet Hereafter", "Cricket", "Hawthorne Fish House", "Viking Soul Food", "Red Square", "Horse Brass", "Dick's Kitchen", "Taco Bell", "Me Kha Noodle Bar", "La Bonita Taqueria", "Smokehouse Tavern", "Pembiche", "Kay's Bar", "Gnarly Grey", "Slappy Cakes", "Mi Mero Mole" };
    private String[] cuisines = new String[] {"Vegan Food", "Breakfast", "Fishs Dishs", "Scandinavian", "Coffee", "English Food", "Burgers", "Fast Food", "Noodle Soups", "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar", "Breakfast", "Mexican" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ButterKnife.bind(this);

        MyRestaurantArrayAdapter adapter = new MyRestaurantArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants,cuisines);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
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
