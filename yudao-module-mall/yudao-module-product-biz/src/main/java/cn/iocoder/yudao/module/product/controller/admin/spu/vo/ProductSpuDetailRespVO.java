package cn.iocoder.yudao.module.product.controller.admin.spu.vo;

import cn.iocoder.yudao.module.product.controller.admin.sku.vo.ProductSkuRespVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 商品 SPU 详细 Response VO
 * 包括关联的 SKU 等信息
 *
 * @author HUIHUI
 */
@Schema(description = "管理后台 - 商品 SPU 详细 Response VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductSpuDetailRespVO extends ProductSpuBaseVO {

    @Schema(description = "商品 SPU 编号", required = true, example = "1212")
    private Long id;

    @Schema(description = "商品销量", required = true, example = "10000")
    private Integer salesCount;

    @Schema(description = "浏览量", required = true, example = "20000")
    private Integer browseCount;

    @Schema(description = "商品状态", required = true, example = "1")
    private Integer status;

    // ========== SKU 相关字段 =========

    @Schema(description = "SKU 数组")
    private List<ProductSkuRespVO> skus;

}
