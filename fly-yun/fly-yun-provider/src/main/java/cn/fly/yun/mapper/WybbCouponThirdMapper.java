package cn.fly.yun.mapper;

import cn.fly.yun.domain.WybbCouponThird;
import cn.fly.yun.domain.WybbCouponThirdExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WybbCouponThirdMapper {
    int countByExample(WybbCouponThirdExample example);

    int deleteByExample(WybbCouponThirdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WybbCouponThird record);

    int insertSelective(WybbCouponThird record);

    List<WybbCouponThird> selectByExample(WybbCouponThirdExample example);

    WybbCouponThird selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WybbCouponThird record, @Param("example") WybbCouponThirdExample example);

    int updateByExample(@Param("record") WybbCouponThird record, @Param("example") WybbCouponThirdExample example);

    int updateByPrimaryKeySelective(WybbCouponThird record);

    int updateByPrimaryKey(WybbCouponThird record);
}