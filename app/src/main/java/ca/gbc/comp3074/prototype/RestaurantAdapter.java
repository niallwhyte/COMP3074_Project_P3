package ca.gbc.comp3074.prototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantHolder> {

    Context context;
    List<Restaurant> restaurant;

    public RestaurantAdapter(Context context, List<Restaurant> restaurant) {
        this.context = context;
        this.restaurant = restaurant;
    }

    @NonNull
    @Override
    public RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestaurantHolder(LayoutInflater.from(context).inflate(R.layout.food_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantHolder holder, int position) {
        holder.name.setText(restaurant.get(position).getName());
        holder.location.setText(restaurant.get(position).getLocation());
        holder.rating.setText(restaurant.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return restaurant.size();
    }
}
