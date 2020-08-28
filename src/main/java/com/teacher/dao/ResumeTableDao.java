package com.teacher.dao;

import com.teacher.entity.ResumeTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ResumeTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public interface ResumeTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param resumeId 主键
     * @return 实例对象
     */
    ResumeTable queryById(Integer resumeId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ResumeTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param resumeTable 实例对象
     * @return 对象列表
     */
    List<ResumeTable> queryAll(ResumeTable resumeTable);

    /**
     * 新增数据
     *
     * @param resumeTable 实例对象
     * @return 影响行数
     */
    int insert(ResumeTable resumeTable);

    /**
     * 修改数据
     *
     * @param resumeTable 实例对象
     * @return 影响行数
     */
    int update(ResumeTable resumeTable);

    /**
     * 通过主键删除数据
     *
     * @param resumeId 主键
     * @return 影响行数
     */
    int deleteById(Integer resumeId);

}