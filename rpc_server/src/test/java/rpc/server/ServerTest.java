package rpc.server;

import com.rpc.registerconfig.RedisRegisterCenterConfig;
import com.rpc.registerconfig.RegisterCenterConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rpc.service.ServiceString;

/**
 * @user KyZhang
 * @date
 */
public class ServerTest {
    @Test
    public void testRpc() throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerConfig.class);
        context.registerShutdownHook();
        RedisRegisterCenterConfig centerConfig = (RedisRegisterCenterConfig)context.getBean(RegisterCenterConfig.class);
        System.out.println(centerConfig.getIp());
        System.out.println(centerConfig.getPort());

        ServiceString bean = context.getBean(ServiceString.class);
        System.out.println(bean.getClass());
        System.out.println(bean.test());

        Thread.sleep(800000);

    }
}
