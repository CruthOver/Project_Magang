package org.wiradipa.projectmagang;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScannerFragment extends Fragment {

    ImageView scan;

    public ScannerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scanner, container, false);

        scan = (ImageView) view.findViewById(R.id.icon_scanner);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ZXingScannerView mScannerView = new ZXingScannerView(getActivity());
//                mScannerView.startCamera();
                Toast.makeText(getActivity(), "Belum Ada Aksi", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
