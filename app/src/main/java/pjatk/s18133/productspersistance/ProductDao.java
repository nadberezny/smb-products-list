package pjatk.s18133.productspersistance;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.database.Cursor;

@Dao
public interface ProductDao {
    @Query("SELECT COUNT(*) FROM " + Product.TABLE_NAME)
    int count();

    @Query("SELECT * FROM " + Product.TABLE_NAME )
    Cursor selectAll();

    @Query("SELECT * FROM " + Product.TABLE_NAME )
    public Product[] getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(Product product);

    @Update
    public void update(Product product);

    @Delete
    public void delete(Product product);
}
