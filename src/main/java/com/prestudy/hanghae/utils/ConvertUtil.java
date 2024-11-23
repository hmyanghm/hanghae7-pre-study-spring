package com.prestudy.hanghae.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertUtil {

    public static void convertIgnoreNull(Object src, Object target, String... ignoreProperties) {
        BeanUtils.copyProperties(src, target, getNullPropertyNames(src, ignoreProperties));
    }

    public static void convert(Object src, Object target, String... ignoreProperties) {
        BeanUtils.copyProperties(src, target, ignoreProperties);
    }

    private static String[] getNullPropertyNames(Object source, String... ignoreProperties) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        emptyNames.addAll(Arrays.asList(ignoreProperties));
        String[] result = new String[emptyNames.size() + ignoreProperties.length];
        return emptyNames.toArray(result);
    }
}
