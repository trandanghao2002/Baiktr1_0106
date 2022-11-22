package com.example.bkt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentTrangChu extends Fragment {
    private ListView listView;
    private com.example.bkt2.DiaDiemDL_Adapter adapter;
    private ArrayList<com.example.bkt2.TenCaSi> caList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView= view.findViewById(R.id.listview_nhac);
        caList = new ArrayList<>();
        caList.add(new com.example.bkt2.TenCaSi("Tên cá:",R.drawable.img_2,"Tên Thường","Đặc Tính:"));
        caList.add(new com.example.bkt2.TenCaSi("Tên cá:",R.drawable.img_3,"Tên Thường","Đặc Tính:"));
        caList.add(new com.example.bkt2.TenCaSi("Tên Cá:",R.drawable.img_4,"Tên Thường","Đặc Tính:"));
        caList.add(new com.example.bkt2.TenCaSi("Tên cá:",R.drawable.img_5,"Tên Thường","Đặc Tính:"));
        caList.add(new com.example.bkt2.TenCaSi("Tên Cá:",R.drawable.img_6,"Tên Thường","Đặc Tính:"));

        adapter = new com.example.bkt2.DiaDiemDL_Adapter(getContext(),R.layout.custom_itemdiadiem,caList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), com.example.bkt2.MoTa.class);
                intent.putExtra("key1",caList.get(i).getImg());
                intent.putExtra("key2",caList.get(i).getTenCa());
                intent.putExtra("key3",caList.get(i).getTenCa());
                intent.putExtra("key4",caList.get(i).getDactinh());
                intent.putExtra("key5",caList.get(i).getMoTa());
                startActivity(intent);
            }
        });



        return view;
    }
}