package cn.itcase.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDate implements Converter<String,Date>{
    @Override
    public Date convert(String source) {
        if (source==null){
            throw new RuntimeException("参数不能为空");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("参数类型错误");
        }
    }
}
