package com.fachri.makerinstitute.myprofileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditProfileActivity extends AppCompatActivity {
    static final int REQUEST_PROFILE_DETAILS = 11;

    EditText nameEditText;
    EditText occupationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        occupationEditText = (EditText) findViewById(R.id.occupationEditText);
    }

    public void onSave(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", nameEditText.getText().toString());
        intent.putExtra("occupation", occupationEditText.getText().toString());
        setResult(REQUEST_PROFILE_DETAILS, intent);
        finish();
    }
}
