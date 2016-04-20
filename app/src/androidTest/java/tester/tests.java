package tester;

import android.test.ActivityInstrumentationTestCase2;

import com.example.cahung.myapplication.MainActivity;

/**
 * Created by cahung on 4/20/2016.
 */
public class tests extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public tests() {
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();
        int result = mainActivity.sum(1, 2);
        assertEquals(3, result);
    }
}