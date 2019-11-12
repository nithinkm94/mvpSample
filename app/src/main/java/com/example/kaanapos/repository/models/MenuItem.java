
package com.example.kaanapos.repository.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.alignminds.ivyplexeabl.repositoryies.typeconverters.MenuItemTaxConverter;
import com.alignminds.ivyplexeabl.repositoryies.typeconverters.ModifeirTypeConverter;
import com.alignminds.ivyplexeabl.repositoryies.typeconverters.VarianceTypeConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

//@Entity(
//        tableName= MyDatabase.MENU_ITEM_TABLE_NAME,
//        foreignKeys = @ForeignKey(entity = CategoryWiseList.class,
//        parentColumns = "categoryId",
//        childColumns = "categoryId",
//        onDelete = CASCADE))

@Entity
public class MenuItem implements Serializable {

    public MenuItem(String name, Integer id, Integer cId) {
        this.name = name;
        this.id = id;
        this.cId = cId;
    }

//    @ColumnInfo(name = "quantity")
//    public int quantity;
//
//    @ColumnInfo(name = "selected")
//    private  Boolean isSelected;
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public Boolean getSelected() {
//        return isSelected;
//    }
//
//    public void setSelected(Boolean selected) {
//        isSelected = selected;
//    }

    @SerializedName("modifiers")
    @Expose
//    @Ignore
    @TypeConverters(ModifeirTypeConverter.class) // add here
    @ColumnInfo(name = "modifiers")
    private List<Modifier> modifiers = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("variant")
    @Expose
//    @Ignore
    private Boolean variant;
    @SerializedName("image")
    @Expose
//    @Ignore
    private Integer image;
    @SerializedName("shortName")
    @Expose
//    @Ignore
    private String shortName;
    @SerializedName("discountSetting")
    @Expose
    @Ignore
    private List<DiscountSetting> discountSetting = null;
    @SerializedName("materialVariants")
    @Expose
    @TypeConverters(VarianceTypeConverter.class)
    private List<MaterialVariant> materialVariants = null;
    @SerializedName("active")
    @Expose
//    @Ignore
    private Boolean active;
    @SerializedName("code")
    @Expose
//    @Ignore
    private String code;
    @SerializedName("parentId")
    @Expose
//    @Ignore
    private Integer parentId;
    @SerializedName("stationId")
    @Expose
//    @Ignore
    private Integer stationId;
    @SerializedName("skuCode")
    @Expose
//    @Ignore
    private String skuCode;
    @SerializedName("barCode")
    @Expose
//    @Ignore
    private String barCode;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("itemType")
    @Expose
    private Integer itemType;
    @SerializedName("currentRate")
    @Expose
    private Double currentRate;
    @SerializedName("taxAmount")
    @Expose
    private Double taxAmount;
    @SerializedName("combo")
    @Expose
//    @Ignore
    private Boolean combo;
    @SerializedName("taxes")
    @Expose
    @TypeConverters(MenuItemTaxConverter.class)
    private List<Tax> taxes = null;
    @SerializedName("modifier")
    @Expose
//    @Ignore
    private Boolean modifier;
    @SerializedName("favourite")
    @Expose
//    @Ignore
    private Boolean favourite;
    @SerializedName("uomshortName")
    @Expose
    private String uomshortName;
    @SerializedName("allowDecimal")
    @Expose
    private Boolean allowDecimal;
    @SerializedName("uomId")
    @Expose
//    @Ignore
    private Integer uomId;
    @SerializedName("imagePath")
    @Expose
//    @Ignore
    private String imagePath;
    @SerializedName("id")
    @Expose
    @PrimaryKey
    @ColumnInfo(name = "id")
    public Integer id;

    @ForeignKey(
            entity = CategoryWiseList.class,
            parentColumns = "id",
            childColumns = "cId")
    @ColumnInfo(name = "cId")
    public Integer cId;


    @SerializedName("storeId")
    @Expose
//    @Ignore
    private Integer storeId;

    @SerializedName("discountAmt")
    @Expose
    private Double discountAmt;
    @SerializedName("discountPer")
    @Expose
    private Double discountPer;
    @SerializedName("maxQty")
    @Expose
    private Double maxQty;

    public Double getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(Double maxQty) {
        this.maxQty = maxQty;
    }

    public Double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(Double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public Double getDiscountPer() {
        return discountPer;
    }

    public void setDiscountPer(Double discountPer) {
        this.discountPer = discountPer;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVariant() {
        return variant;
    }

    public void setVariant(Boolean variant) {
        this.variant = variant;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<DiscountSetting> getDiscountSetting() {
        return discountSetting;
    }

    public void setDiscountSetting(List<DiscountSetting> discountSetting) {
        this.discountSetting = discountSetting;
    }

    public List<MaterialVariant> getMaterialVariants() {
        return materialVariants;
    }

    public void setMaterialVariants(List<MaterialVariant> materialVariants) {
        this.materialVariants = materialVariants;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Boolean getCombo() {
        return combo;
    }

    public void setCombo(Boolean combo) {
        this.combo = combo;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public Boolean getModifier() {
        return modifier;
    }

    public void setModifier(Boolean modifier) {
        this.modifier = modifier;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public String getUomshortName() {
        return uomshortName;
    }

    public void setUomshortName(String uomshortName) {
        this.uomshortName = uomshortName;
    }

    public Integer getUomId() {
        return uomId;
    }

    public void setUomId(Integer uomId) {
        this.uomId = uomId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Double getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Double currentRate) {
        this.currentRate = currentRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Boolean getAllowDecimal() {
        return allowDecimal;
    }

    public void setAllowDecimal(Boolean allowDecimal) {
        this.allowDecimal = allowDecimal;
    }
}
