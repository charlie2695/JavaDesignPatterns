/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator;

/**
 *
 * @author Binod
 */
public abstract class User {
    protected Mediator mediator;
    protected ArrayList<String> message_box;
    protected String name;
     
    public User(Mediator mediator, String name){
        this.mediator=mediator;
        this.name=name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
