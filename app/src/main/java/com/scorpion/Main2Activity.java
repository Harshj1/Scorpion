package com.scorpion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.scorpion.MainActivity;

import static com.scorpion.MainActivity.count;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(count==0);

        else
            setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final EditText editText= (EditText) findViewById(R.id.name);
        final Button register= (Button) findViewById(R.id.button);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.language, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.states_e,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.states_hindi,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(adapter1);
//        addItemsOnSpinner1();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {

                String selected = parentView.getSelectedItem().toString();

                if(selected.equals("English"))
                {
                    spinner2.setAdapter(adapter2);
                    editText.setHint("Name");
                    register.setText("Register");
                }

                else if(selected.equals("हिंदी"))
                {
                    spinner2.setAdapter(adapter3);
                    editText.setHint("नाम");
                    register.setText("रजिस्टर");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                spinner2.setAdapter(adapter2);
            }
        });

    }
//    public void addItemsOnSpinner1() {
//        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.language, android.R.layout.simple_spinner_item);
//        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner.setAdapter(adapter1);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
//            {
//
//                String selected = parentView.getItemAtPosition(position).toString();
//
//                if(selected== "English")
//                {
//                    addItemsOnSpinner2();
//                }
//
//                else if(selected=="हिंदी")
//                {
//                    addItemsOnSpinner3();
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parentView) {
//                // your code here
//            }
//        });
//    }
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
