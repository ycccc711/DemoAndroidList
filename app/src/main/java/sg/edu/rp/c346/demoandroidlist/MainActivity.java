package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVersion;
    ArrayList<AndroidVersion> alVersion;
    ArrayAdapter<AndroidVersion> aaVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list view
        lvVersion = findViewById(R.id.lvVersion);

        //arrayList
        alVersion = new ArrayList<>();
        AndroidVersion a = new AndroidVersion("Pie","9.0");
        AndroidVersion b = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion c = new AndroidVersion("Nougat","7.0 - 7.1.2");
        AndroidVersion d = new AndroidVersion("Marshmallow","6.0 - 6.0.1");
        AndroidVersion e = new AndroidVersion("Lollipop","5.0 - 5.1.1");
        AndroidVersion f = new AndroidVersion("KitKat","4.4 - 4.4.4");
        AndroidVersion g = new AndroidVersion("Jelly Bean"," 4.1 - 4.3.1");

        alVersion.add(a);
        alVersion.add(b);
        alVersion.add(c);
        alVersion.add(d);
        alVersion.add(e);
        alVersion.add(f);
        alVersion.add(g);

        //array adapter
        //aaVersion = new ArrayAdapter<AndroidVersion>(MainActivity.this,android.R.layout.simple_list_item_1,alVersion);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,R.layout.row,alVersion);
        lvVersion.setAdapter(adapter);


    }
}
