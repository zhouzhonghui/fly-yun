package cn.fly.yun.schedule;

import cn.fly.yun.domain.WybbCoupon;
import cn.fly.yun.domain.WybbCouponThird;
import cn.fly.yun.mapper.WybbCouponMapper;
import cn.fly.yun.mapper.WybbCouponThirdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Component
public class CouponServiceImpl implements CouponService{

    @Autowired
    private WybbCouponMapper couponMapper;

    @Autowired
    private WybbCouponThirdMapper thirdMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addCoupon(int i) throws Exception{
//        WybbCoupon coupon = new WybbCoupon();
//        coupon.setId(Long.parseLong(i+""));
//        if (i % 2 == 0) {
//            coupon.setName("飞海轮活动绿卡");
//            coupon.setDiscountAmount(BigDecimal.valueOf(0));
//            coupon.setDescription("绿卡优惠券");
//        } else {
//            int random = (int) (Math.random() * 100 + 1);
//            coupon.setName("飞轮海" + random + "she抵扣券");
//            coupon.setDiscountAmount(BigDecimal.valueOf(random));
//            coupon.setDescription("投保抵扣券");
//        }
//        coupon.setCouponCategoryId(1l);
//        coupon.setDiscountReduction(BigDecimal.valueOf(0));
//        coupon.setBeginTime(new Date());
//        coupon.setValidDate(7);
//        coupon.setOverTime(DateTimeUtils.getSpecifiedDayAfter(new Date(),20));
//        coupon.setCreatedAt(new Date());
//        coupon.setCategoryType(0);
//        coupon.setIcon("/statics/wap/images/oilIconImg/oil_icon.png");
//        coupon.setState(1);
//        coupon.setSort(0);
//        coupon.setLimitLeastTime(0);
//        int id = couponMapper.insert(coupon);


        WybbCouponThird third = new WybbCouponThird() ;
        third.setLotteryActivityId(1l);
        third.setStatus(0);
        third.setCreatedAt(new Date()) ;
        third.setState(1);
        third.setCouponId(1l);
        third.setCouponCode(UUID.randomUUID().toString().replaceAll("-","").substring(0,10).toLowerCase());
        third.setSort(1);
        thirdMapper.insert(third) ;
    }
}
