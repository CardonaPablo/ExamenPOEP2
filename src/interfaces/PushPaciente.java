/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import examen.p2.Paciente;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Byte.parseByte;
import storage.PilaPacientes;
/**
 *
 * @author cardonapablo
 */
public class PushPaciente extends javax.swing.JFrame {

    /**
     * Creates new form PushPaciente
     */
    public PushPaciente() {
        initComponents();
    }
    
    private JLabel titleLabel = new JLabel();
    private JPanel formPanel = new JPanel();
    private JPanel actionsPanel = new JPanel();
    private PilaPacientes pacientes;
    
    private JButton addButton = new JButton();
    
    Font titleFont = new Font("Helvetica", Font.PLAIN, 25);
    Font labelFont = new Font("Helvetica", Font.BOLD, 25);
    Font inputFont = new Font("Helvetica", Font.PLAIN, 24);
    
    private JTextField nombreInput = new JTextField();
    private JTextField nssInput = new JTextField();
    private JTextField edadInput = new JTextField();
    private JRadioButton generoF = new JRadioButton("Fermenino");
    private JRadioButton generoM = new JRadioButton("Masculino");
    private JRadioButton generoO = new JRadioButton("Otro");
    ButtonGroup bg;
    
    Menu menu;

    /**
     * Creates new form RegistrarAlumno
     */
    public PushPaciente(PilaPacientes pacientes, Menu menu) {
        this.pacientes = pacientes;
        this.menu = menu;
        setTitle("Registrar paciente");
        setSize(700, 800);
        setLocation(1500, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        titleLabel.setText("Registrar paciente");
        addButton.setText("Guardar");
        
        titleLabel.setSize(400, 50);
        titleLabel.setFont(titleFont);
        titleLabel.setLocation(150, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVisible(true);
        this.add(titleLabel);
        
        this.drawForm();
    }
    
    private void drawForm() {
        
        formPanel.setLocation(150, 100);
        formPanel.setSize(400, 500);
        formPanel.setVisible(true);
        
        formPanel.setLayout(new GridLayout(10, 1));
        
        nombreInput.setFont(inputFont);
        nssInput.setFont(inputFont);
        edadInput.setFont(inputFont);
        
        JLabel formLabel = new JLabel("Nombre");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(nombreInput);
        
        formLabel = new JLabel("NSS");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(nssInput);
        
        formLabel = new JLabel("Edad");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(edadInput);
        
        bg = new ButtonGroup();
        
        generoF.setActionCommand("F");
        bg.add(generoF);
        generoM.setActionCommand("M");
        bg.add(generoM);
        generoO.setActionCommand("O");
        bg.add(generoO);
        
        formPanel.add(generoF);
        formPanel.add(generoM);
        formPanel.add(generoO);
        
        formPanel.add(new JSeparator());
        
        this.add(formPanel);
        this.drawActions();
    }
    
    private void drawActions() {
                
        actionsPanel.setLayout(new BoxLayout(actionsPanel, BoxLayout.X_AXIS));
        actionsPanel.setLocation(150, 600);
        actionsPanel.setSize(400, 60);
        
        addButton.setFont(inputFont);
        addButton.setSize(200, 50);
        addButton.setVisible(true);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitFields();
            }
        });
        actionsPanel.add(addButton);
        
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setFont(inputFont);
        cancelButton.setSize(200, 50);
        cancelButton.setVisible(true);
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                menu.setVisible(true);
            }
        });
        actionsPanel.add(cancelButton);
        
        actionsPanel.setVisible(true);
        this.add(actionsPanel);
        
    }
    
    private void submitFields() {
        String nombre = nombreInput.getText();
        String nss = nssInput.getText();
        byte edad = parseByte(edadInput.getText());
        char genero = bg.getSelection().getActionCommand().charAt(0);
        
        Paciente a = new Paciente(nombre, edad, genero, nss);
        pacientes.push(a);
        dispose();
        this.menu.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PushPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PushPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PushPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PushPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PushPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
