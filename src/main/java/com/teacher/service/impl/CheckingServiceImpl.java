package com.teacher.service.impl;

import com.teacher.entity.Checking;
import com.teacher.dao.CheckingDao;
import com.teacher.service.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Checking)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 14:59:58
 */
@Service("checkingService")
public class CheckingServiceImpl implements CheckingService {
    @Resource
    private CheckingDao checkingDao;
    @Autowired
    public void setCheckingDao(CheckingDao checkingDao) {
        this.checkingDao = checkingDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Checking queryById(Integer id) {
        return this.checkingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Checking> queryAllByLimit(int offset, int limit) {
        return this.checkingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param checking 实例对象
     * @return 实例对象
     */
    @Override
    public Checking insert(Checking checking) {
        this.checkingDao.insert(checking);
        return checking;
    }

    /**
     * 修改数据
     *
     * @param checking 实例对象
     * @return 实例对象
     */
    @Override
    public Checking update(Checking checking) {
        this.checkingDao.update(checking);
        return this.queryById(checking.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.checkingDao.deleteById(id) > 0;
    }
}