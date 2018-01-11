package org.wiradipa.projectmagang;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {


    public NotificationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        TextView kosong = (TextView) view.findViewById(R.id.kosong);

        ArrayList<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("Sepatu Nike","DASDJN212","02 januari 2017","03/20", R.drawable.ic_available));
        notifications.add(new Notification("Sepatu Adidas","IW374JFUE","14 januari 2017","02/20",0));
        notifications.add(new Notification("Baju Quick Silver","9KDD736DH","03 Maret 2017","16/20",0));
        notifications.add(new Notification("Baju Adidas","KS9DLF0WE","29 Februari 2017","09/20",R.drawable.ic_available));
        notifications.add(new Notification("Baju Nike","EE73YYD6F","23 Agustus 2017","10/20",R.drawable.ic_available));
        notifications.add(new Notification("Celana Jeans","KSMDY66G3","25 Desember 2017","12/20",0));

        ListView list = view.findViewById(R.id.list_item);

        NotificationsAdapter adapter = new NotificationsAdapter(getActivity(),notifications);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                    adapter.getItemAtPosition(position);
                    Intent intent = new Intent(getActivity(), DeliveryOrderActivity.class);
                    startActivity(intent);
            }
        });

        return view;
    }
}
