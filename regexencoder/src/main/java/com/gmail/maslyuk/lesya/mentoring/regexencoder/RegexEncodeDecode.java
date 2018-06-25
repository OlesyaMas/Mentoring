package com.gmail.maslyuk.lesya.mentoring.regexencoder;

import com.gmail.maslyuk.lesya.mentoring.regexencoder.decoder.DefaultDecoder;
import com.gmail.maslyuk.lesya.mentoring.regexencoder.encoder.DefaultEncoder;

public class RegexEncodeDecode {

    private static final String INPUT = "Hello 22 wooooooooooooooooorld!";

    public static void main(String[] args) {

        System.out.println("Input: " + INPUT);

        String encoded = new DefaultEncoder().encode(INPUT);
        System.out.println("Encoded: " + encoded);

        String decoded = new DefaultDecoder().decode(encoded);
        System.out.println("Decoded: " + decoded);

        System.out.println(INPUT.equals(decoded) ? "Input equals decoded" : "Input NOT equals decoded");

    }
}
