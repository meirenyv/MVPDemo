package com.yh.mvpdemo.entity;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 14:49
 * @chang time
 * @change class describe:
 */

public class Login {


    /**
     * time : 2018-03-13 11:30:29
     * ftime : 2018-03-13 11:30:29
     * context : 黎托街道黎锦苑8栋106号妈妈驿站已发出自提短信,请上门自提,如有疑问请联系13755027160
     * location :
     */

    private String time;
    private String ftime;
    private String context;
    private String location;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Login{" +
                "time='" + time + '\'' +
                ", ftime='" + ftime + '\'' +
                ", context='" + context + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}
