package com.teacher.service;

import com.teacher.entity.Teacher;

import java.util.List;

/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 15:00:07
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffNumber 主键
     * @return 实例对象
     */
    Teacher queryById(Integer staffNumber);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Teacher> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param staffNumber 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffNumber);



    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryParttime(int post);

    /**
     * 查询所有兼职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryFloater(int post);
    /**
     * 查询所有临时聘用人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */

    List<Teacher> queryBookMan(int post);

    /**
     * 查询所有返聘人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryReEmploy(int post);

    /**
     * 查询所有挂职人员数据
     *
     * @param post 岗位
     * @return 对象列表
     */
    List<Teacher> queryTemp(int post);

}