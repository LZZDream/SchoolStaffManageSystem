package com.teacher.service;

import com.teacher.entity.ApplicantTable;

import java.util.List;

/**
 * (ApplicantTable)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 14:59:52
 */
public interface ApplicantTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    ApplicantTable queryById(String account);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ApplicantTable> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param applicantTable 实例对象
     * @return 实例对象
     */
    ApplicantTable insert(ApplicantTable applicantTable);

    /**
     * 修改数据
     *
     * @param applicantTable 实例对象
     * @return 实例对象
     */
    ApplicantTable update(ApplicantTable applicantTable);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    boolean deleteById(String account);

    ApplicantTable login(String account,String password);

    int signin(ApplicantTable applicantTable);

}