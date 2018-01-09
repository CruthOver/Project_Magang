package org.wiradipa.projectmagang;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecentsFragment extends Fragment {
    public RecentsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recents, container, false);

        TextView mEmpty = (TextView) view.findViewById(R.id.empty);

        ArrayList<Recents> recentses = new ArrayList<>();
        recentses.add(new Recents("Sepatu Nike", "SPTNK050118", "05/01/2018", "23.11"));
        recentses.add(new Recents("Sepatu Adidas", "SPTADS060118", "06/01/2018", "12.32"));
        recentses.add(new Recents("Sepatu Specs", "SPTSPC070118", "07/01/2018", "11.47"));
        recentses.add(new Recents("Sepatu Puma", "SPTPM050818", "08/01/2018", "09.10"));
        recentses.add(new Recents("Sepatu League", "SPTLG090118", "09/01/2018", "10.23"));
        recentses.add(new Recents("Sepatu League", "SPTLG090118", "09/01/2018", "10.23"));
        recentses.add(new Recents("Sepatu League", "SPTLG090118", "09/01/2018", "10.23"));
        recentses.add(new Recents("Sepatu League", "SPTLG090118", "09/01/2018", "10.23"));

        ListView recentsList = (ListView) view.findViewById(R.id.list_recent);

        RecentsAdapter adapter = new RecentsAdapter(getActivity(), recentses);
        recentsList.setAdapter(adapter);


        return view;
    }
}
