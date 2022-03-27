package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shop.dto.CreateProductDTO;

public class MainActivity extends AppCompatActivity {
TextView txtInfo;
EditText editTextName;
    EditText editTextPrice;
    EditText editTextImage;
    EditText editTextDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInfo =findViewById(R.id.txtInfo);
        editTextName=findViewById(R.id.editTextName);
        editTextPrice=findViewById(R.id.editTextPrice);
        editTextImage=findViewById(R.id.editTextImage);
        editTextDescription=findViewById(R.id.editTextDescription);
    }
    public void clickOn (View view){
        CreateProductDTO dto = new CreateProductDTO(
                editTextName.getText().toString(),
                editTextPrice.getText().toString(),
                editTextDescription.getText().toString(),
                editTextImage.getText().toString()
        );
    int i = 3;


//        String text=editTextName.getText().toString();
//        txtInfo.setText(text);
    }
}