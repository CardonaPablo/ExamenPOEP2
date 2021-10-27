/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import storage.PilaPacientes;
import storage.PilaRecetas;

/**
 *
 * @author cardonapablo
 */
public class Menu extends javax.swing.JFrame {

    Font buttonFont = new Font("Helvetica", Font.PLAIN, 30);
    Font menuFont = new Font("Helvetica", Font.PLAIN, 27);
    Font menuItemFont = new Font("Helvetica", Font.PLAIN, 24);
    Menu menu = this;
    PilaPacientes pacientes = new PilaPacientes();
    PilaRecetas recetas = new PilaRecetas();
    
    ActionListener menuItemActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()) {
                case "nuevoPaciente":
                    new PushPaciente(pacientes, menu);
                    setVisible(false);
                break;
                case "consultarPacientes":
                    new ListPaciente(pacientes, menu);
                    setVisible(false);
                break;
                case "nuevaReceta":
                    new PushReceta(recetas, menu);
                    setVisible(false);
                break;
                case "consultarRecetas":
                    new ListReceta(recetas, menu);
                    setVisible(false);
                break;
            }
        }
    };
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        drawMenu();
    }
    
    void drawMenu() {
        
        setTitle("Examen Parcial 2");
        setSize(800, 550);
        setLocation(1500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("Menú");
        titleLabel.setSize(800, 50);
        titleLabel.setFont(new Font("Helvetica", Font.PLAIN, 35));
        titleLabel.setLocation(0, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVisible(true);
        this.add(titleLabel);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuP = new JMenu("Paciente");
        JMenu menuC = new JMenu("Receta Médica");
        menuP.setFont(menuFont);
        menuC.setFont(menuFont);
        
        JMenuItem pushMenuP = new JMenuItem("Registrar");
        pushMenuP.setFont(menuItemFont);
        pushMenuP.setActionCommand("nuevoPaciente");
		
        JMenuItem popMenuP = new JMenuItem("Consultar");
        popMenuP.setFont(menuItemFont);
        popMenuP.setActionCommand("consultarPacientes");

		
        JMenuItem queueC = new JMenuItem("Registrar");
        queueC.setFont(menuItemFont);
        queueC.setActionCommand("nuevaReceta");
		
        JMenuItem unqueueC = new JMenuItem("Consultar");
        unqueueC.setFont(menuItemFont);
        unqueueC.setActionCommand("consultarRecetas");
		
        pushMenuP.addActionListener(menuItemActionListener);
	popMenuP.addActionListener(menuItemActionListener);
	queueC.addActionListener(menuItemActionListener);
	unqueueC.addActionListener(menuItemActionListener);
        
        menuP.add(pushMenuP);
        menuP.add(popMenuP);
        menuC.add(queueC);
        menuC.add(unqueueC);
        
        menuBar.add(menuP);
        menuBar.add(menuC);
        this.setJMenuBar(menuBar);
//        drawActions();
        setVisible(true);
    }
    
//    void openPopDialog() {
//        //default icon, custom title
//        int n = JOptionPane.showConfirmDialog(
//            this,
//            "Seguro que quieres borrar el último elemento?",
//            "Pila - Pop",
//            JOptionPane.YES_NO_OPTION);
//        if(n == 0)
//            pila.pop();
//    }
//    
//    void openUnqueueDialog() {
//        //default icon, custom title
//        int n = JOptionPane.showConfirmDialog(
//            this,
//            "Seguro que quieres desencolar el último elemento?",
//            "Cola - Desencolar",
//            JOptionPane.YES_NO_OPTION);
//        if(n == 0)
//            cola.unqueue();
//    }
    
//    private void drawActions() {
//        
//        JPanel actionsPanel = new JPanel();
//        BoxLayout layout = new BoxLayout(actionsPanel, BoxLayout.Y_AXIS);
//        actionsPanel.setLayout(layout);
//        actionsPanel.setLocation(200, 100);
//        actionsPanel.setSize(400, 600);
//        
//        JButton button = new JButton();
//        
//        button.setText("Encolar");
//        button.setFont(buttonFont);
//        button.setSize(200, 50);
//        button.setActionCommand("queue");
//        button.addActionListener(menuItemActionListener);
//        button.setVisible(true); 
//        actionsPanel.add(button);
//        
//        button = new JButton();
//        button.setText("Desencolar");
//        button.setFont(buttonFont);
//        button.setActionCommand("unqueue");
//        button.addActionListener(menuItemActionListener);
//        actionsPanel.add(button);   
//        
//        button = new JButton();
//        button.setText("Push");
//        button.setFont(buttonFont);
//        button.setActionCommand("push");
//        button.addActionListener(menuItemActionListener);
//        actionsPanel.add(button);   
//        
//        button = new JButton();
//        button.setText("Pop");
//        button.setFont(buttonFont);
//        button.setActionCommand("pop");
//        button.addActionListener(menuItemActionListener);
//        actionsPanel.add(button);   
//        
//        button = new JButton();
//        button.setText("Recorrer pila");
//        button.setFont(buttonFont);
//        button.setActionCommand("recorrerP");
//        button.addActionListener(menuItemActionListener);
//        actionsPanel.add(button);   
//        
//        button = new JButton();
//        button.setText("Recorrer cola");
//        button.setFont(buttonFont);
//        button.setActionCommand("recorrerC");
//        button.addActionListener(menuItemActionListener);
//        actionsPanel.add(button);
//        
//        actionsPanel.setVisible(true);
//        this.add(actionsPanel);
//        
//    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
