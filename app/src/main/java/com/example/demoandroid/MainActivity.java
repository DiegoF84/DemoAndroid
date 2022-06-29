package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    private Button button_menu_activity_ultima,button_menu_activity_otra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViews();



    }



    private void findViews(){
        button_menu_activity_otra = findViewById(R.id.button_menu_activity_otra);
        button_menu_activity_ultima = findViewById(R.id.button_menu_activity_ultima);



        button_menu_activity_otra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), UltimaActivity.class);
                startActivity(intent);
            }
        });



        button_menu_activity_ultima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), OtraActivity.class);
                startActivity(intent);
            }
        });













    }



   /*buscar metodo onclick para enganchar el toast


   public void Vista(View view){
       Toast.makeText(this, "", Toast.LENGTH_SHORT).show();


       /* en que clase estamos, a que clase queremos ir


       Intent intent = new Intent(MainActivity_Menu.this, MainActivity.class);
       startActivity(intent);
   }


   */
}

