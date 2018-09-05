package com.tea.dmoretrofitandrxjava.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tea.dmoretrofitandrxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView tv_title;
    TextView tv_content;
    TextView tv_auth;

    public PostViewHolder(View itemView) {
        super(itemView);

        tv_title = itemView.findViewById(R.id.tv_title);
        tv_content = itemView.findViewById(R.id.tv_conten);
        tv_auth = itemView.findViewById(R.id.tv_auth);
    }
}
