package com.scorpion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addItemsOnSpinner2();
    }
    public void addItemsOnSpinner2(){
        Spinner spinner= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.language,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);
    }

    
}
