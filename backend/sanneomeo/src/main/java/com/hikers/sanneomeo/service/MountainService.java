package com.hikers.sanneomeo.service;

import com.hikers.sanneomeo.domain.MountainDocument;
import com.hikers.sanneomeo.dto.request.UploadImagesRequestDto;
import com.hikers.sanneomeo.dto.request.WriteReviewRequestDto;
import com.hikers.sanneomeo.dto.response.MountainDetailResponseDto;
import com.hikers.sanneomeo.dto.response.MountainPosResponseDto;
import com.hikers.sanneomeo.dto.response.NearMountainResponseDto;
import com.hikers.sanneomeo.dto.response.ReviewResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface MountainService {

    //사진 등록
    boolean createRecordPhotos(UploadImagesRequestDto uploadImagesRequestDto, List<String> uploadImgUrls, Long mountainSeq);

    //산 후기 작성
    boolean writeReview(WriteReviewRequestDto writeReviewRequestDto);

    //산 위치 정보
    MountainPosResponseDto getPos(String mountainIdx);

    //후기 리스트
    List<ReviewResponseDto> reviewList(String mountainIdx, Long authUserSeq);

    //후기 삭제
    void deleteReview(Long reviewIdx);

    MountainDetailResponseDto getMountainInfoBysequence(String sequence);
    NearMountainResponseDto getMountainSeqByDistance(BigDecimal latitude, BigDecimal longitude);

    //mountain
    List<MountainDocument> search(String key);

}
