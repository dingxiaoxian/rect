package com.example.rect;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectApplicationTests {

    @Test
    void answerTest() {
        Assertions.assertEquals(
                Answer.of(
                        Rect.of(1, 2, 3, 4)
                ),// 期望的正确答案
                RectApplication.solve(
                        1,
                        Answer.of(
                                Rect.of(1, 2, 3, 4)
                        )// 用户1的回答
                )
        );
    }

}
