package rpc.service;

import com.rpc.annotation.RpcReference;
import org.springframework.stereotype.Service;

/**
 * @user KyZhang
 * @date
 */
@Service
@RpcReference
public interface ServiceArray {
    String[] testArray(int length);
}
