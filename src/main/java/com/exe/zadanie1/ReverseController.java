package com.exe.zadanie1;

import java.util.concurrent.atomic.AtomicLong;

import com.exe.zadanie1.Reverse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/reverse")
    public Reverse greeting(@RequestParam(value="string", defaultValue="reverse") String name) {
        StringBuilder reverse = new StringBuilder(name);
        return new Reverse(reverse.reverse().toString());
    }
}