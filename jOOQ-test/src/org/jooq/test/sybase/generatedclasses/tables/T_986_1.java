/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_1 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = 1205758206;

	/**
	 * The singleton instance of <code>DBA.t_986_1</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.sybase.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record.class;
	}

	/**
	 * The column <code>DBA.t_986_1.REF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>DBA.t_986_1</code> table reference
	 */
	public T_986_1() {
		super("t_986_1", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.t_986_1</code> table reference
	 */
	public T_986_1(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_986_1__PK_986;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_986_1__PK_986, org.jooq.test.sybase.generatedclasses.Keys.T_986_1__UK_986);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_986_1__FK_986);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.T_986_1 as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.T_986_1(alias);
	}
}
