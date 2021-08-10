package annotation.simple2;

/**
 * https://my.oschina.net/itgaowei/blog/1602277
 */
@ReqMapping(method = ReqMapping.ReqMethod.POST,val = "类")
public class UserInfo {
    @ReqValue(value1 = "小王")
    private String userName;

    @ReqValue(value2 = "密码" )
    private String pswd;

    @ReqMapping(method = ReqMapping.ReqMethod.GET)
    public void get(){

    }

    @ReqMapping(val={"a","b"})
    public void other(){

    }
}
