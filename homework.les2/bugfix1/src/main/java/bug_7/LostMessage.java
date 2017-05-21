package bug_7;


import java.io.IOException;

/**
 * I want to see VeryImportant Exception as result:
 */

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        LostMessage lm = new LostMessage();
        try {
            lm.f();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                lm.dispose();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }


}

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

