package com.teacher.service.impl;

import com.teacher.entity.Teacher;
import com.teacher.dao.TeacherDao;
import com.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:07
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;
    @Autowired
    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer staffNumber) {
        return this.teacherDao.queryById(staffNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryAllByLimit(int offset, int limit) {
        return this.teacherDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getStaffNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer staffNumber) {
        return this.teacherDao.deleteById(staffNumber) > 0;
    }

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryParttime(int post) {
        return this.teacherDao.queryParttime(post);
    }

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryFloater(int post) {
        return this.teacherDao.queryFloater(post);
    }

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryBookMan(int post) {
        return this.teacherDao.queryBookMan(post);
    }

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryReEmploy(int post) {
        return this.teacherDao.queryReEmploy(post);
    }

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryTemp(int post) {
        return this.teacherDao.queryTemp(post);
    }
}