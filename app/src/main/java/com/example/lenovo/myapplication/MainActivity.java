package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox eate;
    private CheckBox sleep;
    private CheckBox game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        eate = (CheckBox)findViewById(R.id.eatID);
        sleep = (CheckBox) findViewById(R.id.sleep);
        game = (CheckBox) findViewById(R.id.game);
        OnBoxClickListener listener = new OnBoxClickListener();
        eate.setOnClickListener(listener);
        sleep.setOnClickListener(listener);
        game.setOnClickListener(listener);

    }
    class OnBoxClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            CheckBox box = (CheckBox)v;


            if (box.getId() == R.id.eatID) {
                System.out.println("Clickidbox");
            } else if (box.getId() == R.id.sleep) {
                System.out.println("Click sleep box");
            } else if (box.getId() == R.id.game){
                System.out.println("Click game box");
            }
            if (box.isChecked()) {
                System.out.println("checked");
            } else {
                System.out.println("unchecked");
            }



            System.out.println("Checkbox");
        }
    }
}
