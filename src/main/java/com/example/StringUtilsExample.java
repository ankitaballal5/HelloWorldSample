package com.example;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        CharBuffer charBuffer = CharBuffer.wrap(input.toCharArray());
        ByteBuffer byteBuffer = Charset.defaultCharset().encode(charBuffer);
        byteBuffer.rewind();
        CharBuffer reversed = CharBuffer.allocate(charBuffer.capacity());
        byteBuffer.get(reversed.array(), 0, byteBuffer.remaining());
        reversed.flip();
        return input.equals(reversed.toString());
    }
}