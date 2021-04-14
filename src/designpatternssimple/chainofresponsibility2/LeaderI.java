package designpatternssimple.chainofresponsibility2;

public interface LeaderI {
    void setNext(Leader next);

    Leader getNext();
}
