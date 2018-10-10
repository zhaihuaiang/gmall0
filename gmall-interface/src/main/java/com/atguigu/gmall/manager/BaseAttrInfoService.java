package com.atguigu.gmall.manager;

import java.util.List;

public interface BaseAttrInfoService {
    /**
     * 获取某个平台属性的所有属性值
     * @param baseAttrInfoId
     * @return
     */
    public List<BaseAttrValue> getBaseAttrValueByAttrId(Integer baseAttrInfoId);

    /**
     * 根据ByCatalog3的ID查询所对应的平台属性名
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(Integer catalog3Id);

}
