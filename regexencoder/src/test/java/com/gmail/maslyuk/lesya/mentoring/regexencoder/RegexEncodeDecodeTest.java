package com.gmail.maslyuk.lesya.mentoring.regexencoder;

import com.gmail.maslyuk.lesya.mentoring.regexencoder.decoder.DefaultDecoder;
import com.gmail.maslyuk.lesya.mentoring.regexencoder.encoder.DefaultEncoder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegexEncodeDecodeTest {

    @Test
    public void encodeDecode() {
        String input = "Hello 22 wooooooooooooooooorld!";

        String encodedDecoded = new DefaultDecoder().decode(new DefaultEncoder().encode(input));

        assertThat(encodedDecoded, is(input));
    }

}