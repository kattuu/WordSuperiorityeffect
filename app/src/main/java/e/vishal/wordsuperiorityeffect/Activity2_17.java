package e.vishal.wordsuperiorityeffect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_17);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(130);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), Activity3_17.class);
                        startActivity(intent);
                        finish();
                        //main activity start krne ka code Intent bna ke
                    }
                });
            }
        }).start();
    }
}
