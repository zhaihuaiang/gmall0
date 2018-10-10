package com.atguigu.gmall.manager;

import java.util.List;

public interface CatalogService {

    /**
     * 查询所有的一级分类
     * @return
     */
    public List<BaseCatalog1>  getAllBaseCatalog1();

    /**
     * 根据BaseCatalog1的ID查询所对应的二级分类
     * @param catalog1Id BaseCatalog1的ID
     * @return
     */
    public List<BaseCatalog2> getBaseCatalog1Byc1Id(Integer catalog1Id);
    /**
     * 根据BaseCatalog2的ID查询所对应的三级分类
     * @param catalog2Id  BaseCatalog2的ID
     * @return
     */
    public List<BaseCatalog3> getBaseCatalog2Byc1Id(Integer catalog2Id);

}
