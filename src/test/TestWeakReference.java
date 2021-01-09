package test;

import utils.PrintlnUtils;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * *******************************************************
 * Author: chinadragon
 * Time: 2021/1/8 上午9:51
 * Name:
 * Overview:
 * Usage:
 * 内存泄露 https://kaiwu.lagou.com/course/courseInfo.htm?courseId=67#/detail/pc?id=1880
 * *******************************************************
 */
public class TestWeakReference {
    public static void main(String[] args) {

        ReferenceQueue<BigObject> referenceQueue = new ReferenceQueue<>();

        // 1
//        WeakReference<BigObject> weakReference = new WeakReference<>(new BigObject());

        // 2
//        WeakReference<BigObject> weakReference = new WeakReference<>(new BigObject(),referenceQueue);

        // 3
        BigObject bigObject = new BigObject();
        WeakReference<BigObject> weakReference = new WeakReference<>(bigObject,referenceQueue);
        PrintlnUtils.println("before gc  weakReference.get is "+weakReference.get());
        PrintlnUtils.println("before gc  referenceQueue.poll is "+referenceQueue.poll());
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintlnUtils.println("after gc  weakReference.get is "+weakReference.get());
        PrintlnUtils.println("after gc  referenceQueue.poll is "+referenceQueue.poll());

        // 1
        // before gc  weakReference.get is test.TestWeakReference$BigObject@72ea2f77
        //
        //after gc  weakReference.get is null

        // 2
        //before gc  weakReference.get is test.TestWeakReference$BigObject@72ea2f77
        //
        //before gc  referenceQueue.poll is null
        //
        //after gc  weakReference.get is null
        //
        //after gc  referenceQueue.poll is java.lang.ref.WeakReference@3af49f1c

        // 3
        //before gc  weakReference.get is test.TestWeakReference$BigObject@72ea2f77
        //
        //before gc  referenceQueue.poll is null
        //
        //after gc  weakReference.get is test.TestWeakReference$BigObject@72ea2f77
        //
        //after gc  referenceQueue.poll is null

    }

    static class BigObject{

    }
}
