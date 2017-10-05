package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox eate;
    private CheckBox sleep;
    private CheckBox game;
    private CheckBox all;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        eate = (CheckBox)findViewById(R.id.eatID);
        sleep = (CheckBox) findViewById(R.id.sleep);
        game = (CheckBox) findViewById(R.id.game);
        all = (CheckBox) findViewById(R.id.all);

        /*OnBoxClickListener listener = new OnBoxClickListener();
        eate.setOnClickListener(listener);
        sleep.setOnClickListener(listener);
        game.setOnClickListener(listener);
*/

        CheckBoxListenber listenber = new CheckBoxListenber();
        eate.setOnCheckedChangeListener(listenber);
        sleep.setOnCheckedChangeListener(listenber);
        game.setOnCheckedChangeListener(listenber);
    }
    class CheckBoxListenber implements CompoundButton.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.getId() == R.id.game) {
                System.out.println("game");
            } else if (buttonView.getId() == R.id.sleep) {
                System.out.println("sleep");
            } else if (buttonView.getId() == R.id.eatID) {
                System.out.println("eat");
            }

            if (isChecked) {
                System.out.println("checked");
            } else {
                System.out.println("unchecked");
            }
        }
    }




    //OnClickListener的使用方法
  /*  class OnBoxClickListener implements View.OnClickListener {

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
    }*/
}
