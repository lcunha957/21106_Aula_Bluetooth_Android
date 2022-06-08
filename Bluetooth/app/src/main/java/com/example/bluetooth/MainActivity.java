package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnOn, btnOff, btnList, btnVisible;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice>  pairDevices;
    private ListView lv;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ligando o botão e listview a condicional
        btnOn = (Button) findViewById(R.id.button);
        btnOff = (Button) findViewById(R.id.button4)
        btnVisible = (Button) findViewById(R.id.button3);
        btnList = (Button) findViewById(R.id.button2);
        lv = (ListView) findViewById(R.id.listView);
        BA = BluetoothAdapter.getDefaultAdapter();

        btnOn.setOnClickListener(new Niew.OnClickListener()){
           @Override
        public void onClick (View v){
              if (!BA.isEnabled()){
                  // Intent é uma nova janelça
                intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                        startActivityForResult(turnOn. 0);
              } else {
                  Toast.makeText(getApplicationContext(), "Ja esta ligado", Toast.LENGTH_LONG).show;
              }
            }
        }
    }
}