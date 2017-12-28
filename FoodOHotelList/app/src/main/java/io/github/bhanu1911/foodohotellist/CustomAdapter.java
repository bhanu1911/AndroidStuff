package io.github.bhanu1911.foodohotellist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by fkinuseless on 17/12/17.
 */

public class CustomAdapter extends ArrayAdapter<HotelList> {
    List<HotelList> hotels;

    Context context;
    int resource;

    public CustomAdapter(Context context, int resource, List<HotelList> hotels) {
        super(context,resource, hotels);
        this.context = context;
        this.resource = resource;
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

    }

}
