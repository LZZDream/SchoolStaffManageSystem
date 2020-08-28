package com.teacher.dao;

import com.teacher.entity.RetiredTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetiredTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public interface RetiredTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    RetiredTable queryById(Integer staffNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RetiredTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param retiredTable 实例对象
     * @return 对象列表
     */
    List<RetiredTable> queryAll(RetiredTable retiredTable);

    /**
     * 新增数据
     *
     * @param retiredTable 实例对象
     * @return 影响行数
     */
    int insert(RetiredTable retiredTable);

    /**
     * 修改数据
     *
     * @param retiredTable 实例对象
     * @return 影响行数
     */
    int update(RetiredTable retiredTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer staffNumber);

}