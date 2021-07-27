package rpc.server;

import com.rpc.provider.ServerRpcConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rpc.service.ServiceString;
import rpc.service.ServiceArray;

import java.util.Arrays;

/**
 * @user KyZhang
 * @date
 */
public class ServerTest {
    @Test
    public void testRpc() throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerConfig.class);
        context.registerShutdownHook();
        ServerRpcConfig serverConfig = context.getBean(ServerRpcConfig.class);

        System.out.println(serverConfig.getPort());

        ServiceString bean = context.getBean(ServiceString.class);
        System.out.println(bean.getClass());
        System.out.println(bean.test());

        ServiceArray beanC = context.getBean(ServiceArray.class);
        System.out.println(beanC.getClass());
        System.out.println(Arrays.toString(beanC.testArray(2)));
//        Thread.sleep(200000);
//        context.close();
//        System.out.println("ioc closed over");
        Thread.sleep(10000000);

    }
}