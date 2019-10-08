package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu6 extends AppCompatActivity {

    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu6);

        btn6 = (Button) findViewById(R.id.btnseis);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(menu6.this,MainActivity.class);
                startActivity(intent16);
                finish();
            }
        });
    }
}
