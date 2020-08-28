package com.teacher.dao;

import com.teacher.entity.DepartmentTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DepartmentTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 14:59:59
 */
public interface DepartmentTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DepartmentTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DepartmentTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param departmentTable 实例对象
     * @return 对象列表
     */
    List<DepartmentTable> queryAll(DepartmentTable departmentTable);

    /**
     * 新增数据
     *
     * @param departmentTable 实例对象
     * @return 影响行数
     */
    int insert(DepartmentTable departmentTable);

    /**
     * 修改数据
     *
     * @param departmentTable 实例对象
     * @return 影响行数
     */
    int update(DepartmentTable departmentTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}