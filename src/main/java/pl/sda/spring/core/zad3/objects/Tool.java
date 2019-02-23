package pl.sda.spring.core.zad3.objects;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Tool implements InitializingBean {

    private int weight;
    private String name;

    public Tool() {
        this.weight = 1;
        this.name = "Just a tool";
    }

    public Tool(int weight, String name) {
        this.weight = weight;
        this.name = name + (int) (Math.random() * 100);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Tools after properties set");
    }
}
