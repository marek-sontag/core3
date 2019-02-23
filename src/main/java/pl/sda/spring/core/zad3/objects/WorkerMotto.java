package pl.sda.spring.core.zad3.objects;

import org.springframework.stereotype.Component;

@Component("wiseMotto")
public class WorkerMotto {

    private String citate;

    public WorkerMotto() {
        citate = "Ciężką pracą ludzie się bogacą";
    }

    public WorkerMotto(String citate) {
        this.citate = citate;
    }

    public String getCitate() {
        return citate;
    }

    public void setCitate(String citate) {
        this.citate = citate;
    }

    @Override
    public String toString() {
        return "WorkerMotto{" +
                "citate='" + citate + '\'' +
                '}';
    }
}
