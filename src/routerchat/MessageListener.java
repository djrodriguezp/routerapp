/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class MessageListener implements Runnable
{
    private BufferedReader in;
    private String ip;
    private ServerSocket sSocket;
    private int port;
    private RouterChatGUI rgui;
    
    public MessageListener(String ip, int port, RouterChatGUI rgui) throws IOException
    {
        this.ip = ip;
        this.port = port;
        this.sSocket = new ServerSocket();
        this.sSocket.bind(new InetSocketAddress(this.ip,this.port));
        this.rgui = rgui;
    }

    @Override
    public void run()
    {
        Socket cSocket;
        try
        {
            String receivedMsg = "";
            String from = "";
            String line = "";
            while(true)
            {
                receivedMsg = "";
                from = "";
                cSocket = this.sSocket.accept();
                in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
                while((line = in.readLine()) != null)
                {
                    if(line.startsWith("From:") && from.equals(""))
                    {
                        from = line.replace("From:", "");
                    }
                    else
                    {
                        receivedMsg += line;
                    }
                }
                RouterChatGUI.processNewMessage(from,receivedMsg,this.rgui);
                cSocket.close();
            }
        } catch (IOException ex)
        {
            System.out.println("Error recibiendo mensaje");
        }
       
    }
    
}
