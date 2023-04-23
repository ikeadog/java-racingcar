package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static final String DEFAULT_DELIMITER = "[,:]";
    public static final Pattern CUSTOM_DELIMITER = Pattern.compile("//(.)\n(.*)");
    public static final int DELIMITER = 0;
    public static final int NUMBERS = 0;

    public static int splitAndSum(String text) {
        return parseAndSum(split(text));
    }

    private static String[] split(String text) {
        if (StringUtils.isBlank(text)) {
            text = "0";
        }

        Matcher m = CUSTOM_DELIMITER.matcher(text);

        if (m.find()) {
            return m.group(NUMBERS).split(m.group(DELIMITER));
        }
        return text.split(DEFAULT_DELIMITER);
    }

    private static int parseAndSum(String[] numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            number += getPositiveNumber((numbers[i]));
        }
        return number;
    }

    private static int getPositiveNumber(String number) {
        if (Integer.parseInt(number) < 0) {
            throw new RuntimeException(number + "는 양수가 아닙니다.");
        }
        return Integer.parseInt(number);
    }
}
