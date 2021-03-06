package com.mi.excelcsv.helper.deserializer.impl;

import com.mi.excelcsv.helper.deserializer.AbstractCellDeserializer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 陈奕鸿
 * @Description
 * @Date 创建于 19-6-19 下午4:06
 */
public class LocalTimeDeserializer extends AbstractCellDeserializer {

    private static final String DEFAULT_FORMAT = "HH:mm:ss";

    @Override
    public Object deserialize(String cellValue, String[] args) {
        String dateFormat;
        if (args.length > 0) {
            dateFormat = args[0];
        } else {
            dateFormat = DEFAULT_FORMAT;
        }

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(dateFormat);
        return LocalTime.parse(cellValue, timeFormatter);
    }

}
