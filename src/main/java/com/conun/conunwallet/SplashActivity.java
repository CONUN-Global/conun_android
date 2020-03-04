package com.conun.conunwallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_splash);

        thread_sleep sleep = new thread_sleep(this);
        sleep.start();

    }

    class thread_sleep extends Thread {
        Activity thisAct;
        thread_sleep(Activity theAct) {
            thisAct = theAct;
        }
        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(thisAct, MainActivity.class);
            startActivity(intent);
        }
    }
}
