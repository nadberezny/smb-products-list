package pjatk.s18133.productspersistance;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = Product.TABLE_NAME)
public class Product {
    public static final String TABLE_NAME = "products";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_QUANTITY = "quantity";
    public static final String COLUMN_IS_PURCHASED = "is_purchased";

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = COLUMN_NAME, index = true)
    public String name;

    @ColumnInfo(name = COLUMN_PRICE)
    public Float price;

    @ColumnInfo(name = COLUMN_QUANTITY)
    public int quantity;

    @ColumnInfo(name = COLUMN_IS_PURCHASED)
    public Boolean isPurchased;
}
