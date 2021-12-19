package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldSqr() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqr(0);

        assertEquals(expected, actual);

    }
}