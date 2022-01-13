package com.example.notrealinstagram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notrealinstagram.R;
import com.example.notrealinstagram.models.insta_model;

import java.util.ArrayList;

public class insta_adapter extends RecyclerView.Adapter<insta_adapter.viewHolder> {

    ArrayList<insta_model> list ;
    Context context;

    public insta_adapter(ArrayList<insta_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sampleinsta_homelayout , parent , false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        insta_model model = list.get(position);

        holder.profilePic.setImageResource(model.getProfilePic());
        holder.uploadPic.setImageResource(model.getUploadPic());
        holder.instaID.setText(model.getInstaId());
        holder.instaPlace.setText(model.getPlace());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class  viewHolder extends RecyclerView.ViewHolder {

        ImageView uploadPic;
        ImageView profilePic;
        TextView instaID;
        TextView instaPlace;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            uploadPic = itemView.findViewById(R.id.upload_image);
            profilePic = itemView.findViewById(R.id.story_image);
            instaID = itemView.findViewById(R.id.insta_id);
            instaPlace = itemView.findViewById(R.id.insta_place);
        }
    }


}
