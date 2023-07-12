package ru.netology.javaqadiplom;
public class IllegalArgumentException extends RuntimeException{
    public IllegalArgumentException(int rate) {
        super("Накопительная ставка не может быть отрицательной, а у вас: " + rate);
    }

    public IllegalArgumentException(String s) {
        super(s);
    }
}