package cn.fly.yun.mapper;

import cn.fly.yun.domain.WybbMemberCoupon;
import cn.fly.yun.domain.WybbMemberCouponExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface WybbMemberCouponMapper {
    int countByExample(WybbMemberCouponExample example);

    int deleteByExample(WybbMemberCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WybbMemberCoupon record);

    int insertSelective(WybbMemberCoupon record);

    List<WybbMemberCoupon> selectByExample(WybbMemberCouponExample example);

    WybbMemberCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WybbMemberCoupon record, @Param("example") WybbMemberCouponExample example);

    int updateByExample(@Param("record") WybbMemberCoupon record, @Param("example") WybbMemberCouponExample example);

    int updateByPrimaryKeySelective(WybbMemberCoupon record);

    int updateByPrimaryKey(WybbMemberCoupon record);

    List<WybbMemberCoupon> selectMemberCoupon(Map<String, Object> map);

    int countMemberCoupon(Map<String, Object> map);
}