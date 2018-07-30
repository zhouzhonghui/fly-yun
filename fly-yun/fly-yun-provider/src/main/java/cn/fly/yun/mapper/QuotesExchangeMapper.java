package cn.fly.yun.mapper;

import cn.fly.yun.domain.QuotesExchange;
import cn.fly.yun.domain.QuotesExchangeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuotesExchangeMapper {
    int countByExample(QuotesExchangeExample example);

    int deleteByExample(QuotesExchangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuotesExchange record);

    int insertSelective(QuotesExchange record);

    List<QuotesExchange> selectByExample(QuotesExchangeExample example);

    QuotesExchange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuotesExchange record, @Param("example") QuotesExchangeExample example);

    int updateByExample(@Param("record") QuotesExchange record, @Param("example") QuotesExchangeExample example);

    int updateByPrimaryKeySelective(QuotesExchange record);

    int updateByPrimaryKey(QuotesExchange record);
}