package com.ljt;

import com.ljt.dto.DebitRequest;
import com.ljt.dto.DebitResponse;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public interface IUserService {

    /*
     * 更新用户余额
     */
    DebitResponse debit(DebitRequest request);
}
