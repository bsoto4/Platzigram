package com.zeze.platzigram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zeze.platzigram.R;
import com.zeze.platzigram.model.CardPicture;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 09/01/2017.
 */

public class RecyclerViewCardAdapter extends RecyclerView.Adapter<RecyclerViewCardAdapter.CardViewHolder>{

    private ArrayList<CardPicture> cards;
    private int resource;
    private Activity activity;

    public RecyclerViewCardAdapter(ArrayList<CardPicture> cards, int resource, Activity activity) {
        this.cards = cards;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        CardPicture card = cards.get(position);
        holder.tv_username.setText(card.getUsername());
        holder.tv_time.setText(card.getTime());
        holder.tv_like.setText(card.getLike());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_card;
        private TextView tv_username;
        private TextView tv_time;
        private TextView tv_like;

        public CardViewHolder(View itemView) {
            super(itemView);

            img_card = (ImageView) itemView.findViewById(R.id.img_cardview);
            tv_username = (TextView) itemView.findViewById(R.id.tv_username);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
            tv_like = (TextView) itemView.findViewById(R.id.tv_like);

        }
    }
}
