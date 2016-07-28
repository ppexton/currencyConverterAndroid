package com.phill.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {
        EditText poundValue = (EditText) findViewById(R.id.poundValue);
        Double poundAmount = Double.parseDouble(poundValue.getText().toString());
        Double dollarAmount = poundAmount * 1.31;
        Toast.makeText(getApplicationContext(), "$" + dollarAmount.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
