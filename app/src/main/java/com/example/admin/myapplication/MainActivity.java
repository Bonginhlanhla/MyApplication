package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd, btnRetrive;
    private ImageButton btnResturant, imgHotel, imgCarServ, imgGas_Station,imgHospital,imgShoppMall;
    private Firebase myR;
    private String TAG = "Firebase Data";
    public   static String CHECK_ACTIVITY = "";

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickResturant();
        clickHotels();
        clickCarServices();
        clickGasStation();
        clickHospital();
        clickShopping();

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnRetrive  = (Button)findViewById(R.id.btnRetrive);
        imgGas_Station = (ImageButton) findViewById(R.id.imgGas_Station);
        imgHospital = (ImageButton) findViewById(R.id.imgHospital);
        imgShoppMall = (ImageButton)findViewById(R.id.imgShoppMall);



        btnRetrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        String value = dataSnapshot.getValue(String.class);
                        Log.d(TAG, "Value is: " + value);
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getGroupId();

        if(id==R.id.btnAdmin);

        Intent intentAdmin = new Intent(MainActivity.this,AdminActivity.class);
        startActivity(intentAdmin);

        return true;
    }

    public void clickResturant()
    {
        MainActivity.CHECK_ACTIVITY = "Resturant";
        btnResturant = (ImageButton) findViewById(R.id.imgRest);

        btnResturant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this, ResturantActivity.class);

                startActivity(intNext);
            }
        });
    }
    public void clickHotels()
    {

        imgHotel = (ImageButton) findViewById(R.id.imgHotels);

        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(intNext);
            }
        });
    }
    public void clickCarServices()
    {

        imgCarServ = (ImageButton) findViewById(R.id.imgCarservice);

        imgCarServ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this, CarServiceActivity.class);
                startActivity(intNext);
            }
        });
    }
    public void clickGasStation()
    {

        imgGas_Station = (ImageButton) findViewById(R.id.imgGas_Station);

        imgGas_Station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this,GasStationActivity.class);
                startActivity(intNext);
            }
        });
    }
    public void clickHospital()
    {

        imgHospital = (ImageButton) findViewById(R.id.imgHospital);

        imgHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(intNext);
            }
        });
    }
    public void clickShopping()
    {

        imgShoppMall = (ImageButton) findViewById(R.id.imgShoppMall);

        imgShoppMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intNext = new Intent(MainActivity.this,ShoppingActivity.class);
                startActivity(intNext);
            }
        });
    }


}
