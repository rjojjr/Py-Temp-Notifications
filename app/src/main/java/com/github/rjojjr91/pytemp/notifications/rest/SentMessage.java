package com.github.rjojjr91.pytemp.notifications.rest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SentMessage {

    private String recipient;
    private String msg;
    private Long time;

}
