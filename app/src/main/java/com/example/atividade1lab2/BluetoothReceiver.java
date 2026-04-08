package com.example.atividade1lab2;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BluetoothReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (BluetoothAdapter.ACTION_STATE_CHANGED.equals(intent.getAction())) {

            int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, -1);

            if (state == BluetoothAdapter.STATE_ON) {
                Log.d("Receiver", "Bluetooth ativado");
                Toast.makeText(context, "Bluetooth ativado", Toast.LENGTH_SHORT).show();
            }

            if (state == BluetoothAdapter.STATE_OFF) {
                Log.d("Receiver", "Bluetooth desativado");
                Toast.makeText(context, "Bluetooth desativado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
