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
 * The SocietyFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class SocietyFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SocietyFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String societyUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.society));
        Log.e(LOG_TAG, societyUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), societyUrl);
    }
}
