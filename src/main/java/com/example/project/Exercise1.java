package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            
            if(s == "") {
            	System.out.println("La cadena esta vacia!.");
            	}
            else
            	System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
        char caracteres[] = s.toCharArray();
        
        for(int i=0; i< caracteres.length; i++) {
        	
        	if(caracteres[i] == '(' || caracteres[i] == '[' || caracteres[i] == '{') {
        		stack.push(caracteres[i]);
        	}
        	else if(caracteres[i] == ')' || caracteres[i] == ']' || caracteres[i] == '}') {
        		if(!stack.isEmpty()) {
        			stack.pop();
        			
        		} else {	
        			break;
        		}
        	}	 	
        }
        return stack.isEmpty();
    }
}
