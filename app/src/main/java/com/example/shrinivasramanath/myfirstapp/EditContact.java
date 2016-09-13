package com.example.shrinivasramanath.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        populateContactInformation();
        saveContactButtonListener();
        deleteContactButtonListener();
    }

    private void populateContactInformation() {
        Intent intent = this.getIntent();
        String contactName = intent.getStringExtra("name");
        TextView contactNameField = (TextView) findViewById(R.id.editNameField);
        contactNameField.setText(contactName);
    }

    public void saveContactButtonListener() {
        Button saveContactButton = (Button) findViewById(R.id.saveEditedContactButton);
        saveContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void deleteContactButtonListener() {
        Button saveContactButton = (Button) findViewById(R.id.saveEditedContactButton);
        saveContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
