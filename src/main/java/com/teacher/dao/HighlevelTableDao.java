package com.teacher.dao;

import com.teacher.entity.HighlevelTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (HighlevelTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
public interface HighlevelTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    HighlevelTable queryById(Integer staffNumber);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HighlevelTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param highlevelTable 实例对象
     * @return 对象列表
     */
    List<HighlevelTable> queryAll(HighlevelTable highlevelTable);

    /**
     * 新增数据
     *
     * @param highlevelTable 实例对象
     * @return 影响行数
     */
    int insert(HighlevelTable highlevelTable);

    /**
     * 修改数据
     *
     * @param highlevelTable 实例对象
     * @return 影响行数
     */
    int update(HighlevelTable highlevelTable);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 影响行数
     */
    int deleteById(Integer staffNumber);

}