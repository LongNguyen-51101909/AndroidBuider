package freelancer.androidbuider.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nqlong on 26-Sep-16.
 */
public abstract class AbstractFragment extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    /**
     * I don't know
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //If activity recreated (such as from screen rotate), restore
        //the previous article selection set by onSAVEiNSTANCEsTATE().
        // This is primaky necessary when in the two-pane layout
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(getIdContentView(), container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        // During startup, check if there are argument passed to the feagment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            updateContentView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            // Set article based on saved instance state defined onCreateView
            updateContentView(mCurrentPosition);
        }
    }

    protected abstract int getIdContentView();

    protected abstract void updateContentView(int position);

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}
