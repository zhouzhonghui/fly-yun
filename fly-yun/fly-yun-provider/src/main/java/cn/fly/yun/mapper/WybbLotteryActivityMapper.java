package cn.fly.yun.mapper;

import cn.fly.yun.domain.WybbLotteryActivity;
import cn.fly.yun.domain.WybbLotteryActivityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WybbLotteryActivityMapper {
    int countByExample(WybbLotteryActivityExample example);

    int deleteByExample(WybbLotteryActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WybbLotteryActivity record);

    int insertSelective(WybbLotteryActivity record);

    List<WybbLotteryActivity> selectByExample(WybbLotteryActivityExample example);

    WybbLotteryActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WybbLotteryActivity record, @Param("example") WybbLotteryActivityExample example);

    int updateByExample(@Param("record") WybbLotteryActivity record, @Param("example") WybbLotteryActivityExample example);

    int updateByPrimaryKeySelective(WybbLotteryActivity record);

    int updateByPrimaryKey(WybbLotteryActivity record);
}