package com.ztesoft.dispatcher.modules.cms.dao;

import com.ztesoft.dispatcher.common.persistence.CrudDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.cms.entity.Comment;

/**
 * 评论DAO接口
 *
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface CommentDao extends CrudDao<Comment> {

}
