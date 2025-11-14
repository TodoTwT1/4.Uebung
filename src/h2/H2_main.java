package h2;

public class H2_main {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = true;
        boolean a = false;
        boolean b = false;
        boolean c = true;
        int input = 10;

        switch (input) {
            case 10:
                x = true;
                y = false;
                break;
            case 11:
                x = true;
                y = true;
                break;
            case 1:
                y = true;
                x = false;
                break;
            case 0:
            default:
                x = false;
                y = false;
        }
        if (x == true && y == true) {
            c = false;
        }
        if (x == true && y == false) {
            c = true;
        }
        if (x == false && y == true) {
            c = false;
        }
        if (x == false && y == false) {
            c = true;
        }

        System.out.println(c);
    }
}
