package m.nicholas.myrestaurant.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRestaurantArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyRestaurantArrayAdapter(Context context, int resource, String[] mRestaurants, String[] mCuisines) {
        super(context, resource);
        this.mContext = context;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s",restaurant,cuisine);
    }

    @Override
    public int getCount() {
        return mRestaurants.length;
    }
}
