package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu7 extends AppCompatActivity {

    Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu7);

        btn7 = (Button) findViewById(R.id.btnsiete);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(menu7.this,MainActivity.class);
                startActivity(intent17);
                finish();
            }
        });
    }
}
