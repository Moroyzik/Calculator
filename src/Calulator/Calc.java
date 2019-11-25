package Calulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private double total = 0.0;
    private double total2 = 0.0;
    private char mathOperator;
    private double result = 0.0;

    private JTextField textField1;
    private JButton buttonOne;
    private JButton buttonFour;
    private JButton button4;
    private JButton buttonMultiply;
    private JButton buttonThree;
    private JButton ButtonSix;
    private JButton buttonSeven;
    private JButton buttonNine;
    private JButton buttonMinus;
    private JButton buttonTwo;
    private JButton buttonFive;
    private JButton buttonEight;
    private JButton buttonDivision;
    private JButton buttonZero;
    private JButton buttonEquals;
    private JPanel JavaCalculator;
    private JButton CLEARButton;
    private JButton powButton;
    private JButton lButton;
    private JButton sButton;
    private JButton cButton;

    private void getOperator(String btnText){
        mathOperator = btnText.charAt(0);
        total = total + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public Calc() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOne = textField1.getText() + buttonOne.getText();
                textField1.setText(btnOne);
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + buttonTwo.getText();
                textField1.setText(btnTwoText);

            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + buttonThree.getText();
                textField1.setText(btnThreeText);

            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + buttonFour.getText();
                textField1.setText(btnFourText);

            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + buttonFive.getText();
                textField1.setText(btnFiveText);

            }
        });
        ButtonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + ButtonSix.getText();
                textField1.setText(btnSixText);

            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + buttonSeven.getText();
                textField1.setText(btnSevenText);

            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + buttonEight.getText();
                textField1.setText(btnEightText);

            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + buttonNine.getText();
                textField1.setText(btnNineText);

            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + buttonZero.getText();
                textField1.setText(btnZeroText);

            }
        });
        // это сложение
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = button4.getText();
                getOperator(button_text);
            }
        });
        // это равно
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (mathOperator){
                    case '+':
                        total2 = total + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total - Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2 = total * Double.parseDouble(textField1.getText());
                        break;
                    case '/':
                        total2 = total / Double.parseDouble(textField1.getText());
                        break;
                    case '^':
                       // total2 = Double.parseDouble(textField1.getText());
                        total2 = Math.pow(total, Double.parseDouble(textField1.getText()));
                        break;
                    case 'l':
                        total2 = Math.log(Double.parseDouble(textField1.getText()));
                        break;
                        case 's':
                        total2 = Math.sin(Double.parseDouble(textField1.getText()));
                        break;
                    case 'c':
                        total2 = Math.cos(Double.parseDouble(textField1.getText()));
                        break;

                }
                textField1.setText(Double.toString(total2));
                total = 0;
            }
        });
        // это минус
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);
            }
        });
        // это деление
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonDivision.getText();
                getOperator(button_text);
            }
        });
        // это умножение
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMultiply.getText();
                getOperator(button_text);
            }
        });
        // это очистка поля
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                textField1.setText("");
            }
        });
        // это возведение в степень
        powButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                total = total + Double.parseDouble( textField1.getText()) ;
//                textField1.setText("");

                String button_text = powButton.getText();
                getOperator(button_text);
            }
        });
        // это логарифм натуральный
        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = lButton.getText();
                getOperator(button_text);
            }
        });
        // это вычисление синуса
        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = lButton.getText();
                getOperator(button_text);
            }
        });
        // это вычисление косинуса
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = lButton.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calc");
        frame.setContentPane(new Calc().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
