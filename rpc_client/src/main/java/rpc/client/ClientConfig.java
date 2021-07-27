package rpc.client;

import com.rpc.consumer.ClientRpcConfig;
import com.rpc.consumer.proxy.RpcInterfaceProxyFactoryBean;
import com.rpc.consumer.subscriber.RedisServiceSubscriber;
import com.rpc.consumer.subscriber.ServiceSubscriber;
import com.rpc.registerconfig.RedisRegisterCenterConfig;
import com.rpc.registerconfig.RegisterCenterConfig;
import org.springframework.context.annotation.*;
import rpc.service.ServiceString;
import rpc.service.ServiceArray;

/**
 * @user KyZhang
 * @date
 */
@Configuration
@ComponentScan(basePackageClasses = rpc.service.ServiceString.class)
public class ClientConfig {

    @Bean
    public static RegisterCenterConfig registerCenterConfig(){
        // path == null
        RedisRegisterCenterConfig centerConfig = new RedisRegisterCenterConfig();
        return centerConfig;
    }

    @Bean
    public static ServiceSubscriber serviceSubscriber(){
        RedisServiceSubscriber subscriber = new RedisServiceSubscriber();
        //subscriber.init();
        return subscriber;
    }

    @Bean
    public static ClientRpcConfig rpcClientConfiguration(RegisterCenterConfig registerCenterConfig, ServiceSubscriber subscriber){
        ClientRpcConfig client = new ClientRpcConfig(registerCenterConfig, subscriber);
        client.setCenterObservePeriod(10);
        client.setSocketObservePeriod(10);
        client.setItfPaths("rpc.service");
        client.setSynSubscriptSeconds(10);
        return client;
    }

    @Bean
    public RpcInterfaceProxyFactoryBean serviceString(){
        return new RpcInterfaceProxyFactoryBean(ServiceString.class);
    }

    @Bean
    public RpcInterfaceProxyFactoryBean serviceArray(){
        return new RpcInterfaceProxyFactoryBean(ServiceArray.class);
    }
}
