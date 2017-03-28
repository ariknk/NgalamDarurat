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

        addSlide(AppIntroFragment.newInstance("Lamda", "Aplikasi penting dan sangat dibutuhkan saat ada di Malang", R.drawable.logooo,
                Color.parseColor("#51e2b7")));

        addSlide(AppIntroFragment.newInstance("Ambulance", "Tekan icon untuk mendapakan nomor ambulance yang bisa dihubungi di Malang", R.drawable.t1,
                Color.parseColor("#FF4081")));

        addSlide(AppIntroFragment.newInstance("Rumah Sakit", "Tekan icon untuk mendapakan nomor rumah sakit yang bisa dihubungi di Malang", R.drawable.t2,
                Color.parseColor("#546E7A")));

        addSlide(AppIntroFragment.newInstance("Pemadam Kebakaran", "Tekan icon untuk mendapakan nomor pemadam kebakaran yang bisa dihubungi di Malang", R.drawable.t3,
                Color.parseColor("#8c50e3")));

        addSlide(AppIntroFragment.newInstance("Taxi", "Tekan icon untuk mendapakan nomor taxi yang bisa dihubungi di Malang", R.drawable.t4,
                Color.parseColor("#4DB6AC")));

        addSlide(AppIntroFragment.newInstance("Angkot", "Tekan icon untuk mendapakan jalur angkot yang ada di Malang", R.drawable.t5,
                Color.parseColor("#00E5FF")));

        addSlide(AppIntroFragment.newInstance("Polisi", "Tekan icon untuk mendapakan nomor kantor polisi yang bisa dihubungi di Malang", R.drawable.t6,
                Color.parseColor("#FFB300")));

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
