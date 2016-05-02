package com.renovavision.smooch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.smooch.core.User;
import io.smooch.ui.ConversationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Map<String, Object> customProperties = new HashMap<>();
        customProperties.put("customDate", new Date());
        customProperties.put("customFlag", true);
        customProperties.put("customDigit", 322);
        User.getCurrentUser().setFirstName("Alex Test");
        User.getCurrentUser().addProperties(customProperties);

        ConversationActivity.show(this);
    }
}
