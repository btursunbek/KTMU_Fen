package tk.yeow.ktmu_fen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAboutFen = (Button) findViewById(R.id.btnAboutFen);
        Button btnSchedule = (Button) findViewById(R.id.btnSchedule);
        Button btnDictionary = (Button) findViewById(R.id.btnDictionary);
        Button btnFormulas = (Button) findViewById(R.id.btnFormulas);
        Button btnFacultyNews = (Button) findViewById(R.id.btnFacultyNews);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnAboutFen:
                intent = new Intent(MainActivity.this, AboutFenActivity.class);
                startActivity(intent);
            case R.id.btnSchedule:
                intent = new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
            case R.id.btnDictionary:
                intent = new Intent(MainActivity.this, AboutFenActivity.class);
                startActivity(intent);
            case R.id.btnFormulas:
                intent = new Intent(MainActivity.this, AboutFenActivity.class);
                startActivity(intent);
            case R.id.btnFacultyNews:
                intent = new Intent(MainActivity.this, AboutFenActivity.class);
                startActivity(intent);
        }
    }
}
