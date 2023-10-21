package com.mycompany.mine_log;

import java.time.LocalDate;

public class Person {
   protected String Name;
   protected String Last_Name;
   protected int Document;
   LocalDate date;
   protected int Entry_Time, Departure_Time;
  
   protected String Post;

    public Person() {
        this.Name = Name;
        this.Last_Name = Last_Name;
        this.Document = Document;
        this.Entry_Time = Entry_Time;
        this.Departure_Time = Departure_Time;
    }

    public Person(String Post) {
        this.Post = Post;
    }
    
    
    
    public String getName() {
        return Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public int getDocument() {
        return Document;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getEntry_Time() {
        return Entry_Time;
    }

    public int getDeparture_Time() {
        return Departure_Time;
    
    }

    public String getPost() {
        return Post;
    }
   
    public void Journeys(int Entry_Time, int Departure_Time) {
    int Time_Worked = Departure_Time - Entry_Time;
    int Time_Left = 8 - Time_Worked;
    if(Time_Left < 8 && Time_Left > 1 ){
        System.out.println("you are missing " + Time_Left + " hours.");
    } 
    else{
        System.out.println("End of day");
        this.Entry_Time = Entry_Time;
        this.Departure_Time = Departure_Time;   
        }
    date = LocalDate.now();
        System.out.println(date);
    }
    public void Temporary_License(int days){
        if(days >= 1 && days <=4){
            System.out.println("You've taken " + days + " temporary leave days. ");
        }
        else {
            System.out.println("You can't take more than four days, request a vacation..");
        }
    }
    
    public void Maternity_Leave(int days){
        
        if(days >= 1 && days <=180){
            System.out.println("You've taken " + days + " days of your maternity leave." );
        }
        else {
            System.out.println("You can't take more than one hundred and eighty days.");
        }
    }
    public void Paternity_Leave(int days){
        if(days >= 1 && days <= 15){
            System.out.println("You've taken " + days + "days of your paternity leave.");
        }
        else {
            System.out.println("You can't take more than fifteen days.");
        }  
    }
    public void Inability(int days){
        if( days >= 1 &&  days <= 20){
            System.out.println("You've taken" + days + " Days of disability.");
        }
        else {
            System.out.println("You cannot take more than twenty days of disability.");
        }   
    }
    public void Vacation(int days){
        if(days >= 1 && days <= 15){
            System.out.println("You've taken " + days + " Holidays.");
        }
        else {
            System.out.println("You cannot take more than fifteen days of vacation.");
        }   
    }
    public void Permissions(int hours){
        if(hours >= 1 && hours <= 5){
            System.out.println("You've taken " + hours + " leave hours.");
        }
        else {
            System.out.println("You are advised to take a vacation day or temporary leave.");
        }   
    }
    
    public String Show_Data(){
        return "Post: " + Post;
        }
    }
