package org.wiradipa.projectmagang;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AndhikaEffendy on 1/6/2018.
 */

public class NotificationsAdapter extends ArrayAdapter<Notification> {
    public NotificationsAdapter(@NonNull Context context, @NonNull List<Notification> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_deliveryorder,parent,false);
        }
        Notification current = getItem(position);
        TextView namaBarang = (TextView) convertView.findViewById(R.id.nBarang);
        TextView kodeBarang = (TextView) convertView.findViewById(R.id.kBarang);
        TextView tanggal = (TextView) convertView.findViewById(R.id.tnggl);
        TextView totalBarang = (TextView) convertView.findViewById(R.id.total_barang);
        ImageView tersedia = (ImageView) convertView.findViewById(R.id.available);

        namaBarang.setText(current.getMnamaBarang());
        kodeBarang.setText(current.getMmerekBarang());
        tanggal.setText(current.getMjam());
        totalBarang.setText(current.getmTotalBarang());
        return convertView;
    }

}
