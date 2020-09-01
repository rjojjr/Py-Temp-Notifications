package com.github.rjojjr91.pytemp.notifications.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

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

}
