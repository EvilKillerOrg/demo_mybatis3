package com.ek.mybatis.day2.many2many.pojo;

import java.util.Date;
/**
 * 商品表 m_items
 * @author EK
 * @date 2017年8月26日
 */
public class ItemsM2M {
  private Integer id;
  private String name;
  private Float price;
  private String detail;
  private String pic;
  private Date createTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public String toString() {
    return "ItemsM2M [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", pic=" + pic
        + ", createTime=" + createTime + "]";
  }
  
}