package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomDetailsActivity extends AppCompatActivity {
    private String[][] RoomDetails1 = {
            {"Food Name: Eggs", "Table Number : 20", "Staff Name : Tabby Chege ", "Availability : Reserved Seat", "1000"},
            {"Food Name: Greek Yogurt", "Table Number : 21", "Staff Name : James Mwangi ", "Availability : Reserved Seat", "700"},
            {"Food Name: Oats", "Table Number : 22", "Staff Name : Reuben Oluyali ", "Availability : Reserved Seat", "100"},
            {"Food Name: Nuts and Butters", "Table Number : 23", "Staff Name : Kevin Elaar ", "Availability : Reserved Seat", "105"},
            {"Food Name: Bananas", "Table Number : 24", "Staff Name : Esther Kimani ", "Availability : Take Away", "3000"},
            {"Food Name: Chia Puddling", "Table Number : 25", "Staff Name : Eregae Nguran ", "Availability : Reserved Seat", "7000"},
            {"Food Name: Kahawa and Mandazi", "Table Number : 26", "Staff Name : Sharon Harley ", "Availability : Reserved Seat", "1900"},
            {"Food Name: Black Tea and Chapati", "Table Number : 27", "Staff Name : Mtumishi Kevin ", "Availability : Take Away", "1200"},
            {"Food Name: Whole Grain Toast", "Table Number : 28", "Staff Name : Joseph Akutoi ", "Availability : Reserved Seat", "1100"},
            {"Food Name: White Tea", "Table Number : 29", "Staff Name : Dismus Machutees ", "Availability : Take Away", "2000"},
    };

    private String[][] RoomDetails2 = {
            {"Food Name: Sandwiches", "Table Number : 30 ", "Staff Name : Elijah Mikolson ", "Availability : Reserved Seat", "5000"},
            {"Food Name: Pizza", "Table Number : 31 ", "Staff Name : James Mwangi ", "Availability : Reserved Seat", "7000"},
            {"Food Name: Soup", "Table Number : 32 ", "Staff Name : Reuben Omolo ", "Availability : Take Away", "1000"},
            {"Food Name: Rice Paper Rolls", "Table Number : 33 ", "Staff Name : Helina Madam ", "Availability : Take Away", "1050"},
            {"Food Name: Salads", "Table Number : 34 ", "Staff Name : Helina Madam ", "Availability : Reserved Seat", "3050"},
            {"Food Name: Sushi Rolls", "Table Number : 35 ", "Staff Name : Eregae Nguran ", "Availability : Reserved Seat", "7000"},
            {"Food Name: Noodles", "Table Number : 36 ", "Staff Name : Sharon Patricia ", "Availability : Take Away", "1200"},
            {"Food Name: Kale Soup", "Table Number : 37 ", "Staff Name : Helina Madam", "Availability : Reserved Seat", "1000"},
            {"Food Name: Chilli cornbread", "Table Number : 38 ", "Staff Name : Joseph Akutoi ", "Availability : Take Away", "110"},
            {"Food Name: Diet cola Chicken", "Table Number : 45 ", "Staff Name : Dismus Machutees ", "Availability : Take Away", "2500"},
    };

    private String[][] RoomDetails3 = {
            {"Food Name: Caesar Salad", "Table Number : 15 ", "Staff Name : Tabby Chege ", "Availability : Take Away", "9000"},
            {"Food Name: Greek Salad", "Table Number : 16 ", "Staff Name : Sharon Harley ", "Availability : Reserved Seat", "7000"},
            {"Food Name: Caprese Salad", "Table Number : 17 ", "Staff Name : Reuben Oluyali ", "Availability : Take Away", "1000"},
            {"Food Name: Cobb Salad", "Table Number : 18 ", "Staff Name : Kevin Elaar ", "Availability : Reserved Seat", "10700"},
            {"Food Name: Waldorf Salad", "Table Number : 19 ", "Staff Name : Esther Kimani ", "Availability : Reserved Seat", "3000"},
            {"Food Name: Nicoise Salad", "Table Number : 55 ", "Staff Name : Sharon Harley", "Availability : Take Away", "5000"},
            {"Food Name: Macaroni Salad", "Table Number : 56 ", "Staff Name : Elijah Mikolson ", "Availability : Reserved Seat", "1900"},
            {"Food Name: Coleslaw Salad", "Table Number : 57 ", "Staff Name : Sharon Harley ", "Availability : Reserved Seat", "12000"},
            {"Food Name: Fruit Salad", "Table Number : 59 ", "Staff Name : Joseph Akutoi ", "Availability : Take Away", "1100"},
            {"Food Name: Vegetable Salad", "Table Number : 99 ", "Staff Name : Dismus Machutees ", "Availability : Reserved Seat", "2000"},
    };

    private String[][] RoomDetails4 = {
            {"Food Name: Margarita", "Table Number : 69 ", "Staff Name : Tabby Chege ", "Availability : Reserved Seat", "1500"},
            {"Food Name: Espresso Martini", "Table Number : 70 ", "Staff Name : James Mwangi ", "Availability : Take Away", "7050"},
            {"Food Name: Hot Chocolate", "Table Number : 76", "Staff Name : Tabby Chege ", "Availability : Reserved Seat", "1000"},
            {"Food Name: Pina Colada", "Table Number : 23 ", "Staff Name : Kevin Elaar ", "Availability : Reserved Seat", "1000"},
            {"Food Name: Passion Fruit Martini", "Table Number : 56 ", "Staff Name : Esther Kimani ", "Availability : Reserved Seat", "7000"},
            {"Food Name: Soda pop", "Table Number : 20 ", "Staff Name : Tabby Chege ", "Availability : Reserved Seat", "6000"},
            {"Food Name: Sparkling Water", "Table Number : 45 ", "Staff Name : Sharon Harley ", "Availability : Take Away", "1000"},
            {"Food Name: Iced Tea", "Table Number : 75 ", "Staff Name : Helina Madam ", "Availability : Reserved Seat", "1250"},
            {"Food Name: Lemonade", "Table Number : 79 ", "Staff Name : Tabby Chege ", "Availability : Take Away", "11000"},
            {"Food Name: Root Bear", "Table Number : 59 ", "Staff Name : Helina Madam ", "Availability : Reserved Seat", "2000"},
    };
    private String[][] RoomDetails5 = {
            {"Food Name: Apple", "Table Number : 2 ", "Staff Name : Zephaniah Ekeno ", "Availability : Take Away", "900"},
            {"Food Name: Banana", "Table Number : 3 ", "Staff Name : Kevin Elaar ", "Availability : Reserved Seat", "720"},
            {"Food Name: Blueberry", "Table Number : 4 ", "Staff Name : Stephen Salvatore ", "Availability : Reserved Seat", "100"},
            {"Food Name: Oranges", "Table Number : 5 ", "Staff Name : Elijah Mikolson ", "Availability : Reserved Seat", "105"},
            {"Food Name: Grapes", "Table Number : 6 ", "Staff Name : Helina Madam ", "Availability : Reserved Seat", "300"},
            {"Food Name: Lemon", "Table Number : 7 ", "Staff Name : Zephaniah Ekeno ", "Availability : Take Away", "700"},
            {"Food Name: Mango", "Table Number : 8 ", "Staff Name : Sharon Harley ", "Availability : Reserved Seat", "190"},
            {"Food Name: Strawberry", "Table Number : 9 ", "Staff Name : Kevin Elaar", "Availability : Reserved Seat", "120"},
            {"Food Name: Avocado", "Table Number : 10 ", "Staff Name : Stephen Salvatore ", "Availability : Reserved Seat", "110"},
            {"Food Name: Lime", "Table Number : 11 ", "Staff Name : Helina Madam ", "Availability : Take Away", "200"},
    };


    TextView tv;
    Button btn;
    String[][] room_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Breakfast")==0)
            room_details = RoomDetails1;
        else
        if (title.compareTo("Lunch and Dinner")==0)
            room_details = RoomDetails2;
        else
        if (title.compareTo("Salads")==0)
            room_details = RoomDetails3;
        if (title.compareTo("Drinks")==0)
            room_details = RoomDetails4;
        else
            room_details = RoomDetails5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RoomDetailsActivity.this, FindRoomActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<room_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", room_details[i][0]);
            item.put("line2", room_details[i][1]);
            item.put("line3", room_details[i][2]);
            item.put("line4", room_details[i][3]);
            item.put("line5", "Charge Fees"+" "+room_details[i][4]+"/-");
            list.add(item);
        }
       sa = new SimpleAdapter(this,list,
            R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
             new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
     );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(RoomDetailsActivity.this,BookRoomActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",room_details[i][0]);
                it.putExtra("text3",room_details[i][1]);
                it.putExtra("text4",room_details[i][3]);
                it.putExtra("text5",room_details[i][4]);
                startActivity(it);
            }
        });


    }
}