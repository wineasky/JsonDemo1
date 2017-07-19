package com.example.jsondemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by w on 2017/7/19.
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder>  {
    private ArrayList<Feed> mFeed = new ArrayList<>();
    private Context mContext;
    public FeedAdapter(ArrayList<Feed> mFeed, Context mContext) {
        this.mFeed = mFeed;
        this.mContext = mContext;
    }


    @Override
    public FeedAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.feed_view, parent, false);
        FeedAdapter.MyViewHolder viewHolder = new FeedAdapter.MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FeedAdapter.MyViewHolder holder, int i) {
        Feed feed = mFeed.get(i);
        holder.title.setText(feed.title);
    }

    @Override
    public int getItemCount() {
        return mFeed.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

       public TextView title;

        public MyViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
        }
    }
}
