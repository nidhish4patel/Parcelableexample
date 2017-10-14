package com.nidhi.parcelableexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView txtMessage;
    private TextView txtPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        txtMessage = (TextView)findViewById(R.id.tvmsg);
        txtPerson = (TextView)findViewById(R.id.tvperson);

        String mess = getIntent().getExtras().getString("data");
        txtMessage.setText(mess);

        Person pers = (Person)getIntent().getParcelableExtra("person");
        txtPerson.setText(pers.getFirstname()+" "+pers.getLastname()+" "+pers.getQualification());

    }
}
