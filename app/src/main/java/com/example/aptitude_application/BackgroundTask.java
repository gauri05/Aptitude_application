package com.example.aptitude_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

public class BackgroundTask extends AsyncTask {
    Intent intent;
    public Context context;
    public BackgroundTask(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        //intent=new Intent(context,
           //     MainActivity.class);
        intent = new Intent().setClass(context, MainActivity.class);
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        /*  Use this method to load background
         * data that your app needs. */

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);

        //pass your loaded data here using intent
        //context.startActivity(intent);
       // ((Activity)context).finish();


        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

// Launch the new activity and add the additional flags to the intent
        context.startActivity(intent);
        ((Activity)context).finish();


    }
}
