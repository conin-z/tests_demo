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

    String name = "serviceStringImpl";

    public String test() {
        return "SERVER 2 : serviceStringImpl got";
    }
}
