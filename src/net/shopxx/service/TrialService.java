package net.shopxx.service;

import java.util.Date;
import java.util.List;

import net.shopxx.Filter;
import net.shopxx.Order;
import net.shopxx.entity.Trial;

/**
 * Service - 促销
 * 
 * @author DongXinXing
 * @version 1.0
 */
public interface TrialService extends BaseService<Trial, Long> {

	/**
	 * 查找试用
	 * 
	 * @param hasBegun
	 *            是否已开始
	 * @param hasEnded
	 *            是否已结束
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @return 促销
	 */
	List<Trial> findList(Boolean hasBegun, Boolean hasEnded, Integer count, List<Filter> filters, List<Order> orders);
	
	/**
	 * 查找试用(缓存)
	 * 
	 * @param hasBegun
	 *            是否已开始
	 * @param hasEnded
	 *            是否已结束
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @param cacheRegion
	 *            缓存区域
	 * @return 促销(缓存)
	 */
	List<Trial> findList(Boolean hasBegun, Boolean hasEnded, Integer count, List<Filter> filters, List<Order> orders, String cacheRegion);

	/**
	 * 根据结束时间升序查询出所有还没有过期的和预试用的商品
	 */
	
	List<Trial> findOrderByEndDateAndDate(Date date);
}