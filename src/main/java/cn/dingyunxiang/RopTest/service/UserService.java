package cn.dingyunxiang.RopTest.service;

import cn.dingyunxiang.RopTest.request.LogonRequest;
import com.rop.RopRequest;
import com.rop.annotation.NeedInSessionType;
import com.rop.annotation.ServiceMethod;
import com.rop.session.SimpleSession;
import org.junit.Test;

/**
 * Created by dingyunxiang on 16/7/21.
 */
public class UserService {


    @ServiceMethod(method = "user.login",version ="1.0",needInSession = NeedInSessionType.DEFAULT)
    public Object login(LogonRequest request){
        SimpleSession session = new SimpleSession();
//        HashMap
        session.setAttribute("userName",request.getUserName());
        request.getRopRequestContext().addSession("session",session);

        return "session";
    }


    public Object logout(RopRequest request){
        request.getRopRequestContext().removeSession();
        return "success";
    }


    @Test
    public void test(){
        System.out.println(4 & 2);
    }


}
