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
import com.example.notrealinstagram.models.insta_model2;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class insta_adapter2 extends RecyclerView.Adapter<insta_adapter2.viewHolder> {

    ArrayList<insta_model2> list;
    Context context ;

    public insta_adapter2(ArrayList<insta_model2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sampleinsta_storieslayout ,parent , false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        insta_model2 model = list.get(position);

        holder.story.setImageResource(model.getPic());
        holder.storytext.setText(model.getId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView story;
        TextView  storytext;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            story = itemView.findViewById(R.id.story_image);
            storytext = itemView.findViewById(R.id.storyid);
        }
    }


}
