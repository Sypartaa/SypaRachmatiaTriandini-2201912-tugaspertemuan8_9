/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package no1;

/**
 *
 * @author ASUS
 */
public class ObjekGeometris {
    private String color;
    private boolean filled;

    public ObjekGeometris() {
        this.color = "white";
        this.filled = false;
    }

    public ObjekGeometris(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}