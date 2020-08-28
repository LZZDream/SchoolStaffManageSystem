package com.teacher.dao;

import com.teacher.entity.CheckTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CheckTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
public interface CheckTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    CheckTable queryById(Integer staffNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CheckTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param checkTable 实例对象
     * @return 对象列表
     */
    List<CheckTable> queryAll(CheckTable checkTable);

    /**
     * 新增数据
     *
     * @param checkTable 实例对象
     * @return 影响行数
     */
    int insert(CheckTable checkTable);

    /**
     * 修改数据
     *
     * @param checkTable 实例对象
     * @return 影响行数
     */
    int update(CheckTable checkTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer staffNumber);

}