package Controller;

/**
 *
 * @author mounikakothapalli
 */
public abstract class Database_Queries extends DatabaseMethods {

    public static DDL_Queries DDL() {
        return DDL_Queries.getInst();
    }

    public static DML_Queries DML() {
       return DML_Queries.getInst();
    }

}