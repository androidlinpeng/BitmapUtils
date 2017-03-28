package msgcopy.com.mybitmaputils;

import android.app.Application;

/**
 * Created by liang on 2017/3/23.
 */

public class MsgApplication extends Application {

    private static MsgApplication globalContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        globalContext = this;
    }
    public static MsgApplication getInstance() {
        return globalContext;
    }
}
