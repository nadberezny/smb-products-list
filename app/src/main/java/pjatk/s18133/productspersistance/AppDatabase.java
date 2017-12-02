package pjatk.s18133.productspersistance;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

//AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//        AppDatabase.class, "database-name").build();

@Database(entities = {Product.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    /**
     * @return The DAO for the products table.
     */
    @SuppressWarnings("WeakerAccess")
    public abstract ProductDao productDao();

    /** singleton instance */
    private static AppDatabase sInstance;

    /**
     * @param context The context.
     * @return The singleton instance of AppDatabase.
     */
    public static synchronized AppDatabase getInstance(Context context) {
        if (sInstance == null) {
            sInstance = Room
                .databaseBuilder(context.getApplicationContext(), AppDatabase.class, "products-database")
                .allowMainThreadQueries()
                .build();
        }
        return sInstance;
    }
}
