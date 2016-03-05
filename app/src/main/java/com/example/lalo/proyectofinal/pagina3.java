package com.example.lalo.proyectofinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lalo on 05/03/2016.
 */
public class pagina3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina3);
    }
    public void pagina2(View view){
        Intent i = new Intent(this, pagina2.class);
        startActivity(i);
    }
}
