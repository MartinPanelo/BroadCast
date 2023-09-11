package com.martintecno.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.io.Console;

public class CambioAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
    //    Log.d("salida intent", String.valueOf(intent.getBooleanExtra("state", false)));

        if (intent.getBooleanExtra("state", false)) {
        //    Log.d("Modo Avión", "Modo Avioneta Activado");
            Toast.makeText(context, "Modo Avioneta Activado", Toast.LENGTH_LONG).show();
        } else {
       //     Log.d("Modo Avión", "Modo Avioneta Desactivado");
            Toast.makeText(context, "Modo Avioneta Desactivado", Toast.LENGTH_LONG).show();
        }
    }
}
