package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import repository.BoardDAO;
import repository.BoardDAOImpl;

public class BoardServiceImpl implements BoardService {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	private BoardDAO bdao;
	
	public BoardServiceImpl() {
		bdao = new BoardDAOImpl();
	}
	
	@Override
	public int insert(BoardVO bvo) {
		log.info("insert service 진입");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> list() {
		log.info("List service 진입");
		return bdao.list();
	}

	@Override
	public BoardVO detail(int bNum) {
		int isOk = bdao.updateCount(bNum);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("detail service 진입");
		return (isOk > 0 ) ? bdao.detailOne(bNum) : null;
	}

	@Override
	public int edit(BoardVO bvo) {
		log.info("edit service 진입");
		return bdao.editOne(bvo);
	}

	@Override
	public int remove(int bNum) {
		log.info("remove service 진입");
		return bdao.removeOne(bNum);
	}

}
