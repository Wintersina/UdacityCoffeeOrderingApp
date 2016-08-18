package hapticgate.testapptwo;

import android.annotation.TargetApi;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TestAppTwo_MainActivity extends AppCompatActivity {

    int counter;
    int coffeeCost = 5;

    /**
     * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
     * This is the package name our example uses:
     *
     * package com.example.android.justjava;
     */


    /**
     * This app displays an order form to order coffee.
     */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_test_app_two__main);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
           update_cost(counter * coffeeCost);
        }
        public void  addButton(View view){
            counter =counter + 1;

            display(counter);

        }
        public void subButton(View view){
            counter = counter -1;

            if (counter <= 0){
                counter = 0;
            }

            display(counter);

        }


        /**
         * This method displays the given quantity value on the screen.
         */
        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.counter_text_view);
            quantityTextView.setText((""+number));
        }
        @TargetApi(Build.VERSION_CODES.N)
        private void update_cost(int number){
            TextView costTextView = (TextView) findViewById(R.id.cost_text_view);
            costTextView.setText("Yo, you owe " + NumberFormat.getCurrencyInstance().format(number) + " for " + counter + " cups of coffee. \n Thank you!");
        }
    }



