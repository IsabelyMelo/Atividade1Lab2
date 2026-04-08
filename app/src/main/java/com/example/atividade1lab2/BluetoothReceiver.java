package com.example.atividade1lab2;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class BluetoothReceiver extends BroadcastReceiver {

    private TextView lblBluetooth;

    public BluetoothReceiver(TextView lblBluetooth) {
        this.lblBluetooth = lblBluetooth;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (BluetoothAdapter.ACTION_STATE_CHANGED.equals(intent.getAction())) {

            int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, -1);

            if (state == BluetoothAdapter.STATE_ON) {
                lblBluetooth.setText("Bluetooth: ativado");
                Toast.makeText(context, "Bluetooth ativado", Toast.LENGTH_SHORT).show();
            }

            if (state == BluetoothAdapter.STATE_OFF) {
                lblBluetooth.setText("Bluetooth: desativado");
                Toast.makeText(context, "Bluetooth desativado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
