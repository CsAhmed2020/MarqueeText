package com.example.marqueetext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marqueetext.v1.MarqueeItem;
import com.example.marqueetext.v1.MarqueeRecyclerView;
import com.example.marqueetext.v1.Utils;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView m1;

    boolean isPlaying = true;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1 = findViewById(R.id.marqueeTextA);
        m1.setSelected(true);

        v1();



    }

    private void v1() {
        MarqueeRecyclerView marqueeRecyclerView = findViewById(R.id.marquee_recycler_view);
        Button btn = findViewById(R.id.btn);
        String url = "https://w7.pngwing.com/pngs/135/52/png-transparent-bein-sports-1-bein-sports-2-television-channel-bein-sport-purple-television-violet.png";
        int src = R.drawable.ic_launcher_foreground;
        List<MarqueeItem> items = new ArrayList<>();
        if (Utils.isAr(this)) {
            items.add(new MarqueeItem("هذا هو النص الاول ", ""));
            items.add(new MarqueeItem("هذا هو النص الثاني ", src));
            items.add(new MarqueeItem("هذا هو النص الثالث ", src));
            items.add(new MarqueeItem("هذا هو النص الرابع ", src));
            items.add(new MarqueeItem("هذا هو النص الخامس ", src));
            items.add(new MarqueeItem("هذا هو النص السادس ", src));
            items.add(new MarqueeItem("هذا هو النص السابع ", src));
            items.add(new MarqueeItem("هذا هو النص الثامن ", src));
        } else {
            items.add(new MarqueeItem("This is the first item", src));
            items.add(new MarqueeItem("This is the second item", src));
            items.add(new MarqueeItem("This is the third item",  src));
            items.add(new MarqueeItem("This is the fourth item", src));
            items.add(new MarqueeItem("This is the fifth item",  src));
            items.add(new MarqueeItem("This is the sixth item",  src));
            items.add(new MarqueeItem("This is the seventh item", src));
            items.add(new MarqueeItem("This is the eighth item",src));
        }

        if (marqueeRecyclerView != null) {
            marqueeRecyclerView.setMarqueeItems(items);
            marqueeRecyclerView.setSpacingWidth(0.01f);
            marqueeRecyclerView.setScrollAmount(3);
            marqueeRecyclerView.startMarquee();
            /*btn.setOnClickListener(view -> {
                if (isPlaying) {
                    btn.setText("Start");
                    marqueeRecyclerView.pauseMarquee();
                } else {
                    btn.setText("Pause");
                    marqueeRecyclerView.startMarquee();
                }
                isPlaying = !isPlaying;
            });*/
        }



        //Slider spacingSlider = findViewById(R.id.slider_spacing_width);
        //Slider scrollWidth = findViewById(R.id.slider_scroll_width);

        /*spacingSlider.addOnChangeListener((slider, value, fromUser) -> {
            assert marqueeRecyclerView != null;
            marqueeRecyclerView.setSpacingWidth(value);
        });

        scrollWidth.addOnChangeListener((slider, value, fromUser) -> {
            assert marqueeRecyclerView != null;
            marqueeRecyclerView.setScrollAmount((int) value);
        });*/
    }


}