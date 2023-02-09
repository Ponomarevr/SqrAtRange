package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {


    @Test

    public void sqrAmountAtRangeServiceTest() {
        SQRService service = new SQRService();

        int expected = 3;

        int actual = service.sqrAmountAtRangeService(200, 300);


        assertEquals(expected, actual);

    }

}

