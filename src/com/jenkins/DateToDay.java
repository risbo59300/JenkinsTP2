package com.jenkins;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToDay {


    public static void main(String[] args) {

        Date now = new Date();

        int mm = now.getMonth();

        int dd = now.getDay();

        int yyyy = now.getYear();

        int hour = now.getHours();

        int mi = now.getMinutes();

        int ss = now.getSeconds();

        System.out.println("Date : "+ mm + "/" + dd + "/" + yyyy + " " + hour + ":" + mi + ":" + ss);

    }

}
