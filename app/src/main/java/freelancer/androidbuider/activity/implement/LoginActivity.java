package freelancer.androidbuider.activity.implement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.OnClick;
import freelancer.androidbuider.R;
import freelancer.androidbuider.activity.AbstractActivity;

/**
 * Created by nqlong on 21-Sep-16.
 */
public class LoginActivity extends AbstractActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.login_btn)
    public void doLogin() {
        // start main activity , no check business
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP|
        Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.login_activity;
    }
}