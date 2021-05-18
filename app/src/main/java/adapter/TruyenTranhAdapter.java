package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.appdoctruyentranh.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import object.TruyenTranh;

public class TruyenTranhAdapter extends ArrayAdapter<TruyenTranh> {
    private Context ct;
    private ArrayList<TruyenTranh> arr;
    public TruyenTranhAdapter(@NonNull Context context, int resource, @NonNull List<TruyenTranh> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.item_truyen, null);

        }
        if(arr.size()>0)
        {
            TruyenTranh truyenTranh = this.arr.get(position);

            TextView tenTenTruyem= convertView.findViewById(R.id.txvTenTruyem);
            TextView tenTenChap= convertView.findViewById(R.id.txvTenChap);
            ImageView imgAnhtruyen= convertView.findViewById(R.id.imgAnhTruyen);

            tenTenTruyem.setText(truyenTranh.getTenTruyen());
            tenTenChap.setText(truyenTranh.getTenChap());
            Glide.with(this.ct).load(truyenTranh.getLinkAnh()).into(imgAnhtruyen);
        }
        return convertView;
    }
}
