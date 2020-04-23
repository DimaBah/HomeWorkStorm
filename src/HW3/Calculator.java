package HW3;

import java.util.Random;

public class Calculator{
    int operand1;
    int operand2;
    Calculator(){
        operand1 = 1;
        operand2 = 2;
    }
    public int getOperand1() {
        return operand1;
    }
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }
    public int getOperand2() {
        return operand2;
    }
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    public int addition(int operand1, int operand2){
        return operand1 + operand2;
    }
    public int multiplication(int operand1, int operand2){
        return operand1 * operand2;
    }
    public double middle(double operand1, double operand2){
        return (operand1 + operand2)/2;
    }
    public int aInGradeB(int operand1, int operand2){
        return (int)Math.pow(operand1, operand2);
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int op1 = 1 + rnd.nextInt(10);
        int op2 = 1 + rnd.nextInt(10);
        Calculator a = new Calculator();
        System.out.println("Сумма чисел " + op1 + " и " + op2 + " равна: " + a.addition(op1, op2));
        System.out.println("Произведение " + op1 + " и " + op2 + " равно: " + a.multiplication(op1, op2));
        System.out.println("Среднее арифметическое чисел " + op1 + " и " + op2 + " равно: " + a.middle(op1, op2));
        System.out.println("Число " + op1 + " в степени " + op2 + " равно: " + a.aInGradeB(op1, op2));
    }
}
