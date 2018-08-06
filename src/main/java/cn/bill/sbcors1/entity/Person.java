package cn.bill.sbcors1.entity;

import java.io.Serializable;

/**
 * Description: <br/>
 * Date:2018年8月2日 上午9:35:03 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@SuppressWarnings("serial")
public class Person implements Serializable
{
	private String id;
	private String name;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

}
