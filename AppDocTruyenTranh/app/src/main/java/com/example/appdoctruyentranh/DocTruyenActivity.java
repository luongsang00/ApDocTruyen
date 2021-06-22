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

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import api.ApiLayAnh;
import api.ApiLayTruyen;
import interfaces.LayAnhVe;
import object.TruyenTranh;

public class DocTruyenActivity extends AppCompatActivity implements LayAnhVe{
    ImageView ingAnh;
    ArrayList<String> arrUrlAnh;
    int sotrang, sotrangdangdoc;
    TextView txtSoTrang;
    String idChap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_truyen2);
        init();
        anhXa();
        setUp();
        setClick();
        new ApiLayAnh(this,idChap).execute();
    }
    private void init()
    {
        Bundle b= getIntent().getBundleExtra("data");
        idChap=b.getString("idChap");

    }
    private void anhXa()
    {
        ingAnh = findViewById(R.id.ingAnh);
        txtSoTrang = findViewById(R.id.txtSoTrang);
    }
    private void setUp()
    {
        //docTheoTrang(0);
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

    @Override
    public void batDau() {

    }

    @Override
    public void ketThuc(String data) {
        arrUrlAnh = new ArrayList<>();
        try{
            JSONArray arr = new JSONArray(data);
            for (int i=0; i<arr.length();i++)
            {
                arrUrlAnh.add(arr.getString(i));
            }
            sotrangdangdoc = 1;
            sotrang=arrUrlAnh.size();
            docTheoTrang(0);
        }catch(JSONException e)
        {

        }

    }

    @Override
    public void biLoi() {

    }
}