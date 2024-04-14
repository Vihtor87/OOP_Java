package calculator;

import complexNum.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
