package com.example.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<listitem> listitems;  // listitem is the card student and listitems is every card item
    private Context mycontext;
    public myAdapter(List<listitem> listitems, Context context) {
        this.listitems = listitems;
        this.mycontext = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mycontext);
        View view = inflater.inflate(R.layout.list_item,null);
        //ViewHolder holder = new ViewHolder(view);

                return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      listitem listitem = listitems.get(position);

      holder.sid.setText(listitem.getSid()); // getters from constructor class
      holder.sname.setText(listitem.getSname());
      holder.smarks.setText(listitem.getSmarks());
      holder.sstatus.setText(listitem.getSstatus());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView sid;
        public TextView sname;
        public TextView smarks;
        public TextView sstatus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sid = (TextView) itemView.findViewById(R.id.itemview_id);
            sname =  (TextView) itemView.findViewById(R.id.itemview_name);
            smarks =  (TextView) itemView.findViewById(R.id.itemview_marks);
            sstatus =  (TextView) itemView.findViewById(R.id.itemview_status);
        }
    }
}
