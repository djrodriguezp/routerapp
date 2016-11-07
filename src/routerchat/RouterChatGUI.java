/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerchat;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author daniel
 */
public class RouterChatGUI extends javax.swing.JFrame {

    /**
     * Creates new form RouterChatGUI
     */
    public RouterChatGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCurrChats = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnNewChat = new javax.swing.JButton();
        btnDelChat = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMessages = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        lstCurrChats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCurrChats.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                lstCurrChatsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCurrChats);

        txtMessage.setColumns(20);
        txtMessage.setRows(3);
        jScrollPane3.setViewportView(txtMessage);

        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSendActionPerformed(evt);
            }
        });

        btnNewChat.setText("+");
        btnNewChat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNewChatActionPerformed(evt);
            }
        });

        btnDelChat.setText("-");
        btnDelChat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDelChatActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        lblError.setForeground(new java.awt.Color(201, 1, 1));
        lblError.setText("error");
        lblError.setAlignmentY(0.1F);

        jLabel1.setText("Router:");

        jLabel2.setText("IP:");

        txtMessages.setEditable(false);
        txtMessages.setContentType("text/html"); // NOI18N
        jScrollPane4.setViewportView(txtMessages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnNewChat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelChat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNewChat)
                            .addComponent(btnDelChat))))
                .addGap(3, 3, 3)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       /* int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Está seguro que desea salir?","Cerrando Aplicación",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            dialogButton = JOptionPane.YES_NO_OPTION;
            dialogResult = JOptionPane.showConfirmDialog (null, "¿SEGUROOOOOOOOOOOO?","Cerrando Aplicación",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
              System.exit(0);
            }
        }
        */
       System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void sendMessage(String from, Chat selectedChat, String messageBody)
    {
        try
        {
            String message = "From:"+from+"\nTo:"+selectedChat.neighbor+"\nMsg:"+messageBody+"\nEOF";
            Socket clientSocket = new Socket(this.myRouterIP, 1981);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            outToServer.write(message.getBytes());
            clientSocket.close();
            selectedChat.chatMessages.add(newMessage(sayMyName,messageBody));
            this.refreshMessages(selectedChat.chatMessages);
            this.lblError.setText("");
            this.txtMessage.setText("");
        }
        catch(Exception e)
        {
            this.lblError.setText("Ha ocurrido un error enviando mensaje: "+e.getMessage());
        }

    }
    
    private void refreshMessages(LinkedList<String> chatMessages)
    {
        txtMessages.setText("");
        StringBuilder msg = new StringBuilder();
        for (String cm : chatMessages)
        {
            msg = msg.append(cm);
        }
        txtMessages.setText(msg.toString());
        //txtMessages.setCaretPosition(txtMessages.getText().length());
    }
    
    private int findChatIndex(String neighbor)
    {
        for(int i = 0; i < chatModel.size(); i++)
        {
            if(chatModel.get(i) != null && neighbor.equals(chatModel.get(i).neighbor))
                return i;
        }
        return -1;
    }
    
    private static String getCurrDateTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    private static String newMessage(String from, String message)
    {
        message = message.replace("\n", "<br>");
        String fromClass = (from.equals(sayMyName)) ? "me" : "contact";
        String htmlMsg = "<span class='"+fromClass+"'>Router "+from+"</span>";
        htmlMsg += "<span class='"+fromClass+"date'> ["+getCurrDateTime()+"]: </span>";
        htmlMsg += message+"<br><br>";
        return htmlMsg;
    }
    
    public static void processNewMessage(String from, String receivedMsg,RouterChatGUI rgui)
    {
        synchronized(RouterChatGUI.chatsLock)
        {
            int neighborIndex = rgui.addNewChat(from);
            Chat chat = rgui.chatModel.get(neighborIndex);
            if(chat != null)
            {
                chat.chatMessages.add(newMessage(chat.neighbor,receivedMsg));
            }
            
            if(rgui.lstCurrChats.getSelectedIndex() == neighborIndex)
            {
                rgui.refreshMessages(chat.chatMessages);
            }
            else
            {
                chat.unreadMessages = true;
            }
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtMessages.setEditorKit(this.kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color: #222; font-family:times; margin: 0; padding:0 }");
        styleSheet.addRule(".medate, .contactdate {font-size: 8px;}");
        styleSheet.addRule(".me, .medate {color: blue;}");
        styleSheet.addRule(".contact, .contactdate {color: green;}");

        try
        {
            this.messageListener = new Thread(new MessageListener(this.myRouterIP,this.listenerPort,this));
            this.messageListener.start();
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this,"No ha sido posible hacer bind en la ip "+this.myRouterIP+":"+this.listenerPort,"",JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }

        this.lblError.setText("");
        this.chatModel.addElement(new Chat("B",false));
        this.chatModel.get(0).chatMessages.add(newMessage("B","hola que tal"));
        this.lstCurrChats.setModel(chatModel);
        this.lstCurrChats.setCellRenderer(new ChatCellRender());
    }//GEN-LAST:event_formWindowOpened

    
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        this.lblError.setText("");
        System.out.println(txtMessage.getText());
        Chat selectedChat = null;
        synchronized(RouterChatGUI.chatsLock)
        {
            selectedChat = lstCurrChats.getSelectedValue();
        }
        if(selectedChat != null)
        {
            String message = txtMessage.getText();
            this.sendMessage(sayMyName,selectedChat,message);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar un destinatario","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnDelChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelChatActionPerformed
        Chat currChat = null;
        synchronized(RouterChatGUI.chatsLock)
        {
            currChat = this.lstCurrChats.getSelectedValue();
        }
        if(currChat != null)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "¿Está seguro que desea eliminar el chat con el Router "+currChat.neighbor+"?","Eliminar Chat",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                synchronized(RouterChatGUI.chatsLock)
                {
                    chatModel.remove(lstCurrChats.getSelectedIndex());
                    txtMessages.setText("");
                }
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this,"Debe seleccionar el chat que desea eliminar","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDelChatActionPerformed

    private void btnNewChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewChatActionPerformed
        String newNeighbor = JOptionPane.showInputDialog("Ingrese el nombre del router al que desea enviarle el mensaje: ");
        if(newNeighbor != null)
        {
            synchronized(RouterChatGUI.chatsLock)
            {
                int neighborIndex = addNewChat(newNeighbor);
                this.lstCurrChats.setSelectedIndex(neighborIndex);
            }
        }
    }//GEN-LAST:event_btnNewChatActionPerformed

    private int addNewChat(String newNeighbor)
    {
        int neighborIndex = findChatIndex(newNeighbor);
        if (neighborIndex == -1)
        {
            chatModel.addElement(new Chat(newNeighbor,false));
            neighborIndex = chatModel.size() - 1;
        }
        return neighborIndex;
    }
    
    private void lstCurrChatsValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_lstCurrChatsValueChanged
    {//GEN-HEADEREND:event_lstCurrChatsValueChanged
        Chat selectedChat = null;
        synchronized(RouterChatGUI.chatsLock)
        {
            selectedChat = lstCurrChats.getSelectedValue();
        }
        if (selectedChat != null)
        {
            selectedChat.unreadMessages = false;
            this.refreshMessages(selectedChat.chatMessages);
        }
    }//GEN-LAST:event_lstCurrChatsValueChanged

    private static class ChatCellRender extends DefaultListCellRenderer 
    {
        public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) 
        {
            Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
            if (value instanceof Chat) 
            {
                Chat chat = (Chat) value;
                setText("Router "+chat.neighbor);
                if (chat.unreadMessages) 
                {
                     setBackground(Color.LIGHT_GRAY);
                } 
                if (isSelected) 
                {
                    //float[] hsv = new float[3];
                    //Color.RGBtoHSB(0,102,230,hsv);
                    setBackground(Color.getHSBColor((float)0.59, (float)1, (float)0.94));
                    setForeground(Color.WHITE);
                }
            } 
            else 
            {
               setText("chat no valido");
            }
            return c;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouterChatGUI().setVisible(true);
            }
        });
    }

    private HTMLEditorKit kit = new HTMLEditorKit();
    private Thread messageListener = null;
    private int listenerPort = 1982;
    private static String sayMyName = "A";
    private String myRouterIP = "172.16.110.1";
    public static final Object chatsLock = new Object();
    public DefaultListModel<Chat> chatModel = new DefaultListModel<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelChat;
    private javax.swing.JButton btnNewChat;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblError;
    private javax.swing.JList<routerchat.Chat> lstCurrChats;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JEditorPane txtMessages;
    // End of variables declaration//GEN-END:variables
}
