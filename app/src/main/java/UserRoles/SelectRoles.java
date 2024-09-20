package UserRoles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import BluetoothManager.MainFragment;
import advnture_monitoring.app.R;

/** @noinspection ALL*/
public class SelectRoles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_roles);

        Button buttonHiker = findViewById(R.id.buttonHiker);
        buttonHiker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRoles.this, MainFragment.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonGuide = findViewById(R.id.buttonGuide);
        buttonGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRoles.this, MainFragment.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonCamp = findViewById(R.id.buttonCamp);
        buttonCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRoles.this, MainFragment.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}