package cestar.HappyOrders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    int item_price;
    Spinner spinner;
    EditText priceText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.SpinnerMeals);
        item_price = setItemPrice(spinner.toString());
        priceText = findViewById(R.id.Price);
        priceText.setText("$"+item_price);
    }

    public static int setItemPrice(String x){
        int temp_price=0;
        switch(x) {
            case "Pizza":
                temp_price=15;
                break;
            case "Veggie Burger":
                temp_price=6;
                break;
            case "Chicken Burger":
                temp_price=5;
                break;
            case "Plain Dosa":
                temp_price=10;
                break;
            case "Paneer Dosa":
                temp_price=12;
                break;
            case "Spring Roll":
                temp_price=7;
                break;
            case "Veggie Noodles":
                temp_price=13;
                break;
            case "GolGappe":
                temp_price=5;
                break;
            case "Rasmalai":
                temp_price=4;
                break;
            case "Mango Lassi":
                temp_price=3;
                break;
        }
        return temp_price;
    }
}
