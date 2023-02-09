package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void sqrAmountAtRangeServiceTest(int expected, int rangeFrom, int rangeTill) {
        SQRService service = new SQRService();

        int actual = service.sqrAmountAtRangeService(rangeFrom, rangeTill);

        assertEquals(expected, actual);

    }

}

