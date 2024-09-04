package com.example.interntask2; // Update this to match your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    // Define your UI elements
    private Button btnViewFavorites;
    private Button btnGenerateQuote;
    private ImageButton btnFavorite;
    private TextView tvQuote;
    private TextView tvAuthor;
    private CardView quoteCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Ensure this matches your XML filename

        // Initialize UI elements
        btnViewFavorites = findViewById(R.id.btnViewFavorites);
        btnGenerateQuote = findViewById(R.id.btnGenerateQuote);
        btnFavorite = findViewById(R.id.btnFavorite);
        tvQuote = findViewById(R.id.tvQuote);
        tvAuthor = findViewById(R.id.tvAuthor);
        quoteCardView = findViewById(R.id.quoteCardView); // Update this ID if necessary

        // Set up button click listeners
        btnViewFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle "View Favorites" button click
                // You can start a new activity or perform any action you need
                // For example:
                // Intent intent = new Intent(HomeActivity.this, FavoritesActivity.class);
                // startActivity(intent);
            }
        });

        btnGenerateQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle "Generate Another Quote" button click
                // Add logic to generate a new quote and update the TextViews
            }
        });

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle "Favorite" button click
                // Add logic to handle favoriting the quote
            }
        });

        // Optionally, initialize any other components or set default values
    }
}
