package calculator;

import complexNum.Complex;

import java.util.Scanner;

public class ViewCalculator {
    private final Scanner iScanner = new Scanner(System.in);
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run(){
        while (true){
            Complex firstArg = promptComplex("Пеpвый аpгумент");
            Calculable calculator = calculableFactory.create(firstArg);
            while (true){
                String cmd = prompt("Введите команду (+, *, :, -, =): ");
                if (cmd.equals("+")){
                    Complex arg = promptComplex("Втоpой аpгумент");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("*")){
                    Complex arg = promptComplex("Втоpой аpгумент");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals(":")){
                    Complex arg = promptComplex("Втоpой аpгумент");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("-")){
                    Complex arg = promptComplex("Втоpой аpгумент");
                    calculator.minus(arg);
                    continue;
                }
                if (cmd.equals("=")){
                    System.out.printf("Pезультат %s\n", calculator.getResult());
                    break;
                }
            }
            String cmd = prompt("Запустить калькулятор заново (да/нет)? ");
            if (cmd.equals("нет")){
                break;
            }
        }
    }
    private String prompt(String msg){
        System.out.print(msg);
        return iScanner.nextLine();
    }
    private double promptDouble(String msg){
        System.out.print(msg);
        return Double.parseDouble(iScanner.nextLine());
    }
    private Complex promptComplex(String msg){
        System.out.println(msg);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new Complex(inputRe, inputIm);
    }
}
