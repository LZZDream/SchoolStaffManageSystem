package com.teacher.dao;

import com.teacher.entity.StudentTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StudentTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
public interface StudentTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param studentNumber 主键
     * @return 实例对象
     */
    StudentTable queryById(Integer studentNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<StudentTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param studentTable 实例对象
     * @return 对象列表
     */
    List<StudentTable> queryAll(StudentTable studentTable);

    /**
     * 新增数据
     *
     * @param studentTable 实例对象
     * @return 影响行数
     */
    int insert(StudentTable studentTable);

    /**
     * 修改数据
     *
     * @param studentTable 实例对象
     * @return 影响行数
     */
    int update(StudentTable studentTable);

    /**
     * 通过主键删除数据
     *
     * @param studentNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer studentNumber);

}