package com.teacher.service;

import com.teacher.entity.LevelReview;

import java.util.List;

/**
 * (LevelReview)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:03
 */
public interface LevelReviewService {

    /**
     * 通过ID查询单条数据
     *
     * @param year 主键
     * @return 实例对象
     */
    LevelReview queryById(Integer year);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LevelReview> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param levelReview 实例对象
     * @return 实例对象
     */
    LevelReview insert(LevelReview levelReview);

    /**
     * 修改数据
     *
     * @param levelReview 实例对象
     * @return 实例对象
     */
    LevelReview update(LevelReview levelReview);

    /**
     * 通过主键删除数据
     *
     * @param year 主键
     * @return 是否成功
     */
    boolean deleteById(Integer year);

}