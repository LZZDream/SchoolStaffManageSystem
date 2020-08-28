package com.teacher.service.impl;

import com.teacher.entity.LevelReview;
import com.teacher.dao.LevelReviewDao;
import com.teacher.service.LevelReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LevelReview)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:03
 */
@Service("levelReviewService")
public class LevelReviewServiceImpl implements LevelReviewService {
    @Resource
    private LevelReviewDao levelReviewDao;
    @Autowired
    public void setLevelReviewDao(LevelReviewDao levelReviewDao) {
        this.levelReviewDao = levelReviewDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param year 主键
     * @return 实例对象
     */
    @Override
    public LevelReview queryById(Integer year) {
        return this.levelReviewDao.queryById(year);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LevelReview> queryAllByLimit(int offset, int limit) {
        return this.levelReviewDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param levelReview 实例对象
     * @return 实例对象
     */
    @Override
    public LevelReview insert(LevelReview levelReview) {
        this.levelReviewDao.insert(levelReview);
        return levelReview;
    }

    /**
     * 修改数据
     *
     * @param levelReview 实例对象
     * @return 实例对象
     */
    @Override
    public LevelReview update(LevelReview levelReview) {
        this.levelReviewDao.update(levelReview);
        return this.queryById(levelReview.getYear());
    }

    /**
     * 通过主键删除数据
     *
     * @param year 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer year) {
        return this.levelReviewDao.deleteById(year) > 0;
    }
}