import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class NewJFrame extends javax.swing.JFrame {
        private String whoseturn="X";
        private String playerturn;
        private String playerone;
        private String playertwo;
        private int playeronecount=0;
        private int playertwocount=0;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(348,348);
        setVisible(true);
        takenames();
        setScore();
    }
    
    private void play()
    {
        if(whoseturn.equalsIgnoreCase("X"))
        playerturn=playerone;
    else
        playerturn=playertwo;
        
    }
    
    private void setScore()
    {   
        jscore.setText(playerone+":Score is "+playeronecount+"\t\t"+playerturn+"'s move\t\t"+playertwo+":Score is "+playertwocount);
       
        
    }
    private void takenames()
    {
        playerone=JOptionPane.showInputDialog(this,"Player One name:","Names of the players",JOptionPane.INFORMATION_MESSAGE);
        playertwo=JOptionPane.showInputDialog(this,"Player Two name:","Names of the players",JOptionPane.INFORMATION_MESSAGE);
        playerturn=playerone;
        
    }
    private void changeWhoseTurn()
    {
        if(whoseturn.equalsIgnoreCase("X"))
            whoseturn="O";
        else
            whoseturn="X";     
    }
    private void xWins()
    {
        JOptionPane.showMessageDialog(this,playerone+" Wins","Winner", JOptionPane.INFORMATION_MESSAGE); playeronecount++; resetGame();
        setScore();
    }
     private void oWins()
    {
        JOptionPane.showMessageDialog(this,playertwo+" Wins","Winner", JOptionPane.INFORMATION_MESSAGE);
        playertwocount++;
        resetGame(); setScore();
        
        
    }
     private void checkifTie()
     { 
          String one1=jButton2.getText();
        String two1=jButton3.getText();
        String three1=jButton4.getText();
        String four1=jButton5.getText();
        String five1=jButton6.getText();
        String six1=jButton7.getText();
        String seven1=jButton8.getText();
        String eight1=jButton9.getText();
        String nine1=jButton10.getText(); 
        if(one1!=""&&two1!=""&&three1!=""&&four1!=""&&five1!=""&&six1!=""&&seven1!=""&&eight1!=""&&nine1!="")
        { JOptionPane.showMessageDialog(this,"Game is a Tie!","Tie Game", JOptionPane.INFORMATION_MESSAGE);resetGame();}
        
         
     }
    private void checkWhoWins()
    {
        String one=jButton2.getText();
        String two=jButton3.getText();
        String three=jButton4.getText();
        String four=jButton5.getText();
        String five=jButton6.getText();
        String six=jButton7.getText();
        String seven=jButton8.getText();
        String eight=jButton9.getText();
        String nine=jButton10.getText();
        if(one=="X"&&two=="X"&&three=="X")
            xWins();
        if(four=="X"&&five=="X"&&six=="X")
            xWins();
        if(seven=="X"&&eight=="X"&&nine=="X")
            xWins();
        if(one=="X"&&four=="X"&&seven=="X")
            xWins();
        if(two=="X"&&five=="X"&&eight=="X")
            xWins();
        if(three=="X"&&six=="X"&&nine=="X")
            xWins();
        if(one=="X"&&five=="X"&&nine=="X")
            xWins();
        if(three=="X"&&five=="X"&&seven=="X")
            xWins();
        //if O wins
        if(one=="O"&&two=="O"&&three=="O")
            oWins();
        if(four=="O"&&five=="O"&&six=="O")
            oWins();
        if(seven=="O"&&eight=="O"&&nine=="O")
            oWins();
        if(one=="O"&&four=="O"&&seven=="O")
            oWins();
        if(two=="O"&&five=="O"&&eight=="O")
            oWins();
        if(three=="O"&&six=="O"&&nine=="O")
            oWins();
        if(one=="O"&&five=="O"&&nine=="O")
            oWins();
        if(three==""&&five=="O"&&seven=="O")
            oWins();
    
    }
private void resetGame()
{
    jButton2.setText("");
    jButton3.setText("");
    jButton4.setText("");
    jButton5.setText("");
    jButton6.setText("");
    jButton7.setText("");
    jButton8.setText("");
    jButton9.setText("");
    jButton10.setText("");  
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jp2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jp3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jp4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jp5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jp6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jp7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jp8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jp9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jscore = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(378, 378));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp1.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jp1.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp2.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jp2.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp3.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jp3.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp3);

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp4.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jp4.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp4);

        jp5.setBackground(new java.awt.Color(255, 255, 255));
        jp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp5.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jp5.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp5);

        jp6.setBackground(new java.awt.Color(255, 255, 255));
        jp6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp6.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jp6.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp6);

        jp7.setBackground(new java.awt.Color(255, 255, 255));
        jp7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp7.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jp7.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp7);

        jp8.setBackground(new java.awt.Color(255, 255, 255));
        jp8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp8.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jp8.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp8);

        jp9.setBackground(new java.awt.Color(255, 255, 255));
        jp9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp9.setLayout(new java.awt.BorderLayout());

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font(".SF NS Text", 1, 70)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jp9.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jp9);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 350, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        jscore.setBackground(new java.awt.Color(255, 255, 255));
        jscore.setText("scores of players");
        getContentPane().add(jscore);
        jscore.setBounds(0, 300, 348, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(whoseturn);
        if(whoseturn.equalsIgnoreCase("X"))
            jButton2.setForeground(Color.RED);
        else
            jButton2.setForeground(Color.BLACK);
        changeWhoseTurn();
        play();setScore();
        checkWhoWins();
        checkifTie();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton3.setForeground(Color.RED);
        else
            jButton3.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton4.setForeground(Color.RED);
        else
            jButton4.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton5.setForeground(Color.RED);
        else
            jButton5.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton6.setForeground(Color.RED);
        else
            jButton6.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton7.setForeground(Color.RED);
        else
            jButton7.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton8.setForeground(Color.RED);
        else
            jButton8.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton9.setForeground(Color.RED);
        else
            jButton9.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setText(whoseturn);
         if(whoseturn.equalsIgnoreCase("X"))
            jButton10.setForeground(Color.RED);
        else
            jButton10.setForeground(Color.BLACK);
        changeWhoseTurn();play();setScore();checkWhoWins(); checkifTie();
        //tieGame();
    }//GEN-LAST:event_jButton10ActionPerformed

    
     
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel jp5;
    private javax.swing.JPanel jp6;
    private javax.swing.JPanel jp7;
    private javax.swing.JPanel jp8;
    private javax.swing.JPanel jp9;
    private javax.swing.JLabel jscore;
    // End of variables declaration//GEN-END:variables

}