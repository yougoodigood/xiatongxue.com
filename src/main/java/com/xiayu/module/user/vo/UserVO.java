package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.file.entity.FileComment;
import com.xiayu.module.file.entity.FileSuggestion;
import com.xiayu.module.file.vo.FileCommentVO;
import com.xiayu.module.file.vo.FileSuggestionVO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class UserVO extends BaseVO {
    private String id;
    private UserClassVO userClass;
    private UserGroupVO userGroup;
    private int userNumber;
    private String nickname;
    private String loginName;
    private String password;
    private int age;
    private String birthday;
    private String telephone;
    private String email;
    private String phone;
    private boolean isPhoneChecked;
    private boolean isEmailChecked;
    private String picture;
    private List<UserLoginVO> userLogins;
    private List<FileCommentVO> fileComments;
    private List<UserLikeCommentVO> userLikeComments;
    private List<FileSuggestionVO> fileSuggestions;
    private List<UserVideoNoteVO> userVideoNotes;
    private List<RealtimeCommentsVO> realtimeComments;
    private List<UserDownloadVO> userDownloads;
}
