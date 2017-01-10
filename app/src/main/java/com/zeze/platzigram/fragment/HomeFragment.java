package com.zeze.platzigram.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeze.platzigram.R;
import com.zeze.platzigram.adapter.RecyclerViewCardAdapter;
import com.zeze.platzigram.model.CardPicture;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerViewCardAdapter recyclerViewCardAdapter;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //showToolbar("ASDASD",false, view);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_picture);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewCardAdapter = new RecyclerViewCardAdapter(getData(), R.layout.cardview_picture, getActivity());
        recyclerView.setAdapter(recyclerViewCardAdapter);

        return view;
    }


    public void showToolbar(String title, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public ArrayList<CardPicture> getData() {
        ArrayList<CardPicture> cards = new ArrayList<>();
        cards.add(new CardPicture("", "Bryam Soto", "4 días", "5"));
        cards.add(new CardPicture("", "Greisy Arones", "2 días", "15"));
        cards.add(new CardPicture("", "Diego Soto", "1 días", "9"));
        cards.add(new CardPicture("", "Cindy Diaz", "1 hora", "1"));
        return cards;
    }
}
