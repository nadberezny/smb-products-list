package pjatk.s18133.productspersistance;

import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(AndroidJUnit4.class)
public class AppDatabaseInstrumentedTest {

    private AppDatabase mDatabase;

    @Before
    public void createDatabase() {
        mDatabase = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getTargetContext(),
                AppDatabase.class).build();
    }

    @After
    public void closeDatabase() throws IOException {
        mDatabase.close();
    }

    @Test
    public void insertAndCount() {
        Assert.assertThat(mDatabase.productDao().count(), Is.is(0));
        Product product = new Product();
        product.name = "abc";
        mDatabase.productDao().insert(product);
        Assert.assertThat(mDatabase.productDao().count(), Is.is(1));
    }

}
