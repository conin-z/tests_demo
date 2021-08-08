package rpc.server;

import com.rpc.management.GracefulShutdownListener;
import com.rpc.provider.ServerRpcConfig;
import com.rpc.provider.registry.RedisServiceRegistry;
import com.rpc.provider.registry.ServiceRegistry;
import com.rpc.registerconfig.RedisRegisterCenterConfig;
import com.rpc.registerconfig.RegisterCenterConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @user KyZhang
 * @date
 */
@Configuration
@ComponentScan(basePackageClasses = rpc.service.ServiceList.class)
public class ServerConfig {


    @Bean
    public RegisterCenterConfig redisRegisterCenterConfig(){
        return new RedisRegisterCenterConfig();
    }


    @Bean
    public ServiceRegistry redisServiceRegistry(RegisterCenterConfig registerCenterConfig){
        return new RedisServiceRegistry((RedisRegisterCenterConfig)registerCenterConfig);
    }

    @Bean
    public ServerRpcConfig serverRpcConfig(RegisterCenterConfig centerConfig, ServiceRegistry registry){
        ServerRpcConfig configuration = new ServerRpcConfig(centerConfig, registry,10086);
        configuration.setSocketObservePeriod(10);
        configuration.setCenterObservePeriod(10);
        return configuration;
    }


    @Bean
    public GracefulShutdownListener gracefulShutdownListener(ServerRpcConfig server){
        return new GracefulShutdownListener(server);
    }

}
