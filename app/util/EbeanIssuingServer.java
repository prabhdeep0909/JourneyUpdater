package util;


import io.ebean.*;
import io.ebean.cache.ServerCacheManager;

import java.util.Collection;
import java.util.Iterator;

public class EbeanIssuingServer {
    static EbeanServer notificationDB = Ebean.getServer("issuing");

    public static ExpressionFactory expression() {
        return notificationDB.getExpressionFactory();
    }

    public static <T> Query<T> find(java.lang.Class<T> beanType) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        return notificationDB.find(beanType);
    }

    public static <T> Query<T> createQuery(Class<T> beanType) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        return notificationDB.createQuery(beanType);
    }

    public static <T> SqlQuery createSqlQuery(String sql) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        return notificationDB.createSqlQuery(sql);
    }

    public static void save(java.lang.Object bean) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.save(bean);
    }

    public static void beginTransaction() {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.beginTransaction();
    }

    public static void commitTransaction() {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.commitTransaction();
    }

    public static void endTransaction() {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.endTransaction();
    }

    public static void rollbackTransaction() {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.rollbackTransaction();
    }

    public static void saveAll(Collection collBean) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.saveAll(collBean);
    }

    public static void save(Iterator<Object> beanItr) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.save(beanItr);
    }

    public static void update(java.lang.Object bean) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.update(bean);
    }

    public static void delete(java.lang.Object bean) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.delete(bean);
    }

    public static void refresh(java.lang.Object bean) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.refresh(bean);
    }

    public static EbeanServer getServer(String serverName) {
        return Ebean.getServer(serverName);
    }

    public static SqlUpdate createUpdateQuery(String s) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        return notificationDB.createSqlUpdate(s);
    }

    public static void execute(SqlUpdate sqlUpdate) {
//        EbeanServer issuingDB = Ebean.getServer("issuing");
        notificationDB.execute(sqlUpdate);
    }
}
