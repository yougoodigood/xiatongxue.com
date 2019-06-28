drop table if exists t_author;

drop table if exists t_cg_file;

drop table if exists t_chapter;

drop table if exists t_city;

drop table if exists t_country;

drop table if exists t_course;

drop table if exists t_file;

drop table if exists t_file_commment;

drop table if exists t_menu_role;

drop table if exists t_permission;

drop table if exists t_project_class;

drop table if exists t_province;

drop table if exists t_realtime_comments;

drop table if exists t_role;

drop table if exists t_role1;

drop table if exists t_role_permission;

drop table if exists t_school;

drop table if exists t_school_course;

drop table if exists t_section;

drop table if exists t_system_menu;

drop table if exists t_user;

drop table if exists t_user_class;

drop table if exists t_user_download;

drop table if exists t_user_group;

drop table if exists t_user_like_comment;

drop table if exists t_user_login;

drop table if exists t_user_video_note;

drop table if exists t_user_watch_record;

drop table if exists t_video;

drop table if exists t_video_segment_info;

/*==============================================================*/
/* Table: t_author                                              */
/*==============================================================*/
create table t_author
(
   id                   varchar(255)                   not null PRIMARY KEY,
   role_id              char(10)                       null,
   login_name           varchar(255)                   null,
   real_name            varchar(255)                   null,
   id_card              char(10)                       null,
   password             varchar(255)                   null,
   birthday             date                           null,
   email                varchar(255)                   null,
   telephone            varchar(20)                    null,
   sex                  int                            null,
   level                int                            null,
   picture              varchar(255)                   null,
   create_time          datetime                       null,
   create_id            varchar(255)                   null,
   update_time          datetime                       null,
   update_id            varchar(255)                   null,
   community_age        int                            null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_cg_file                                             */
/*==============================================================*/
create table t_cg_file
(
   id                   varchar(255)                   not null PRIMARY KEY,
   auth_id              varchar(255)                   null,
   file_name            varchar(255)                   null,
   file_type            varchar(10)                    null,
   file_size            int                            null,
   file_md5             varchar(64)                    null,
   access_url           varchar(255)                   null,
   download_times       int                            null,
   upload_time          datetime                       null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_chapter                                             */
/*==============================================================*/
create table t_chapter
(
   id                   varchar(255)                   not null PRIMARY KEY,
   chapter_number       varchar(255)                   null,
   chapter_name         varchar(255)                   null,
   importance           int                            null,
   course_id            varchar(255)                   null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                    null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_city                                                */
/*==============================================================*/
create table t_city
(
   id                   varchar(255)                   not null PRIMARY KEY,
   city_name            varchar(255)                   null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_country                                             */
/*==============================================================*/
create table t_country
(
   id                   varchar(255)                   not null PRIMARY KEY,
   country_name         varchar(50)                    null,
   delflag              boolean                        null,
   cretate_id           varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_course                                              */
/*==============================================================*/
create table t_course
(
   id                   varchar(255)                   not null PRIMARY KEY,
   course_name          varchar(255)                   null,
   course_number        varchar(255)                   null,
   project_class_id     varchar(255)                   null,
   chapter_number       int                            null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_file                                                */
/*==============================================================*/
create table t_file
(
   id                   varchar(255)                   not null PRIMARY KEY,
   parent_id            varchar(255)                   null,
   file_number          char(10)                       null,
   name                 varchar(255)                   null,
   file_size            int                            null,
   file_md5             varchar(255)                   null,
   file_url             varchar(255)                   null,
   download_times       int                            null,
   file_suffix          varchar(20)                    null,
   like_times           int                            null,
   not_like_times       int                            null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_file_commment                                       */
/*==============================================================*/
create table t_file_commment
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_file_id            varchar(255)                   null,
   t_user_id            varchar(255)                   null,
   comment              varchar(500)                   null,
   like_times           int                            null,
   not_like_times       int                            null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_menu_role                                           */
/*==============================================================*/
create table t_menu_role
(
   id                   varchar(255)                   not null PRIMARY KEY,
   role_id              varchar(255)                   null,
   menu_id              varchar(255)                   null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_permission                                          */
/*==============================================================*/
create table t_permission
(
   id                   varchar(255)                   not null PRIMARY KEY,
   permission_name      varchar(255)                   null,
   url                  varchar(255)                   null,
   resource_type        int                            null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_project_class                                       */
/*==============================================================*/
create table t_project_class
(
   id                   varchar(255)                   not null PRIMARY KEY,
   project_name         varchar(255)                   null,
   project_class_no     char(10)                       null,
   short_comment        varchar(1024)                  null,
   create_id            varchar(255)                   null,
   create_time          varchar(255)                   null,
   update_id            varchar(255)                   null,
   update_time          varchar(255)                   null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_province                                            */
/*==============================================================*/
create table t_province
(
   id                   varchar(255)                   not null PRIMARY KEY,
   province_name        varchar(255)                   null,
   country_id           varchar(255)                   null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_realtime_comments                                   */
/*==============================================================*/
create table t_realtime_comments
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_user_id            varchar(255)                   null,
   t_video_id           varchar(255)                   null,
   comment            varchar(1024)                  null,
   videos_time          int                            null,
   font_size            int                            null,
   color                varchar(20)                    null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   id                   varchar(255)                   not null PRIMARY KEY,
   role_name            varchar(50)                    null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_time          datetime                       null,
   update_id            varchar(255)                   null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_role1                                               */
/*==============================================================*/
create table t_role1
(
   id                   varchar(255)                   not null PRIMARY KEY,
   role_name            varchar(255)                   null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_role_permission                                     */
/*==============================================================*/
create table t_role_permission
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_permission_id      varchar(255)                   null,
   t_role_id            varchar(255)                   null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_school                                              */
/*==============================================================*/
create table t_school
(
   id                   varchar(255)                   not null PRIMARY KEY,
   school_name          varchar(255)                   null,
   school_number        varchar(255)                   null,
   student_numbers      int                            null,
   course_numbers       int                            null,
   delflag              boolean                        null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null
);

/*==============================================================*/
/* Table: t_school_course                                       */
/*==============================================================*/
create table t_school_course
(
   id                   varchar(255)                   not null PRIMARY KEY,
   school_id            varchar(255)                   null,
   course_id            varchar(255)                   null,
   delflag              boolean                        null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_section                                             */
/*==============================================================*/
create table t_section
(
   id                   varchar(255)                   not null PRIMARY KEY,
   section_number       char(10)                       null,
   section_name         varchar(255)                   null,
   chapter              varchar(255)                   null,
   file_id              varchar(255)                   null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_system_menu                                         */
/*==============================================================*/
create table t_system_menu
(
   id                   varchar(255)                   not null PRIMARY KEY,
   menu_name            varchar(255)                   null,
   parentide            varchar(255)                   null,
   navigate_url         varchar(255)                   null,
   menu_cssid           varchar(255)                   null,
   order_seq            int                            null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   id                   varchar(255)                   not null PRIMARY KEY,
   user_class_id        varchar(255)                   null,
   user_group_id        varchar(255)                   null,
   user_number          int                            null,
   nickname             varchar(255)                   null,
   login_name           varchar(255)                   null,
   password             varchar(255)                   null,
   age                  int                            null,
   birthday             date                           null,
   telephone            varchar(20)                    null,
   email                varchar(255)                   null,
   is_phone_checked     boolean                        null,
   is_email_checked     boolean                        null,
   picture              varchar(255)                   null,
   country_id           varchar(255)                   null,
   province_id          varchar(255)                   null,
   detail_address       varchar(255)                   null,
   city_id              varchar(255)                   null,
   last_login_time      datetime                       null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   isBan                boolean                        null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_user_class                                          */
/*==============================================================*/
create table t_user_class
(
   id                   varchar(255)                   not null PRIMARY KEY,
   class_number         varchar(255)                   null,
   class_name           varchar(255)                   null,
   user_amount          int                            null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   delflag              boolean                        null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_user_download                                       */
/*==============================================================*/
create table t_user_download
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_user_id            varchar(255)                   null,
   t_file_id            varchar(255)                   null,
   download_time        datetime                       null
);

/*==============================================================*/
/* Table: t_user_group                                          */
/*==============================================================*/
create table t_user_group
(
   id                   varchar(255)                   not null PRIMARY KEY,
   role_id              varchar(255)                   null,
   group_name           varchar(255)                   null,
   group_numbers        int                            null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_user_like_comment                                   */
/*==============================================================*/
create table t_user_like_comment
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_user_id            varchar(255)                   null,
   comment_id           varchar(255)                   null,
   is_like              boolean                        null,
   create_time          datetime                       null
);

/*==============================================================*/
/* Table: t_user_login                                          */
/*==============================================================*/
create table t_user_login
(
   id                   varchar(255)                   not null PRIMARY KEY,
   user_id              varchar(255)                   null,
   retry_times          int                            null,
   login_ip             varchar(50)                    null,
   login_browser        varchar(255)                   null,
   login_place          varchar(255)                   null,
   identify_code        varchar(10)                    null,
   login_domain         varchar(255)                   null,
   create_time          datetime                       null,
   update_time          datetime                       null
);

/*==============================================================*/
/* Table: t_user_video_note                                     */
/*==============================================================*/
create table t_user_video_note
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_user_id            varchar(255)                   null,
   t_video_id           varchar(255)                   null,
   note_content         varchar(1024)                  null,
   create_id            varchar(255)                   null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_user_watch_record                                   */
/*==============================================================*/
create table t_user_watch_record
(
   id                   varchar(255)                   not null PRIMARY KEY,
   t_user_id            varchar(255)                   null,
   t_video_id           varchar(255)                   null,
   start                int                            null,
   end                  int                            null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_video                                               */
/*==============================================================*/
create table t_video
(
   id                   varchar(255)                   not null PRIMARY KEY,
   video_number         char(10)                       null,
   length               int                            null,
   watch_times          int                            null,
   online_users         int                            null,
   delflag              boolean                        null
);

/*==============================================================*/
/* Table: t_video_segment_info                                  */
/*==============================================================*/
create table t_video_segment_info
(
   id                   varchar(255)                   not null PRIMARY KEY,
   video_id             varchar(255)                   null,
   level                int                            null,
   start                int                            null,
   end                  int                            null,
   create_id            varchar(255)                   null,
   delflag              boolean                        null,
   create_time          datetime                       null,
   update_id            varchar(255)                   null,
   update_time          datetime                       null
);
