package com.koo.android.practice.rhinoapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button runBtn = (Button) findViewById(R.id.btn_run);
        runBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edit_text);
                Editable editable = editText.getText();
                String scripts = editable.toString();

                //RhinoSample rhino = new RhinoSample();
                //rhino.runJavaScript(scripts);

                RhinoJavaToJsSample rhinoj2j = new RhinoJavaToJsSample();
                rhinoj2j.runJavaScript(scripts);
            }
        });
    }
}
