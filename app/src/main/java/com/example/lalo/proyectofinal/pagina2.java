package com.example.lalo.proyectofinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lalo on 05/03/2016.
 */
public class pagina2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina2);
    }

    public void pagina1(View view){
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }

    public void pagina3(View view){
        Intent i = new Intent(this, pagina3.class);
        startActivity(i);
    }
}
