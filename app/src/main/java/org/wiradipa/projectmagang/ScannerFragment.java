package org.wiradipa.projectmagang;


import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import static android.Manifest.permission.CAMERA;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScannerFragment extends Fragment implements ZXingScannerView.ResultHandler {
    public static final int REQUEST_CAMERA = 1;
    ImageView scan;
    ZXingScannerView mScannerView;

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
//                setContentView(mScannerView);
//                mScannerView.startCamera();
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    if (!checkPermission()) {
//                        requestPermission();
//                    }
//                }
                Toast.makeText(getActivity(), "Belum Ada Aksi", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

//    private void setContentView(ZXingScannerView mScannerView) {
//        setContentView(mScannerView);
//    }
//
//
//    /**
//     * checking for camera permission
//     * @return is camera granted
//     */
//    private boolean checkPermission() {
//        return (ContextCompat.checkSelfPermission(getActivity(), CAMERA) == PackageManager.PERMISSION_GRANTED);
//    }
//
//    /**
//     * request permission
//     */
//    private void requestPermission() {
//        ActivityCompat.requestPermissions(getActivity(), new String[]{CAMERA}, REQUEST_CAMERA);
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (checkPermission()) {
//                if(mScannerView == null) {
//                    mScannerView = new ZXingScannerView(getActivity());
//                    setContentView(mScannerView);
//                }
//                mScannerView.setResultHandler(this);
//                mScannerView.startCamera();
//            }
//        } else {
//            requestPermission();
//        }
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        mScannerView.stopCamera();
//    }

    @Override
    public void handleResult(final Result result) {
        final String idDevice = result.getText();
    }


}
