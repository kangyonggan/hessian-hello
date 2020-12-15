package com.kangyonggan.demo;

/**
 * 用户对外的相关接口
 *
 * @author kyg
 */
public interface IUserService {

    /**
     * 根据用户ID查找用户信息
     *
     * @param id
     * @return
     */
    User getUserById(Long id);
}
