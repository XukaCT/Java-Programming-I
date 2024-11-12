/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sangn
 */
import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> stack;
    
    public MessagingService(){
        this.stack = new ArrayList();
    }
    
    public void add(Message message){
        
        int b = message.getContent().length();
        if(b<=280){
            this.stack.add(message);
        }
    }
    public ArrayList<Message> getMessages(){        
        for(int i=0; i<stack.size();i++){
            System.out.println(stack);
        }
        return stack;
    }
}
