package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class AdminActivity extends AppCompatActivity {

    private DatabaseReference myDatabaseRef;
    private StorageReference sStorageRef;
    private Button btnaAdd, btnRetrieve;
    private ImageView imgView;
    private EditText txt_desc;

    public static final String FB_STORAGE_PATH = "image/";
    public static final String FB_DATABASE_PATH = "image";
    public static final int REQUEST_CODE  = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        imgView = (ImageView) findViewById(R.id.imgView);
        txt_desc = (EditText) findViewById(R.id.txt_descrip);
        btnaAdd = (Button) findViewById(R.id.btnUpload);
        btnRetrieve = (Button) findViewById(R.id.btnRetrive);

        sStorageRef = FirebaseStorage.getInstance().getReference();
        myDatabaseRef = FirebaseDatabase.getInstance().getReference(FB_DATABASE_PATH);

    }
    public void onClickBrowser(View view)
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        startActivityForResult(Intent.createChooser(intent, "select image"),REQUEST_CODE);
    }
}
