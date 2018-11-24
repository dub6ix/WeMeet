/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupem;

import static groupem.GroupEm.hp;
import static groupem.GroupEm.pan;
import static groupem.GroupEm.passwords;
import static groupem.GroupEm.userPass;
import static groupem.GroupEm.userUsername;
import static groupem.GroupEm.usernames;
import static groupem.GroupEm.loggedIn;
import static groupem.GroupEm.eventss;
import static groupem.GroupEm.getUserIndex;
import static groupem.GroupEm.updateUserEvents;
import static groupem.GroupEm.userEventNames;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author walter
 */


public class Login extends javax.swing.JDialog {

//    ArrayList<String> usernames = new ArrayList<>();
//    ArrayList<String> passwords = new ArrayList<>();
//    String userPass;
//    String userUsername;
    java.awt.Frame p;
    
    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        p = parent;
        //this.passwords = new ArrayList();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signinButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        invalid_text = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 191, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GroupEm");

        usernameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFocusLost(evt);
            }
        });
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        jLabel2.setText("username");

        jLabel3.setText("password");

        signinButton.setText("sign in");
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        signupButton.setText("sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        invalid_text.setForeground(new java.awt.Color(225, 0, 0));
        invalid_text.setText("             ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signinButton))
                    .addComponent(invalid_text)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(invalid_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signinButton)
                    .addComponent(signupButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTextActionPerformed

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        // TODO add your handling code here:
        userUsername = usernameText.getText();
        userPass = passwordText.getText();
        //userPass = passwordText.getPassword();
        //userPass = passwordText.getp
        
        
        boolean isUser = usernames.contains(userUsername);
        if (userUsername.equalsIgnoreCase("") && userPass.equalsIgnoreCase(""))
            invalid_text.setText("Please Enter Your Username and Password");
        else if (userUsername.equalsIgnoreCase(""))
            invalid_text.setText("Please Enter Your Username");
        else if (userPass.equalsIgnoreCase(""))
            invalid_text.setText("Please Enter Your Password");
        else if(!isUser)
            invalid_text.setText("Incorrect Username or Password");
      
        int userIndex = getUserIndex(userUsername);
        System.out.println("INDEX: "+ userIndex);
        boolean correctPassword = passwords.get(userIndex).equals(userPass);
        if(userPass.contentEquals("")){
            invalid_text.setText("Hello, " + userUsername + ". Please enter your password");
            return;
        }
        if(!correctPassword) {
            invalid_text.setText("Incorrect Username or Password");
            return;
        }
        
        System.out.println("Username and Password Verified");
        loggedIn = true;
        updateUserEvents(userUsername);
        setVisible(false);
        HomePage hp4 = new HomePage();
        hp4.setVisible(loggedIn);
        
        //hp.setVisible(loggedIn);
        
        
        
    }//GEN-LAST:event_signinButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        //System.out.println(pass_text_entered);
        
        userUsername = usernameText.getText();
        userPass = passwordText.getText();
        
        boolean isUser = usernames.contains(userUsername);
        if (userUsername.equalsIgnoreCase("") && userPass.equalsIgnoreCase("")){
            invalid_text.setText("You must enter a username and password");
        }
        else if(userUsername.equalsIgnoreCase("")){
            invalid_text.setText("You must enter a username");
        }
        else if(userPass.equalsIgnoreCase("")){
            invalid_text.setText("You must enter a password");
        }
        else if(isUser) {
            invalid_text.setText("Username already exists");
        } else {
            usernames.add(userUsername);
            passwords.add(userPass);
            
            
            updateUserEvents(userUsername);
            System.out.println("username: " + userUsername);
            System.out.println("yo: " + Arrays.toString(userEventNames));
            loggedIn = true;
            setVisible(false);
            HomePage hp3 = new HomePage();
            hp3.setVisible(loggedIn);
            //hp.setVisible(loggedIn);
        }
        System.out.println("usernames: " + usernames.toString());
        System.out.println("passwords: " + passwords.toString());
        
//        String[] test = new String[0];
//        Home.main(test);
        
        
        
    }//GEN-LAST:event_signupButtonActionPerformed

    private void usernameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTextFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invalid_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
