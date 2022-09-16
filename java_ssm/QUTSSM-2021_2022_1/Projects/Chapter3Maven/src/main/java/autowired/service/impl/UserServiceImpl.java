package autowired.service.impl;

import autowired.domain.User;
import autowired.service.UserService;
import org.springframework.stereotype.*;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User>
	implements UserService
{
}