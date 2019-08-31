package idv.jerryexcc.gifdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    private boolean isChange = false;//圖片狀態

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final GifImageView imgView = findViewById(R.id.pic);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChange) {
                    isChange = false;
                    imgView.setImageResource(R.drawable.wtf);//設定圖片
                } else {
                    isChange = true;
                    imgView.setImageResource(R.drawable.ooo);
                }

            }
        });
    }
}
