package freelancer.androidbuider;

import android.app.Application;

import com.facebook.stetho.Stetho;

import okhttp3.OkHttpClient;

/**
 * Created by nqlong on 22-Sep-16.
 */
public class AndroidBuilderApplication extends Application {
    private static final String TAG = AndroidBuilderApplication.class.getSimpleName();
    public static AndroidBuilderApplication instance;
    public static final boolean DEBUG = true;

    public AndroidBuilderApplication() {
        super();
        if (instance == null) {
            instance = this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // setup Stetho
        if (DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
        // enable Network Inspection

    }

    /**
     * get instance singleton
     * @return
     */
    public AndroidBuilderApplication getInstance() {
        if (instance == null) {
            instance = new AndroidBuilderApplication();
        }
        return instance;
    }
}
