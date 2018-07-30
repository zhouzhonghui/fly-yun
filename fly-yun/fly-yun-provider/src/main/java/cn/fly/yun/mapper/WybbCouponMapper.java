package cn.fly.yun.mapper;

import cn.fly.yun.domain.WybbCoupon;
import cn.fly.yun.domain.WybbCouponExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WybbCouponMapper {
    int countByExample(WybbCouponExample example);

    int deleteByExample(WybbCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WybbCoupon record);

    int insertSelective(WybbCoupon record);

    List<WybbCoupon> selectByExample(WybbCouponExample example);

    WybbCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WybbCoupon record, @Param("example") WybbCouponExample example);

    int updateByExample(@Param("record") WybbCoupon record, @Param("example") WybbCouponExample example);

    int updateByPrimaryKeySelective(WybbCoupon record);

    int updateByPrimaryKey(WybbCoupon record);
}