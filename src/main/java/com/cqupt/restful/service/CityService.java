package com.cqupt.restful.service;

import com.cqupt.restful.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口
 *
 * Created by I am master on 2018/1/2.
 */
public interface CityService {

    /**
     * 获取城市信息列表
     *
     * @return
     * */
    List<City> findAllCity();

    /**
     * 根据城市id,查询城市信息
     *
     * @param id
     * @return
     * */
    City findCityById(Long id);

    /**
     * 新增城市信息
     *
     *@param city
     *@return
     * */
    Long saveCity(City city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     * */
    Long updateCity(City city);

    /**
     * 根据城市ID，删除城市信息
     *
     * @param id
     * @return
     * */
    Long deleteCity(Long id);

}
