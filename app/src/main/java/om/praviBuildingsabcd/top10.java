package om.praviBuildingsabcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class top10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top10);
    }

    public void bt1(View view) {
        startActivity(new Intent(top10.this,bt1.class));
    }

    public void bt2(View view) {
        startActivity(new Intent(top10.this,bt2.class));
    }

    public void bt3(View view) {
        startActivity(new Intent(top10.this,bt3.class));
    }

    public void bt4(View view) {
        startActivity(new Intent(top10.this,bt4.class));
    }

    public void bt5(View view) {
        startActivity(new Intent(top10.this,bt5.class));
    }

    public void bt6(View view) {
        startActivity(new Intent(top10.this,bt6.class));
    }

    public void bt7(View view) {
        startActivity(new Intent(top10.this,bt7.class));
    }

    public void bt8(View view) {
        startActivity(new Intent(top10.this,bt8.class));
    }

    public void bt9(View view) {
        startActivity(new Intent(top10.this,bt9.class));
    }

    public void bt10(View view) {
        startActivity(new Intent(top10.this,bt10.class));
    }
}