package HardTests;

import Hard.ZigZagEncoder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZigZagEncoderTest {

    ZigZagEncoder zze;

    @Before
    public void setup() {
        zze = new ZigZagEncoder();
    }
    @After
    public void breakdown() {
        zze = null;
    }
    //  Encode message over 4 lines
    @Test
    public void returnEncodedMessage() {
        String actual = zze.zigZagEncryption("Hello my name is max", 4);
        String expected = "Hysemnimloaealmx";

        Assert.assertEquals(expected, actual);
    }
    //  Encode message over 16 lines
    @Test
    public void returnEncodedMessageSame() {
        String actual = zze.zigZagEncryption("Hello my name is max", 16);
        String actual2 = zze.zigZagEncryption("Hello my name is max", 1);
        String expected = "Hellomynameismax";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
}
