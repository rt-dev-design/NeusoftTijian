package edu.scau.tijian.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Integer orderId;
    private String orderDate;
    private String userId;
    private Integer hpId;
    private Integer smId;
    private Integer state;

}
