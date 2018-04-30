package com.example.manik.customtoolbar;

//android:theme="@style/Theme.AppCompat.Light.NoActionBar">
//permission is required

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar tb;
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb =  (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        ab = getSupportActionBar();
        ab.setTitle("My ToolBar");
        ab.setSubtitle("My Sub Title");
        ab.setLogo(R.mipmap.ic_launcher);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        MenuItem search = menu.findItem(R.id.search);
        SearchView sv = (SearchView) search.getActionView();
        sv.setOnQueryTextListener(new OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this,query,Toast.LENGTH_SHORT).show();
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int k = item.getItemId();
        switch (k)
        {
            case R.id.item1:
                Toast.makeText(this,""+item.getTitle(),Toast.LENGTH_SHORT).show();
                break;

            case R.id.item2:
                Toast.makeText(this,""+item.getTitle(),Toast.LENGTH_SHORT).show();
                break;
        }
       // return super.onOptionsItemSelected(item);
        return true;
    }
}

