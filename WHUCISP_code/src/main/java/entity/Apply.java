package entity;

import lombok.Data;

//报名类
//直接使用构造函数进行内容设置
@Data
public class Apply {

    private String Name;
    private String SchoolID;
    private String Club;
    private String Telephone;
    private String SelfIntro;

    public Apply(String name, String schoolID, String club, String telephone, String selfIntro) {
        Name = name;
        SchoolID = schoolID;
        Club = club;
        Telephone = telephone;
        SelfIntro = selfIntro;
    }

//    public void setName(String name) {
//        Name = name;
//    }
//    public String getName() {
//        return Name;
//    }
//
//    public void setSchoolID(String schoolID) {
//        SchoolID = schoolID;
//    }
//    public String getSchoolID() {
//        return SchoolID;
//    }
//
//    public void setClub(String club) {
//        Club = club;
//    }
//    public String getClub() {
//        return Club;
//    }
//
//    public void setTelephone(String telephone) {
//        Telephone = telephone;
//    }
//    public String getTelephone() {
//        return Telephone;
//    }
//
//    public void setSelfIntro(String selfIntro) {
//        SelfIntro = selfIntro;
//    }
//    public String getSelfIntro() {
//        return SelfIntro;
//    }


}
