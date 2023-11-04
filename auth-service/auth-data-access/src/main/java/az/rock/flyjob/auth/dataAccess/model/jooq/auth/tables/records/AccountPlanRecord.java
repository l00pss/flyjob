/*
 * This file is generated by jOOQ.
 */
package az.rock.flyjob.auth.dataAccess.model.jooq.auth.tables.records;


import az.rock.flyjob.auth.dataAccess.model.jooq.auth.tables.AccountPlan;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountPlanRecord extends UpdatableRecordImpl<AccountPlanRecord> implements Record12<UUID, Long, String, String, LocalDateTime, LocalDateTime, UUID, String, LocalDateTime, LocalDateTime, Boolean, String> {

    private static final long serialVersionUID = -1823676333;

    /**
     * Setter for <code>auth.account_plan.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>auth.account_plan.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>auth.account_plan.version</code>.
     */
    public void setVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>auth.account_plan.version</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>auth.account_plan.process_status</code>.
     */
    public void setProcessStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>auth.account_plan.process_status</code>.
     */
    public String getProcessStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>auth.account_plan.row_status</code>.
     */
    public void setRowStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>auth.account_plan.row_status</code>.
     */
    public String getRowStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>auth.account_plan.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>auth.account_plan.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>auth.account_plan.modification_date</code>.
     */
    public void setModificationDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>auth.account_plan.modification_date</code>.
     */
    public LocalDateTime getModificationDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>auth.account_plan.user_uuid</code>.
     */
    public void setUserUuid(UUID value) {
        set(6, value);
    }

    /**
     * Getter for <code>auth.account_plan.user_uuid</code>.
     */
    public UUID getUserUuid() {
        return (UUID) get(6);
    }

    /**
     * Setter for <code>auth.account_plan.plan</code>.
     */
    public void setPlan(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>auth.account_plan.plan</code>.
     */
    public String getPlan() {
        return (String) get(7);
    }

    /**
     * Setter for <code>auth.account_plan.start_date</code>.
     */
    public void setStartDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>auth.account_plan.start_date</code>.
     */
    public LocalDateTime getStartDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>auth.account_plan.expired_date</code>.
     */
    public void setExpiredDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>auth.account_plan.expired_date</code>.
     */
    public LocalDateTime getExpiredDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>auth.account_plan.is_expired</code>.
     */
    public void setİsExpired(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>auth.account_plan.is_expired</code>.
     */
    public Boolean getİsExpired() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>auth.account_plan.promo_code</code>.
     */
    public void setPromoCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>auth.account_plan.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, Long, String, String, LocalDateTime, LocalDateTime, UUID, String, LocalDateTime, LocalDateTime, Boolean, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UUID, Long, String, String, LocalDateTime, LocalDateTime, UUID, String, LocalDateTime, LocalDateTime, Boolean, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return AccountPlan.ACCOUNT_PLAN.UUİD;
    }

    @Override
    public Field<Long> field2() {
        return AccountPlan.ACCOUNT_PLAN.VERSİON;
    }

    @Override
    public Field<String> field3() {
        return AccountPlan.ACCOUNT_PLAN.PROCESS_STATUS;
    }

    @Override
    public Field<String> field4() {
        return AccountPlan.ACCOUNT_PLAN.ROW_STATUS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return AccountPlan.ACCOUNT_PLAN.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return AccountPlan.ACCOUNT_PLAN.MODİFİCATİON_DATE;
    }

    @Override
    public Field<UUID> field7() {
        return AccountPlan.ACCOUNT_PLAN.USER_UUİD;
    }

    @Override
    public Field<String> field8() {
        return AccountPlan.ACCOUNT_PLAN.PLAN;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return AccountPlan.ACCOUNT_PLAN.START_DATE;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AccountPlan.ACCOUNT_PLAN.EXPİRED_DATE;
    }

    @Override
    public Field<Boolean> field11() {
        return AccountPlan.ACCOUNT_PLAN.İS_EXPİRED;
    }

    @Override
    public Field<String> field12() {
        return AccountPlan.ACCOUNT_PLAN.PROMO_CODE;
    }

    @Override
    public UUID component1() {
        return getUuid();
    }

    @Override
    public Long component2() {
        return getVersion();
    }

    @Override
    public String component3() {
        return getProcessStatus();
    }

    @Override
    public String component4() {
        return getRowStatus();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime component6() {
        return getModificationDate();
    }

    @Override
    public UUID component7() {
        return getUserUuid();
    }

    @Override
    public String component8() {
        return getPlan();
    }

    @Override
    public LocalDateTime component9() {
        return getStartDate();
    }

    @Override
    public LocalDateTime component10() {
        return getExpiredDate();
    }

    @Override
    public Boolean component11() {
        return getİsExpired();
    }

    @Override
    public String component12() {
        return getPromoCode();
    }

    @Override
    public UUID value1() {
        return getUuid();
    }

    @Override
    public Long value2() {
        return getVersion();
    }

    @Override
    public String value3() {
        return getProcessStatus();
    }

    @Override
    public String value4() {
        return getRowStatus();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime value6() {
        return getModificationDate();
    }

    @Override
    public UUID value7() {
        return getUserUuid();
    }

    @Override
    public String value8() {
        return getPlan();
    }

    @Override
    public LocalDateTime value9() {
        return getStartDate();
    }

    @Override
    public LocalDateTime value10() {
        return getExpiredDate();
    }

    @Override
    public Boolean value11() {
        return getİsExpired();
    }

    @Override
    public String value12() {
        return getPromoCode();
    }

    @Override
    public AccountPlanRecord value1(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public AccountPlanRecord value2(Long value) {
        setVersion(value);
        return this;
    }

    @Override
    public AccountPlanRecord value3(String value) {
        setProcessStatus(value);
        return this;
    }

    @Override
    public AccountPlanRecord value4(String value) {
        setRowStatus(value);
        return this;
    }

    @Override
    public AccountPlanRecord value5(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public AccountPlanRecord value6(LocalDateTime value) {
        setModificationDate(value);
        return this;
    }

    @Override
    public AccountPlanRecord value7(UUID value) {
        setUserUuid(value);
        return this;
    }

    @Override
    public AccountPlanRecord value8(String value) {
        setPlan(value);
        return this;
    }

    @Override
    public AccountPlanRecord value9(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public AccountPlanRecord value10(LocalDateTime value) {
        setExpiredDate(value);
        return this;
    }

    @Override
    public AccountPlanRecord value11(Boolean value) {
        setİsExpired(value);
        return this;
    }

    @Override
    public AccountPlanRecord value12(String value) {
        setPromoCode(value);
        return this;
    }

    @Override
    public AccountPlanRecord values(UUID value1, Long value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6, UUID value7, String value8, LocalDateTime value9, LocalDateTime value10, Boolean value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountPlanRecord
     */
    public AccountPlanRecord() {
        super(AccountPlan.ACCOUNT_PLAN);
    }

    /**
     * Create a detached, initialised AccountPlanRecord
     */
    public AccountPlanRecord(UUID uuid, Long version, String processStatus, String rowStatus, LocalDateTime createdDate, LocalDateTime modificationDate, UUID userUuid, String plan, LocalDateTime startDate, LocalDateTime expiredDate, Boolean isExpired, String promoCode) {
        super(AccountPlan.ACCOUNT_PLAN);

        set(0, uuid);
        set(1, version);
        set(2, processStatus);
        set(3, rowStatus);
        set(4, createdDate);
        set(5, modificationDate);
        set(6, userUuid);
        set(7, plan);
        set(8, startDate);
        set(9, expiredDate);
        set(10, isExpired);
        set(11, promoCode);
    }
}
