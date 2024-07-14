package com.phanit.android.newsfeed.fragment;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.loader.content.Loader;

import com.phanit.android.newsfeed.R;
import com.phanit.android.newsfeed.News;
import com.phanit.android.newsfeed.NewsLoader;
import com.phanit.android.newsfeed.NewsPreferences;

import java.util.List;

/**
 * The SportFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class SportFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SportFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String sportUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.sport));
        Log.e(LOG_TAG, sportUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), sportUrl);
    }
}
