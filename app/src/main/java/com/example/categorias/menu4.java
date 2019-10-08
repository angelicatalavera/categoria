package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu4 extends AppCompatActivity {

    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);

        btn4 = (Button) findViewById(R.id.btncuatro);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(menu4.this,MainActivity.class);
                startActivity(intent14);
                finish();
            }
        });
    }
}
