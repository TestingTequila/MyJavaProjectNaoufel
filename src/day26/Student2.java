package day26;

public class Student2 {
    public int displayMarks(String name) {
        int marks= -1;

        if (name.equals("Jason")) {
            marks= 92;
        } else if (name.equals("Kerrie")) {
            marks= 60;
        } else if (name.equals("Naoufel")) {
            marks= 87;
        } else if (name.equals("Lee")) {
            marks= 45;
        } else if (name.equals("Rose")) {
            marks= 32;
        }
        return marks;
    }
}
