package com.gmail.maslyuk.lesya.mentoring.regexencoder.encoder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DefaultEncoder {

    // Regex must die X_x
    private static final Pattern ENCODE_PATTERN = Pattern.compile("([\\D])\\1*|[\\d]{1}");

    public String encode(String source) {
        Matcher encodeMatcher = ENCODE_PATTERN.matcher(source);

        List<String> encodeMatches = new ArrayList<>();
        while (encodeMatcher.find()) {
            encodeMatches.add(encodeMatcher.group());
        }

        return encodeMatches.stream()
                .map(this::encodeGroup)
                .collect(Collectors.joining());
    }

    private String encodeGroup(String group) {
        int length = group.length();
        // Is one-symbol
        if (length == 1) {
            // Is one digit
            if (Pattern.compile("^\\d$").matcher(group).matches()) {
                return "1" + group;
            }
            return group;
        }

        // Return count + symbol
        return String.valueOf(length) + group.charAt(0);
    }

}
