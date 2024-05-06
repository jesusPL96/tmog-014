package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    void testSolution_Ok() {

        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        var result = Solution.maxArea(heights);

        assertEquals(49, result);

    }

    @Test
    void testShortSolution_Ok() {

        int[] heights = {1, 1};

        var result = Solution.maxArea(heights);

        assertEquals(1, result);

    }

}