package freelancer.androidbuider.activity.implement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.view.View;

import freelancer.androidbuider.R;
import freelancer.androidbuider.activity.AbstractActivity;


/**
 * Created by nqlong on 26-Sep-16.
 */
public class MainActivity extends AbstractActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_activity;
    }
    public void zoomLayout(View view){
        Intent intent = new Intent(MainActivity.this,ZoomLayoutActivity.class);
        startActivity(intent);
    }


    public void zoomList(View view){
        Intent intent = new Intent(MainActivity.this,ZoomListActivity.class);
        startActivity(intent);
    }

}
