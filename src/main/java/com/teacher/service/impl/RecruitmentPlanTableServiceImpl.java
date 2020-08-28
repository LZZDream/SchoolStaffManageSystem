package com.teacher.service.impl;

import com.teacher.entity.RecruitmentPlanTable;
import com.teacher.dao.RecruitmentPlanTableDao;
import com.teacher.entity.ResumeTable;
import com.teacher.service.RecruitmentPlanTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RecruitmentPlanTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 15:00:04
 */
@Service("recruitmentPlanTableService")
public class RecruitmentPlanTableServiceImpl implements RecruitmentPlanTableService {
    @Resource
    private RecruitmentPlanTableDao recruitmentPlanTableDao;

    @Autowired
    public void setRecruitmentPlanTableDao(RecruitmentPlanTableDao recruitmentPlanTableDao) {
        this.recruitmentPlanTableDao = recruitmentPlanTableDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RecruitmentPlanTable queryById(Integer id) {
        return this.recruitmentPlanTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<RecruitmentPlanTable> queryAllByLimit(int offset, int limit) {
        return this.recruitmentPlanTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param recruitmentPlanTable 实例对象
     * @return 实例对象
     */
    @Override
    public RecruitmentPlanTable insert(RecruitmentPlanTable recruitmentPlanTable) {
        if(recruitmentPlanTableDao.queryById(recruitmentPlanTable.getId())==null){
            this.recruitmentPlanTableDao.insert(recruitmentPlanTable);
            return recruitmentPlanTable;
        }
        else{
            return null;
        }


    }

    /**
     * 修改数据
     *
     * @param recruitmentPlanTable 实例对象
     * @return 实例对象
     */
    @Override
    public RecruitmentPlanTable update(RecruitmentPlanTable recruitmentPlanTable) {
        this.recruitmentPlanTableDao.update(recruitmentPlanTable);
        return this.queryById(recruitmentPlanTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.recruitmentPlanTableDao.deleteById(id) > 0;
    }

    @Override
    public List<RecruitmentPlanTable> queryAllList() {
        List<RecruitmentPlanTable> recruitmentPlanTables=recruitmentPlanTableDao.queryAllList();
        return recruitmentPlanTables;
    }
}