package apply.Service;

import apply.Dao.ApplyDao;
import apply.Dao.ApplyDaoImpl;
import entity.Apply;

public class ApplyServiceImpl implements ApplyService {
    private ApplyDao applyDao = new ApplyDaoImpl();

    @Override
    public String apply(String name, String schoolID, String club, String telephone, String selfIntro){
        if (name.trim().isEmpty() | schoolID.trim().isEmpty() | club.trim().isEmpty() | telephone.trim().isEmpty()) {
            return "请检查报名信息，姓名、学号、意向部门、联系电话不能为空！";
        }

        Apply apply = new Apply(name,schoolID,club,telephone,selfIntro);
        Boolean insert = applyDao.insert(apply);
        if (!insert) {
            return "报名失败";
        }
        return "报名成功";
    }
}
