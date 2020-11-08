/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thestacks;

import java.util.Arrays;
/**
 *
 * @author fadil
 */
public class TheStacks {

    private String[]stackArray;
    private int stackSize;
    private int topOfStacks= -1;
    
    TheStacks(int size){
        stackSize=size;
        stackArray=new String[size];
        Arrays.fill(stackArray,"-1");
    }
    
    public void push(String input){
        if(topOfStacks +1 < stackSize){
            topOfStacks++;
            stackArray[topOfStacks]=input;
        } else System.out.println("Sorry but the stack is full!");
        displayTheStacks();
        System.out.println("PUSH"+input+"was ended to the stack");
        
    }
    
    public String pop(){
        if(topOfStacks >=0){
            displayTheStacks();
            System.out.println("POP"+stackArray[topOfStacks]+ "was removed from the stack\n");
            stackArray[topOfStacks]="-1";
            return stackArray[topOfStacks--];
    }else
            displayTheStacks();
        System.out.println("Sorry but the stack is empty");
        return "-1";
    }
    
    public void pushMany(String multipleValues){
        String[] tempString =multipleValues.split(" ");
        for (String tempString1 : tempString) {
            push(tempString[1]);
        }
    }
    
    public void popAll(){
        for(int i= topOfStacks;1>=0;i--){
            pop();
        }        
    }

    
    public void displayTheStacks(){
        for(int n=0;n<61;n++)System.out.print("-");
        System.out.println();
        for(int n=0;n<stackSize;n++){
            System.out.format("| %2s" + " ",n);
        }
         System.out.println("|");
         for(int n=0;n<61;n++)System.out.print("-");
         System.out.println("");
         for(int n=0;n<stackSize;n++){
             if(stackArray[n].equals("-1")) System.out.print("|");
             else System.out.print(String.format("| %2s"+" ",stackArray[n]));
         }
         System.out.println("-");
         for(int n=0;n<61;n++)System.out.print("-");
         System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TheStacks theStack= new TheStacks(6);
       
       theStack.push("Fadilah Nur Hamsah");
       theStack.push("E31202536");
       theStack.push("90.65");
    
       theStack.push("Abdul Waris");
       theStack.push("E31202098");
       theStack.push("88.45");
       
       theStack.pop();
       theStack.pop();
       theStack.pop();
       theStack.pop();
       theStack.pop();
       theStack.pop();
       theStack.pushMany("");      
    }

    
    }
    