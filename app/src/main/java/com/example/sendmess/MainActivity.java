package com.example.sendmess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMess(View view){
        Intent intent  = new Intent(Intent.ACTION_SEND);
        EditText messView = (EditText)findViewById(R.id.message);
        String messText = messView.getText().toString();
        String chooserTitle = getString(R.string.chooser);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messText);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);
    }
}
