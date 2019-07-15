package com.example.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.R;
import com.example.mvp.bean.TestBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MianAdapter extends RecyclerView.Adapter<MianAdapter.ViewHolder> {
    Context context;
    List<TestBean> list;
    private Onclick onclick;

    public interface Onclick {
        void onClick(View view, int position);
    }

    public MianAdapter(Context context, List<TestBean> list, Onclick onclick) {
        this.list = list;
        this.context = context;
        this.onclick = onclick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.icon.setImageResource(list.get(position).getIcon());
        holder.test.setText(list.get(position).getTest());
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclick.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    static
    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.test)
        TextView test;
        @BindView(R.id.icon)
        ImageView icon;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
