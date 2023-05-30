package repository;

import java.util.List;

import domain.BoardVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> list();

	BoardVO detailOne(int bNum);

	int editOne(BoardVO bvo);

	int removeOne(int bNum);

	int updateCount(int bNum);

}
