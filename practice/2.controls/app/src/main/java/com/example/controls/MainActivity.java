package com.example.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button buttonLeft, buttonRight, buttonConfirm;
    Switch switch1;
    ProgressBar progressBar;
    EditText editText;
    RadioGroup radioGroup;
    ImageView imageView;
    SeekBar seekBar;
    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate controls
        display = findViewById(R.id.textView);
        buttonLeft = findViewById(R.id.button);
        buttonRight = findViewById(R.id.button2);
        buttonConfirm = findViewById(R.id.button3);
        switch1 = findViewById(R.id.switch1);
        progressBar = findViewById(R.id.progressBar3);
        editText = findViewById(R.id.editTextNumber);
        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);
        seekBar = findViewById(R.id.seekBar);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        // OnClick Listener
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("向左");
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(R.string.button1);
            }
        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    display.setText("开");
                } else {
                    display.setText("关");
                }
            }
        });
        // Android中，TextUtils.isEmpty()对于null和长度为0都会判定true
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if (TextUtils.isEmpty(s)) {
                    s = "0";
                }
                progressBar.setProgress(Integer.valueOf(s));
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2) {
                    imageView.setImageResource(R.drawable.ic_launcher_foreground);
                } else {
                    imageView.setImageResource(R.drawable.ic_launcher_background);
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                display.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}