package com.example.myapplication;

public class listitem {
    private String Sid;
    private String Sname;
    private String Smarks;
    private String Sstatus;

    public listitem(String sid, String sname, String smarks, String sstatus) {
        Sid = sid;
        Sname = sname;
        Smarks = smarks;
        Sstatus = sstatus;
    }

    public String getSid() {
        return Sid;
    }

    public String getSname() {
        return Sname;
    }

    public String getSmarks() {
        return Smarks;
    }

    public String getSstatus() {
        return Sstatus;
    }
}
