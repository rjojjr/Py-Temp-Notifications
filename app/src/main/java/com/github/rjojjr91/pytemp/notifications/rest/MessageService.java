package com.github.rjojjr91.pytemp.notifications.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import androidx.core.content.*;
import android.content.pm.*;
import androidx.core.app.*;

import android.Manifest;

public class MessageService {

    private static MessageService instance = null;
    private Executor threadPool = Executors.newSingleThreadExecutor();

    private List<SentMessage> sentCache;

    private MessageService(){
        sentCache = Collections.synchronizedList(new ArrayList<>());
    }

    public static MessageService getInstance(){
        if(instance == null){
            instance = new MessageService();
        }
        return instance;
    }

    private Runnable restThread(){
        return () -> {
			
        };
    }

	private void sendSMSMessage(String phoneNumber, String msg) {

        if (ContextCompat.checkSelfPermission(this,
											  Manifest.permission.SEND_SMS)
			!= PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
																	Manifest.permission.SEND_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this,
												  new String[]{Manifest.permission.SEND_SMS},
												  MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
    }

}
