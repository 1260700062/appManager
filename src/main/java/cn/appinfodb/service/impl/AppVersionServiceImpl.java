package cn.appinfodb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.appinfodb.dao.AppVersionMapper;
import cn.appinfodb.pojo.AppVersion;
import cn.appinfodb.service.AppVersionService;
@Service
public class AppVersionServiceImpl implements AppVersionService {
	
	@Autowired
	private AppVersionMapper appVersionMapper;
	
	@Override
	public String getAppVersionByVersionId(long id) {
		String version = appVersionMapper.selectVersionNoByVersionId(id);
		return version;
	}

	@Override
	public int addAppVersion(AppVersion appVersion) {
		int i = appVersionMapper.addVersion(appVersion);
		return i;
	}

}
