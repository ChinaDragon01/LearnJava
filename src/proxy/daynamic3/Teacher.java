package proxy.daynamic3;

import utils.PrintlnUtils;

public class Teacher implements People {
    private String name;

    @Override
    public String work() {
        PrintlnUtils.println("老师教书育人...");
        return "教书";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
