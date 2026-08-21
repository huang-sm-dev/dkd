package com.dkd.manage.mapper;

import com.dkd.manage.domain.SkuClass;

import java.util.List;

/**
 * 商品类型Mapper接口
 */
public interface SkuClassMapper 
{
    /**
     * 查询商品类型
     * 
     * @param classId 商品类型主键
     * @return 商品类型
     */
    public SkuClass selectSkuClassByClassId(Long classId);

    /**
     * 查询商品类型列表
     * 
     * @param skuClass 商品类型
     * @return 商品类型集合
     */
    public List<SkuClass> selectSkuClassList(SkuClass skuClass);

    /**
     * 新增商品类型
     * 
     * @param skuClass 商品类型
     * @return 结果
     */
    public int insertSkuClass(SkuClass skuClass);

    /**
     * 修改商品类型
     * 
     * @param skuClass 商品类型
     * @return 结果
     */
    public int updateSkuClass(SkuClass skuClass);

    /**
     * 删除商品类型
     * 
     * @param classId 商品类型主键
     * @return 结果
     */
    public int deleteSkuClassByClassId(Long classId);

    /**
     * 批量删除商品类型
     * 
     * @param classIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSkuClassByClassIds(Long[] classIds);
}
