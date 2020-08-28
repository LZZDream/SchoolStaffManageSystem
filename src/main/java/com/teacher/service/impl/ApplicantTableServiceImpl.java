package com.teacher.service.impl;

import com.teacher.entity.ApplicantTable;
import com.teacher.dao.ApplicantTableDao;
import com.teacher.service.ApplicantTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ApplicantTable)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:53
 */
@Service("applicantTableService")
public class ApplicantTableServiceImpl implements ApplicantTableService {

    @Resource
    private ApplicantTableDao applicantTableDao;

    @Autowired
    public void setApplicantTableDao(ApplicantTableDao applicantTableDao) {
        this.applicantTableDao = applicantTableDao;
    }

    @Override
    public ApplicantTable login(String account, String password) {
        ApplicantTable applicantTable=applicantTableDao.queryById(account);
        if(applicantTable!=null&&applicantTable.getPassword().equals(password)){
            return applicantTable;
        }
        else return null;

    }

    @Override
    public int signin(ApplicantTable applicantTable) {
        if(applicantTableDao.queryById(applicantTable.getAccount())==null){
            return applicantTableDao.insert(applicantTable);
        }
        else return 0;

    }

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    @Override
    public ApplicantTable queryById(String account) {
        return this.applicantTableDao.queryById(account);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ApplicantTable> queryAllByLimit(int offset, int limit) {
        return this.applicantTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param applicantTable 实例对象
     * @return 实例对象
     */
    @Override
    public ApplicantTable insert(ApplicantTable applicantTable) {
        this.applicantTableDao.insert(applicantTable);
        return applicantTable;
    }

    /**
     * 修改数据
     *
     * @param applicantTable 实例对象
     * @return 实例对象
     */
    @Override
    public ApplicantTable update(ApplicantTable applicantTable) {
        this.applicantTableDao.update(applicantTable);
        return this.queryById(applicantTable.getAccount());
    }

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String account) {
        return this.applicantTableDao.deleteById(account) > 0;
    }
}