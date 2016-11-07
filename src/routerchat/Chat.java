
package routerchat;

import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class Chat 
{
    public String neighbor;
    public LinkedList<String> chatMessages;
    public boolean unreadMessages;

    public Chat(String neighbor, boolean unreadMessages) 
    {
        this.neighbor = neighbor;
        this.chatMessages = new LinkedList<>();
        this.unreadMessages = unreadMessages;
    }
    
    
    
    
}
