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
        int mainEqu = (2 * rows) - 2;

        for (char letter : messageArr) {
            if (letter != ' ') {
                smushList.add(String.valueOf(letter));
            }
        }
        if(rows != 1) {
            for (int i = 0; i < rows; i++) {

                int skippedIndex = i;

                if (i == 0 || i == rows - 1) {
                    for (int x = i; x <= smushList.size() - 1; x += mainEqu) {
                        encoded += smushList.get(x);
                    }
                } else if (i % (rows - 1) != 0) {
                    for (int x = i; x < smushList.size(); x += mainEqu) {
                        skippedIndex = (x + (mainEqu) - (i * 2));
                        encoded += smushList.get(x);
                        if (skippedIndex < smushList.size()) {
                            encoded += smushList.get(skippedIndex);
                        }
                    }
                }
            }
        } else {
            encoded = message;
        }

        return encoded;
    }
}
