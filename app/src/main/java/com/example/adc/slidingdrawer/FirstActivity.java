package com.example.adc.slidingdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

public class FirstActivity extends AppCompatActivity {

    String[] nameArray = {"Aestro", "Blender", "Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "IceCream Sandwich", "JelliBean", "KitKat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        SlidingDrawer simpleSlidingDrawer = (SlidingDrawer) findViewById(R.id.simpleSlidingDrawer); // initiate the SlidingDrawer
        final Button handleButton = (Button) findViewById(R.id.handle); // inititate a Button which is used for handling the content of SlidingDrawer
        ListView simpleListView = (ListView) findViewById(R.id.simpleListView); // initiate the ListView that is used for content of Sl.idingDrawer
        // adapter for the list view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item, R.id.name, nameArray);
        // set an adapter to fill the data in the ListView
        simpleListView.setAdapter(arrayAdapter);
        // implement setOnDrawerOpenListener event
        simpleSlidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {
                handleButton.setText("Close");
            }
        });
        // implement setOnDrawerCloseListener event
        simpleSlidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {
                // change the handle button text
                handleButton.setText("Open");
            }
        });
    }
}