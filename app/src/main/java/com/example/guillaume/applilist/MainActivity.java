/*package com.example.guillaume.applilist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView;
    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent", "Gerard"
    };

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
    }
}
*/

package com.example.guillaume.applilist;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

        import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private String[] Sports = new String[]{"Football", "Basketball", "Golf", "Rugby","Football", "Basketball", "Golf", "Rugby","Football", "Basketball", "Golf", "Rugby","Football", "Basketball", "Golf", "Rugby","Football", "Basketball", "Golf", "Rugby","Football", "Basketball", "Golf", "Rugby"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listSports = (ListView) findViewById(R.id.listSports);
        final TextView textViewContent = (TextView) findViewById(R.id.textViewContent);

        ArrayAdapter<String> SportAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Sports);

        listSports.setAdapter(SportAdapter);

        listSports.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue = (String) parent.getItemAtPosition(position);
                String strclick = "Séléctionné :\n Postition : " + position + "\n ListItem : " + itemValue;

                Toast.makeText(MainActivity.this, strclick, Toast.LENGTH_SHORT).show();


            }
        });

    }
}