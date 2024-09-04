package com.example.interntask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Favorites_Activity extends AppCompatActivity {
    Button back,remove,remove2;
    EditText dearch;
    TextView quote,quote2;
    ImageView heart_icon,heart_icon2;
    CardView cardView, cardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        back = findViewById(R.id.back);
        remove = findViewById(R.id.remove);
        remove2 = findViewById(R.id.remove2);
        dearch = findViewById(R.id.dearch);
        quote = findViewById(R.id.quote);
        quote2 = findViewById(R.id.quote2);
        heart_icon = findViewById(R.id.heart_icon);
        heart_icon2 = findViewById(R.id.heart_icon2);
        cardView = findViewById(R.id.cardView);
        cardView2 = findViewById(R.id.cardView2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Favorites_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Favorites_Activity.this, "Removed from Favorites!", Toast.LENGTH_SHORT).show();
                heart_icon.setImageResource(R.drawable.baseline_favorite_border_24);
                remove.setText("Add to Favorites");
            }
        });

        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Favorites_Activity.this, "Removed from Favorites!", Toast.LENGTH_SHORT).show();
                heart_icon2.setImageResource(R.drawable.baseline_favorite_border_24);
                remove2.setText("Add to Favorites");
            }
        });

        heart_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (heart_icon.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.baseline_favorite_border_24).getConstantState()) {
                    heart_icon.setImageResource(R.drawable.baseline_favorite_border_24);
                    remove.setText("Remove From Favorites");
                    Toast.makeText(Favorites_Activity.this, "Added to Favorites!", Toast.LENGTH_SHORT).show();
                } else {
                    heart_icon.setImageResource(R.drawable.baseline_favorite_border_24);
                    remove.setText("Add to Favorites");
                    Toast.makeText(Favorites_Activity.this, "Removed from Favorites!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        heart_icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (heart_icon2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.baseline_favorite_border_24).getConstantState()) {
                    heart_icon2.setImageResource(R.drawable.baseline_favorite_border_24);
                    remove2.setText("Remove From Favorites");
                    Toast.makeText(Favorites_Activity.this, "Added to Favorites!", Toast.LENGTH_SHORT).show();
                } else {
                    heart_icon2.setImageResource(R.drawable.baseline_favorite_border_24);
                    remove2.setText("Add to Favorites");
                    Toast.makeText(Favorites_Activity.this, "Removed from Favorites!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}