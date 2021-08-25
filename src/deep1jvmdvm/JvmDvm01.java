package deep1jvmdvm;

/**
 * 程序运行时，内存到底是如何进行分配的？
 *
 * E:\idea_uitmate_project\LearnJava>javac -encoding utf-8 src\deep1jvmdvm\JvmDvm01.java
 *
 * JvmDvm01.java:4: 错误: 编码 GBK 的不可映射字符 (0x9F)
 *  * 绋嬪簭杩愯鏃讹紝鍐呭瓨鍒板簳鏄浣曡繘琛屽垎閰嶇殑锛?
 *
 * 因为上面注释里有汉字 需要添加 -encoding utf-8
 *
 *
 * E:\idea_uitmate_project\LearnJava>cd E:\idea_uitmate_project\LearnJava\src\deep1jvmdvm
 *
 * E:\idea_uitmate_project\LearnJava\src\deep1jvmdvm>javac JvmDvm01.java
 *
 * IDEA配置javap命令及字节码表查看
 * https://blog.csdn.net/mojiewangday/article/details/116292801?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_title~default-4.essearch_pc_relevant&spm=1001.2101.3001.4242
 *
 * 在IDEA的终端（Terminal）中使用java、javac命令
 * https://blog.csdn.net/Reanon/article/details/103737416?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.essearch_pc_relevant&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.essearch_pc_relevant
 */
public class JvmDvm01 {
    public static void main(String[] args) {
//        PrintlnUtils.println("result = "+add(3));

    }

    public static int add(int k) {
        int i = 1;
        int j = 1;
        return i + j + k;

    }
}
