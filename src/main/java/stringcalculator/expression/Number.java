package stringcalculator.expression;

import java.util.Objects;

public class Number {
    private final double number;

    Number(double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        Number number1 = (Number) o;
        return getNumber() == number1.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}