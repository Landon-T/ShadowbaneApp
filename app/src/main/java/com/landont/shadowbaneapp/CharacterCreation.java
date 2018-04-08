package com.landont.shadowbaneapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class CharacterCreation extends Activity {

    EditText NameInput;
    ListView list;
    //Init Global Variables for character creation


    //List<String> Races = new ArrayList<String>(Arrays.asList("Human","Aeldborn","Aracoix","Centaur","Dwarf","Elf","Half Giant","Irekei","Minotaur","Nephilim","Shade","Vampire"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charcter_creation);

        //Load the data for classes into list
        final CharacterClass[] Classes = new CharacterClass[4];
        loadData(Classes);
        //Create adapter for the list
        ClassListAdapter adapter = new ClassListAdapter(this, Classes);
        list = (ListView)findViewById(R.id.ClassList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO: Test this is the correct value
                CharacterClass selectedClass = Classes[position];
                Toast.makeText(CharacterCreation.this, selectedClass.name, Toast.LENGTH_SHORT).show();
            }
        });

        NameInput = findViewById(R.id.CharacterNameInput);

    }

    public void CharacterCreationNext(View v){
        //TODO: Change this to the next activity.
        Intent intent = new Intent(this, CharacterCreation.class);
        startActivity(intent);
    }


    public void loadData(CharacterClass[] classes){
        CharacterClass fighter = new CharacterClass("Fighter",646,588,5,0,5,-10,0, R.drawable.fighter_rune);
        CharacterClass rouge = new CharacterClass("Rouge",646,588,0,5,0,5,-5, R.drawable.rouge_rune);
        CharacterClass healer = new CharacterClass("Healer",704,646,0,-10,5,0,+5,R.drawable.healer_rune);
        CharacterClass mage = new CharacterClass("Mage",704,646,-10,0,0,5,5, R.drawable.mage_rune);
        classes[0]=(fighter);
        classes[1]=(rouge);
        classes[2]=(healer);
        classes[3]=(mage);
    }


}

