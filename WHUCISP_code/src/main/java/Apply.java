//报名类
//直接使用构造函数进行内容设置
public class Apply {

    private StringBuilder Name;
    private StringBuilder SchoolID;
    private StringBuilder Club;
    private StringBuilder Telephone;
    private StringBuilder SelfIntro;

    public Apply(StringBuilder name, StringBuilder schoolID, StringBuilder club, StringBuilder telephone, StringBuilder selfIntro) {
        Name = name;
        SchoolID = schoolID;
        Club = club;
        Telephone = telephone;
        SelfIntro = selfIntro;
    }


    public boolean join() //将该报名实例中的所有属性写入报名表中
    {


        return true;
    }

}
