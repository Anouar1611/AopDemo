package Mypackage;

import org.springframework.stereotype.Component;

@Component
public class Triangle {

    private String name="triangle";
    @Loggable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
