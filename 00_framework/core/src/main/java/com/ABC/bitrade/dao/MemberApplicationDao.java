package com.ABC.bitrade.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ABC.bitrade.constant.AuditStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.Member;
import com.ABC.bitrade.entity.MemberApplication;

import java.util.List;

/**
 * @author GS
 * @description
 * @date 2017/12/26 15:12
 */
public interface MemberApplicationDao extends BaseDao<MemberApplication> {
    List<MemberApplication> findMemberApplicationByMemberAndAuditStatusOrderByIdDesc(Member var1, AuditStatus var2);

    long countAllByAuditStatus(AuditStatus auditStatus);
    @Query(value = "select count(1) from member_application where  id_card = :idCard and audit_status=0",nativeQuery = true)
    int queryByIdCard(@Param("idCard") String idCard);
}
