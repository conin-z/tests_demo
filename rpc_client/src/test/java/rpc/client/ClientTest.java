package rpc.client;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rpc.service.ServiceList;
import rpc.service.ServiceString;
import rpc.service.ServiceArray;


public class ClientTest {

    @Test
    public void testRpc() throws InterruptedException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);

        for (int t = 0; t < 2; t++) {
            new Thread(() -> {
                ServiceString serviceString = (ServiceString)context.getBean("serviceString");
                ServiceArray serviceArray = (ServiceArray)context.getBean("serviceArray");
                for (int i = 0; i < 50000; i++) {
                    serviceString.test();
                    serviceArray.testArray(i % 3 + 1);
                }
            }).start();
        }

        ServiceList serviceList = context.getBean(ServiceList.class);
        ServiceArray serviceArray = (ServiceArray)context.getBean("serviceArray");
        for (int i = 0; i < 50000; i++) {
            serviceList.testList(i % 4 + 1);
            serviceArray.testArray(i % 3 + 1);
        }
    }

}
