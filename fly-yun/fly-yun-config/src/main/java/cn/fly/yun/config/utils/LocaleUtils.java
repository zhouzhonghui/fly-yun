package cn.fly.yun.config.utils;

import org.springframework.util.StringUtils;

import java.util.Locale;

public class LocaleUtils {
    public static Locale getLocalByString(String localeStr) {
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        if (StringUtils.hasText(localeStr)) {
            if ("english".equals(localeStr)) {
                locale = Locale.ENGLISH;
            } else if ("japan".equals(localeStr)) {
                locale = Locale.JAPAN;
            } else if ("korea".equals(localeStr)) {
                locale = Locale.KOREA;
            }
        }

        return locale;
    }
}
