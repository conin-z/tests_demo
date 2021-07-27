package rpc.service;

import com.rpc.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * @user KyZhang
 * @date
 */
@RpcService
@Service
public class ServiceStringImpl implements ServiceString {

    public String test() {
        return "SERVER 1 : serviceStringImpl got";
    }
}
