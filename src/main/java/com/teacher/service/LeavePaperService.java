package com.teacher.service;

import com.teacher.entity.LeavePaper;

import java.util.List;

/**
 * (LeavePaper)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:01
 */
public interface LeavePaperService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LeavePaper queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LeavePaper> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param leavePaper 实例对象
     * @return 实例对象
     */
    LeavePaper insert(LeavePaper leavePaper);

    /**
     * 修改数据
     *
     * @param leavePaper 实例对象
     * @return 实例对象
     */
    LeavePaper update(LeavePaper leavePaper);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}