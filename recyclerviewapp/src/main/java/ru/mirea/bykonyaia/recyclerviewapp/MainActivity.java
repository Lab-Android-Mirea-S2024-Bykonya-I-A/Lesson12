package ru.mirea.bykonyaia.recyclerviewapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.mirea.bykonyaia.recyclerviewapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    protected ActivityMainBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView = this.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new CountryRecyclerViewAdapter(getCountriesInfo()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private static List<Country> getCountriesInfo() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("Colombia", R.drawable.flag_of_colombia, 210000000));
        list.add(new Country("Indonesia", R.drawable.flag_of_indonesia, 1420000000));
        list.add(new Country("South Korea", R.drawable.flag_of_south_korea, 1430000000));
        list.add(new Country("Spain", R.drawable.flag_of_spain, 146000000));
        list.add(new Country("Yemen", R.drawable.flag_of_yemen, 64000000 ));
        return list;
    }
}