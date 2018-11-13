package vn.bfc.testpushnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.repro.android.Repro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Repro.track("MainActivity");
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey(io.repro.android.GCMReceiver.NOTIFICATION_ID_KEY)) {
            Repro.trackNotificationOpened(extras.getString(io.repro.android.GCMReceiver.NOTIFICATION_ID_KEY));
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey(io.repro.android.GCMReceiver.NOTIFICATION_ID_KEY)) {
            Repro.trackNotificationOpened(extras.getString(io.repro.android.GCMReceiver.NOTIFICATION_ID_KEY));
        }

        this.setIntent(intent);
    }
}
