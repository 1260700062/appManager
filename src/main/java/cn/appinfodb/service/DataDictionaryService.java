package cn.appinfodb.service;

import java.util.List;

import cn.appinfodb.pojo.DataDictionary;

public interface DataDictionaryService {
	public List<DataDictionary> getAllDataDictionaryFlatform();
	public String getNameByFlatformid(Long valueId);
	public String getPublishStatusNameById(Long publishstatus);
	public List<DataDictionary> getAllPublishName();
}
