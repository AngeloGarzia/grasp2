package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static class DatesUtils {

        /** Transforme une date au format String en {@link LocalDateTime}
         * @param dateStr date au format String
         * @return LocalDateTime
         */
        /** formatter */
        private static final DateTimeFormatter FORMAT_STANDARD=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        public static  LocalDateTime toDate(String dateStr) {

            return LocalDateTime.parse(dateStr, FORMAT_STANDARD);
        }


    }
}
