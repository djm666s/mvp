package com.example.mvp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.R;
import com.example.mvp.util.GrideUtil;
import com.example.mvp.util.MyApplication;
import com.example.mvp.bean.TouTiaoBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TouTiaoAdapter extends RecyclerView.Adapter<TouTiaoAdapter.ViewHolder> {
    List<TouTiaoBean.NewslistBean> list = new ArrayList<>();
    private OnClick onClick;

    public interface OnClick {
        void click(View view, int position);
    }

    public TouTiaoAdapter(List<TouTiaoBean.NewslistBean> list, OnClick onClick) {
        this.onClick = onClick;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.new_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GrideUtil.getRul(list.get(position).getPicUrl(), holder.newIcon);
        holder.newTitle.setText(list.get(position).getTitle());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.click(view, position);
            }
        });
    }

    public void updata(List<TouTiaoBean.NewslistBean> data) {
        list.addAll(data);
        notifyItemChanged(list.size() - data.size(), data);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static
    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.new_title)
        TextView newTitle;
        @BindView(R.id.new_icon)
        ImageView newIcon;
        @BindView(R.id.layout)
        LinearLayout linearLayout;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
