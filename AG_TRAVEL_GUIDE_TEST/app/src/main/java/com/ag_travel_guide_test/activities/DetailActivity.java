package com.ag_travel_guide_test.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ag_travel_guide_test.R;
import com.ag_travel_guide_test.models.Mountain;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOUNTAIN = "extra_mountain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView elevation = findViewById(R.id.tv_elevation_detail);
        TextView country = findViewById(R.id.tv_country_detail);

        Mountain mountain = getIntent().getParcelableExtra(EXTRA_MOUNTAIN);

        Glide.with(this).load(mountain.getPhoto()).into(imageView);
        name.setText(mountain.getName());
        description.setText(mountain.getDescription());
        elevation.setText(mountain.getElevation());
        country.setText(mountain.getLocation());
    }
}
