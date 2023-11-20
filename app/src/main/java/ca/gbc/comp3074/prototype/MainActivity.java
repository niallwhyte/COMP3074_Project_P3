package ca.gbc.comp3074.prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCollection = findViewById(R.id.btnCollection);
        Button btnAdd = findViewById(R.id.btnAdd);
        FragmentManager fragmentManager = getSupportFragmentManager();

        btnCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //need a fragment manager to move between manager -- ./guide/fragments/fragmentmanager#java
                //begin transaction of each fragments
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, CollectionFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("yes")
                        .commit();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //begin transaction of each fragments
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, AddFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("yes")
                        .commit();
            }
        });
    }
}