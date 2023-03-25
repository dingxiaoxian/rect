package com.example.rect;


import java.util.ArrayList;
import java.util.List;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point point) {
            return point.x == this.x && point.y == y;
        }
        return false;
    }
}

// 矩形框 左右为x 上下为y
class Rect {
    // 左上角
    public Point leftTop;
    // 右下角
    public Point rightBottom;

    public Rect(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public static Rect of(int left, int top, int right, int bottom) {
        return new Rect(new Point(left, top), new Point(right, bottom));
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("左上角 (%d, %d)", leftTop.x, leftTop.y));
        sb.append(String.format("右下角 (%d, %d)", rightBottom.x, rightBottom.y));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rect rect) {
            return rect.leftTop.equals(this.leftTop) && rect.rightBottom.equals(this.rightBottom);
        }
        return false;
    }
}

class Answer {
    public List<Rect> rects;

    public Answer(Rect... rects) {
        this.rects = new ArrayList<>(List.of(rects));
    }

    public static Answer of(Rect... rects) {
        return new Answer(rects);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[\n");
        for (int i = 0; i < rects.size(); i++) {
            sb.append(String.format("矩形%d: ", i));
            sb.append(rects.get(i).toString());
            sb.append("\n");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Answer answer) {
            if (answer.rects.size() != this.rects.size()) {
                return false;
            }
            for (int i = 0; i < answer.rects.size(); i++) {
                if (!answer.rects.get(i).equals(this.rects.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

public class RectApplication {
    public static Answer solve(int threshold, Answer... userAnswers) {
        if (threshold == 1) {
            return userAnswers[0];
        }
        // FIXME 完成该部分内容
//        for (Answer userAnswer : userAnswers) {
//            // TODO
//        }
//        Answer realAnswer = new Answer();
//        return realAnswer;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(
                RectApplication.solve(1,
                        Answer.of(
                                Rect.of(1, 2, 3, 4),
                                Rect.of(5, 6, 7, 8)
                        )
                )
        );
    }
}
