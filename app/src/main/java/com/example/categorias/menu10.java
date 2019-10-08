package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu10 extends AppCompatActivity {

    Button btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu10);

        btn10 = (Button) findViewById(R.id.btndiez);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent20 = new Intent(menu10.this,MainActivity.class);
                startActivity(intent20);
                finish();
            }
        });
    }
}
