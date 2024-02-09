package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindRoomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room);

        CardView locations = findViewById(R.id.cardFDLocations);
        locations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoomActivity.this, GoogleMapsActivity.class));
            }
        });

        CardView SingleRoom = findViewById(R.id.cardFDSingleRoom);
        SingleRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Breakfast");
                startActivity(it);
            }
        });

        CardView LivingRoom = findViewById(R.id.cardFDLivingRoom);
        LivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Lunch and Dinner");
                startActivity(it);
            }
        });

        CardView SinglePacking = findViewById(R.id.cardFDSingleParking);
        SinglePacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Salads");
                startActivity(it);
            }
        });

        CardView LivingRoomPacking = findViewById(R.id.cardFDLivingRoomParking);
        LivingRoomPacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Drinks");
                startActivity(it);
            }
        });

        CardView fruits = findViewById(R.id.cardFDFruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, RoomDetailsActivity.class);
                it.putExtra("title", "Fruits");
                startActivity(it);
            }
        });

        CardView CustomerCare = findViewById(R.id.cardFDCustomerCare);
        CustomerCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindRoomActivity.this, CustomerCareActivity.class);
                it.putExtra("title", "Customer Care");
                startActivity(it);
            }
        });

        CardView BookDetails = findViewById(R.id.cardFDOrderDetails);
        BookDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoomActivity.this, BookDetailsActivity.class));
            }
        });






    }
}