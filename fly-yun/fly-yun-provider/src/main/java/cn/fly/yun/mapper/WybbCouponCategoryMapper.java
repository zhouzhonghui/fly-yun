package cn.fly.yun.mapper;

import cn.fly.yun.domain.WybbCouponCategory;
import cn.fly.yun.domain.WybbCouponCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WybbCouponCategoryMapper {
    int countByExample(WybbCouponCategoryExample example);

    int deleteByExample(WybbCouponCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WybbCouponCategory record);

    int insertSelective(WybbCouponCategory record);

    List<WybbCouponCategory> selectByExample(WybbCouponCategoryExample example);

    WybbCouponCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WybbCouponCategory record, @Param("example") WybbCouponCategoryExample example);

    int updateByExample(@Param("record") WybbCouponCategory record, @Param("example") WybbCouponCategoryExample example);

    int updateByPrimaryKeySelective(WybbCouponCategory record);

    int updateByPrimaryKey(WybbCouponCategory record);
}