package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> list();

	BoardVO selectOne(int bno);

	BoardVO modifyOne(int bno);

	int editOne(BoardVO bvo);

	BoardVO removeOne(int bno);

	int total();

	List<BoardVO> pageList(PagingVO pgvo);


}
