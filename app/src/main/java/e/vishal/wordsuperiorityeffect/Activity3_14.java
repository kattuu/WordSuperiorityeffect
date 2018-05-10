package e.vishal.wordsuperiorityeffect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity3_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_14);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent =new Intent(getApplicationContext(),Activity4_14.class);
                        startActivity(intent);
                        finish();
                        //main activity start krne ka code Intent bna ke
                    }
                });
            }
        }).start();
    }
}
