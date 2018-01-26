package com.ek.mybatis.day2.one2many.pojo;

/**
 * 订单明细表 m_orderdetail
 * @author EK
 * @date 2017年8月26日
 */
public class OrderDetailO2M {
  private Integer id;
  private Integer ordersId;
  private Integer itemsId;
  private Integer itemsNum;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOrdersId() {
    return ordersId;
  }

  public void setOrdersId(Integer ordersId) {
    this.ordersId = ordersId;
  }

  public Integer getItemsId() {
    return itemsId;
  }

  public void setItemsId(Integer itemsId) {
    this.itemsId = itemsId;
  }

  public Integer getItemsNum() {
    return itemsNum;
  }

  public void setItemsNum(Integer itemsNum) {
    this.itemsNum = itemsNum;
  }

  @Override
  public String toString() {
    return "OrderDetailO2M [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum
        + "]";
  }
}