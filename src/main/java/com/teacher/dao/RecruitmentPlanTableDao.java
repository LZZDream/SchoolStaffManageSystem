package com.teacher.dao;

import com.teacher.entity.RecruitmentPlanTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RecruitmentPlanTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 15:00:04
 */
public interface RecruitmentPlanTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RecruitmentPlanTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RecruitmentPlanTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

//查询所有信息
    List<RecruitmentPlanTable> queryAllList();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param recruitmentPlanTable 实例对象
     * @return 对象列表
     */
    List<RecruitmentPlanTable> queryAll(RecruitmentPlanTable recruitmentPlanTable);

    /**
     * 新增数据
     *
     * @param recruitmentPlanTable 实例对象
     * @return 影响行数
     */
    int insert(RecruitmentPlanTable recruitmentPlanTable);

    /**
     * 修改数据
     *
     * @param recruitmentPlanTable 实例对象
     * @return 影响行数
     */
    int update(RecruitmentPlanTable recruitmentPlanTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}