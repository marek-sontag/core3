package pl.sda.spring.core.zad3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.spring.core.zad3.objects.*;

import java.util.logging.Logger;

public class Application {

    private static final Logger LOG = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationConfig.class);

        LOG.info("====================================");

        GarageService service = (GarageService) context.getBean("garageService");

        LOG.info(service.getWorker().toString());

        WorkerMotto motto = context.getBean(WorkerMotto.class);
        LOG.info(motto.getCitate());

        Worker defaultWorker = context.getBean("worker", Worker.class);

        LOG.info("Tools count: " + context.getBeansOfType(Tool.class).size());
        LOG.info("Worker count: " + context.getBeansOfType(Worker.class).size());
        LOG.info("Motto count: " + context.getBeansOfType(WorkerMotto.class).size());

//        /* XML VERSION */
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        WorkerMotto motto = (WorkerMotto) context.getBean("wiseMotto");
//        Tool hummer = (Tool) context.getBean("hummer");
//        Tool hummer1 = (Tool) context.getBean("hummer");
//        Tool hummer2 = (Tool) context.getBean("hummer");
//        Worker worker = (Worker) context.getBean("worker");
//
//        LOG.info(motto.getCitate());
//        LOG.info(hummer);
//        LOG.info(hummer1);
//        LOG.info(hummer2);
//        LOG.info(worker);
    }
}
