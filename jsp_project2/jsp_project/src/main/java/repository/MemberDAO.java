package repository;

import java.util.List;

import domain.MemberVO;

public interface MemberDAO {

	int insert(MemberVO mvo);

	MemberVO selectOne(MemberVO mvo2);

	int lastlogin(String id2);

	int edit(MemberVO mvo4);

	int delete(MemberVO mvo5);

	List<MemberVO> selectList();



}
