package ca.gbc.comp3074.prototype;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantHolder extends RecyclerView.ViewHolder {

    TextView name, location, rating;

    public RestaurantHolder(@NonNull View itemView) {
        super(itemView);
        name = name.findViewById(R.id.name);
        location = location.findViewById(R.id.location);
        rating = rating.findViewById(R.id.rating);
    }
}
