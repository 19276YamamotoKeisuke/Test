package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcNum(View view){
        EditText editText1=(EditText)findViewById(R.id.editText1);
        EditText editText2=(EditText)findViewById(R.id.editText2);
        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        long num1 = Integer.parseInt(str1);
        long num2 = Integer.parseInt(str2);
//        int result = num1 + num2;
        
//        String str3 = String.valueOf(result);
//        textView1.setText(str3);


        //インテント作成
//        Intent intent = new Intent(getApplication(), SubActivity.class);
       Intent intent = new Intent(getApplication(), count_activity.class);

        //入力データをセット
//        EditText editText = findViewById(R.id.editText1);
        intent.putExtra("SEND_DATA",num1);
        intent.putExtra("SEND_DATA_2",num2);

        //SubActivityに画面遷移
        startActivity(intent);
    }
}