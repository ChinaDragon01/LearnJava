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

    /*

        javap -v JvmDvm01.class（字节码）



        "C:\Program Files\Java\jdk-15.0.2\bin\javap.exe" -v JvmDvm01.class
Classfile /E:/idea_uitmate_project/LearnJava/src/deep1jvmdvm/JvmDvm01.class
  Last modified 2021年8月25日; size 342 bytes
  SHA-256 checksum bb1cc7ef05bea1d07bfd8f82d4579059025268fb738323d137001b9ded98b808
  Compiled from "JvmDvm01.java"
public class deep1jvmdvm.JvmDvm01
  minor version: 0
  major version: 59
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // deep1jvmdvm/JvmDvm01
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // deep1jvmdvm/JvmDvm01
   #8 = Utf8               deep1jvmdvm/JvmDvm01
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               main
  #12 = Utf8               ([Ljava/lang/String;)V
  #13 = Utf8               add
  #14 = Utf8               (I)I
  #15 = Utf8               SourceFile
  #16 = Utf8               JvmDvm01.java
{
  public deep1jvmdvm.JvmDvm01();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 18: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 22: 0

  public static int add(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: iconst_1
         1: istore_1
         2: iconst_1
         3: istore_2
         4: iload_1
         5: iload_2
         6: iadd
         7: iload_0
         8: iadd
         9: ireturn
      LineNumberTable:
        line 25: 0
        line 26: 2
        line 27: 4
}
SourceFile: "JvmDvm01.java"

Process finished with exit code 0

            总结：
                locals=3就是代表局部变量表长度是 3，也就是说经过编译之后，局部变量表的长度已经确定为3，分别保存：参数 k 和局部变量 i、j。

                当一个方法刚刚开始执行的时候，这个方法的操作数栈是空的。在方法执行的过程中，会有各种字节码指令被压入和弹出操作数栈

                （比如：iadd 指令就是将操作数栈中栈顶的两个元素弹出，执行加法运算，并将结果重新压回到操作数栈中）。




     */
}
