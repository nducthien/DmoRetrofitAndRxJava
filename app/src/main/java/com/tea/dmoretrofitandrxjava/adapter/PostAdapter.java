package com.tea.dmoretrofitandrxjava.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tea.dmoretrofitandrxjava.R;
import com.tea.dmoretrofitandrxjava.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private Context context;
    private List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.tv_auth.setText(String.valueOf(postList.get(position).userId));
        holder.tv_title.setText(String.valueOf(postList.get(position).title));
        holder.tv_content.setText(new StringBuffer(postList.get(position).body.substring(0, 20))
                .append("...").toString());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
