
package it.istat.cspro.dashboard.dao;

import it.istat.cspro.dashboard.domain.REaExpectedBase;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class REaExpectedDao {
    private final HibernateTemplate hibernateTemplate;

    @Autowired
    public REaExpectedDao(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public List<REaExpectedBase> getExpectedReportBy(final String table) {
        return (List<REaExpectedBase>) hibernateTemplate.execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session sn) throws HibernateException {
                SQLQuery query = sn.createSQLQuery("SELECT `ID`,`name`,`completed`,`expected`,`completed_expected` FROM `mr_ea_expected_by_" + table + "`");
                query.addScalar("id", StandardBasicTypes.INTEGER)
                        .addScalar("name", StandardBasicTypes.STRING)
                        .addScalar("completed", StandardBasicTypes.INTEGER)
                        .addScalar("expected", StandardBasicTypes.INTEGER)
                        .addScalar("completed_expected", StandardBasicTypes.DOUBLE)
                        .setResultTransformer(Transformers.aliasToBean(REaExpectedBase.class));
                return query.list();
            }
        });
    }
}
