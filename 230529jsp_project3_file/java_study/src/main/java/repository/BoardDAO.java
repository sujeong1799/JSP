package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> selectList();

	BoardVO detailOne(int bno);

	int updateEdit(BoardVO bvo);

	int removeOne(int bno);
	
	int updateCount(int bno);

	BoardVO detail1(int bno);

	int total(PagingVO pgvo);

	List<BoardVO> PageList(PagingVO pgvo);


}
