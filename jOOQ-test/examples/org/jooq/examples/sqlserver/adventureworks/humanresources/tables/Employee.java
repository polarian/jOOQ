/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Employee extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee> {

	private static final long serialVersionUID = -676063629;

	/**
	 * The singleton instance of <code>HumanResources.Employee</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee Employee = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee.class;
	}

	/**
	 * The column <code>HumanResources.Employee.EmployeeID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>HumanResources.Employee.NationalIDNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> NationalIDNumber = createField("NationalIDNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.ContactID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Integer> ContactID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>HumanResources.Employee.LoginID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> LoginID = createField("LoginID", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.ManagerID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Integer> ManagerID = createField("ManagerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>HumanResources.Employee.Title</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.BirthDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.sql.Timestamp> BirthDate = createField("BirthDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>HumanResources.Employee.MaritalStatus</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> MaritalStatus = createField("MaritalStatus", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.Gender</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> Gender = createField("Gender", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.HireDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.sql.Timestamp> HireDate = createField("HireDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>HumanResources.Employee.SalariedFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Boolean> SalariedFlag = createField("SalariedFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The column <code>HumanResources.Employee.VacationHours</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Short> VacationHours = createField("VacationHours", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>HumanResources.Employee.SickLeaveHours</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Short> SickLeaveHours = createField("SickLeaveHours", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>HumanResources.Employee.CurrentFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Boolean> CurrentFlag = createField("CurrentFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The column <code>HumanResources.Employee.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>HumanResources.Employee.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>HumanResources.Employee</code> table reference
	 */
	public Employee() {
		super("Employee", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	/**
	 * Create an aliased <code>HumanResources.Employee</code> table reference
	 */
	public Employee(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.IDENTITY_Employee;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Employee_EmployeeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Employee_EmployeeID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_Employee_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_Employee_Employee_ManagerID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee(alias);
	}
}
