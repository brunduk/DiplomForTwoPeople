package ru.netology.javaqadiplom;
public class NegativeRateException extends IllegalArgumentException {
    public NegativeRateException(int rate) {
        super("Накопительная ставка не может быть отрицательной, а у вас: " + rate);
    }

    public NegativeRateException (String s) {
        super(s);
    }
}
