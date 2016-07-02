package example;

/**
 * Created by jairomendes on 7/2/16.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Arguments passed by parameter were: ");
        for(String arg : args)
            System.out.print(arg + "; ");

    }
}
