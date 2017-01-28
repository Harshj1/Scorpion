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

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        final EditText editText= (EditText) findViewById(R.id.name);
        final Button register= (Button) findViewById(R.id.button);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.language, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.states_e,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.states_hindi,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.city_me,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.city_mh,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.city_ge,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        final ArrayAdapter <CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.city_gh,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

//        set default lang to english
        spinner.setAdapter(adapter1);

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


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id)
            {
                String selected = parentView.getSelectedItem().toString();

                if(selected.equals("Maharashtra"))
                {
                    spinner3.setAdapter(adapter4);
                }
                else if(selected.equals("महाराष्ट्र"))
                {
                    spinner3.setAdapter(adapter5);
                }
                else if(selected.equals("Gujarat"))
                {
                    spinner3.setAdapter(adapter6);
                }
                else if(selected.equals("गुजरात"))
                {
                    spinner3.setAdapter(adapter7);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                spinner3.setAdapter(adapter4);
            }
        });
    }

    void register(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
