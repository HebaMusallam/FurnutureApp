package com.example.farnuture.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.farnuture.R;
import com.example.farnuture.models.FavoriteItem;

import java.util.List;

public class FavoriteAdapter extends BaseAdapter {

    private Context context;
    private List<FavoriteItem> favoriteItems;

    public FavoriteAdapter(Context context, List<FavoriteItem> favoriteItems) {
        this.context = context;
        this.favoriteItems = favoriteItems;
    }

    @Override
    public int getCount() {
        return favoriteItems.size();
    }

    @Override
    public Object getItem(int position) {
        return favoriteItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        ImageView imgProduct, imgFavorite, imgRatingStar;
        TextView txtTitle, txtRating, txtPrice;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_favorite, parent, false);
            holder = new ViewHolder();
            holder.imgProduct = convertView.findViewById(R.id.imgProduct);
            holder.imgFavorite = convertView.findViewById(R.id.imgFavorite);
            holder.imgRatingStar = convertView.findViewById(R.id.imgRatingStar);
            holder.txtTitle = convertView.findViewById(R.id.txtTitle);
            holder.txtRating = convertView.findViewById(R.id.txtRating);
            holder.txtPrice = convertView.findViewById(R.id.txtPrice);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        FavoriteItem item = favoriteItems.get(position);

        holder.imgProduct.setImageResource(item.getImageResId());
        // أيقونة المفضلة ثابتة هنا، يمكن إضافة تفاعل لو تريد.
        holder.txtTitle.setText(item.getTitle());
        holder.txtRating.setText(item.getRating());
        holder.txtPrice.setText(item.getPrice());

        return convertView;
    }
}
