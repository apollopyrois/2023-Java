package mainstuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exam extends JFrame implements ActionListener {
    private storage[] storageArray;
    private int currentIndex;
    private JLabel i1Label, s1Label, b1Label, d1Label, c1Label;
    private JTextField i1Field, s1Field, d1Field, c1Field;
    private JCheckBox b1CheckBox;
    private JButton prevButton, nextButton;
  	  
    public exam() {
    	
    	super("View Storage Object");
    	setSize(400,400);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	

        storageArray = new storage[5];
        for (int i = 0; i < storageArray.length; i++) {
            storageArray[i] = new storage(1 + i, "string" + (i + 1), true, 1.5 + i, (char) ('a' + i));
        }
        currentIndex = 0;

        JPanel mainPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        i1Label = new JLabel("Integer 1:");
        mainPanel.add(i1Label);
        i1Field = new JTextField(10);
        mainPanel.add(i1Field);

        s1Label = new JLabel("String 1:");
        mainPanel.add(s1Label);
        s1Field = new JTextField(10);
        mainPanel.add(s1Field);

        b1Label = new JLabel("Boolean 1:");
        mainPanel.add(b1Label);
        b1CheckBox = new JCheckBox();
        mainPanel.add(b1CheckBox);

        d1Label = new JLabel("Double 1:");
        mainPanel.add(d1Label);
        d1Field = new JTextField(10);
        mainPanel.add(d1Field);

        c1Label = new JLabel("Character 1:");
        mainPanel.add(c1Label);
        c1Field = new JTextField(10);
        mainPanel.add(c1Field);

        prevButton = new JButton("Previous");
        prevButton.addActionListener(this);
        mainPanel.add(prevButton);

        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        mainPanel.add(nextButton);

        displayStorageValues();

        setContentPane(mainPanel);
        setVisible(true);
    }

    private void displayStorageValues() {
        storage currentStorage = storageArray[currentIndex];
        i1Field.setText(String.valueOf(currentStorage.geti1()));
        s1Field.setText(currentStorage.gets1());
        b1CheckBox.setSelected(currentStorage.getb1());
        d1Field.setText(String.valueOf(currentStorage.getd1()));
        c1Field.setText(String.valueOf(currentStorage.getc1()));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            currentIndex--;
            if (currentIndex < 0) {
                currentIndex = storageArray.length - 1;
            }
            displayStorageValues();
        } else if (e.getSource() == nextButton) {
            currentIndex++;
            if (currentIndex >= storageArray.length) {
                currentIndex = 0;
            }
            displayStorageValues();
        }
    }

    public static void main(String[] args) {
        new exam();
       }
    }
