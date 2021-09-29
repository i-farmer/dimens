package i.farmer.demo.dimens;

import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author i-farmer
 * @created-time 2020/11/20 4:09 PM
 * @description <p>
 */
public class DemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }


    private float getSw() {
        DisplayMetrics dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        float sw = dm.widthPixels / dm.density;
        return sw;
    }
}
