package com.example.jimmy.alwaystime.BLL;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jimmy.alwaystime.BO.Task;
import com.example.jimmy.alwaystime.R;

import java.util.List;

public class ListTaskAdapter extends ArrayAdapter<Task> {
    public ListTaskAdapter(Context context, List<Task> tasks) {
        super(context, 0, tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.in_list_task,parent, false);
        }

        TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new TweetViewHolder();
            viewHolder.id_task = (TextView) convertView.findViewById(R.id.id_task);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.duree = (TextView) convertView.findViewById(R.id.duree);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Task task = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.id_task.setText(Integer.toString(task.getId_task()));
        viewHolder.nom.setText(task.getNom());
        viewHolder.duree.setText(task.getDuree());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView id_task;
        public TextView nom;
        public TextView duree;
    }
}
