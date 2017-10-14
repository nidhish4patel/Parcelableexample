package com.nidhi.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btNext;
    private EditText etfname;
    private EditText etlname;
    private EditText etqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfname = (EditText)findViewById(R.id.et_fname);
        etlname = (EditText)findViewById(R.id.et_lname);
        etqual = (EditText)findViewById(R.id.et_qual);
        btNext = (Button)findViewById(R.id.buttonNext);
        btNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,NextActivity.class);
        intent.putExtra("data","message");

        String fn = etfname.getText().toString();
        String ln = etlname.getText().toString();
        String ql = etqual.getText().toString();

        Person person = new Person();
        person.setFirstname(fn);
        person.setLastname(ln);
        person.setQualification(ql);

        intent.putExtra("person",person);
        startActivity(intent);

    }
}
