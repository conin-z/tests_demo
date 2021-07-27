package rpc.service;

import com.rpc.annotation.RpcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @user KyZhang
 * @date
 */
@RpcService
@Service
public class ServiceListImpl implements ServiceList {


    @Override
    public List<Integer> testList(final int length) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        return list;
    }

}
