package com.hasan.exam;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.hasan.exam.Controller.Controller;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Controller controller;
    ArrayList<ListModel> datalist;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.recyclerView);
        datalist = new ArrayList<>();
        controller = new Controller(getApplicationContext(), datalist);
        recyclerView.setAdapter(controller);

        datalist.add(new ListModel("Whispers of the Night",
                "Underneath the moon's gentle glow, shadows dance and secrets whisper, weaving tales of forgotten lore."));

        datalist.add(new ListModel("Echoes of the Past",
                "Amidst the ruins of an ancient civilization, echoes of a bygone era resonate, revealing stories of triumph and tragedy."));

        datalist.add(new ListModel("Realm of Dreams",
                "In the ethereal realm of dreams, imagination knows no bounds, and reality bends to the will of the subconscious."));

        datalist.add(new ListModel("Dance of the Elements",
                "Beneath the cascading waterfall, the elements converge in a mesmerizing dance, harmonizing earth, water, fire, and air."));

        datalist.add(new ListModel("Whispers of Wisdom",
                "In the quiet solitude of the library, whispers of wisdom echo through the shelves, imparting knowledge from ages past."));

        datalist.add(new ListModel("Journey to Enlightenment",
                "Along the winding path of self-discovery, the seeker embarks on a journey to unravel the mysteries of existence."));

        datalist.add(new ListModel("Echoes of Harmony",
                "In the symphony of nature, echoes of harmony resonate, weaving a tapestry of sound that transcends time and space."));

        datalist.add(new ListModel("Sands of Time",
                "Upon the shifting sands of time, the past, present, and future converge, each grain a fleeting moment in the grand tapestry of existence."));

        datalist.add(new ListModel("Whispers of Hope",
                "In the darkest hour, whispers of hope pierce the veil of despair, illuminating the path toward a brighter tomorrow."));

        datalist.add(new ListModel("Echoes of Destiny",
                "In the tapestry of fate, echoes of destiny reverberate, guiding each soul along its destined path."));

        controller.notifyDataSetChanged();

    }
}
