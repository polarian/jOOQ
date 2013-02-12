/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class WorkOrderRouting extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> {

	private static final long serialVersionUID = 722223190;

	/**
	 * The singleton instance of <code>Production.WorkOrderRouting</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting WorkOrderRouting = new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting.class;
	}

	/**
	 * The column <code>Production.WorkOrderRouting.WorkOrderID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Integer> WorkOrderID = createField("WorkOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.WorkOrderRouting.OperationSequence</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Short> OperationSequence = createField("OperationSequence", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.WorkOrderRouting.LocationID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ScheduledStartDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ScheduledStartDate = createField("ScheduledStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ScheduledEndDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ScheduledEndDate = createField("ScheduledEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ActualStartDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ActualStartDate = createField("ActualStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ActualEndDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ActualEndDate = createField("ActualEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ActualResourceHrs</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> ActualResourceHrs = createField("ActualResourceHrs", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.WorkOrderRouting.PlannedCost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> PlannedCost = createField("PlannedCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ActualCost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> ActualCost = createField("ActualCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.WorkOrderRouting.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.WorkOrderRouting</code> table reference
	 */
	public WorkOrderRouting() {
		super("WorkOrderRouting", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.WorkOrderRouting</code> table reference
	 */
	public WorkOrderRouting(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrderRouting_WorkOrderID_ProductID_OperationSequence;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrderRouting_WorkOrderID_ProductID_OperationSequence);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrderRouting_WorkOrder_WorkOrderID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrderRouting_Location_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting(alias);
	}
}
