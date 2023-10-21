package com.mycompany.mine_log;

public class Worker extends Person{
    protected int Extra_Hours;

    public Worker(int Extra_Hours, String Post) {
        super(Post);
        this.Extra_Hours = Extra_Hours;
        
    }

    public int getExtra_Hours() {
        return Extra_Hours;
    }
   
    @Override
    public String Show_Data(){
        return "Post: " + Post+ 
                "\nExtra hours: " + Extra_Hours;
    
        
        }
    }
    
        

