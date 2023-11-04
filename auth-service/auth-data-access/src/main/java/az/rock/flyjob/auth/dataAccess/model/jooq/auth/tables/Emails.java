/*
 * This file is generated by jOOQ.
 */
package az.rock.flyjob.auth.dataAccess.model.jooq.auth.tables;


import az.rock.flyjob.auth.dataAccess.model.jooq.auth.Auth;
import az.rock.flyjob.auth.dataAccess.model.jooq.auth.Indexes;
import az.rock.flyjob.auth.dataAccess.model.jooq.auth.Keys;
import az.rock.flyjob.auth.dataAccess.model.jooq.auth.tables.records.EmailsRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Emails extends TableImpl<EmailsRecord> {

    private static final long serialVersionUID = 852401264;

    /**
     * The reference instance of <code>auth.emails</code>
     */
    public static final Emails EMAİLS = new Emails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailsRecord> getRecordType() {
        return EmailsRecord.class;
    }

    /**
     * The column <code>auth.emails.uuid</code>.
     */
    public final TableField<EmailsRecord, UUID> UUİD = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>auth.emails.version</code>.
     */
    public final TableField<EmailsRecord, Long> VERSİON = createField(DSL.name("version"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>auth.emails.process_status</code>.
     */
    public final TableField<EmailsRecord, String> PROCESS_STATUS = createField(DSL.name("process_status"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>auth.emails.row_status</code>.
     */
    public final TableField<EmailsRecord, String> ROW_STATUS = createField(DSL.name("row_status"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>auth.emails.created_date</code>.
     */
    public final TableField<EmailsRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>auth.emails.modification_date</code>.
     */
    public final TableField<EmailsRecord, LocalDateTime> MODİFİCATİON_DATE = createField(DSL.name("modification_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>auth.emails.access_modifier</code>.
     */
    public final TableField<EmailsRecord, String> ACCESS_MODİFİER = createField(DSL.name("access_modifier"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.field("'ONLY_AUTHENTICATED'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>auth.emails.user_uuid</code>.
     */
    public final TableField<EmailsRecord, UUID> USER_UUİD = createField(DSL.name("user_uuid"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>auth.emails.type</code>.
     */
    public final TableField<EmailsRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>auth.emails.email</code>.
     */
    public final TableField<EmailsRecord, String> EMAİL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>auth.emails.is_enable_notification</code>.
     */
    public final TableField<EmailsRecord, Boolean> İS_ENABLE_NOTİFİCATİON = createField(DSL.name("is_enable_notification"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>auth.emails.is_primary</code>.
     */
    public final TableField<EmailsRecord, Boolean> İS_PRİMARY = createField(DSL.name("is_primary"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>auth.emails.is_verified</code>.
     */
    public final TableField<EmailsRecord, Boolean> İS_VERİFİED = createField(DSL.name("is_verified"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>auth.emails.verification_code</code>.
     */
    public final TableField<EmailsRecord, String> VERİFİCATİON_CODE = createField(DSL.name("verification_code"), org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>auth.emails.verification_code_expire_date</code>.
     */
    public final TableField<EmailsRecord, LocalDateTime> VERİFİCATİON_CODE_EXPİRE_DATE = createField(DSL.name("verification_code_expire_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>auth.emails.verification_code_send_date</code>.
     */
    public final TableField<EmailsRecord, LocalDateTime> VERİFİCATİON_CODE_SEND_DATE = createField(DSL.name("verification_code_send_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>auth.emails.verification_code_send_count</code>.
     */
    public final TableField<EmailsRecord, BigDecimal> VERİFİCATİON_CODE_SEND_COUNT = createField(DSL.name("verification_code_send_count"), org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>auth.emails.is_subscribed_promotions</code>.
     */
    public final TableField<EmailsRecord, Boolean> İS_SUBSCRİBED_PROMOTİONS = createField(DSL.name("is_subscribed_promotions"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>auth.emails.subscribed_date</code>.
     */
    public final TableField<EmailsRecord, LocalDateTime> SUBSCRİBED_DATE = createField(DSL.name("subscribed_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>auth.emails</code> table reference
     */
    public Emails() {
        this(DSL.name("emails"), null);
    }

    /**
     * Create an aliased <code>auth.emails</code> table reference
     */
    public Emails(String alias) {
        this(DSL.name(alias), EMAİLS);
    }

    /**
     * Create an aliased <code>auth.emails</code> table reference
     */
    public Emails(Name alias) {
        this(alias, EMAİLS);
    }

    private Emails(Name alias, Table<EmailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Emails(Name alias, Table<EmailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Emails(Table<O> child, ForeignKey<O, EmailsRecord> key) {
        super(child, key, EMAİLS);
    }

    @Override
    public Schema getSchema() {
        return Auth.AUTH;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes._3fDX_EMAİLENTİTY_ROW_STATUS);
    }

    @Override
    public UniqueKey<EmailsRecord> getPrimaryKey() {
        return Keys.PK_EMAİLS;
    }

    @Override
    public List<UniqueKey<EmailsRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailsRecord>>asList(Keys.PK_EMAİLS, Keys.UC_EMAİLS_EMAİL);
    }

    @Override
    public List<ForeignKey<EmailsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EmailsRecord, ?>>asList(Keys.EMAİLS__FK_EMAİLS_ON_USER_UUİD);
    }

    public Users users() {
        return new Users(this, Keys.EMAİLS__FK_EMAİLS_ON_USER_UUİD);
    }

    @Override
    public Emails as(String alias) {
        return new Emails(DSL.name(alias), this);
    }

    @Override
    public Emails as(Name alias) {
        return new Emails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Emails rename(String name) {
        return new Emails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Emails rename(Name name) {
        return new Emails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<UUID, Long, String, String, LocalDateTime, LocalDateTime, String, UUID, String, String, Boolean, Boolean, Boolean, String, LocalDateTime, LocalDateTime, BigDecimal, Boolean, LocalDateTime> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
