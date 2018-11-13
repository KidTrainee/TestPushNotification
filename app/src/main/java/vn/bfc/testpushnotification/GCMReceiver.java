package vn.bfc.testpushnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import io.repro.android.Repro;

public class GCMReceiver extends io.repro.android.GCMReceiver {
    private static final String TAG = GCMReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        Bundle extras = intent.getExtras();
//
//        // check whether the application should handle this push notification.
//        if (!Repro.applicationShouldHandlePushNotification(context, extras)) {
//            Log.d(TAG, "Ignore push notification: it will be handled by Repro SDK");
//            return;
//        }
//
//        // check whether this push notification was already received.
//        if (Repro.isAlreadyReceivedPushNotification(context, extras)) {
//            Log.d(TAG, "Ignore push notification: it was already received");
//            return;
//        }

        // mark this push notification as "received".
//        Log.d(TAG, "Mark push notification as received");
//        Repro.markPushNotificationReceived(context, extras);
//
//        String message;
//        if (extras.containsKey("message")) {
//            message = extras.getString("message");
//        } else {
//            message = "default message";
//        }
//
//        final NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
//                .setContentTitle(context.getResources().getString(R.string.app_name))
//                .setContentText(message)
//                .setSmallIcon(R.drawable.ic_notification)
//                .setAutoCancel(true)
//                .setPriority(NotificationManager.IMPORTANCE_HIGH);
//
//        Intent resultIntent = new Intent(context, MainActivity.class);
//        resultIntent.putExtras(extras);
//
//        PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, resultIntent, PendingIntent.FLAG_CANCEL_CURRENT);
//        builder.setContentIntent(resultPendingIntent);
//
//        final NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(0, builder.getNotification());
    }
}