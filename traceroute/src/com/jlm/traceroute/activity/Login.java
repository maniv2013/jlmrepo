package com.jlm.traceroute.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setting default screen to login.xml
        setContentView(R.layout.login);

        TextView registerScreen = (TextView)findViewById(R.id.link_to_register);

        //Listening to register new Account Link
        registerScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Switching to register.xml

                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
    }
}
