package org.wiradipa.projectmagang;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText mEmail = (EditText) findViewById(R.id.email);
        final EditText mPassword = (EditText) findViewById(R.id.password);
        Button mButtonLogin = (Button) findViewById(R.id.button_login);

        mButtonLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mEmail.getText().toString().equals("admin") && mPassword.getText().toString().equals("admin"))||
                        (mEmail.getText().toString().equals("Admin") && mPassword.getText().toString().equals("admin"))){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else if ((mEmail.getText().toString().equals("") && mPassword.getText().toString().equals(""))||
                        (mEmail.getText().toString().equals(" ") && mPassword.getText().toString().equals(" "))){
                    Toast.makeText(getApplicationContext(),"user dan password tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Periksa kembali username dan password anda",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

