/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Fadil
 */
public class CobaStackStatis {
    public static void main(String[] args){
        Stack S = new Stack();
        
        S.createEmpty();
        S.printStack();
        
        System.out.println("=================================");
        
        S.push("E31202536", "Fadil", 90.43 );
        S.push("E31201951", "Mashita", 99.23 );
        S.push("E31202278", "Chaidar", 90.55);
        
        S.printStack();

        
        System.out.println("=================================");
        
        S.pop();
        S.pop();
        S.pop();
        S.printStack();

        
        System.out.println("=================================");
        
    }
}
