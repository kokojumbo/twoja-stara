
package com.epimelo.app;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class Start
    extends SherlockActivity
{


    @AfterViews
    void afterViews() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

}
