package fluently.myzone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fluently.myzone.model.UserVO;
import fluently.myzone.service.IOperationUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	protected static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IOperationUserService iOperationUserService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void addUser(UserVO user) {
		iOperationUserService.addUser(user);
	}
	
	@RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
	public List<UserVO> queryAllUser() {
		logger.info("queryAllUser");
		List<UserVO> listUser = iOperationUserService.queryAllUser();
		logger.info(listUser.toString());
		return listUser;
	}
}
