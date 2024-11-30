package com.prestudy.hanghae.utils;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class Message {

    private static MessageSource messageSource;
    private final MessageSource initMessageSource;

    @PostConstruct
    private void initStaticDao() {
        messageSource = this.initMessageSource;
    }

    public static String getMessage(String message) {
        return getMessage(message, (String[]) null);
    }

    public static String getMessage(String message, String... arguments) {
        return getMessage(message, null, arguments);
    }

    public static String getMessage(String message, Locale locale) {
        return getMessage(message, locale, (String[]) null);
    }

    public static String getMessage(String message, Locale locale, String... arguments) {
        if (locale == null) {
            return messageSource.getMessage(message, arguments, Locale.getDefault());
        } else {
            return messageSource.getMessage(message, arguments, locale);
        }
    }
}
