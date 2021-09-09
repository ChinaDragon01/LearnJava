package proxy.daynamic3;

/**
 * Java动态代理InvocationHandler和Proxy学习笔记
 * https://blog.csdn.net/yaomingyang/article/details/80981004
 */
public interface People {
    String work();

    void setName(String name);

    String getName();
}
