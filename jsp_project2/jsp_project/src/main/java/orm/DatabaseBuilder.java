package orm;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseBuilder {
	// 여기서도 log를 표현했으면 좋겠다
	private static Logger log = LoggerFactory.getLogger(DatabaseBuilder.class);
	private static SqlSessionFactory factory;
	private static final String config = "orm/MybatisConfig.xml"; //MybatisConfig 경로를 넣는다
	
	static {
		try {
			factory = new SqlSessionFactoryBuilder().build(
					Resources.getResourceAsReader(config));
		} catch (IOException e) {
			log.info("Mybatis 설정 오류"); //log.info == sysout
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
