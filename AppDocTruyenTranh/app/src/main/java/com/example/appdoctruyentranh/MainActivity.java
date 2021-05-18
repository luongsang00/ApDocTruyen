package com.example.appdoctruyentranh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import object.TruyenTranh;

public class MainActivity extends AppCompatActivity {
GridView dgvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init()
    {
        truyenTranhArrayList =  new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("Tiên Tôn Lạc Vô Cực","Chương 47","https://scontent-hkg4-2.xx.fbcdn.net/v/t1.6435-9/89336460_2588390038040137_7271516456901148672_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=KKik1Oa93qYAX_XrEoR&_nc_ht=scontent-hkg4-2.xx&oh=fd267d79116374e3014adcfc31a6bd4a&oe=60C69A94"));
        truyenTranhArrayList.add(new TruyenTranh("Tuyệt Thế Võ Thần","Chương 405","https://cmanga.com/assets/tmp/book/avatar/1619172536-4592.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Kẻ Ăn Hại Triều Minh","Chương 44","https://cmanga.com/assets/tmp/book/avatar/1599956550-9025.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chương 344","https://cmanga.com/assets/tmp/book/avatar/1597483443-6557.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Tiên Tôn Lạc Vô Cực","Chương 47","https://scontent-hkg4-2.xx.fbcdn.net/v/t1.6435-9/89336460_2588390038040137_7271516456901148672_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=KKik1Oa93qYAX_XrEoR&_nc_ht=scontent-hkg4-2.xx&oh=fd267d79116374e3014adcfc31a6bd4a&oe=60C69A94"));
        truyenTranhArrayList.add(new TruyenTranh("Tuyệt Thế Võ Thần","Chương 405","https://cmanga.com/assets/tmp/book/avatar/1619172536-4592.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Kẻ Ăn Hại Triều Minh","Chương 44","https://cmanga.com/assets/tmp/book/avatar/1599956550-9025.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chương 344","https://cmanga.com/assets/tmp/book/avatar/1597483443-6557.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Tiên Tôn Lạc Vô Cực","Chương 47","https://scontent-hkg4-2.xx.fbcdn.net/v/t1.6435-9/89336460_2588390038040137_7271516456901148672_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=KKik1Oa93qYAX_XrEoR&_nc_ht=scontent-hkg4-2.xx&oh=fd267d79116374e3014adcfc31a6bd4a&oe=60C69A94"));
        truyenTranhArrayList.add(new TruyenTranh("Tuyệt Thế Võ Thần","Chương 405","https://cmanga.com/assets/tmp/book/avatar/1619172536-4592.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Kẻ Ăn Hại Triều Minh","Chương 44","https://cmanga.com/assets/tmp/book/avatar/1599956550-9025.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chương 344","https://cmanga.com/assets/tmp/book/avatar/1597483443-6557.jpg"));

        adapter= new TruyenTranhAdapter(this, 0, truyenTranhArrayList);
    }
    private void anhXa()
    {
        dgvDSTruyen= findViewById(R.id.gdvDSTruyen);
    }
    private void setUp()
    {
        dgvDSTruyen.setAdapter(adapter);
    }
    private void setClick(){}
}