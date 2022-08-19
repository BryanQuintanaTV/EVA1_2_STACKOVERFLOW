/*
 * "EVA1_2_STACKOVERFLOW
 * "Practica 2 "STACKOVERFLOW"
 */

package eva12stackoverflow;

/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA12STACKOVERFLOW {

    public static void main(String[] args) {
        A();
    }
    
    public static void A(){
        B();
    }
    
    public static void B(){
        A();
    }
}