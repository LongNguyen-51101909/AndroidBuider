package freelancer.androidbuider.activity.implement;

import android.os.Bundle;
import android.support.annotation.Nullable;

import freelancer.androidbuider.R;
import freelancer.androidbuider.activity.AbstractActivity;

/**
 * Created by nqlong on 26-Sep-16.
 */
public class MainActivity extends AbstractActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_main_activity;
    }
}
