package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.CommentVO;
import orm.DatabaseBuilder;

public class CommentDAOImpl implements CommentDAO {
	private static final Logger log = LoggerFactory.getLogger(CommentDAOImpl.class);
	private SqlSession sql;
	private int isOk;
	private String CS = "CommentMapper.";
	
	public CommentDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession(); // sql연결
	}
	@Override
	public int post(CommentVO cvo) {
		log.info("post DAO 진입");
		isOk = sql.insert(CS+"post", cvo);
		if(isOk > 0) {
			sql.commit();
		}
		
		return isOk;
	}
	@Override
	public List<CommentVO> list(int bno) {
		log.info("comment list DAO 진입");
		return sql.selectList(CS+"list", bno);
	}
	@Override
	public int remove(int cno) {
		log.info("comment remove DAO 진입");
		isOk = sql.delete(CS+"remove", cno);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}
	@Override
	public int modify(CommentVO cvo) {
		log.info("comment modify DAO 진입");
		isOk = sql.update(CS+"modify", cvo);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

}
