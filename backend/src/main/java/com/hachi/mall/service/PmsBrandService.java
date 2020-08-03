package com.hachi.mall.service;

import com.hachi.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author yang
 * @version 1.0.0
 * @date 2020/8/3 20:32
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
