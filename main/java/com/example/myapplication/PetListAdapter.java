package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PetListAdapter extends BaseAdapter {
    Context mcontext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<Maininfo> sample_Maininfo;

    public PetListAdapter(Context context, ArrayList<Maininfo> data) {
        mcontext = context;
        sample_Maininfo = data;
        mLayoutInflater = LayoutInflater.from(mcontext);
    }
    @Override
    public int getCount() {
        return sample_Maininfo.size();
    }

    @Override
    public Object getItem(int position) {
        return sample_Maininfo.get(position);
        // 현재 어떤 아이템인지 알려줌
    }

    @Override
    public long getItemId(int position) {
        return position;
        //현재 어떤 포지션인지
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.item, null);
        TextView idtextview = (TextView) view.findViewById((R.id.id_textview));
        TextView nametextview = (TextView) view.findViewById((R.id.name_textview));
        TextView agetextview = (TextView) view.findViewById((R.id.age_textview));
        TextView speciestextview = (TextView) view.findViewById((R.id.species_textview));

        idtextview.setText(sample_Maininfo.get(position).getId());
        nametextview.setText(sample_Maininfo.get(position).getName());
        agetextview.setText(sample_Maininfo.get(position).getAge());
        speciestextview.setText(sample_Maininfo.get(position).getSpecies());

        return view;
    }
}
