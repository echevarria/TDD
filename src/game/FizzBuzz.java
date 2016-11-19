/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Avell B155 MAX
 */
public class FizzBuzz {
    
    public String fizzbuzz (int numero) throws Exception {
        
        if (numero <= 0) {
            throw new Exception();
        } else if (numero % 3 == 0 && numero % 5 == 0) {
            return "fizz buzz";
        } else if (numero % 3 == 0) {
            return "fizz";
        } else if (numero % 5 == 0) {
            return "buzz";
        } else {
            return "" + numero;
        }
        
        
    }
    
}
