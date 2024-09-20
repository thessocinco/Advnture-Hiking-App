package letsgohikingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import UserRoles.SelectRoles;
import advnture_monitoring.app.R;

/** @noinspection ALL*/
public class LetsGoHiking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lets_go_hiking);

        Button myButton = findViewById(R.id.buttonLoginStart);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LetsGoHiking.this, SelectRoles.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });;

    }
}
