/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XUnused extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = 928614780;

	/**
	 * The singleton instance of <code>LUKAS.X_UNUSED</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.db2.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The column <code>LUKAS.X_UNUSED.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.BIG_INTEGER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(25), X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.ID_REF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.CLASS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.FIELDS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.TABLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TABLE = createField("TABLE", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.CONFIGURATION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.U_D_T</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.META_DATA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.VALUES</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> VALUES = createField("VALUES", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.TYPE0</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.PRIMARY_KEY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.PRIMARYKEY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.NAME_REF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_UNUSED);

	/**
	 * The column <code>LUKAS.X_UNUSED.FIELD 737</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 2), X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("X_UNUSED", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord> getPrimaryKey() {
		return org.jooq.test.db2.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED, org.jooq.test.db2.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.X_UNUSED__FK_X_UNUSED_SELF);
	}
}
