package com.gmail.maslyuk.lesya.mentoring.regexencoder.decoder;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DefaultDecoder {

    // Try reading this quickly
    private static final Pattern DECODE_PATTERN = Pattern.compile("(\\D+)|(([1]\\d)(?=[\\d ]))|(\\d+\\D)");

    public String decode(String source) {
        Matcher decodeMatcher = DECODE_PATTERN.matcher(source);

        List<String> decodeMatches = new ArrayList<>();
        while (decodeMatcher.find()) {
            decodeMatches.add(decodeMatcher.group());
        }

        return decodeMatches.stream()
                .map(this::decodeGroup)
                .collect(Collectors.joining());
    }

    private String decodeGroup(String group) {
        // Is digits + non-digit
        if (Pattern.compile("\\d+\\D").matcher(group).matches()) {
            String symbol = group.substring(group.length() - 1);
            Integer count = Integer.valueOf(group.substring(0, group.length() - 1));

            return StringUtils.repeat(symbol, count);
        }
        // Is two digits
        if (Pattern.compile("\\d{2}").matcher(group).matches()) {
            return String.valueOf(group.charAt(1));
        }

        return group;
    }
}
