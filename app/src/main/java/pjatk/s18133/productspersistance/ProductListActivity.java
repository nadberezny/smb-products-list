package pjatk.s18133.productspersistance;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        setProductList();
    }

    private void setProductList() {
        ListView listV = findViewById(R.id.product_list);

        ProductDao productDao = AppDatabase.getInstance(this).productDao();

//        Product sample = new Product("Foo");
//        productDao.insert(sample);
//
        Cursor prodCursor = productDao.selectAll();
        ProductCursorAdapter productCursorAdapter = new ProductCursorAdapter(this, prodCursor);
        listV.setAdapter(productCursorAdapter);
    }
}
