package com.md.common.vo;

import java.io.Serializable;
import java.util.List;

/**VO(Value Object):值对象(封装数据，数据传递)
 * 在这里要借助PageObject对象封装分页查询信息
 * 例如从数据层获取的当前记录，总记录数，以及基于
 * 总记录数计算的总页数
 * @author ta
 * @param <T>
 */
public class PageObject<T> implements Serializable {
	private static final long serialVersionUID = -7368493786259905794L;
	/**当前页的页码值*/
	private Integer pageCurrent=1;
    /**页面大小*/
    private Integer pageSize=3;
    /**总行数(通过查询获得)*/
    private Integer rowCount=0;
    /**总页数(通过计算获得)*/
    private Integer pageCount=0;
    /**当前页记录*/
    private List<T> records;
	public Integer getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	public Integer getPageCount() {
		//pageCount=(rowCount-1)/pageSize+1;
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public List<T> getRecords() {
		return records;
	}
	public void setRecords(List<T> records) {
		this.records = records;
	}
    
    

}
