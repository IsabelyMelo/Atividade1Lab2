package com.example.atividade1lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class AirplaneReceiver extends BroadcastReceiver {

    private TextView lblAirplane;

    public AirplaneReceiver(TextView lblAirplane) {
        this.lblAirplane = lblAirplane;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirplaneOn = intent.getBooleanExtra("state", false);

        if (isAirplaneOn) {
            lblAirplane.setText("Modo Avião: ativado");
            Toast.makeText(context, "Modo avião ativado", Toast.LENGTH_SHORT).show();
        } else {
            lblAirplane.setText("Modo Avião: desativado");
            Toast.makeText(context, "Modo avião desativado", Toast.LENGTH_SHORT).show();
        }
    }
}
