package com.example.workout_4.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.workout_4.ActionInfo;
import com.example.workout_4.R;

import java.util.List;

public class ChoseActionListAdapter extends BaseAdapter{

    Activity activity;
    List<ActionInfo> users;
    LayoutInflater inflater;

    public ChoseActionListAdapter(Activity activity) {
        this.activity = activity;
    }

    public ChoseActionListAdapter(Activity activity, List<ActionInfo> users) {
        this.activity = activity;
        this.users = users;

        inflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;

        if(view == null){

            view = inflater.inflate(R.layout.list_view_item,viewGroup,false);

            holder = new ViewHolder();

            holder.SportName = (TextView)view.findViewById(R.id.sport_name);
            holder.ivCheckBox = (ImageView)view.findViewById(R.id.ivCheck);
            holder.ivSport = (ImageView)view.findViewById(R.id.ivSprot);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        ActionInfo model = users.get(position);

        holder.ivSport.setBackgroundResource(model.getFlag());
        holder.SportName.setText(model.getUserName());

        if(model.isSelected()){
            holder.ivCheckBox.setBackgroundResource(R.drawable.check);
        }
        else
            holder.ivCheckBox.setBackgroundResource(R.drawable.empty);

        if (model.getFlag()==0)
            holder.ivCheckBox.setBackgroundResource(0);

        return  view;
    }
    public void updateRecords(List<ActionInfo> users){
        this.users = users;

        notifyDataSetChanged();
    }

    class  ViewHolder{
        TextView SportName;
        ImageView ivSport;
        ImageView ivCheckBox;
    }
}
