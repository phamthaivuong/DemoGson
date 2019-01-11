package com.example.phamthaivuong.demogson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Address address = new Address("VietNam","TP.HCM");
        Employee employee = new Employee("John",30,"john@gmail.com",address);
        String json = gson.toJson(employee);
        */



        String json = "{\"address\":{\"city\":\"TP.HCM\",\"country\":\"VietNam\"},\"age\":30,\"email\":\"john@gmail.com\",\"first_name\":\"John\"}";
        Employee employee = gson.fromJson(json,Employee.class);

    }
}
