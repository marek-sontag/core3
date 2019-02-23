package pl.sda.spring.core.zad3.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GarageService {

    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    @Autowired
    public void setWorker(@Qualifier("mechanic") Worker worker) {
        this.worker = worker;
    }
}
