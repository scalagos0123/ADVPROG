package com.heroicduel;
import java.util.*;

public class HeroicDuel {
	@SupressWarnings
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int atk, def, hp, mag, res; 
        String name;
        
        System.out.println("**** HERO DUEL ****");
        
        System.out.println("What is the name of the first hero?");
        name = sc.nextLine();
        
        do {
            System.out.println("ATK of "+ name);
            atk = sc.nextInt();
            
            if (atk < 0 || atk > 11) {
                System.out.println("Invalid ATK. ATK must be from 1 to 10 only.");
            }
        
        } while(atk < 0 || atk > 11 );
        
        do { 
            System.out.println("DEF of "+ name);
            def = sc.nextInt();
            
            if (def < -1 || def > 11) {
                System.out.println("Invalid DEF. DEF must be from 0 to 10 only.");
            }
            
        } while(def < -1 && def > 11); 
        
        do {
            
            System.out.println("HP of "+ name);
            hp = sc.nextInt();
            
            if (hp % 100 != 0 && hp < 100 || hp > 2000) {
                System.out.println("Invalid HP. It must be divisible by 100.");
            }
        
        } while (hp % 100 != 0 && hp < 100 || hp > 2000);
        
        do { 
            System.out.println("MAG of "+ name);
            mag = sc.nextInt();
            
            if (mag < 0 || mag > 11) {
                System.out.println("Invalid MAG. MAG must be from 1 to 10 only.");
            }
            
        } while(mag < 0 && mag > 11);
        
        do { 
            System.out.println("RES of "+ name);
            res = sc.nextInt();
            
            if (res < -1 || res > 11) {
                System.out.println("Invalid MAG. MAG must be from 0 to 10 only.");
            }
            
        } while(res < -1 && res > 11);
        
        Hero h1 = new Hero(name, atk, def, hp, mag, res);
        
        System.out.println("What is the name of the 2nd hero?");
        name = sc.next();
        
        do {
            System.out.println("ATK of "+ name);
            atk = sc.nextInt();
            
            if (atk < 1 || atk > 10) {
                System.out.println("Invalid ATK. ATK must be from 1 to 10 only.");
            }
        
        } while(atk < 1 || atk > 10 );
        
        do { 
            System.out.println("DEF of "+ name);
            def = sc.nextInt();
            
            if (def < 0 || def > 10) {
                System.out.println("Invalid DEF. DEF must be from 0 to 10 only.");
            }
            
        } while(def <= 0 || def >= 10); 
        
        do {
            
        System.out.println("HP of "+ name);
        hp = sc.nextInt();
        
        if (hp % 100 != 0 || hp < 100 || hp > 2000) {
            System.out.println("Invalid HP. It must be divisible by 100.");
        }
        
        } while (hp % 100 != 0 && hp < 100 || hp > 2000); 
        
        do { 
            System.out.println("MAG of "+ name);
            mag = sc.nextInt();
            
            if (mag < 0 || mag > 11) {
                System.out.println("Invalid MAG. MAG must be from 1 to 10 only.");
            }
            
        } while(mag < 0 && mag > 11);
        
        do { 
            System.out.println("RES of "+ name);
            res = sc.nextInt();
            
            if (res < -1 || res > 11) {
                System.out.println("Invalid MAG. MAG must be from 0 to 10 only.");
            }
            
        } while(res < -1 && res > 11);

        Hero h2 = new Hero(name, atk, def, hp, mag, res);
        
        System.out.println("-- Duel Start! --");
        while (h1.getHp() > 0 && h2.getHp() > 0) {
            
            int damage = h1.attack(h2);
            int spelldam = h1.spell(h2);
            System.out.println(h1.getName() + " attacks " + h2.getName() + " for " + damage + " damage! ");
            System.out.println(h1.getName() + " casted a spell to " + h2.getName() + " for " + spelldam + " damage! ");
            System.out.println(h2.getName() + " has " + h2.getHp() + " HP left. ");
            
            damage = h2.attack(h1);
            spelldam = h2.spell(h1);
            System.out.println(h2.getName() + " attacks " + h1.getName() + " for " + damage + " damage! ");
            System.out.println(h2.getName() + " casted a spell to " + h1.getName() + " for " + spelldam + " damage! ");
            System.out.println(h1.getName() + " has " + h1.getHp() + " HP left. ");
        }
        
        if (h1.getHp() <= 0) {
            System.out.println();
            System.out.println(h2.getName() + " wins! ");
            System.out.println();
            System.out.println("-- Duel end --");
        } else {
            System.out.println();
            System.out.println(h1.getName() + " wins! ");
            System.out.println();
            System.out.println("-- Duel end --");
        }
        
    }
}