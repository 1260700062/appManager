package cn.appinfodb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.BackendUser;
import cn.appinfodb.pojo.BackendUserExample;

public interface BackendUserMapper {
    long countByExample(BackendUserExample example);

    int deleteByExample(BackendUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BackendUser record);

    int insertSelective(BackendUser record);

    List<BackendUser> selectByExample(BackendUserExample example);

    BackendUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BackendUser record, @Param("example") BackendUserExample example);

    int updateByExample(@Param("record") BackendUser record, @Param("example") BackendUserExample example);

    int updateByPrimaryKeySelective(BackendUser record);

    int updateByPrimaryKey(BackendUser record);
    
    BackendUser getBackendUserByBackendCode(String BackendCode);
}