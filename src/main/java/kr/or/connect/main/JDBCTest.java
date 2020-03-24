package kr.or.connect.main;

import kr.or.connect.dao.RoleDao;
import kr.or.connect.dto.Role;
import kr.or.connect.jdbctexam01.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JDBCTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        RoleDao roleDao = ac.getBean(RoleDao.class);

        Role role = new Role();

        role.setRoleId(1);
        role.setDescription("PROGRAMMER");

        int count = roleDao.update(role);
        System.out.println(count + "건 수정되었습니다");

        Role resultRole = roleDao.selectById(1);
        System.out.println(resultRole);

        int deleteCount = roleDao.deleteById(500);
        System.out.println(deleteCount + "건 삭제되었습니다");

        role.setRoleId(500);
        role.setDescription("CEO");

        int insertCount = roleDao.insert(role);
        System.out.println(insertCount + "건 입력되었습니다");
    }
}
