package repository;

import java.util.List;

import domain.ProductVO;

public interface DAO {

	

	int insert(ProductVO pvo);

	List<ProductVO> selectList();

	ProductVO selectOne(int pno);

	int editOne(ProductVO pvo1);

	int remove(int pno2);


}
