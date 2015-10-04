package com.example.clarencenguyen.liftr;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
/**
 * Created by Phi on 10/3/2015.
 */
public class LiftrApplication extends Application{
    @Override
    public void onCreate{
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "kxRXVjgUrcj9VERoLE1IUxBloZmRKLjCrknCuKzt", "3q2uX3teIqVRYrGlzLfvNkmBxTMnv7LwtBiByIu3");



    }

}
