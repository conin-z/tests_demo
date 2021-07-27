package rpc.service;

import com.rpc.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * @user KyZhang
 * @date
 */
@RpcService
@Service
public class ServiceArrayImpl implements ServiceArray {

    @Override
    public String[] testArray(int length) {
        String[] str= new String[length];
        for (int i = 0; i < length; i++) {
            str[i] = "Hello ~" + i;
        }
        return str;
    }
}
