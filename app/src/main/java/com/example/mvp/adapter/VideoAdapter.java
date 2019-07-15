package com.example.mvp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.R;
import com.example.mvp.util.GrideUtil;
import com.example.mvp.util.MyApplication;
import com.example.mvp.bean.VideoBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    List<VideoBean> list = new ArrayList<>();
    RecvicerOnClick onClick;

    public VideoAdapter(List<VideoBean> list, RecvicerOnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    public void upData(List<VideoBean> videoBeanList) {
        list.clear();
        notifyItemChanged(0, videoBeanList);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.video_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GrideUtil.getRul(list.get(position).getIcon(), holder.videoImage);
        holder.videoText.setText(list.get(position).getTitle());
        holder.videoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static
    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.video_image)
        ImageView videoImage;
        @BindView(R.id.video_text)
        TextView videoText;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
