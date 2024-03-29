package social.tochka.android.construct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import social.tochka.android.R;

public class ConstructActivity extends AppCompatActivity implements MerchListFragment.OnListFragmentInteractionListener, TochkaTabFragment.anotherOnListInteractionListener {
    private ConstructFragmentPageAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construct);

        Log.d("TAG", "ConstructActivity onCreate");

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Create an adapter that knows which fragment should be shown on each page
        adapter = new ConstructFragmentPageAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onListFragmentInteraction(String item) {
        Log.d("TAG", "FUCK FRAGMENT INTERACTION");
        viewPager.setCurrentItem(1, true);
    }

    @Override
    public void anotherOnListFragmentInteraction(String item) {
        Log.d("TAG", "FUCK FRAGMENT INTERACTION");
        viewPager.setCurrentItem(2, true);
    }
}
