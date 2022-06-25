package Hard;

import java.util.ArrayList;
import java.util.List;

public class ZigZagEncoder {
    /*
    Zig Zag Message Encoder - takes a string 'message' and a number of rows to encrypt over. Subtract spaces from the message and
    write out the word in a zig zag pattern, then read line by line and concat into a string to return.
    'Hello my name is max' over 4 lines can be visualized as :
    H     y       s
     e   m  n    i  m
      l o    a  e    a
       l       m      x
    : and should return 'Hysemnimloaealmx'
    */
    public static String zigZagEncryption(String message, int rows) {
        char[] messageArr = message.toCharArray();
        List<String> smushList = new ArrayList<>();
        String encoded = "";
        //  Main equation to be used to traverse the message
        int mainEqu = (2 * rows) - 2;
        //  Remove spaces
        for (char letter : messageArr) {
            if (letter != ' ') {
                smushList.add(String.valueOf(letter));
            }
        }
        //  Check if rows is 1
        if(rows != 1) {
            //  Start loop
            for (int i = 0; i < rows; i++) {

                int skippedIndex = i;
                //  When at top or bottom row
                if (i == 0 || i == rows - 1) {
                    // Start loop and add letter to encoded
                    for (int x = i; x <= smushList.size() - 1; x += mainEqu) {
                        encoded += smushList.get(x);
                    }
                    //  When not at top or bottom row
                } else if (i % (rows - 1) != 0) {
                    //  Start loop and grab skipped index, then add letter to encoded
                    for (int x = i; x < smushList.size(); x += mainEqu) {
                        skippedIndex = (x + (mainEqu) - (i * 2));
                        encoded += smushList.get(x);
                        //  Add skipped index to encoded when not out of bounds
                        if (skippedIndex < smushList.size()) {
                            encoded += smushList.get(skippedIndex);
                        }
                    }
                }
            }
        } else {
            //  Return original message when rows == 1
            encoded = message;
        }

        return encoded;
    }
}
