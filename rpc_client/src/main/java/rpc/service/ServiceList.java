package rpc.service;

import com.rpc.annotation.RpcReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user KyZhang
 * @date
 */
@Service
@RpcReference
public interface ServiceList {
    List<Integer> testList(final int length);
}
