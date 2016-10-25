package freelancer.androidbuider.pulllayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by nqlong on 25-Oct-16.
 */

public class PullBase extends LinearLayout {
    private View mHeaderView;
    private int mHeaderViewHeight;
    private View mContentView;
//    protected boolean mHeaderShow
    public PullBase(Context context) {
        super(context);
    }

    public PullBase(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
