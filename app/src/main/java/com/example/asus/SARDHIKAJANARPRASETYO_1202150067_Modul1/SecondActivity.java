package com.example.asus.SARDHIKAJANARPRASETYO_1202150067_Modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tempat,menumakan,porsipesan,harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String HasilTempat =intent.getStringExtra("tempat");
        String Menu=intent.getStringExtra("menu");
        String Porsi=intent.getStringExtra("porsi");
        String Harga=intent.getStringExtra("harga");

       int Total= Integer.valueOf(Harga)* Integer.valueOf(Porsi);

       tempat =(TextView)findViewById(R.id.rumahmakan);
       tempat.setText(HasilTempat);

       menumakan =(TextView)findViewById(R.id.menum);
       menumakan.setText(Menu);

       porsipesan =(TextView)findViewById(R.id.porsi);
       porsipesan.setText(Porsi);

       harga=(TextView)findViewById(R.id.hargah);
       harga.setText(String.valueOf(Total));

       if (Total > 65000) {
           Toast peringatan =Toast.makeText(this, "Jangan disini makan",Toast.LENGTH_LONG);
peringatan.show();

       } else{

           Toast peringatan =Toast.makeText(this, "Disini aja makanya",Toast.LENGTH_LONG);
           peringatan.show();

       }



    }


}
