package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.file.entity.FileComment;
import com.xiayu.module.file.entity.FileSuggestion;
import com.xiayu.module.user.entity.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class UserVO extends BaseVO {
    private String id;
    private UserClass userClass;
    private UserGroup userGroup;
    private int userNumber;
    private String nickname;
    private String loginName;
    private String password;
    private int age;
    private Date birthday;
    private String telephone;
    private String email;
    private boolean isPhoneChecked;
    private boolean isEmailChecked;
    private String picture;
    private List<UserLogin> userLogins;
    private List<FileComment> fileComments;
    private List<UserLikeComment> userLikeComments;
    private List<FileSuggestion> fileSuggestions;
    private List<UserVideoNote> userVideoNotes;
    private List<RealtimeComments> realtimeComments;
    private List<UserDownload> userDownloads;
}
