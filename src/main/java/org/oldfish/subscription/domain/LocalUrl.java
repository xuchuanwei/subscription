package org.oldfish.subscription.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
@Getter
@Setter
@TableName("local_url")
public class LocalUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 0:默认 1:CFT节点
     */
    @TableField("type")
    private Integer type;

    @TableField("url")
    private String url;
}
