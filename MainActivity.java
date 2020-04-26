package dzone.co.in.listview_n1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] androidBooks =
            {
                    "Hello, Android - Ed Burnette",
                    "Professional Android 2 App Dev - Reto Meier",
                    "Unlocking Android - Frank Ableson",
                    "Android App Development - Blake Meike",
                    "Pro Android 2 - Dave MacLean",
                    "Beginning Android 2 - Mark Murphy",
                    "Hello, Android - Ed Burnette-2-2",
                    "Professional Android 2 App Dev - Reto Meier-2",
                    "Unlocking Android - Frank Ableson22",
                    "Android App Development - Blake Meikexx",
                    "Pro Android 2 - Dave MacLeanvv",
                    "Beginning Android 2 - Mark Murphycc",
                    "sdfsdfdf",
                    "efsggf",
            };

    ListView listView;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView) findViewById(R.id.listView1);
        tv1=(TextView) findViewById(R.id.textView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,
                android.R.layout.simple_list_item_1,androidBooks);
        //.simple_spinner_item
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        tv1.setText(androidBooks[position] );
    }

}
