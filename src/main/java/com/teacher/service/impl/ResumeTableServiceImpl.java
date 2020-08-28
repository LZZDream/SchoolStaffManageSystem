package com.teacher.service.impl;

import com.teacher.entity.ResumeTable;
import com.teacher.dao.ResumeTableDao;
import com.teacher.service.ResumeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ResumeTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
@Service("resumeTableService")
public class ResumeTableServiceImpl implements ResumeTableService {
    @Resource
    private ResumeTableDao resumeTableDao;
    @Autowired
    public void setResumeTableDao(ResumeTableDao resumeTableDao) {
        this.resumeTableDao = resumeTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param resumeId 主键
     * @return 实例对象
     */
    @Override
    public ResumeTable queryById(Integer resumeId) {
        return this.resumeTableDao.queryById(resumeId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ResumeTable> queryAllByLimit(int offset, int limit) {
        return this.resumeTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param resumeTable 实例对象
     * @return 实例对象
     */
    @Override
    public ResumeTable insert(ResumeTable resumeTable) {
        this.resumeTableDao.insert(resumeTable);
        return resumeTable;
    }

    /**
     * 修改数据
     *
     * @param resumeTable 实例对象
     * @return 实例对象
     */
    @Override
    public ResumeTable update(ResumeTable resumeTable) {
        this.resumeTableDao.update(resumeTable);
        return this.queryById(resumeTable.getResumeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param resumeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer resumeId) {
        return this.resumeTableDao.deleteById(resumeId) > 0;
    }
}