package cn.dingyunxiang.RopTest.request;

import com.rop.AbstractRopRequest;

/**
 * Created by dingyunxiang on 16/7/21.
 */
public class LogonRequest extends AbstractRopRequest{



    private String userName;


    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "LogonRequest{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String args[]) {
//        Arrays.sort();
        System.out.println("hello,world");
    }
}
