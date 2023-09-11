package com.martintecno.broadcast;

import static android.net.wifi.WifiManager.EXTRA_WIFI_STATE;
import static android.net.wifi.WifiManager.WIFI_STATE_DISABLED;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;

import java.nio.file.LinkOption;

public class LlamadaWifi extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("shamadita2",String.valueOf( intent.getBooleanExtra(WifiManager.EXTRA_SUPPLICANT_CONNECTED, false)));
        Log.d("salida", String.valueOf(intent.getBooleanExtra("state", false)));


        boolean isConnected = intent.getBooleanExtra("connected", false);


        if (isConnected) {


            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+"2664553747"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }

    }
}
