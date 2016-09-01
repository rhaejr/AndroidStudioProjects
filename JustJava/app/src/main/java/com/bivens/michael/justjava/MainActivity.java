package com.bivens.michael.justjava;
/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quanity = 0;
    int costOfCoffee = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
//        display(quanity);
//        displayPrice(quanity * costOfCoffee);
        Toast toast;
        toast =  Toast.makeText(getApplicationContext(),"Ordered", Toast.LENGTH_SHORT);
        if(toast != null) {
            toast.show();
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    public void increment(View view) {
        quanity++;
        display(quanity);
        displayPrice(quanity * costOfCoffee);
    }
    public void decrement(View view) {
        if (quanity <= 0){
            return;
        }
        quanity--;
        display(quanity);
        displayPrice(quanity * costOfCoffee);
    }
}
