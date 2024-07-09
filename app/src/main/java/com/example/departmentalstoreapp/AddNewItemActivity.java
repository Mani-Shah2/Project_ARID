package com.example.departmentalstoreapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddNewItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item);

        EditText passwordEditText = findViewById(R.id.editTextPassword);
        EditText itemNameEditText = findViewById(R.id.editTextItemName);
        EditText itemPriceEditText = findViewById(R.id.editTextItemPrice);
        Button submitButton = findViewById(R.id.buttonSubmit);
        Button addItemButton = findViewById(R.id.buttonAddItem);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = passwordEditText.getText().toString();

                if (password.equals("abcd")) {
                    Toast.makeText(AddNewItemActivity.this, "You entered correctly", Toast.LENGTH_SHORT).show();
                    itemNameEditText.setVisibility(View.VISIBLE);
                    itemPriceEditText.setVisibility(View.VISIBLE);
                    addItemButton.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(AddNewItemActivity.this, "Incorrect password, please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = itemNameEditText.getText().toString();
                String itemPrice = itemPriceEditText.getText().toString();

                if (!itemName.isEmpty() && !itemPrice.isEmpty()) {
                    // Here you can add the logic to save the item details to your database or any storage
                    Toast.makeText(AddNewItemActivity.this, "Item entered: " + itemName + " with price " + itemPrice, Toast.LENGTH_SHORT).show();
                    finish(); // Navigate back to the previous screen
                } else {
                    Toast.makeText(AddNewItemActivity.this, "Please enter item details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
