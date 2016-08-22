package hapticgate.coffeeorderingapp;

import android.annotation.TargetApi;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int coffeeCounter = 0;
    int cost = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void add_method(View view){
        coffeeCounter= coffeeCounter +1;
        display(coffeeCounter);
    }
    public void sub_method(View view){
        coffeeCounter= coffeeCounter -1;
        display(coffeeCounter);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.add_sub_text_view);
        quantityTextView.setText((""+number));
    }
    public void order_method(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.total_text_view);
        quantityTextView.setText((""+(coffeeCounter*cost)));
    }
}
