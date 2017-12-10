import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ChatWindow extends javax.swing.JFrame {

    private ClientProc cp;
    private String name;
    private String recipient;
    private String host;
    
    /** Creates new form Form */
    public ChatWindow(){
        initComponents();
    }
    public ChatWindow(ClientProc cp, String name, String recipient, String host) {
        
        this();
        this.name = name;
        this.recipient = recipient;
        this.host = host;
        this.cp = cp;
                
        this.setTitle(this.recipient + " Mesaj Penceresi");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_AllMessages = new javax.swing.JTextArea();
        jButton_SendMessage = new javax.swing.JButton();
        jTextField_Message = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTextArea_AllMessages.setColumns(20);
        jTextArea_AllMessages.setEditable(false);
        jTextArea_AllMessages.setRows(5);
        jScrollPane1.setViewportView(jTextArea_AllMessages);

        jButton_SendMessage.setText("Yolla");
        jButton_SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SendMessageActionPerformed(evt);
            }
        });

        jTextField_Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_Message, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SendMessage)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SendMessage))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SendMessageActionPerformed
        /*
        if(cp == null){
            cp = new ClientProc(this, this.host);
        }

         * 
         */
        cp.sendMessage(this.jTextField_Message.getText());
        jTextArea_AllMessages.append(name + ": " +this.jTextField_Message.getText() + "\n");
        
        jTextField_Message.setText(null);
    }//GEN-LAST:event_jButton_SendMessageActionPerformed

    private void jTextField_MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MessageActionPerformed
        
        jButton_SendMessageActionPerformed(evt);
    }//GEN-LAST:event_jTextField_MessageActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        
    }//GEN-LAST:event_formWindowClosed

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SendMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_AllMessages;
    private javax.swing.JTextField jTextField_Message;
    // End of variables declaration//GEN-END:variables

    
    public JTextArea getAllMessages(){
        return jTextArea_AllMessages;
    }
    public String getName(){
        return this.name;
    }
    public String getRecipient(){
        return this.recipient;
    }

    public String getHost(){
        return this.host;
    }

}
