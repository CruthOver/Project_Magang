package org.wiradipa.projectmagang;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CruthOvr on 05/01/2018.
 */

public class RecentsAdapter extends ArrayAdapter<Recents> {
    public RecentsAdapter(@NonNull Context context, @NonNull ArrayList<Recents> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_history, parent, false);
        }

        Recents current = getItem(position);
        TextView namaBarang = (TextView) convertView.findViewById(R.id.textView);
        TextView kodeBarang = (TextView) convertView.findViewById(R.id.kodeBarang);
        TextView tanggal = (TextView) convertView.findViewById(R.id.tanggal);
        TextView jam = (TextView) convertView.findViewById(R.id.jam);

        namaBarang.setText(current.getNamaBarang());
        kodeBarang.setText(current.getKodeBarang());
        tanggal.setText(current.getTanggal());
        jam.setText(current.getJam());

        return convertView;
    }
}
