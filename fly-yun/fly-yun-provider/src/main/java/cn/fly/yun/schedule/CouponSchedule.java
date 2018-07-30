package cn.fly.yun.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class CouponSchedule {
    @Autowired
    CouponService couponService ;

    @Scheduled(fixedRate = 900000000)
    public void addCoupon() {
        for(int i = 0;i<2800;i++) {
            try {
                couponService.addCoupon(i) ;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
