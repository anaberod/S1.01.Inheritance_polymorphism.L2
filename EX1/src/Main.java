//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Smartphone S1 = new Smartphone("Iphone", "16");

        System.out.println(S1);

        S1.alarm();

        String callResult = S1.call("722547668");

        System.out.println(callResult);

        S1.takePhoto();

    }
}