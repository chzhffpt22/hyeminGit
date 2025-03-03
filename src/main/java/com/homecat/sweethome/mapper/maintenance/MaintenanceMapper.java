package com.homecat.sweethome.mapper.maintenance;

import java.util.List;
import java.util.Map;

import com.homecat.sweethome.vo.attach.AttachVO;
import com.homecat.sweethome.vo.maintenance.MaintenanceVO;

public interface MaintenanceMapper {



	// 목록 뷰
//	public List<MaintenanceVO> list(Map<String, Object> map);
	public List<MaintenanceVO> list(MaintenanceVO maintenanceVO);

	// 상세 뷰
	public MaintenanceVO detail(String mtSeq);

	// 하자보수 신청
	public int createPost(MaintenanceVO maintenanceVO);

	// 회원정보 가져오기
	public MaintenanceVO getMemberInfo(String memId);

	// 하자보수 순번 가져오기
	public String getMtSeq();

	// 수정수정
	public int updatePost(MaintenanceVO maintenanceVO);

	// 삭제
	public int deletePost(Map<String, Object> map);

	///////////////// 관리자
	///////////////// 페이지///////////////////////////////////////////////////////////////////
	// 입주민 하자보수 신청 내역
//	public List<MaintenanceVO> adList(Map<String, Object> map);
	public List<MaintenanceVO> adList(MaintenanceVO maintenanceVO);

	// 모달 상세
	public MaintenanceVO modalDetail(MaintenanceVO maintenanceVO);

	// 모달 수정1
	public int modalUpdate(MaintenanceVO maintenanceVO);

	// 모달 수정2
	public int modalUpdate2(MaintenanceVO maintenanceVO);

	public List<MaintenanceVO> homeCnt();

	//첨부파일
	public List<AttachVO> selectAttachList(String attach);

	//처리상태 데이터 카운트
	public List<MaintenanceVO> statusCount();

	public String getMemId(String mtSeq);

	
	// 모달 업체등록
//	public int modalCreate(MaintenanceVO maintenanceVO);
}
