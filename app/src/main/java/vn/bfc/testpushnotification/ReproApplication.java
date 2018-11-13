package vn.bfc.testpushnotification;

import android.app.Application;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import io.repro.android.Repro;

public class ReproApplication extends Application {

    private static final String TAG = ReproApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        // Setup Repro
        Repro.setup(this, "21922e49-4f31-4e11-bd36-1c2767b066eb");
        Repro.setUserID(Repro.getDeviceID());
        Log.d(TAG, "onCreate: " + Repro.getDeviceID());
//        String token = FirebaseInstanceId.getInstance().getToken();

//        Log.d(TAG, "onCreate: " + Repro.getDeviceID() + ", \n" + token);
//        Repro.setPushRegistrationID(token);
        Repro.enablePushNotification("309738305669");
        Repro.startRecording();

    }
}
