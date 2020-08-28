package com.teacher.service;

import com.teacher.entity.ResumeTable;

import java.util.List;

/**
 * (ResumeTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public interface ResumeTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param resumeId 主键
     * @return 实例对象
     */
    ResumeTable queryById(Integer resumeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ResumeTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param resumeTable 实例对象
     * @return 实例对象
     */
    ResumeTable insert(ResumeTable resumeTable);

    /**
     * 修改数据
     *
     * @param resumeTable 实例对象
     * @return 实例对象
     */
    ResumeTable update(ResumeTable resumeTable);

    /**
     * 通过主键删除数据
     *
     * @param resumeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer resumeId);

}