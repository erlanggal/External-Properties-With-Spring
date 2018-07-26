package springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.controller.FakeDataSourceController;

@SpringBootApplication
public class DemotesterApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemotesterApplication.class, args);

        FakeDataSourceController  fakeDataSourceController = (FakeDataSourceController) ctx.getBean("fakeDataSourceController");
        fakeDataSourceController.printAllInformation();
    }
}
