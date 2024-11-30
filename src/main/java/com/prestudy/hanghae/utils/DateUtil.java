package com.prestudy.hanghae.utils;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtil {

    public static ZonedDateTime getNow_KST() {
        return ZonedDateTime.of(ZonedDateTime.now().toLocalDateTime(), ZoneId.of("Asia/Seoul"));
    }
}
