package pjatk.s18133.productspersistance;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class ProductCursorAdapter extends CursorAdapter {
    public ProductCursorAdapter(Context context, Cursor c) {
        super(context, c, true);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.content_product_list, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find fields to populate in inflated template
        TextView prodName = view.findViewById(R.id.product_content_name);

        // Extract properties from cursor
        String body = cursor.getString(cursor.getColumnIndexOrThrow(Product.COLUMN_NAME));

        // Populate fields with extracted properties
        prodName.setText(body);
    }
}
