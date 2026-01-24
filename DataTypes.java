package com.example.demoday2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class DataTypes {
    public static void main(String[] args) {
        int s=10;
        short b = 29999;
        long l = 9644805536L;
        byte c = (byte)123;

        System.out.println("Integer: "+s);
        System.out.println("Short: "+b);
        System.out.println("Long: "+l);
        System.out.println("Byte: "+c);
    }
}
