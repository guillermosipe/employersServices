package com.exercise.employersServices.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

    public static String detalleFecha(String dateComparte) {
        Date date = StringToDate(dateComparte);
        Date today = new Date();
        int dia = Period.between(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).getDays();
        int mes = Period.between(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).getMonths();
        int anio = Period.between(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).getYears();
        return dia + " dias "+ mes + " meses " + anio +" años";
    }

    public static Date StringToDate(String date){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean over18(String birthDate) {
        Date date = StringToDate(birthDate);
        if(Period.between(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).getYears() >= 18){
            return true;
        }
        return false;
    }

}
