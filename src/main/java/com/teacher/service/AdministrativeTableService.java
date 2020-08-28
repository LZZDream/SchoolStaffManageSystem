package com.teacher.service;

import com.teacher.entity.AdministrativeTable;

import java.util.List;

/**
 * (AdministrativeTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
public interface AdministrativeTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdministrativeTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AdministrativeTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param administrativeTable 实例对象
     * @return 实例对象
     */
    AdministrativeTable insert(AdministrativeTable administrativeTable);

    /**
     * 修改数据
     *
     * @param administrativeTable 实例对象
     * @return 实例对象
     */
    AdministrativeTable update(AdministrativeTable administrativeTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}