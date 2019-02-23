package pl.sda.spring.core.zad3.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Worker {

    private String proffession;
    private int age;

    private List<Tool> tools;

    @Autowired
    private WorkerMotto motto;

    public Worker() {
        this.proffession = "builder";
    }

    public Worker(String proffession, int age, List<Tool> tools, WorkerMotto motto) {
        this.proffession = proffession;
        this.age = age;
        this.tools = tools;
        this.motto = motto;
    }

    public WorkerMotto getMotto() {
        return motto;
    }

    @Autowired
    public void setMotto(WorkerMotto motto) {
        this.motto = motto;
    }

    public String getProffession() {
        return proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Tool> getTools() {
        return tools;
    }

    @Autowired
    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public void addDefaultTool() {
        tools.add(new Tool(1, proffession + "-tool"));
    }

    @Override
    public String toString() {
        return "Worker{" +
                "proffession='" + proffession + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                ", motto=" + motto +
                '}';
    }
}
