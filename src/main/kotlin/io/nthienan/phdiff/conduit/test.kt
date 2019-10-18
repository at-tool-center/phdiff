package io.nthienan.phdiff.conduit

import io.nthienan.phdiff.differential.Diff
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.Date

/**
 * description
 *
 * @author pzx (zhanxuan_peng@sui.com)
 * @version 1.0
 * @since 2019/10/18
 */
fun main(args:Array<String>) {
  var query = "{\"sourceControlBaseRevision\":\"2292ccfe4d3585e158a1932044b75932a88d56fd\",\"lintStatus\":\"0\",\"authorEmail\":\"xiquan_shen@sui.com\",\"sourceControlPath\":null,\"changes\":[{\"metadata\":{\"line:first\":1,\"hash.effect\":\"7NeZR5gKp0QZ\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeWayEnum.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"30\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"30\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.setting.enums;\\n+\\n+/**\\n+ * 通知方式枚举类\\n+ *\\n+ * @author qintao_fang\\n+ * @since 2019/7/10\\n+ */\\n+public enum NoticeWayEnum {\\n+\\n+    WAY_SMS(1, \\\"短信方式\\\"),\\n+    WAY_PUSH(2, \\\"Push消息方式\\\");\\n+\\n+    NoticeWayEnum(Integer way, String desc){\\n+        this.way = way;\\n+        this.desc = desc;\\n+    }\\n+    private Integer way;\\n+    private String desc;\\n+\\n+    public Integer getWay() {\\n+        return way;\\n+    }\\n+\\n+    public String getDesc() {\\n+        return desc;\\n+    }\\n+\\n+\\n+}\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5211\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"4AoHxLy0PNok\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeTypeEnum.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"40\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"40\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.setting.enums;\\n+\\n+/**\\n+ * 通知类型枚举类\\n+ *\\n+ * @author qintao_fang\\n+ * @since 2019/7/10\\n+ */\\n+public enum NoticeTypeEnum {\\n+\\n+    TYPE_AWARD(1, \\\"主动通知\\\"),\\n+\\n+    TYPE_NODE_NAME(11, \\\"好友完成<实名>通知\\\"),\\n+    TYPE_NODE_ENHANCE(12, \\\"好友完成<增信>通知\\\"),\\n+    TYPE_NODE_CREDIT(13, \\\"好友完成<授信>通知\\\"),\\n+    TYPE_NODE_FIRST_LOAN(14, \\\"好友完成<首借>通知\\\"),\\n+\\n+    TYPE_NOTICE_KN_FEED_BACK(21, \\\"卡牛返现活动通知!\\\"),\\n+    TYPE_NOTICE_REJECT_COMPENSATE(22, \\\"拒就赔活动通知!\\\"),\\n+    TYPE_NOTICE_FREE_ORDER_WINNER(23, \\\"免单活动-中奖通知\\\"),\\n+    TYPE_NOTICE_FREE_ORDER_LOSER(24, \\\"免单活动-参与通知\\\"),\\n+    ;\\n+\\n+    NoticeTypeEnum(int type, String desc){\\n+        this.type = type;\\n+        this.desc = desc;\\n+    }\\n+    private int type;\\n+    private String desc;\\n+\\n+    public int getType() {\\n+        return type;\\n+    }\\n+\\n+    public String getDesc() {\\n+        return desc;\\n+    }\\n+\\n+\\n+}\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5210\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"UIUtBPKGAWyv\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeStatusEnum.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"31\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"31\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.setting.enums;\\n+\\n+/**\\n+ * 活动用户通知状态枚举类\\n+ *\\n+ * @author qintao_fang\\n+ * @since 2019/7/10\\n+ */\\n+public enum NoticeStatusEnum {\\n+\\n+    STATUS_NONE(0, \\\"未开启\\\"),\\n+    STATUS_OPEN(1, \\\"已启动\\\"),\\n+    STATUS_CLOSE(2, \\\"已关闭\\\");\\n+\\n+    NoticeStatusEnum(int status, String desc){\\n+        this.status = status;\\n+        this.desc = desc;\\n+    }\\n+    private int status;\\n+    private String desc;\\n+\\n+    public int getStatus() {\\n+        return status;\\n+    }\\n+\\n+    public String getDesc() {\\n+        return desc;\\n+    }\\n+\\n+\\n+}\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5209\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"2vCHg17km_Gt\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/recordno/constants/RecordNoConstants.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"54\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"54\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.recordno.constants;\\n+\\n+/**\\n+ * 秒杀活动常量\\n+ *\\n+ * @author xiquan_shen\\n+ * @version 1.0\\n+ * @since 2019/10/15\\n+ */\\n+public class RecordNoConstants {\\n+\\n+\\t/**\\n+\\t * 存储recordNo的redis key\\n+\\t */\\n+\\tprivate static final String RECORD_NO_POOL_KEY_PATTERN = \\\"act_center_record_no_pool_%s\\\";\\n+\\n+    /**\\n+     * redis数组里最低值，小于这个值就要加入新的recordNo了\\n+     */\\n+\\tpublic static final int RECORD_NO_MINIMUM_VALUE = 2000;\\n+\\n+    /**\\n+     * 每次加入recordNo的数量\\n+     */\\n+\\tpublic static final int RECORD_NO_ADD_BATCH_NO = 10000;\\n+\\n+    /**\\n+     * 每次入库的数量\\n+     */\\n+\\tpublic static final int RECORD_NO_ADD_BATCH_MAX = 500;\\n+\\n+    /**\\n+     * 编号的位数\\n+     */\\n+\\tpublic static final int RECORD_NO_DIGIT = 8;\\n+\\n+    /**\\n+     * 正常编号的格式\\n+\\t * 8位数字，不足8位前面补0\\n+     */\\n+\\tpublic static final String RECORD_NO_FORMAT_NORMAL = \\\"%08d\\\";\\n+\\n+    /**\\n+     * 临时编号的格式\\n+\\t * D+7位数字，其中7位数字不足7位前面补0\\n+     */\\n+\\tpublic static final String RECORD_NO_FORMAT_TEMP = \\\"D%07d\\\";\\n+\\n+\\n+\\tpublic static String getRecordNoPoolKey(String actCode) {\\n+\\t\\treturn String.format(RECORD_NO_POOL_KEY_PATTERN, actCode);\\n+\\t}\\n+\\n+}\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5208\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"Mu.auu1NYT6z\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/recordno/bo/NullActRecordNoBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"12\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"12\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.recordno.bo;\\n+\\n+public class NullActRecordNoBO extends ActRecordNoBO {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn true;\\n+\\t}\\n+\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5207\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"YQ.Q9X7daZUN\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/recordno/bo/ActRecordNoBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"54\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"54\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.recordno.bo;\\n+\\n+import lombok.Data;\\n+import com.kingdee.finance.common.operation.code.base.Nullable;\\n+import java.io.Serializable;\\n+import io.swagger.annotations.*;\\n+\\n+import java.util.Date;\\n+\\n+/**\\n+ * 活动已用编码表\\n+ * Created on 2019-10-15\\n+ */\\n+@ApiModel(\\\"活动已用编码表\\\")\\n+@Data\\n+public class ActRecordNoBO implements Serializable, Nullable {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn false;\\n+\\t}\\n+\\n+\\t/**\\n+\\t * 自增长字段,主键\\n+\\t */\\n+\\t@ApiModelProperty(\\\"自增长字段,主键\\\")\\n+\\tprivate Long id;\\n+\\n+\\t/**\\n+\\t * 活动代码\\n+\\t */\\n+\\t@ApiModelProperty(\\\"活动代码\\\")\\n+\\tprivate String actCode;\\n+\\n+\\t/**\\n+\\t * 编码code\\n+\\t */\\n+\\t@ApiModelProperty(\\\"编码code\\\")\\n+\\tprivate String recordNo;\\n+\\n+\\t/**\\n+\\t * 新建时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"新建时间\\\")\\n+\\tprivate Date createTime;\\n+\\n+\\t/**\\n+\\t * 更新时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"更新时间\\\")\\n+\\tprivate Date updateTime;\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5206\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":14,\"hash.effect\":\"_LO1PfsD6kDK\"},\"newProperties\":[],\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/notice/enums/NoticeBusinessEnum.java\",\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/notice/enums/NoticeBusinessEnum.java\",\"oldProperties\":[],\"type\":\"2\",\"commitHash\":null,\"addLines\":\"2\",\"hunks\":[{\"oldLength\":\"45\",\"newLength\":\"47\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\" package com.kingdee.finance.common.operation.act.api.notice.enums;\\n \\n import lombok.extern.slf4j.Slf4j;\\n \\n /**\\n  * 通知业务枚举\\n  *\\n  * @author qintao_fang\\n  * @since 2019/7/25\\n  */\\n @Slf4j\\n public enum NoticeBusinessEnum {\\n \\n+    NOTICE_COMMON(\\\"common\\\", \\\"通用通知，不用策略方式写死noticeType，必须从入参传入\\\"),\\n+\\n     NODE_NAME(\\\"auth_name\\\", \\\"实名认证\\\"),\\n     NODE_ENHANCE(\\\"auth_enhance\\\", \\\"增信认证\\\"),\\n     NODE_CREDIT(\\\"auth_credit\\\", \\\"获得授信额度\\\"),\\n     NODE_FIRST_LOAN(\\\"money\\\", \\\"首次借款\\\"),\\n \\n     NOTICE_KN_FEED_BACK(\\\"kn_feed_back\\\", \\\"卡牛返现活动\\\"),\\n     NOTICE_REJECT_COMPENSATE(\\\"reject_compensate\\\", \\\"拒就赔活动\\\");\\n \\n     private String code;\\n     private String desc;\\n \\n     public static NoticeBusinessEnum find(String code){\\n         for (NoticeBusinessEnum nodeEnum: NoticeBusinessEnum.values()){\\n             if (nodeEnum.getCode().equals(code)){\\n                 return nodeEnum;\\n             }\\n         }\\n         log.error(\\\"失败！查询不到code={}相应信息节点枚举!\\\", code);\\n         return null;\\n     }\\n \\n     NoticeBusinessEnum(String code, String desc){\\n         this.code = code;\\n         this.desc = desc;\\n     }\\n     public String getCode() {\\n         return code;\\n     }\\n     public String getDesc() {\\n         return desc;\\n     }\\n }\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"1\"}],\"id\":\"5205\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":4,\"hash.effect\":\"l9elUUi1X8hu\"},\"newProperties\":[],\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/notice/bo/AwardNoticeBO.java\",\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/notice/bo/AwardNoticeBO.java\",\"oldProperties\":[],\"type\":\"2\",\"commitHash\":null,\"addLines\":\"6\",\"hunks\":[{\"oldLength\":\"53\",\"newLength\":\"59\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\" package com.kingdee.finance.common.operation.act.api.notice.bo;\\n \\n import com.kingdee.finance.common.operation.act.api.notice.enums.NoticeBusinessEnum;\\n+import com.kingdee.finance.common.operation.act.api.setting.enums.NoticeTypeEnum;\\n import lombok.Data;\\n \\n import java.io.Serializable;\\n import java.util.Map;\\n \\n /**\\n  * 领奖通知BO对象\\n  *\\n  * @author qintao_fang\\n  * @since 2019/7/25\\n  */\\n @Data\\n public class AwardNoticeBO implements Serializable {\\n     private static final long serialVersionUID = -1239842763451404888L;\\n \\n     /**\\n      * suid\\n      */\\n     private String suid;\\n \\n     /**\\n      * userId\\n      */\\n     private Long userId;\\n \\n     /**\\n      * 手机号\\n      */\\n     private String phone;\\n \\n     /**\\n      * 通知业务类型\\n      */\\n     private NoticeBusinessEnum noticeBusinessEnum;\\n \\n     /**\\n      * 活动代码\\n      */\\n     private String actCode;\\n \\n     /**\\n      * 渠道代码\\n      */\\n     private String channelCode;\\n \\n     /**\\n      * 额外参数\\n      */\\n     private Map<String, Object> params;\\n+\\n+    /**\\n+     * 通知类型\\n+     */\\n+    private NoticeTypeEnum noticeTypeEnum;\\n }\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"1\"}],\"id\":\"5204\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"IpG_SAErIeIC\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/img/bo/NullActImgBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"12\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"12\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.img.bo;\\n+\\n+public class NullActImgBO extends ActImgBO {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn true;\\n+\\t}\\n+\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5203\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"ouSEySP9yY_z\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/img/bo/ActImgBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"72\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"72\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.img.bo;\\n+\\n+import lombok.Data;\\n+import com.kingdee.finance.common.operation.code.base.Nullable;\\n+import java.io.Serializable;\\n+import io.swagger.annotations.*;\\n+\\n+import java.util.Date;\\n+\\n+/**\\n+ * 活动图片地址表\\n+ * Created on 2019-10-15\\n+ */\\n+@ApiModel(\\\"活动图片地址表\\\")\\n+@Data\\n+public class ActImgBO implements Serializable, Nullable {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn false;\\n+\\t}\\n+\\n+\\t/**\\n+\\t * 自增长字段,主键\\n+\\t */\\n+\\t@ApiModelProperty(\\\"自增长字段,主键\\\")\\n+\\tprivate Long id;\\n+\\n+\\t/**\\n+\\t * 活动代码\\n+\\t */\\n+\\t@ApiModelProperty(\\\"活动代码\\\")\\n+\\tprivate String actCode;\\n+\\n+\\t/**\\n+\\t * 图片code\\n+\\t */\\n+\\t@ApiModelProperty(\\\"图片code\\\")\\n+\\tprivate String imgCode;\\n+\\n+\\t/**\\n+\\t * 原始图片地址\\n+\\t */\\n+\\t@ApiModelProperty(\\\"原始图片地址\\\")\\n+\\tprivate String imgAddress;\\n+\\n+\\t/**\\n+\\t * 随手记图片地址\\n+\\t */\\n+\\t@ApiModelProperty(\\\"随手记图片地址\\\")\\n+\\tprivate String imgSsjAddress;\\n+\\n+\\t/**\\n+\\t * 卡牛图片地址\\n+\\t */\\n+\\t@ApiModelProperty(\\\"卡牛图片地址\\\")\\n+\\tprivate String imgKnAddress;\\n+\\n+\\t/**\\n+\\t * 新建时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"新建时间\\\")\\n+\\tprivate Date createTime;\\n+\\n+\\t/**\\n+\\t * 更新时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"更新时间\\\")\\n+\\tprivate Date updateTime;\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5202\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"KrFbhEz5yxjM\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/fakedata/bo/NullActFakeDataBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"12\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"12\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.fakedata.bo;\\n+\\n+public class NullActFakeDataBO extends ActFakeDataBO {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn true;\\n+\\t}\\n+\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5201\",\"fileType\":\"1\"},{\"metadata\":{\"line:first\":1,\"hash.effect\":\"FtZgrw7xTRoE\"},\"newProperties\":{\"unix:filemode\":\"100644\"},\"delLines\":\"0\",\"awayPaths\":[],\"oldPath\":null,\"currentPath\":\"src/main/java/com/kingdee/finance/common/operation/act/api/fakedata/bo/ActFakeDataBO.java\",\"oldProperties\":[],\"type\":\"1\",\"commitHash\":null,\"addLines\":\"60\",\"hunks\":[{\"oldLength\":\"0\",\"newLength\":\"60\",\"delLines\":null,\"newOffset\":\"1\",\"isMissingOldNewline\":null,\"addLines\":null,\"corpus\":\"+package com.kingdee.finance.common.operation.act.api.fakedata.bo;\\n+\\n+import lombok.Data;\\n+import com.kingdee.finance.common.operation.code.base.Nullable;\\n+import java.io.Serializable;\\n+import io.swagger.annotations.*;\\n+\\n+import java.util.Date;\\n+\\n+/**\\n+ * 活动假数据表\\n+ * Created on 2019-10-15\\n+ */\\n+@ApiModel(\\\"活动假数据表\\\")\\n+@Data\\n+public class ActFakeDataBO implements Serializable, Nullable {\\n+\\n+\\t// TODO: please generate the serialVersionUID constant and move this class to api module.\\n+\\n+\\t@Override\\n+\\tpublic boolean isNull() {\\n+\\t\\treturn false;\\n+\\t}\\n+\\n+\\t/**\\n+\\t * 自增长字段,主键\\n+\\t */\\n+\\t@ApiModelProperty(\\\"自增长字段,主键\\\")\\n+\\tprivate Long id;\\n+\\n+\\t/**\\n+\\t * 活动代码\\n+\\t */\\n+\\t@ApiModelProperty(\\\"活动代码\\\")\\n+\\tprivate String actCode;\\n+\\n+\\t/**\\n+\\t * 日期,如2019-07-07\\n+\\t */\\n+\\t@ApiModelProperty(\\\"日期,如2019-07-07\\\")\\n+\\tprivate String dateStr;\\n+\\n+\\t/**\\n+\\t * 金额,单位分\\n+\\t */\\n+\\t@ApiModelProperty(\\\"金额,单位分\\\")\\n+\\tprivate Long amount;\\n+\\n+\\t/**\\n+\\t * 新建时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"新建时间\\\")\\n+\\tprivate Date createTime;\\n+\\n+\\t/**\\n+\\t * 更新时间\\n+\\t */\\n+\\t@ApiModelProperty(\\\"更新时间\\\")\\n+\\tprivate Date updateTime;\\n+}\\n\\\\ No newline at end of file\\n\",\"isMissingNewNewline\":null,\"oldOffset\":\"0\"}],\"id\":\"5200\",\"fileType\":\"1\"}],\"sourceControlSystem\":\"git\",\"description\":null,\"dateModified\":\"1571303204\",\"branch\":\"master\",\"creationMethod\":\"arc\",\"unitStatus\":\"0\",\"revisionID\":\"515\",\"bookmark\":null,\"dateCreated\":\"1571303202\",\"authorName\":\"申夕诠\",\"id\":\"1041\",\"properties\":{\"arc.staging\":{\"refs\":[],\"status\":\"repository.unconfigured\"},\"local:commits\":{\"373fc675caa1675d93149098dac3a449c8892654\":{\"summary\":\"feat(FINCOMOPE-423):双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据\",\"authorEmail\":\"xiquan_shen@sui.com\",\"author\":\"申夕诠\",\"commit\":\"373fc675caa1675d93149098dac3a449c8892654\",\"tree\":\"bf6a3a5c149b174e15f4b41914fdaf69eab415f4\",\"time\":\"1571302733\",\"message\":\"feat(FINCOMOPE-423):双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据\\n\\nSummary:\\n\\nTest Plan: 双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据\\n\\nReviewers:\\n\\nSubscribers:\",\"parents\":[\"2292ccfe4d3585e158a1932044b75932a88d56fd\"]}},\"arc:onto\":[{\"kind\":\"upstream\",\"name\":\"master\",\"type\":\"branch\"}]}}";
  val diffJsonObj: JSONObject
  diffJsonObj = JSONObject("""{
	"sourceControlBaseRevision": "2292ccfe4d3585e158a1932044b75932a88d56fd",
	"lintStatus": "0",
	"authorEmail": "xiquan_shen@sui.com",
	"sourceControlPath": null,
	"changes": [{
		"metadata": {
			"line:first": 1,
			"hash.effect": "7NeZR5gKp0QZ"
		},
		"newProperties": {
			"unix:filemode": "100644"
		},
		"delLines": "0",
		"awayPaths": [],
		"oldPath": null,
		"currentPath": "src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeWayEnum.java",
		"oldProperties": [],
		"type": "1",
		"commitHash": null,
		"addLines": "30",
		"hunks": [{
			"oldLength": "0",
			"newLength": "30",
			"delLines": null,
			"newOffset": "1",
			"isMissingOldNewline": null,
			"addLines": null,
			"corpus": "+package com.kingdee.finance.common.operation.act.api.setting.enums;\n+\n+/**\n+ * 通知方式枚举类\n+ *\n+ * @author qintao_fang\n+ * @since 2019/7/10\n+ */\n+public enum NoticeWayEnum {\n+\n+    WAY_SMS(1, \"短信方式\"),\n+    WAY_PUSH(2, \"Push消息方式\");\n+\n+    NoticeWayEnum(Integer way, String desc){\n+        this.way = way;\n+        this.desc = desc;\n+    }\n+    private Integer way;\n+    private String desc;\n+\n+    public Integer getWay() {\n+        return way;\n+    }\n+\n+    public String getDesc() {\n+        return desc;\n+    }\n+\n+\n+}\n",
			"isMissingNewNewline": null,
			"oldOffset": "0"
		}],
		"id": "5211",
		"fileType": "1"
	}, {
		"metadata": {
			"line:first": 1,
			"hash.effect": "4AoHxLy0PNok"
		},
		"newProperties": {
			"unix:filemode": "100644"
		},
		"delLines": "0",
		"awayPaths": [],
		"oldPath": null,
		"currentPath": "src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeTypeEnum.java",
		"oldProperties": [],
		"type": "1",
		"commitHash": null,
		"addLines": "40",
		"hunks": [{
			"oldLength": "0",
			"newLength": "40",
			"delLines": null,
			"newOffset": "1",
			"isMissingOldNewline": null,
			"addLines": null,
			"corpus": "+package com.kingdee.finance.common.operation.act.api.setting.enums;\n+\n+/**\n+ * 通知类型枚举类\n+ *\n+ * @author qintao_fang\n+ * @since 2019/7/10\n+ */\n+public enum NoticeTypeEnum {\n+\n+    TYPE_AWARD(1, \"主动通知\"),\n+\n+    TYPE_NODE_NAME(11, \"好友完成<实名>通知\"),\n+    TYPE_NODE_ENHANCE(12, \"好友完成<增信>通知\"),\n+    TYPE_NODE_CREDIT(13, \"好友完成<授信>通知\"),\n+    TYPE_NODE_FIRST_LOAN(14, \"好友完成<首借>通知\"),\n+\n+    TYPE_NOTICE_KN_FEED_BACK(21, \"卡牛返现活动通知!\"),\n+    TYPE_NOTICE_REJECT_COMPENSATE(22, \"拒就赔活动通知!\"),\n+    TYPE_NOTICE_FREE_ORDER_WINNER(23, \"免单活动-中奖通知\"),\n+    TYPE_NOTICE_FREE_ORDER_LOSER(24, \"免单活动-参与通知\"),\n+    ;\n+\n+    NoticeTypeEnum(int type, String desc){\n+        this.type = type;\n+        this.desc = desc;\n+    }\n+    private int type;\n+    private String desc;\n+\n+    public int getType() {\n+        return type;\n+    }\n+\n+    public String getDesc() {\n+        return desc;\n+    }\n+\n+\n+}\n",
			"isMissingNewNewline": null,
			"oldOffset": "0"
		}],
		"id": "5210",
		"fileType": "1"
	}],
	"sourceControlSystem": "git",
	"description": null,
	"dateModified": "1571303204",
	"branch": "master",
	"creationMethod": "arc",
	"unitStatus": "0",
	"revisionID": "515",
	"bookmark": null,
	"dateCreated": "1571303202",
	"authorName": "申夕诠",
	"id": "1041",
	"properties": {
		"arc.staging": {
			"refs": [],
			"status": "repository.unconfigured"
		},
		"local:commits": {
			"373fc675caa1675d93149098dac3a449c8892654": {
				"summary": "feat(FINCOMOPE-423):双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据",
				"authorEmail": "xiquan_shen@sui.com",
				"author": "申夕诠",
				"commit": "373fc675caa1675d93149098dac3a449c8892654",
				"tree": "bf6a3a5c149b174e15f4b41914fdaf69eab415f4",
				"time": "1571302733",
				"message": "feat(FINCOMOPE-423):双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据\n\nSummary:\n\nTest Plan: 双十一初始化图片地址表，redis存储中签编号，存储每日免单假数据\n\nReviewers:\n\nSubscribers:",
				"parents": ["2292ccfe4d3585e158a1932044b75932a88d56fd"]
			}
		},
		"arc:onto": [{
			"kind": "upstream",
			"name": "master",
			"type": "branch"
		}]
	}
}""")
  val diff = Diff()
  diff.id = diffJsonObj.get("id").toString()
  diff.revisionId = diffJsonObj.getString("revisionID")
  diff.dateCreated = Date(diffJsonObj.getLong("dateCreated"))
  diff.dateModified = Date(diffJsonObj.getLong("dateModified"))
  val changedFiles = ArrayList<String>()
  val changes = diffJsonObj.getJSONArray("changes")
  for(i in 0..(changes.length()-1)) {
    val item = changes[i] as JSONObject
    val filePath = item.getString("currentPath")
    changedFiles.add(filePath)
  }
  println(changedFiles)
  println(changedFiles.contains("src/main/java/com/kingdee/finance/common/operation/act/api/setting/enums/NoticeTypeEnum.java"))

}
