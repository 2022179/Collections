/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

/**
 *
 * @author Primm
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // this is the enhanced loop, the one that doesnt allow change 
        Rectangle []rectangles = {new Rectangle (2,3), new Rectangle (4,1)};
        for (int rectangle  = 0; rectangle < rectangles.length; rectangle ++){
            System.out.println(rectangles[rectangle].length);
        }
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle.width);
        }
        
    }

}
