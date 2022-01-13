package com.example.notrealinstagram;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.notrealinstagram.adapters.insta_adapter;
import com.example.notrealinstagram.adapters.insta_adapter2;
import com.example.notrealinstagram.models.insta_model;
import com.example.notrealinstagram.models.insta_model2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notrealinstagram.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview ;
    RecyclerView recyclerview2 ;



    Button home, search , plus , heart , user ;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        recyclerview = findViewById(R.id.recyclerview);
        recyclerview2 = findViewById(R.id.recyclerview2);

        ArrayList<insta_model> list = new ArrayList<>();
        ArrayList<insta_model2> list2 = new ArrayList<>();


        // Main Layout
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instahacker , R.drawable.hackersetup , "Hacker Dude" , "Somewhere out of nowhere"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.instagamer , R.drawable.gamerkeyboard , "Gaming Soul" , "Pochinki"));
        list.add(new insta_model(R.drawable.insta1 , R.drawable.insta1 , "Emlyn D'cunha" , "Belvai"));
        list.add(new insta_model(R.drawable.insta2 , R.drawable.insta2 , "Wilson Aranha" , "koppa"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.instaphotographer , R.drawable.photographerpic , "Mr.Photographer" , "Hawaii"));
        list.add(new insta_model(R.drawable.insta3 , R.drawable.insta3 , "Alwyn Quadras" , "Bailur"));
        list.add(new insta_model(R.drawable.insta4 , R.drawable.insta4 , "Emlyn Quadras" , "Halebidu"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));
        list.add(new insta_model(R.drawable.insta5 , R.drawable.insta5 , "Wilson D'cunha" , "Marnad"));

        insta_adapter adapter = new insta_adapter(list , this);
        recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);


        // Story Layout

        list2.add(new insta_model2(R.drawable.insta1 , "Emlyn D'cunha" ));
        list2.add(new insta_model2(R.drawable.insta2 , "Wilson Aranha"));
        list2.add(new insta_model2(R.drawable.insta3 , "Alwyn Quadras"));
        list2.add(new insta_model2(R.drawable.insta4 , "Emlyn Quadras"));
        list2.add(new insta_model2(R.drawable.insta5 , "Wilson D'cunha"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instagamer , "Gaming Soul"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instaphotographer , "Mr.Photographer"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.instahacker , "Hacker Dude"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));
        list2.add(new insta_model2(R.drawable.gamerkeyboard , "ForeverGamer"));

        insta_adapter2 adapter2 = new insta_adapter2(list2 , this);
        recyclerview2.setAdapter(adapter2);

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this , RecyclerView.HORIZONTAL ,true);
        recyclerview2.setLayoutManager(layoutManager1);




    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNeutralButton("Help", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Press yes to exit", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .show();

    }
}