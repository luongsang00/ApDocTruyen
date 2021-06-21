package com.example.appdoctruyentranh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import api.ApiLayTruyen;
import object.TruyenTranh;

public class DocTruyenActivity extends AppCompatActivity {
    ImageView ingAnh;
    ArrayList<String> arrUrlAnh;
    int sotrang, sotrangdangdoc;
    TextView txtSoTrang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_truyen2);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init()
    {
        arrUrlAnh = new ArrayList<>();
        arrUrlAnh.add("https://1.bp.blogspot.com/-l5kOM1XSAR0/YKcSe0VHZKI/AAAAAAADbQ0/IfP9IplY42Eowq1qSbGeQsHa-ZdclpR6gCLcBGAsYHQ/s0/0002.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-SJXwvOL-6CI/YKcSezkoI2I/AAAAAAADbQ4/n8577qvparAfcn-KipJOQ0FJzVC7WWwrQCLcBGAsYHQ/s0/0003.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-hOyO4I9aqK4/YKcSezYeL7I/AAAAAAADbQ8/p2i5henzk3E-5fN5SES2VrAZZbVd5uocwCLcBGAsYHQ/s0/0004.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-wtApweqbdIU/YKcSf0qHvwI/AAAAAAADbRA/05pjnItplkogExNR5wVbVHICkk3ISb38ACLcBGAsYHQ/s0/0005.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-dLEfPGi2Smo/YKcSgP1MvSI/AAAAAAADbRE/qh2IwJx9MzMBaEU5AM6ads6dJUQjp6eTgCLcBGAsYHQ/s0/0006.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-yUPwkIAhpEk/YKcSgdRg3EI/AAAAAAADbRM/BijfNntORT48-Wgr9-Puu0CF8AKNEbpjwCLcBGAsYHQ/s0/0008.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-PJS0_DoH6M8/YKcSgmxDzGI/AAAAAAADbRQ/SfrE0cfvaoANf9FHeVz_JzBre4UrQDhuwCLcBGAsYHQ/s0/0009.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-YMMrZnKbPtY/YKcSg19aSdI/AAAAAAADbRU/LFFqkCixNh442QANom848zEirydCqxvQACLcBGAsYHQ/s0/0010.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-Q6zP5sin8Vo/YKcShBwDBvI/AAAAAAADbRY/_RIJI-hBL_4fw9m_BLWq1vMJKDhchtd9ACLcBGAsYHQ/s0/0011.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-RiUWEMU1vSM/YKcShTMkFlI/AAAAAAADbRc/wNuYWKmjpWUiv8_vB3hTdZzg-nex9EVnACLcBGAsYHQ/s0/0012.jpg?id=top1?imgmax=0");
        arrUrlAnh.add("https://1.bp.blogspot.com/-snuAhkH2FrM/YKcShyDslDI/AAAAAAADbRg/iinG5i-kmawBKQMmqT69gnvJ-d_-IFiWgCLcBGAsYHQ/s0/0013.jpg?id=top1?imgmax=0");
        sotrangdangdoc = 1;
        sotrang=arrUrlAnh.size();

    }
    private void anhXa()
    {
        ingAnh = findViewById(R.id.ingAnh);
        txtSoTrang = findViewById(R.id.txtSoTrang);
    }
    private void setUp()
    {
        docTheoTrang(0);
    }
    private void setClick()
    {

    }

    public void left(View view) {
        docTheoTrang(-1);
    }

    public void right(View view) {
        docTheoTrang(1);
    }
    private void docTheoTrang(int i)
    {
        sotrangdangdoc = sotrangdangdoc+i;
        if(sotrangdangdoc==0) {
            sotrangdangdoc=1;
        }
        if(sotrangdangdoc>sotrang){
            sotrangdangdoc=sotrang;
        }
        txtSoTrang.setText(sotrangdangdoc+ " / "+sotrang);
        Glide.with(this).load(arrUrlAnh.get(sotrangdangdoc-1)).into(ingAnh);
    }
}