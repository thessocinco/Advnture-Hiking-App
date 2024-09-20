package BluetoothManager;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import BluetoothManager.DevicesFragment;
import advnture_monitoring.app.R;

/** @noinspection ALL*/
public class MainFragment extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {

    private static final String TAG = "MainFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Set custom drawable as navigation icon
        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24);

        setSupportActionBar(toolbar);
        getSupportFragmentManager().addOnBackStackChangedListener(this);
        if (savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, new DevicesFragment(), "devices").commit();
        else
            onBackStackChanged();
    }

    @Override
    public void onBackStackChanged() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(getSupportFragmentManager().getBackStackEntryCount()>0);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
