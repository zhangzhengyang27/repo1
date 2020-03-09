package domain;

import java.util.Date;

/**
 * 封装Emp表数据的JavaBean
 */
public class Emp {
    private int id;
    private String ename;
    private String sex;
    private Date borndate;
    private String phone;
    private int boyfriend_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex(String sex) {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBoyfriend_id() {
        return boyfriend_id;
    }

    public void setBoyfriend_id(int boyfriend_id) {
        this.boyfriend_id = boyfriend_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", sex=" + sex +
                ", borndate=" + borndate +
                ", phone='" + phone + '\'' +
                ", boyfriend_id=" + boyfriend_id +
                '}';
    }
}
