package hapticgate.coffeeorderingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String cs_name = "Sina Serati";
    int coffee_counter = 0;
    int cost = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String customer_name(String name){
        cs_name=name;
        return cs_name;
    }
    private String create_order_summery( int counter){
        String or_summery;
        or_summery = "Name: "+ customer_name("Sina Serati");
        or_summery +="\nTotal: $"+(coffee_counter *cost);
        or_summery +="\nQuantity: "+coffee_counter+"\nThank you,";
        return or_summery;
    }
    public void add_method(View view){
        coffee_counter = coffee_counter +1;
        display(coffee_counter);
    }
    public void sub_method(View view){
        coffee_counter = coffee_counter -1;
        display(coffee_counter);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.add_sub_text_view);
        quantityTextView.setText((""+number));
    }
    public void order_summery_view(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.total_text_view);
        quantityTextView.setText(create_order_summery(coffee_counter));
    }
}
