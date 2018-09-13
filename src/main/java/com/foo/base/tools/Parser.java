package com.foo.base.tools;

import com.foundationdb.sql.parser.SQLParser;
import com.foundationdb.sql.parser.SQLParserFeature;
import com.foundationdb.sql.parser.StatementNode;
import com.foundationdb.sql.unparser.NodeToString;

import java.util.Set;

public class Parser {

    public static void main(String[] args) throws Exception {

        SQLParser parser = new SQLParser();
        StatementNode stmt = parser.parseStatement(
                "select userid,username,password from sys_user where username = 'isea533' group by username order by username desc");

        stmt.treePrint();

        Set<SQLParserFeature> ff = parser.getFeatures();

        NodeToString unparser = new NodeToString();
        String sql = unparser.toString(stmt);

        System.out.println(sql);
    }
}
