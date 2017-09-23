package ado.com.orange.jovargas.practica_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity
        extends AppCompatActivity
    implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LinearLayoutButton = (Button)
                findViewById(R.id.LinearLayoutVertical).setOnClickListener(this);
        findViewById(R.id.LinearLayoutHorizontal).setOnClickListener(this);
    }

    @Override
    public_void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.LinearLayoutHorizontal:
                intent = new Intent(MainActivity.this,
                        LinearLayoutHorizontalActivity.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }

    }
}