package id.sch.smktelkom_mlg.project2.xirpl60517283033.lamda;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Lamda", "Announcement", R.drawable.ic_announcement_black_24dp,
                Color.parseColor("#51e2b7")));

        addSlide(AppIntroFragment.newInstance("Lamda", "Semangat", R.drawable.ic_favorite_black_24dp,
                Color.parseColor("#8c50e3")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        Toast.makeText(this, "On Skip Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "On Slide Changed", Toast.LENGTH_SHORT).show();
    }
}
