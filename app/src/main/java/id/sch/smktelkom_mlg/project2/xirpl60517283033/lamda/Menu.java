package id.sch.smktelkom_mlg.project2.xirpl60517283033.lamda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        findViewById(R.id.rs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, RumahSakit.class);
                Menu.this.startActivity(intent);
            }
        });
        findViewById(R.id.polisi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Polisi.class);
                Menu.this.startActivity(intent);
            }
        });
        findViewById(R.id.taksi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Taksi.class);
                Menu.this.startActivity(intent);
            }
        });
        findViewById(R.id.pemadam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Pemadam.class);
                Menu.this.startActivity(intent);
            }
        });
        findViewById(R.id.wiuwiu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Ambulance.class);
                Menu.this.startActivity(intent);
            }
        });
        findViewById(R.id.angkot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Angkot.class);
                Menu.this.startActivity(intent);
            }
        });
    }
}
