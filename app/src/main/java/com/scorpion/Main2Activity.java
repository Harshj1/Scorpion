package com.scorpion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    String array_name = "states_e";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addItemsOnSpinner1();
        addItemsOnSpinner2();

    }
    public void addItemsOnSpinner1(){
        Spinner spinner= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.language,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);
        check_language();
    }

    public void addItemsOnSpinner2(){
        Spinner spinner= (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter <CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.states_e,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);
    }

    public void check_language()
    {
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();
        if (text == "English")
        {

        }
        else if (text == "हिंदी")
        {
            addItemsOnSpinner3();
        }
    }
    public void addItemsOnSpinner3(){
        Spinner spinner= (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter <CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.states_hindi,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);
    }
    void register(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
