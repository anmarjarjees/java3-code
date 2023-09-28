package p2gui_swing_basic;

import javax.swing.JOptionPane;

public class C01Basic {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to this dialog", "Using showMessageDialog",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, args, null, 0);

        String exam1str = JOptionPane.showInputDialog("Enter exam1 mark:");
        double exam1 = Double.parseDouble(exam1str);

        double exam2 = Double.parseDouble(JOptionPane.showInputDialog("Enter exam3 mark:"));

        // find the average for the two exams
        double average = (exam1 + exam2) / 2;

        if (average < 60) {
            JOptionPane.showMessageDialog(null,
                    "Sorry, you need to retake the exams again, your average is " + average
                            + " which is less than 60",
                    "showMessageDialog() static method", 0);
        } else if (average <= 70) {
            JOptionPane.showMessageDialog(null, "You were able to make it, your average is " + average,
                    "showMessageDialog() static method", 2);
        } else if (average <= 100) {
            JOptionPane.showMessageDialog(null, "Good Job! Your average is " + average,
                    "showMessageDialog() static method", 1);
        }

    }
}
