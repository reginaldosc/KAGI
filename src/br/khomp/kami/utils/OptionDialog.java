/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.utils;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
 

public class OptionDialog extends JPanel {
    JLabel label;
    JFrame frame;
    String iconDesc = "A JOptionPane has its choice of icons";
    String moreDialogDesc = "Some more dialogs";
 
    /** Creates the GUI shown inside the frame's content pane. */
    public OptionDialog(JFrame frame) {
        super(new BorderLayout());
        this.frame = frame;
        JPanel frequentPanel = createSimpleDialogBox();
        Border padding = BorderFactory.createEmptyBorder(20,20,5,20);
        frequentPanel.setBorder(padding);
        add(frequentPanel, BorderLayout.CENTER);        
    }
 
 
    private JPanel createSimpleDialogBox() {
        final int numButtons = 4;
        JRadioButton[] radioButtons = new JRadioButton[numButtons];
        final ButtonGroup group = new ButtonGroup();
        final kLogs logs = new kLogs(); 
 
        JButton showItButton = null;
 
        radioButtons[0] = new JRadioButton("Todos");
        radioButtons[0].setActionCommand(logs.ALL_LOG);
 
        radioButtons[1] = new JRadioButton("Nivel do Sinal");
        radioButtons[1].setActionCommand(logs.NIVEL_SINAL_ANTENA_LOG);
 
        radioButtons[2] = new JRadioButton("Somente Eventos");
        radioButtons[2].setActionCommand(logs.EVENT_LOG);
 
        radioButtons[3] = new JRadioButton("Somente Comandos");
        radioButtons[3].setActionCommand(logs.COMMAND_LOG);
 
        for (int i = 0; i < numButtons; i++) {
            group.add(radioButtons[i]);
        }
        radioButtons[0].setSelected(true);
 
        showItButton = new JButton("OK");
        showItButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //kLogs logs = new kLogs();                
                String command = group.getSelection().getActionCommand();
                //logs.montaLogs(command);
                logs.setLog(command);
                frame.dispose();
            }
        });
 
        return createPane(null,
                          radioButtons,
                          showItButton);
    }
 
    
    private JPanel createPane(String description,
                              JRadioButton[] radioButtons,
                              JButton showButton) {
 
        int numChoices = radioButtons.length;
        JPanel box = new JPanel();
        JLabel label = new JLabel(description);
 
        box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));
        box.add(label);
 
        for (int i = 0; i < numChoices; i++) {
            box.add(radioButtons[i]);
        }
 
        JPanel pane = new JPanel(new BorderLayout());
        pane.add(box, BorderLayout.PAGE_START);
        pane.add(showButton, BorderLayout.PAGE_END);
        return pane;
    }
 
    
 
    public static void createAndShowDialog(JFrame jframe) {
        //Create and set up the window.
        JFrame frame = new JFrame("kLogs");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        //Create and set up the content pane.
        OptionDialog newContentPane = new OptionDialog(frame);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.setLocation(600, 300);
        //frame.setLocationRelativeTo(jframe);
        
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
}
