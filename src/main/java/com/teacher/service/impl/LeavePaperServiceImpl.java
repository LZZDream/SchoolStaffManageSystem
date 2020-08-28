package com.teacher.service.impl;

import com.teacher.entity.LeavePaper;
import com.teacher.dao.LeavePaperDao;
import com.teacher.service.LeavePaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LeavePaper)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:01
 */
@Service("leavePaperService")
public class LeavePaperServiceImpl implements LeavePaperService {
    @Resource
    private LeavePaperDao leavePaperDao;
    @Autowired
    public void setLeavePaperDao(LeavePaperDao leavePaperDao) {
        this.leavePaperDao = leavePaperDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LeavePaper queryById(Integer id) {
        return this.leavePaperDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LeavePaper> queryAllByLimit(int offset, int limit) {
        return this.leavePaperDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param leavePaper 实例对象
     * @return 实例对象
     */
    @Override
    public LeavePaper insert(LeavePaper leavePaper) {
        this.leavePaperDao.insert(leavePaper);
        return leavePaper;
    }

    /**
     * 修改数据
     *
     * @param leavePaper 实例对象
     * @return 实例对象
     */
    @Override
    public LeavePaper update(LeavePaper leavePaper) {
        this.leavePaperDao.update(leavePaper);
        return this.queryById(leavePaper.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.leavePaperDao.deleteById(id) > 0;
    }
}