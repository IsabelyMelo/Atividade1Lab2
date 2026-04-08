package com.example.atividade1lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirplaneOn = intent.getBooleanExtra("state", false);

        if (isAirplaneOn) {
            Log.d("Receiver", "Modo avião ativado");
            Toast.makeText(context, "Modo avião ativado", Toast.LENGTH_SHORT).show();
        } else {
            Log.d("Receiver", "Modo avião desativado");
            Toast.makeText(context, "Modo avião desativado", Toast.LENGTH_SHORT).show();
        }
    }
}
