package com.example.butterknife;

/* Android Butterknife is a view binding tool that uses annotations to generate boilerplate (repetitive) code for us.
 * ButterKnife is developed by Jake Wharton at Square and is essentially used to save typing repetitive
 * lines of code like findViewById(R.id.view) when dealing with views, thus making our code look a lot cleaner.*/

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        text.setText("Hello from Butterknife");

    }

    @OnClick(R.id.button)
    void buttonClick(View view) {
         Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show();

    }
}
