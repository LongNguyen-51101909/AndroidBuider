package freelancer.androidbuider.activity.implement;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ikimuhendis.ldrawer.ActionBarDrawerToggle;
import com.ikimuhendis.ldrawer.DrawerArrowDrawable;

import freelancer.androidbuider.R;
import freelancer.androidbuider.activity.AbstractActivity;

/**
 * Created by nqlong on 26-Sep-16.
 */
public class MainActivity extends AbstractActivity {
    DrawerArrowDrawable drawerArrow;
    ActionBarDrawerToggle mDrawerToggle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // make sure we/re running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {

        }
        drawerArrow = new DrawerArrowDrawable(this) {
            @Override
            public boolean isLayoutRtl() {
                return false;
            }
        };

//        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
//                drawerArrow, R.string.drawer_open,
//                R.string.drawer_close) {
//
//            public void onDrawerClosed(View view) {
//                super.onDrawerClosed(view);
//                invalidateOptionsMenu();
//            }
//
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//                invalidateOptionsMenu();
//            }
//        };

    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_main_activity;
    }
}
