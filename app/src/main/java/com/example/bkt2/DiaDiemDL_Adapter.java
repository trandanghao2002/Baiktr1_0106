package com.example.bkt2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DiaDiemDL_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TenCaSi> caList;

    public DiaDiemDL_Adapter(Context context, int layout, List<TenCaSi> CaList) {
        this.context = context;
        this.layout = layout;
        this.caList = CaList;
    }

    @Override
    public int getCount() {
        return caList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        // anh xa
        TextView txt_TenKhoaHoc = view.findViewById(R.id.txt_tenkhoahoc);

        TextView txt_TenThuong= view.findViewById(R.id.txt_tenthuong);
        TextView txt_DacTinh= view.findViewById(R.id.txt_dactinh);
        ImageView img = view.findViewById(R.id.imgHinh);

        TenCaSi tenCaSi =  caList.get(i);
        txt_TenKhoaHoc.setText(tenCaSi.getTenCa());
        txt_TenThuong.setText(tenCaSi.getTenCa());
        txt_DacTinh.setText(tenCaSi.getDactinh());
        img.setImageResource(tenCaSi.getImg());

        return view;
    }
}

