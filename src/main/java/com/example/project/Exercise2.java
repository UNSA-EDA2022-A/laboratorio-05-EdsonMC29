package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        char caracteres[] = str.toCharArray();
        int countChar = 0;
        int countOper = 0;
		for(int i=0; i< caracteres.length; i++) {
		        	
		        	if(caracteres[i] == '(') {
		        		stack.push('(');
		        		countChar++;
		        	}
		        	else if(caracteres[i] == ')') {
		        		if(!stack.isEmpty()) {
		        			stack.pop();
		        			countChar++;
		        		} else {
		        			countChar++;
		        			break;
		        		}
		        	}
		        	else {
		        		countOper++;
		        	}	        	
		        }
		if(countChar - countOper <= 1 )
			return false;
		else 
			return true;
    }
}
