package com.example.appdoctruyentranh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import api.ApiLayTruyen;
import interfaces.LayTruyenVe;
import object.TruyenTranh;

public class MainActivity extends AppCompatActivity implements LayTruyenVe {
GridView dgvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
EditText edtTimKiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
        new ApiLayTruyen(this).execute();
    }
    private void init()
    {
        truyenTranhArrayList =  new ArrayList<>();

        adapter= new TruyenTranhAdapter(this, 0, truyenTranhArrayList);
    }
    private void anhXa()
    {
        dgvDSTruyen= findViewById(R.id.gdvDSTruyen);
        edtTimKiem= findViewById(R.id.edtTimKiem);

    }
    private void setUp()
    {
        dgvDSTruyen.setAdapter(adapter);
    }
    private void setClick()
    {
        edtTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String st= edtTimKiem.getText().toString();
                adapter.sortTruyen(st);
            }
        });
    }

    @Override
    public void batDau() {
        Toast.makeText(this,"Dang Lay Ve", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ketThuc(String data) {
        try {
            truyenTranhArrayList.clear();
            JSONArray arr = new JSONArray(data);
            for(int i=0;i< arr.length();i++)
            {
                JSONObject o = arr.getJSONObject(i);
                truyenTranhArrayList.add(new TruyenTranh(o));
            }
            adapter= new TruyenTranhAdapter(this, 0, truyenTranhArrayList);
            dgvDSTruyen.setAdapter(adapter);
        }catch (JSONException e){}
    }

    @Override
    public void biLoi() {
        Toast.makeText(this,"Loi Ket Noi", Toast.LENGTH_SHORT).show();
    }
}