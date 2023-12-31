package net.store.project.vo.order;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {
    ORDER("주문접수"),
    DELIVERY("배송중"),
    COMPLETE("배송완료"),
    CANCEL("주문취소");

    private final String value;
}
