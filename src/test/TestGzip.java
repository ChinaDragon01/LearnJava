package test;

import utils.PrintlnUtils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/**
 * 使用GZIP和Zip压缩Java数据流（转）
 * https://blog.csdn.net/yangdayin/article/details/7240838?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control&dist_request_id=1328641.50435.16157724964381761&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control
 */
public class TestGzip {
    public static void main(String[] args) {
        String str = "JJJJJJAAAAVVVVAAAAAA";
        byte[] compress = compress(str.getBytes(StandardCharsets.UTF_8));
        PrintlnUtils.println("压缩前 str length = "+str.getBytes(StandardCharsets.UTF_8).length+" compress length =  "+compress.length);

    }


    /**
     * GZIP压缩
     */
    private static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0)
            return null;
        GZIPOutputStream gzip = null;
        ByteArrayOutputStream out = null;
        try {
            out = new ByteArrayOutputStream();
            gzip = new GZIPOutputStream(out);
            gzip.write(bytes);
            gzip.finish();
            return out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeIOQuietly(gzip, out);
        }
        return null;
    }

    public static void closeIOQuietly(Closeable... closeables) {
        if (closeables == null || closeables.length <= 0) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException ignored) {
                    // ignore
                }
            }
        }
    }
}
