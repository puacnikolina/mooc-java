package org.example.part5.one;

public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value += 1;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }

    public void decrease() {
        this.value -= 1;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }
}
