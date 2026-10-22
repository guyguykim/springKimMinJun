package use;

import used.AddCalc;
import used.Calculator;
import used.MultipleCalc;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new MultipleCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println(
                "계산 결과는 " + result + "입니다.");
    }
}
