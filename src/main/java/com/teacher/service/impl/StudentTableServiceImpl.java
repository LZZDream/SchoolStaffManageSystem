package com.teacher.service.impl;

import com.teacher.entity.StudentTable;
import com.teacher.dao.StudentTableDao;
import com.teacher.service.StudentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
@Service("studentTableService")
public class StudentTableServiceImpl implements StudentTableService {
    @Resource
    private StudentTableDao studentTableDao;
    @Autowired
    public void setStudentTableDao(StudentTableDao studentTableDao) {
        this.studentTableDao = studentTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param studentNumber 主键
     * @return 实例对象
     */
    @Override
    public StudentTable queryById(Integer studentNumber) {
        return this.studentTableDao.queryById(studentNumber);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<StudentTable> queryAllByLimit(int offset, int limit) {
        return this.studentTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param studentTable 实例对象
     * @return 实例对象
     */
    @Override
    public StudentTable insert(StudentTable studentTable) {
        this.studentTableDao.insert(studentTable);
        return studentTable;
    }

    /**
     * 修改数据
     *
     * @param studentTable 实例对象
     * @return 实例对象
     */
    @Override
    public StudentTable update(StudentTable studentTable) {
        this.studentTableDao.update(studentTable);
        return this.queryById(studentTable.getStudentNumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentNumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer studentNumber) {
        return this.studentTableDao.deleteById(studentNumber) > 0;
    }
}