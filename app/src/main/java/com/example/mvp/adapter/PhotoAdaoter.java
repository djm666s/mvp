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
import com.example.mvp.util.GrideUtil;
import com.example.mvp.bean.PhotoBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoAdaoter extends RecyclerView.Adapter<PhotoAdaoter.ViewHolder> {
    Context context;
    List<PhotoBean.ResultsBean> list;
    OnClick onClick;

    public interface OnClick {
        void click(View view, int position);
    }

    public void updata(List<PhotoBean.ResultsBean> data) {
        list.addAll(data);
        notifyItemChanged(list.size() - data.size(), data);
    }

    public PhotoAdaoter(Context context, List<PhotoBean.ResultsBean> list, OnClick onClick) {
        this.list = list;
        this.context = context;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.music_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GrideUtil.getRul(list.get(position).getUrl(), holder.icon);
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.click(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    static
    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.icon)
        ImageView icon;
        @BindView(R.id.music_name)
        TextView musicName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
