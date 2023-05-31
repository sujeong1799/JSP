package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
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
		log.info("list service 진입");
		return bdao.selectList();
	}

	@Override
    public BoardVO detail(int bno) {
        int isOk = bdao.updateCount(bno);
        try {
            Thread.sleep(500); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (isOk > 0)? bdao.detailOne(bno) : null;
    }

	@Override
	public int edit(BoardVO bvo) {
		log.info("edit service 진입");
		return bdao.updateEdit(bvo);
	}

	@Override
	public int remove(int bno) {
		log.info("remove service 진입");
		return bdao.removeOne(bno);
	}

	@Override
	public BoardVO detail1(int bno) {
		log.info("detail1");
		return bdao.detail1(bno);
	}

	@Override
	public int total(PagingVO pgvo) {
		log.info("total service 진입");
		return bdao.total(pgvo);
	}

	@Override
	public List<BoardVO> PageList(PagingVO pgvo) {
		log.info("pageList service 진입");
		return bdao.pageList(pgvo);
	}

	@Override
	public String getFileName(int bno) {
		log.info("file service 진입");
		return bdao.selectRemoveFile(bno);
	}



}
