package day26;

public class Student {
    public int displayMarks(String name) {
        if (name.equals("Jason")) {
            return 92;
        } else if (name.equals("Kerrie")) {
            return 60;
        } else if (name.equals("Naoufel")) {
            return 87;
        } else if (name.equals("Lee")) {
            return 45;
        } else if (name.equals("Rose")) {
            return 32;
        }
        return -1;
    }
}
