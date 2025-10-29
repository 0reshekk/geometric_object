package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated = new Date();

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "создан " + dateCreated + "\nцвет: " + color +
                " и заливка: " + filled;
    }
}