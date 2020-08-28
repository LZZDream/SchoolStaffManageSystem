package com.teacher.dao;

import com.teacher.entity.LevelReview;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LevelReview)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:03
 */
public interface LevelReviewDao {

    /**
     * 通过ID查询单条数据
     *
     * @param year 主键
     * @return 实例对象
     */
    LevelReview queryById(Integer year);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LevelReview> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param levelReview 实例对象
     * @return 对象列表
     */
    List<LevelReview> queryAll(LevelReview levelReview);

    /**
     * 新增数据
     *
     * @param levelReview 实例对象
     * @return 影响行数
     */
    int insert(LevelReview levelReview);

    /**
     * 修改数据
     *
     * @param levelReview 实例对象
     * @return 影响行数
     */
    int update(LevelReview levelReview);

    /**
     * 通过主键删除数据
     *
     * @param year 主键
     * @return 影响行数
     */
    int deleteById(Integer year);

}