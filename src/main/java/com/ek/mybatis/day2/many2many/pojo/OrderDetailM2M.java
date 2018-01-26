package com.ek.mybatis.day2.many2many.pojo;

/**
 * 订单明细表 m_orderdetail
 * @author EK
 * @date 2017年8月26日
 */
public class OrderDetailM2M {
  private Integer id;
  private Integer ordersId;
  private Integer itemsId;
  private Integer itemsNum;
  
  // 一条明细只对应一个商品 一对一
  private ItemsM2M items; 

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

  public ItemsM2M getItems() {
    return items;
  }

  public void setItems(ItemsM2M items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "OrderDetailM2M [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum=" + itemsNum
        + ", items=" + items + "]";
  }
}