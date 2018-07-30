package cn.fly.yun.mapper;

import cn.fly.yun.domain.QuotesTransaction;
import cn.fly.yun.domain.QuotesTransactionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuotesTransactionMapper {
    int countByExample(QuotesTransactionExample example);

    int deleteByExample(QuotesTransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuotesTransaction record);

    int insertSelective(QuotesTransaction record);

    List<QuotesTransaction> selectByExample(QuotesTransactionExample example);

    QuotesTransaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotesTransaction record, @Param("example") QuotesTransactionExample example);

    int updateByExample(@Param("record") QuotesTransaction record, @Param("example") QuotesTransactionExample example);

    int updateByPrimaryKeySelective(QuotesTransaction record);

    int updateByPrimaryKey(QuotesTransaction record);
}