package pjatk.s18133.productspersistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListenerOnProductListBtn();
    }

    private void setListenerOnProductListBtn() {
        Intent intent = new Intent(this, ProductListActivity.class);
        findViewById(R.id.button_products_list).setOnClickListener(_view -> startActivity(intent));
    }
}
