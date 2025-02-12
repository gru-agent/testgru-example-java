package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testMainMethod() {
        String[] args = new String[]{"arg1", "arg2"};
        DemoApplication.main(args);
    }

    @Test
    void testMainMethodWithEmptyArgs() {
        // To avoid port conflicts, set a random port for this test
        System.setProperty("server.port", "0");
        String[] args = new String[]{};
        DemoApplication.main(args);
    }

    @Test
    void testMainMethodWithNullArgs() {
        // Ensure that passing null arguments throws the expected exception
        assertThrows(IllegalArgumentException.class, () -> {
            DemoApplication.main(null);
        });
    }
}
