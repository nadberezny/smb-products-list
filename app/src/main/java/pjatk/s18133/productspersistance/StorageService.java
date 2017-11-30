package pjatk.s18133.productspersistance;

import android.app.IntentService;
import android.content.Intent;

public class StorageService extends IntentService {
    public StorageService() {
        super("StorageService");
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
        // Gets data from the incoming Intent
        String dataString = workIntent.getDataString();
        // Do work here, based on the contents of dataString
    }
}
