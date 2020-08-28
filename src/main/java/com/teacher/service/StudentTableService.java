package com.teacher.service;

import com.teacher.entity.StudentTable;

import java.util.List;

/**
 * (StudentTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
public interface StudentTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentNumber 主键
     * @return 实例对象
     */
    StudentTable queryById(Integer studentNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<StudentTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param studentTable 实例对象
     * @return 实例对象
     */
    StudentTable insert(StudentTable studentTable);

    /**
     * 修改数据
     *
     * @param studentTable 实例对象
     * @return 实例对象
     */
    StudentTable update(StudentTable studentTable);

    /**
     * 通过主键删除数据
     *
     * @param studentNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer studentNumber);

}