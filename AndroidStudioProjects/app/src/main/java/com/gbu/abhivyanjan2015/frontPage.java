package com.gbu.abhivyanjan2015;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class frontPage extends Activity {
    MediaPlayer logoMusic;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
               @Override
                 public void onClick(View v) {
                   Intent menuIntent=new Intent(v.getContext(),about.class);
                   startActivityForResult(menuIntent,0);
               }
                               });
        logoMusic=MediaPlayer.create(frontPage.this,R.raw.song);
        logoMusic.start();
        Thread logoTimer = new Thread(){
            public void run(){
                try{
                    sleep(100000);


                }
                catch(InterruptedException e){
                e.printStackTrace();
                }
                finally{
                    finish();
                    /**Intent menuIntent=new Intent("com.gbu.abhivyanjan2015.ABHIVYANJANA");
                    startActivity(menuIntent);*/
                }
            }
        };
        logoTimer.start();

        }

    @Override
    public void onPause(){
        super.onPause();
       logoMusic.release();
    }

    /**
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_front_page, menu);
        return true;
    }

    @Override
    public  onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        //noinspection SimplifiableIfStatement
        /**switch (item.getItemId()) {
            case R.id.proceed:
                startActivity(new Intent("com.gbu.abhivyanjan2015.about"));
                return true;
            case R.id.menuToast:
                Toast help=Toast.makeText(frontPage.this,"click on screen to proceed", Toast.LENGTH_LONG);
                   help.show();
                return true;}
            return false;*/
        }


