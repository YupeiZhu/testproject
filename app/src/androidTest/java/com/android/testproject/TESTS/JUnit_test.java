package com.android.testproject.TESTS;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.android.testproject.MainActivity;
import com.android.testproject.R;
/**
 * Created by Zhuyupei on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}

