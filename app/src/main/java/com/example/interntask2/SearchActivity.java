package com.example.interntask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    Button back, remove2;
    TextView dearch, quote2;
    ImageView heart_icon2;
    CardView cardView;
    boolean isFavorite2 = false; // Initially, the quote is not a favorite

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        back = findViewById(R.id.back);
        remove2 = findViewById(R.id.remove2);
        dearch = findViewById(R.id.dearch);
        quote2 = findViewById(R.id.quote2);
        heart_icon2 = findViewById(R.id.heart_icon2);
        cardView = findViewById(R.id.cardView);

        // Set the text of the remove button based on the favorite status
        updateRemoveButtonText();

        // Handle click on the remove button
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFavorite2 = !isFavorite2; // Toggle the favorite status
                updateRemoveButtonText();
            }
        });

        // Handle click on the back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }

    private void updateRemoveButtonText() {
        if (isFavorite2) {
            // Quote is favorited, set the button text to "Remove From Favorites"
            remove2.setText("Remove From Favorites");
            heart_icon2.setImageResource(R.drawable.baseline_favorite_border_24);
        } else {
            // Quote is not favorited, set the button text to "Add To Favorites"
            remove2.setText("Add To Favorites");
            heart_icon2.setImageResource(R.drawable.baseline_favorite_border_24);
        }
    }
}