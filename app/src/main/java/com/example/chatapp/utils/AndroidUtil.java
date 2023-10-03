package com.example.chatapp.utils;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.chatapp.models.UserModel;

public class AndroidUtil {

    public static void showToast(Context context, String message){
        Toast.makeText(context, message,Toast.LENGTH_LONG).show();
    }

    public static void passUserModelAsIntent(Intent intent, UserModel model){
        intent.putExtra("username", model.getUsername());
        intent.putExtra("phone", model.getName());
        intent.putExtra("userId", model.getUserID());
    }

    public static   UserModel getUserModelFromIntent(Intent intent){
        UserModel userModel = new UserModel();
        userModel.setUsername(intent.getStringExtra("username"));
        userModel.setName(intent.getStringExtra("phone"));
        userModel.setUserID(intent.getStringExtra("userId"));
        return userModel;
    }
}
