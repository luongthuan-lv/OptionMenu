package vn.edu.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spMenu;
    TextView tvHello;
    String[] fonts={"fonts","colors"};
    Typeface typeface;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spMenu=findViewById(R.id.spMenu);
        tvHello=findViewById(R.id.tvHello);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,fonts);
        spMenu.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu_font,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        int item=spMenu.getSelectedItemPosition();
        switch (item){
            case 0:
                menu.clear();
                getMenuInflater().inflate(R.menu.option_menu_font,menu);
                break;
            case 1:
                menu.clear();
                getMenuInflater().inflate(R.menu.option_menu_color,menu);
                break;
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.beautiful:
                typeface=Typeface.createFromAsset(getAssets(),"beautiful.ttf");
                tvHello.setTypeface(typeface);
                break;
            case R.id.cassandra:
                typeface=Typeface.createFromAsset(getAssets(),"cassandra.ttf");
                tvHello.setTypeface(typeface);
                break;
            case R.id.countryside:
                typeface=Typeface.createFromAsset(getAssets(), "countryside.ttf");
                tvHello.setTypeface(typeface);
                break;
            case R.id.horizontal:
                typeface=Typeface.createFromAsset(getAssets(), "horizontal.ttf");
                tvHello.setTypeface(typeface);
                break;
            case R.id.lemon:
                typeface=Typeface.createFromAsset(getAssets(), "lemon.ttf");
                tvHello.setTypeface(typeface);
                break;
            case R.id.vegan:
                typeface=Typeface.createFromAsset(getAssets(), "vegan.ttf");
                tvHello.setTypeface(typeface);
                break;

            case R.id.blue:
                color=getResources().getColor(R.color.blue);
                tvHello.setTextColor(color);
                break;
            case R.id.brown:
                color=getResources().getColor(R.color.brown);
                tvHello.setTextColor(color);
                break;
            case R.id.green:
                color=getResources().getColor(R.color.green);
                tvHello.setTextColor(color);
                break;
            case R.id.purple:
                color=getResources().getColor(R.color.purple);
                tvHello.setTextColor(color);
                break;
            case R.id.red:
                color=getResources().getColor(R.color.red);
                tvHello.setTextColor(color);
                break;
            case R.id.yellow:
                color=getResources().getColor(R.color.yellow);
                tvHello.setTextColor(color);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
