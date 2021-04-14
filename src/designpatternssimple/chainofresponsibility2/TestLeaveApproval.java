package designpatternssimple.chainofresponsibility2;

public class TestLeaveApproval {
    public static void main(String[] args) {
        //组装责任链
        Leader classAdviser_1 = new ClassAdviser();
        Leader departmentHead_2 = new DepartmentHead();
        Leader dean_3 = new Dean();
//        Leader deanOfStudies_4 = new DeanOfStudies();
        classAdviser_1.setNext(departmentHead_2);
        departmentHead_2.setNext(dean_3);
//        dean_3.setNext(deanOfStudies_4);

        //提交请求
        classAdviser_1.handleRequest(20);

    }
}
