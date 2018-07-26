package springframework.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springframework.service.FakeDataSource;

@Controller
public class FakeDataSourceController {
    private FakeDataSource fakeDataSource;

    public FakeDataSourceController(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    public void printAllInformation()
    {
        String result = this.fakeDataSource.getUsername() + "\n" + this.fakeDataSource.getPassword();
        System.out.println(result);
    }
}
