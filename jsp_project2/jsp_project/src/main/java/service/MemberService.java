package service;

import java.util.List;

import domain.MemberVO;

public interface MemberService {

	int register(MemberVO mvo);

	MemberVO login(MemberVO mvo2);

	int lastLogin(String id2);

	int edit(MemberVO mvo4);

	int delete(MemberVO mvo5);

	List<MemberVO> list();





}
