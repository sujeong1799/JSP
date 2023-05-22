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
	// NameSpace = SQL이 mapper를 구분하기 위한 이름
	// NameSpace.SQL구문이름
	private String CS = "CommentMapper.";
	private int isOk;
	
	public CommentDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession(); // sql연결이라고하네여
	}
	
	
	@Override
	public int post(CommentVO cvo) {
		log.info(">>> comment post > DAO in");
		isOk = sql.insert(CS+"post", cvo);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}


	@Override
	public List<CommentVO> getList(int bno) {
		log.info(">>> comment list > DAO in");
		return sql.selectList(CS+"list", bno);
	}


	@Override
	public int remove(int cno) {
		log.info(">>> comment remove > DAO in");
		isOk = sql.delete(CS+"remove", cno);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}


	@Override
	public int edit(CommentVO cvo) {
		log.info(">>> comment edit > DAO in");
		isOk = sql.update(CS+"edit", cvo);
		if(isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

}
