/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trazo_linea.Dibujo;

import java.awt.Graphics;

/**
 *
 * @author elnin
 */
public class Trazo {
    public static void linea( Graphics trazo, int x1, int y1, int x2, int y2)
    {
        trazo.drawLine(x1,y1,x2,y2);
    };
    
}
