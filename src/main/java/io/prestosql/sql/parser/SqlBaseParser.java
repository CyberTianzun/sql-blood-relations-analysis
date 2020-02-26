// Generated from io/prestosql/sql/parser/SqlBase.g4 by ANTLR 4.7.1
package io.prestosql.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ADMIN=11, ALL=12, ALTER=13, ANALYZE=14, AND=15, ANY=16, ARRAY=17, 
		AS=18, ASC=19, AT=20, BERNOULLI=21, BETWEEN=22, BY=23, CALL=24, CASCADE=25, 
		CASE=26, CAST=27, CATALOGS=28, COLUMN=29, COLUMNS=30, COMMENT=31, COMMIT=32, 
		COMMITTED=33, CONSTRAINT=34, CREATE=35, CROSS=36, CUBE=37, CURRENT=38, 
		CURRENT_DATE=39, CURRENT_PATH=40, CURRENT_ROLE=41, CURRENT_TIME=42, CURRENT_TIMESTAMP=43, 
		CURRENT_USER=44, DATA=45, DATE=46, DAY=47, DEALLOCATE=48, DEFINER=49, 
		DELETE=50, DESC=51, DESCRIBE=52, DISTINCT=53, DISTRIBUTED=54, DOUBLE=55, 
		DROP=56, ELSE=57, END=58, ESCAPE=59, EXCEPT=60, EXCLUDING=61, EXECUTE=62, 
		EXISTS=63, EXPLAIN=64, EXTRACT=65, FALSE=66, FETCH=67, FILTER=68, FIRST=69, 
		FOLLOWING=70, FOR=71, FORMAT=72, FROM=73, FULL=74, FUNCTIONS=75, GRANT=76, 
		GRANTED=77, GRANTS=78, GRAPHVIZ=79, GROUP=80, GROUPING=81, HAVING=82, 
		HOUR=83, IF=84, IGNORE=85, IN=86, INCLUDING=87, INNER=88, INPUT=89, INSERT=90, 
		INTERSECT=91, INTERVAL=92, INTO=93, INVOKER=94, IO=95, IS=96, ISOLATION=97, 
		JOIN=98, JSON=99, LAST=100, LATERAL=101, LEFT=102, LEVEL=103, LIKE=104, 
		LIMIT=105, LOCALTIME=106, LOCALTIMESTAMP=107, LOGICAL=108, MAP=109, MINUTE=110, 
		MONTH=111, NATURAL=112, NEXT=113, NFC=114, NFD=115, NFKC=116, NFKD=117, 
		NO=118, NONE=119, NORMALIZE=120, NOT=121, NULL=122, NULLIF=123, NULLS=124, 
		OFFSET=125, ON=126, ONLY=127, OPTION=128, OR=129, ORDER=130, ORDINALITY=131, 
		OUTER=132, OUTPUT=133, OVER=134, PARTITION=135, PARTITIONS=136, PATH=137, 
		POSITION=138, PRECEDING=139, PRECISION=140, PREPARE=141, PRIVILEGES=142, 
		PROPERTIES=143, RANGE=144, READ=145, RECURSIVE=146, RENAME=147, REPEATABLE=148, 
		REPLACE=149, RESET=150, RESPECT=151, RESTRICT=152, REVOKE=153, RIGHT=154, 
		ROLE=155, ROLES=156, ROLLBACK=157, ROLLUP=158, ROW=159, ROWS=160, SCHEMA=161, 
		SCHEMAS=162, SECOND=163, SECURITY=164, SELECT=165, SERIALIZABLE=166, SESSION=167, 
		SET=168, SETS=169, SHOW=170, SOME=171, START=172, STATS=173, SUBSTRING=174, 
		SYSTEM=175, TABLE=176, TABLES=177, TABLESAMPLE=178, TEXT=179, THEN=180, 
		TIES=181, TIME=182, TIMESTAMP=183, TO=184, TRANSACTION=185, TRUE=186, 
		TRY_CAST=187, TYPE=188, UESCAPE=189, UNBOUNDED=190, UNCOMMITTED=191, UNION=192, 
		UNNEST=193, USE=194, USER=195, USING=196, VALIDATE=197, VALUES=198, VERBOSE=199, 
		VIEW=200, WHEN=201, WHERE=202, WITH=203, WITHOUT=204, WORK=205, WRITE=206, 
		YEAR=207, ZONE=208, EQ=209, NEQ=210, LT=211, LTE=212, GT=213, GTE=214, 
		PLUS=215, MINUS=216, ASTERISK=217, SLASH=218, PERCENT=219, CONCAT=220, 
		STRING=221, UNICODE_STRING=222, BINARY_LITERAL=223, INTEGER_VALUE=224, 
		DECIMAL_VALUE=225, DOUBLE_VALUE=226, IDENTIFIER=227, DIGIT_IDENTIFIER=228, 
		QUOTED_IDENTIFIER=229, BACKQUOTED_IDENTIFIER=230, SIMPLE_COMMENT=231, 
		BRACKETED_COMMENT=232, WS=233, UNRECOGNIZED=234, DELIMITER=235;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standalonePathSpecification = 2, 
		RULE_standaloneType = 3, RULE_statement = 4, RULE_query = 5, RULE_with = 6, 
		RULE_tableElement = 7, RULE_columnDefinition = 8, RULE_likeClause = 9, 
		RULE_properties = 10, RULE_property = 11, RULE_queryNoWith = 12, RULE_queryTerm = 13, 
		RULE_queryPrimary = 14, RULE_sortItem = 15, RULE_querySpecification = 16, 
		RULE_groupBy = 17, RULE_groupingElement = 18, RULE_groupingSet = 19, RULE_namedQuery = 20, 
		RULE_setQuantifier = 21, RULE_selectItem = 22, RULE_relation = 23, RULE_joinType = 24, 
		RULE_joinCriteria = 25, RULE_sampledRelation = 26, RULE_sampleType = 27, 
		RULE_aliasedRelation = 28, RULE_columnAliases = 29, RULE_relationPrimary = 30, 
		RULE_expression = 31, RULE_booleanExpression = 32, RULE_predicate = 33, 
		RULE_valueExpression = 34, RULE_primaryExpression = 35, RULE_nullTreatment = 36, 
		RULE_string = 37, RULE_timeZoneSpecifier = 38, RULE_comparisonOperator = 39, 
		RULE_comparisonQuantifier = 40, RULE_booleanValue = 41, RULE_interval = 42, 
		RULE_intervalField = 43, RULE_normalForm = 44, RULE_type = 45, RULE_rowField = 46, 
		RULE_typeParameter = 47, RULE_whenClause = 48, RULE_filter = 49, RULE_over = 50, 
		RULE_windowFrame = 51, RULE_frameBound = 52, RULE_explainOption = 53, 
		RULE_transactionMode = 54, RULE_levelOfIsolation = 55, RULE_callArgument = 56, 
		RULE_pathElement = 57, RULE_pathSpecification = 58, RULE_privilege = 59, 
		RULE_qualifiedName = 60, RULE_grantor = 61, RULE_principal = 62, RULE_roles = 63, 
		RULE_identifier = 64, RULE_number = 65, RULE_nonReserved = 66;
	public static final String[] ruleNames = {
		"singleStatement", "standaloneExpression", "standalonePathSpecification", 
		"standaloneType", "statement", "query", "with", "tableElement", "columnDefinition", 
		"likeClause", "properties", "property", "queryNoWith", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "groupBy", "groupingElement", "groupingSet", 
		"namedQuery", "setQuantifier", "selectItem", "relation", "joinType", "joinCriteria", 
		"sampledRelation", "sampleType", "aliasedRelation", "columnAliases", "relationPrimary", 
		"expression", "booleanExpression", "predicate", "valueExpression", "primaryExpression", 
		"nullTreatment", "string", "timeZoneSpecifier", "comparisonOperator", 
		"comparisonQuantifier", "booleanValue", "interval", "intervalField", "normalForm", 
		"type", "rowField", "typeParameter", "whenClause", "filter", "over", "windowFrame", 
		"frameBound", "explainOption", "transactionMode", "levelOfIsolation", 
		"callArgument", "pathElement", "pathSpecification", "privilege", "qualifiedName", 
		"grantor", "principal", "roles", "identifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
		"'ADD'", "'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", 
		"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'BERNOULLI'", "'BETWEEN'", "'BY'", 
		"'CALL'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", "'COLUMN'", "'COLUMNS'", 
		"'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", 
		"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_PATH'", "'CURRENT_ROLE'", 
		"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", "'DATE'", 
		"'DAY'", "'DEALLOCATE'", "'DEFINER'", "'DELETE'", "'DESC'", "'DESCRIBE'", 
		"'DISTINCT'", "'DISTRIBUTED'", "'DOUBLE'", "'DROP'", "'ELSE'", "'END'", 
		"'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", "'EXISTS'", "'EXPLAIN'", 
		"'EXTRACT'", "'FALSE'", "'FETCH'", "'FILTER'", "'FIRST'", "'FOLLOWING'", 
		"'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", "'GRANT'", "'GRANTED'", 
		"'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", 
		"'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", "'INNER'", "'INPUT'", "'INSERT'", 
		"'INTERSECT'", "'INTERVAL'", "'INTO'", "'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", 
		"'JOIN'", "'JSON'", "'LAST'", "'LATERAL'", "'LEFT'", "'LEVEL'", "'LIKE'", 
		"'LIMIT'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'LOGICAL'", "'MAP'", "'MINUTE'", 
		"'MONTH'", "'NATURAL'", "'NEXT'", "'NFC'", "'NFD'", "'NFKC'", "'NFKD'", 
		"'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", "'NULLIF'", "'NULLS'", 
		"'OFFSET'", "'ON'", "'ONLY'", "'OPTION'", "'OR'", "'ORDER'", "'ORDINALITY'", 
		"'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", "'PARTITIONS'", "'PATH'", 
		"'POSITION'", "'PRECEDING'", "'PRECISION'", "'PREPARE'", "'PRIVILEGES'", 
		"'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", "'RENAME'", "'REPEATABLE'", 
		"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
		"'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", 
		"'SCHEMAS'", "'SECOND'", "'SECURITY'", "'SELECT'", "'SERIALIZABLE'", "'SESSION'", 
		"'SET'", "'SETS'", "'SHOW'", "'SOME'", "'START'", "'STATS'", "'SUBSTRING'", 
		"'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEXT'", "'THEN'", 
		"'TIES'", "'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", "'TRUE'", 
		"'TRY_CAST'", "'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", 
		"'UNNEST'", "'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", "'VERBOSE'", 
		"'VIEW'", "'WHEN'", "'WHERE'", "'WITH'", "'WITHOUT'", "'WORK'", "'WRITE'", 
		"'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
		"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", "BERNOULLI", 
		"BETWEEN", "BY", "CALL", "CASCADE", "CASE", "CAST", "CATALOGS", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", "CROSS", 
		"CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_PATH", "CURRENT_ROLE", "CURRENT_TIME", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATE", "DAY", "DEALLOCATE", 
		"DEFINER", "DELETE", "DESC", "DESCRIBE", "DISTINCT", "DISTRIBUTED", "DOUBLE", 
		"DROP", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUDING", "EXECUTE", "EXISTS", 
		"EXPLAIN", "EXTRACT", "FALSE", "FETCH", "FILTER", "FIRST", "FOLLOWING", 
		"FOR", "FORMAT", "FROM", "FULL", "FUNCTIONS", "GRANT", "GRANTED", "GRANTS", 
		"GRAPHVIZ", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IGNORE", "IN", 
		"INCLUDING", "INNER", "INPUT", "INSERT", "INTERSECT", "INTERVAL", "INTO", 
		"INVOKER", "IO", "IS", "ISOLATION", "JOIN", "JSON", "LAST", "LATERAL", 
		"LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", 
		"MAP", "MINUTE", "MONTH", "NATURAL", "NEXT", "NFC", "NFD", "NFKC", "NFKD", 
		"NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", "OFFSET", 
		"ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", "OUTPUT", 
		"OVER", "PARTITION", "PARTITIONS", "PATH", "POSITION", "PRECEDING", "PRECISION", 
		"PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", "RENAME", 
		"REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", 
		"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", 
		"SECOND", "SECURITY", "SELECT", "SERIALIZABLE", "SESSION", "SET", "SETS", 
		"SHOW", "SOME", "START", "STATS", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", 
		"TABLESAMPLE", "TEXT", "THEN", "TIES", "TIME", "TIMESTAMP", "TO", "TRANSACTION", 
		"TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", 
		"UNNEST", "USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", 
		"WHEN", "WHERE", "WITH", "WITHOUT", "WORK", "WRITE", "YEAR", "ZONE", "EQ", 
		"NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", 
		"PERCENT", "CONCAT", "STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED", "DELIMITER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			statement();
			setState(135);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression();
			setState(138);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandalonePathSpecificationContext extends ParserRuleContext {
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandalonePathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandalonePathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandalonePathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandalonePathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePathSpecificationContext standalonePathSpecification() throws RecognitionException {
		StandalonePathSpecificationContext _localctx = new StandalonePathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standalonePathSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			pathSpecification();
			setState(141);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneTypeContext standaloneType() throws RecognitionException {
		StandaloneTypeContext _localctx = new StandaloneTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_standaloneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type(0);
			setState(144);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameViewContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPathContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode PATH() { return getToken(SqlBaseParser.PATH, 0); }
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public SetPathContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(USE);
				setState(148);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(USE);
				setState(150);
				((UseContext)_localctx).catalog = identifier();
				setState(151);
				match(T__0);
				setState(152);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(CREATE);
				setState(155);
				match(SCHEMA);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(156);
					match(IF);
					setState(157);
					match(NOT);
					setState(158);
					match(EXISTS);
					}
					break;
				}
				setState(161);
				qualifiedName();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(162);
					match(WITH);
					setState(163);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(DROP);
				setState(167);
				match(SCHEMA);
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(168);
					match(IF);
					setState(169);
					match(EXISTS);
					}
					break;
				}
				setState(172);
				qualifiedName();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(173);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				match(ALTER);
				setState(177);
				match(SCHEMA);
				setState(178);
				qualifiedName();
				setState(179);
				match(RENAME);
				setState(180);
				match(TO);
				setState(181);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(CREATE);
				setState(184);
				match(TABLE);
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(185);
					match(IF);
					setState(186);
					match(NOT);
					setState(187);
					match(EXISTS);
					}
					break;
				}
				setState(190);
				qualifiedName();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(191);
					columnAliases();
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(194);
					match(COMMENT);
					setState(195);
					string();
					}
				}

				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(198);
					match(WITH);
					setState(199);
					properties();
					}
				}

				setState(202);
				match(AS);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(203);
					query();
					}
					break;
				case 2:
					{
					setState(204);
					match(T__1);
					setState(205);
					query();
					setState(206);
					match(T__2);
					}
					break;
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(210);
					match(WITH);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(211);
						match(NO);
						}
					}

					setState(214);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(CREATE);
				setState(218);
				match(TABLE);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(219);
					match(IF);
					setState(220);
					match(NOT);
					setState(221);
					match(EXISTS);
					}
					break;
				}
				setState(224);
				qualifiedName();
				setState(225);
				match(T__1);
				setState(226);
				tableElement();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(227);
					match(T__3);
					setState(228);
					tableElement();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__2);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(235);
					match(COMMENT);
					setState(236);
					string();
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(239);
					match(WITH);
					setState(240);
					properties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
				match(DROP);
				setState(244);
				match(TABLE);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(245);
					match(IF);
					setState(246);
					match(EXISTS);
					}
					break;
				}
				setState(249);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				match(INSERT);
				setState(251);
				match(INTO);
				setState(252);
				qualifiedName();
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253);
					columnAliases();
					}
					break;
				}
				setState(256);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
				match(DELETE);
				setState(259);
				match(FROM);
				setState(260);
				qualifiedName();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(261);
					match(WHERE);
					setState(262);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(265);
				match(ALTER);
				setState(266);
				match(TABLE);
				setState(267);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(268);
				match(RENAME);
				setState(269);
				match(TO);
				setState(270);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 13:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(272);
				match(COMMENT);
				setState(273);
				match(ON);
				setState(274);
				match(TABLE);
				setState(275);
				qualifiedName();
				setState(276);
				match(IS);
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(277);
					string();
					}
					break;
				case NULL:
					{
					setState(278);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 14:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(281);
				match(ALTER);
				setState(282);
				match(TABLE);
				setState(283);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(284);
				match(RENAME);
				setState(285);
				match(COLUMN);
				setState(286);
				((RenameColumnContext)_localctx).from = identifier();
				setState(287);
				match(TO);
				setState(288);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 15:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(290);
				match(ALTER);
				setState(291);
				match(TABLE);
				setState(292);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(293);
				match(DROP);
				setState(294);
				match(COLUMN);
				setState(295);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 16:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				match(ALTER);
				setState(298);
				match(TABLE);
				setState(299);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(300);
				match(ADD);
				setState(301);
				match(COLUMN);
				setState(302);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 17:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(304);
				match(ANALYZE);
				setState(305);
				qualifiedName();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(306);
					match(WITH);
					setState(307);
					properties();
					}
				}

				}
				break;
			case 18:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(310);
				match(CREATE);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(311);
					match(OR);
					setState(312);
					match(REPLACE);
					}
				}

				setState(315);
				match(VIEW);
				setState(316);
				qualifiedName();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(317);
					match(COMMENT);
					setState(318);
					string();
					}
				}

				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(321);
					match(SECURITY);
					setState(322);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(325);
				match(AS);
				setState(326);
				query();
				}
				break;
			case 19:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(328);
				match(DROP);
				setState(329);
				match(VIEW);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(330);
					match(IF);
					setState(331);
					match(EXISTS);
					}
					break;
				}
				setState(334);
				qualifiedName();
				}
				break;
			case 20:
				_localctx = new RenameViewContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(335);
				match(ALTER);
				setState(336);
				match(VIEW);
				setState(337);
				((RenameViewContext)_localctx).from = qualifiedName();
				setState(338);
				match(RENAME);
				setState(339);
				match(TO);
				setState(340);
				((RenameViewContext)_localctx).to = qualifiedName();
				}
				break;
			case 21:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(342);
				match(CALL);
				setState(343);
				qualifiedName();
				setState(344);
				match(T__1);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(345);
					callArgument();
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(346);
						match(T__3);
						setState(347);
						callArgument();
						}
						}
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(355);
				match(T__2);
				}
				break;
			case 22:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(357);
				match(CREATE);
				setState(358);
				match(ROLE);
				setState(359);
				((CreateRoleContext)_localctx).name = identifier();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(360);
					match(WITH);
					setState(361);
					match(ADMIN);
					setState(362);
					grantor();
					}
				}

				}
				break;
			case 23:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(365);
				match(DROP);
				setState(366);
				match(ROLE);
				setState(367);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 24:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(368);
				match(GRANT);
				setState(369);
				roles();
				setState(370);
				match(TO);
				setState(371);
				principal();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(372);
					match(T__3);
					setState(373);
					principal();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(379);
					match(WITH);
					setState(380);
					match(ADMIN);
					setState(381);
					match(OPTION);
					}
				}

				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(384);
					match(GRANTED);
					setState(385);
					match(BY);
					setState(386);
					grantor();
					}
				}

				}
				break;
			case 25:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(389);
				match(REVOKE);
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(390);
					match(ADMIN);
					setState(391);
					match(OPTION);
					setState(392);
					match(FOR);
					}
					break;
				}
				setState(395);
				roles();
				setState(396);
				match(FROM);
				setState(397);
				principal();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(398);
					match(T__3);
					setState(399);
					principal();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(405);
					match(GRANTED);
					setState(406);
					match(BY);
					setState(407);
					grantor();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(410);
				match(SET);
				setState(411);
				match(ROLE);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(412);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(413);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(414);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 27:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(417);
				match(GRANT);
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(418);
					privilege();
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(419);
						match(T__3);
						setState(420);
						privilege();
						}
						}
						setState(425);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(426);
					match(ALL);
					setState(427);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430);
				match(ON);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(431);
					match(TABLE);
					}
				}

				setState(434);
				qualifiedName();
				setState(435);
				match(TO);
				setState(436);
				((GrantContext)_localctx).grantee = principal();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(437);
					match(WITH);
					setState(438);
					match(GRANT);
					setState(439);
					match(OPTION);
					}
				}

				}
				break;
			case 28:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(442);
				match(REVOKE);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(443);
					match(GRANT);
					setState(444);
					match(OPTION);
					setState(445);
					match(FOR);
					}
				}

				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(448);
					privilege();
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(449);
						match(T__3);
						setState(450);
						privilege();
						}
						}
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(456);
					match(ALL);
					setState(457);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(460);
				match(ON);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(461);
					match(TABLE);
					}
				}

				setState(464);
				qualifiedName();
				setState(465);
				match(FROM);
				setState(466);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 29:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(468);
				match(SHOW);
				setState(469);
				match(GRANTS);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(470);
					match(ON);
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(471);
						match(TABLE);
						}
					}

					setState(474);
					qualifiedName();
					}
				}

				}
				break;
			case 30:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(477);
				match(EXPLAIN);
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(478);
					match(ANALYZE);
					}
					break;
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(481);
					match(VERBOSE);
					}
				}

				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(484);
					match(T__1);
					setState(485);
					explainOption();
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(486);
						match(T__3);
						setState(487);
						explainOption();
						}
						}
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(493);
					match(T__2);
					}
					break;
				}
				setState(497);
				statement();
				}
				break;
			case 31:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(498);
				match(SHOW);
				setState(499);
				match(CREATE);
				setState(500);
				match(TABLE);
				setState(501);
				qualifiedName();
				}
				break;
			case 32:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(502);
				match(SHOW);
				setState(503);
				match(CREATE);
				setState(504);
				match(VIEW);
				setState(505);
				qualifiedName();
				}
				break;
			case 33:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(506);
				match(SHOW);
				setState(507);
				match(TABLES);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(508);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(509);
					qualifiedName();
					}
				}

				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(512);
					match(LIKE);
					setState(513);
					((ShowTablesContext)_localctx).pattern = string();
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(514);
						match(ESCAPE);
						setState(515);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 34:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(520);
				match(SHOW);
				setState(521);
				match(SCHEMAS);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(522);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(523);
					identifier();
					}
				}

				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(526);
					match(LIKE);
					setState(527);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(528);
						match(ESCAPE);
						setState(529);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 35:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(534);
				match(SHOW);
				setState(535);
				match(CATALOGS);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(536);
					match(LIKE);
					setState(537);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(538);
						match(ESCAPE);
						setState(539);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(544);
				match(SHOW);
				setState(545);
				match(COLUMNS);
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(547);
				qualifiedName();
				}
				break;
			case 37:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(548);
				match(SHOW);
				setState(549);
				match(STATS);
				setState(550);
				match(FOR);
				setState(551);
				qualifiedName();
				}
				break;
			case 38:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(552);
				match(SHOW);
				setState(553);
				match(STATS);
				setState(554);
				match(FOR);
				setState(555);
				match(T__1);
				setState(556);
				querySpecification();
				setState(557);
				match(T__2);
				}
				break;
			case 39:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(559);
				match(SHOW);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(560);
					match(CURRENT);
					}
				}

				setState(563);
				match(ROLES);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(565);
					identifier();
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(568);
				match(SHOW);
				setState(569);
				match(ROLE);
				setState(570);
				match(GRANTS);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(571);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(572);
					identifier();
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(575);
				match(DESCRIBE);
				setState(576);
				qualifiedName();
				}
				break;
			case 42:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(577);
				match(DESC);
				setState(578);
				qualifiedName();
				}
				break;
			case 43:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(579);
				match(SHOW);
				setState(580);
				match(FUNCTIONS);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(581);
					match(LIKE);
					setState(582);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(583);
						match(ESCAPE);
						setState(584);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 44:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(589);
				match(SHOW);
				setState(590);
				match(SESSION);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(591);
					match(LIKE);
					setState(592);
					((ShowSessionContext)_localctx).pattern = string();
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(593);
						match(ESCAPE);
						setState(594);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 45:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(599);
				match(SET);
				setState(600);
				match(SESSION);
				setState(601);
				qualifiedName();
				setState(602);
				match(EQ);
				setState(603);
				expression();
				}
				break;
			case 46:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(605);
				match(RESET);
				setState(606);
				match(SESSION);
				setState(607);
				qualifiedName();
				}
				break;
			case 47:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(608);
				match(START);
				setState(609);
				match(TRANSACTION);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(610);
					transactionMode();
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(611);
						match(T__3);
						setState(612);
						transactionMode();
						}
						}
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 48:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(620);
				match(COMMIT);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(621);
					match(WORK);
					}
				}

				}
				break;
			case 49:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(624);
				match(ROLLBACK);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(625);
					match(WORK);
					}
				}

				}
				break;
			case 50:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(628);
				match(PREPARE);
				setState(629);
				identifier();
				setState(630);
				match(FROM);
				setState(631);
				statement();
				}
				break;
			case 51:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(633);
				match(DEALLOCATE);
				setState(634);
				match(PREPARE);
				setState(635);
				identifier();
				}
				break;
			case 52:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(636);
				match(EXECUTE);
				setState(637);
				identifier();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(638);
					match(USING);
					setState(639);
					expression();
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(640);
						match(T__3);
						setState(641);
						expression();
						}
						}
						setState(646);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 53:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(649);
				match(DESCRIBE);
				setState(650);
				match(INPUT);
				setState(651);
				identifier();
				}
				break;
			case 54:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(652);
				match(DESCRIBE);
				setState(653);
				match(OUTPUT);
				setState(654);
				identifier();
				}
				break;
			case 55:
				_localctx = new SetPathContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(655);
				match(SET);
				setState(656);
				match(PATH);
				setState(657);
				pathSpecification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(660);
				with();
				}
			}

			setState(663);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(WITH);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(666);
				match(RECURSIVE);
				}
			}

			setState(669);
			namedQuery();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(670);
				match(T__3);
				setState(671);
				namedQuery();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableElement);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				likeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			identifier();
			setState(682);
			type(0);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(683);
				match(NOT);
				setState(684);
				match(NULL);
				}
			}

			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(687);
				match(COMMENT);
				setState(688);
				string();
				}
			}

			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(691);
				match(WITH);
				setState(692);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(LIKE);
			setState(696);
			qualifiedName();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(697);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(698);
				match(PROPERTIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__1);
			setState(702);
			property();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(703);
				match(T__3);
				setState(704);
				property();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			identifier();
			setState(713);
			match(EQ);
			setState(714);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token offset;
		public Token limit;
		public Token fetchFirst;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(SqlBaseParser.NEXT, 0); }
		public List<TerminalNode> ROW() { return getTokens(SqlBaseParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(SqlBaseParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(SqlBaseParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(SqlBaseParser.ROWS, i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(SqlBaseParser.TIES, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			queryTerm(0);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(717);
				match(ORDER);
				setState(718);
				match(BY);
				setState(719);
				sortItem();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(720);
					match(T__3);
					setState(721);
					sortItem();
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(729);
				match(OFFSET);
				setState(730);
				((QueryNoWithContext)_localctx).offset = match(INTEGER_VALUE);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(731);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				{
				setState(736);
				match(LIMIT);
				setState(737);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case FETCH:
				{
				{
				setState(738);
				match(FETCH);
				setState(739);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(740);
					((QueryNoWithContext)_localctx).fetchFirst = match(INTEGER_VALUE);
					}
				}

				setState(743);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(747);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(744);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(745);
					match(WITH);
					setState(746);
					match(TIES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case EOF:
			case T__2:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(752);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(754);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(755);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(756);
							setQuantifier();
							}
						}

						setState(759);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(760);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(761);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(762);
							setQuantifier();
							}
						}

						setState(765);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_queryPrimary);
		try {
			int _alt;
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(TABLE);
				setState(773);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				match(VALUES);
				setState(775);
				expression();
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(776);
						match(T__3);
						setState(777);
						expression();
						}
						} 
					}
					setState(782);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				match(T__1);
				setState(784);
				queryNoWith();
				setState(785);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			expression();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(790);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(793);
				match(NULLS);
				setState(794);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(SELECT);
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(798);
				setQuantifier();
				}
				break;
			}
			setState(801);
			selectItem();
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(802);
					match(T__3);
					setState(803);
					selectItem();
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(809);
				match(FROM);
				setState(810);
				relation(0);
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(811);
						match(T__3);
						setState(812);
						relation(0);
						}
						} 
					}
					setState(817);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			}
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(820);
				match(WHERE);
				setState(821);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(824);
				match(GROUP);
				setState(825);
				match(BY);
				setState(826);
				groupBy();
				}
				break;
			}
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(829);
				match(HAVING);
				setState(830);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(833);
				setQuantifier();
				}
				break;
			}
			setState(836);
			groupingElement();
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					match(T__3);
					setState(838);
					groupingElement();
					}
					} 
				}
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupingElement);
		int _la;
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(ROLLUP);
				setState(846);
				match(T__1);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(847);
					expression();
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(848);
						match(T__3);
						setState(849);
						expression();
						}
						}
						setState(854);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(857);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				match(CUBE);
				setState(859);
				match(T__1);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(860);
					expression();
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(861);
						match(T__3);
						setState(862);
						expression();
						}
						}
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(870);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(GROUPING);
				setState(872);
				match(SETS);
				setState(873);
				match(T__1);
				setState(874);
				groupingSet();
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(875);
					match(T__3);
					setState(876);
					groupingSet();
					}
					}
					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupingSet);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				match(T__1);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(887);
					expression();
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(888);
						match(T__3);
						setState(889);
						expression();
						}
						}
						setState(894);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(897);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			((NamedQueryContext)_localctx).name = identifier();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(902);
				columnAliases();
				}
			}

			setState(905);
			match(AS);
			setState(906);
			match(T__1);
			setState(907);
			query();
			setState(908);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectItem);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				expression();
				setState(917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(913);
						match(AS);
						}
					}

					setState(916);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				primaryExpression(0);
				setState(920);
				match(T__0);
				setState(921);
				match(ASTERISK);
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(922);
					match(AS);
					setState(923);
					columnAliases();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(930);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(932);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(946);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(933);
						match(CROSS);
						setState(934);
						match(JOIN);
						setState(935);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(936);
						joinType();
						setState(937);
						match(JOIN);
						setState(938);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(939);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(941);
						match(NATURAL);
						setState(942);
						joinType();
						setState(943);
						match(JOIN);
						setState(944);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinType);
		int _la;
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(953);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(LEFT);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(957);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				match(RIGHT);
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(961);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(964);
				match(FULL);
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(965);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinCriteria);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(ON);
				setState(971);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				match(USING);
				setState(973);
				match(T__1);
				setState(974);
				identifier();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(975);
					match(T__3);
					setState(976);
					identifier();
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(982);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			aliasedRelation();
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(987);
				match(TABLESAMPLE);
				setState(988);
				sampleType();
				setState(989);
				match(T__1);
				setState(990);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(991);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			relationPrimary();
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(998);
					match(AS);
					}
				}

				setState(1001);
				identifier();
				setState(1003);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1002);
					columnAliases();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(T__1);
			setState(1008);
			identifier();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1009);
				match(T__3);
				setState(1010);
				identifier();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationPrimary);
		int _la;
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(T__1);
				setState(1020);
				query();
				setState(1021);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				match(UNNEST);
				setState(1024);
				match(T__1);
				setState(1025);
				expression();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1026);
					match(T__3);
					setState(1027);
					expression();
					}
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1033);
				match(T__2);
				setState(1036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1034);
					match(WITH);
					setState(1035);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				match(LATERAL);
				setState(1039);
				match(T__1);
				setState(1040);
				query();
				setState(1041);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1043);
				match(T__1);
				setState(1044);
				relation(0);
				setState(1045);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_PATH:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1052);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1053);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1056);
				match(NOT);
				setState(1057);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1066);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1060);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1061);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1062);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1063);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1064);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1065);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 66, RULE_predicate);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				comparisonOperator();
				setState(1072);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				comparisonOperator();
				setState(1075);
				comparisonQuantifier();
				setState(1076);
				match(T__1);
				setState(1077);
				query();
				setState(1078);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1080);
					match(NOT);
					}
				}

				setState(1083);
				match(BETWEEN);
				setState(1084);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1085);
				match(AND);
				setState(1086);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1088);
					match(NOT);
					}
				}

				setState(1091);
				match(IN);
				setState(1092);
				match(T__1);
				setState(1093);
				expression();
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1094);
					match(T__3);
					setState(1095);
					expression();
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1101);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1103);
					match(NOT);
					}
				}

				setState(1106);
				match(IN);
				setState(1107);
				match(T__1);
				setState(1108);
				query();
				setState(1109);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1111);
					match(NOT);
					}
				}

				setState(1114);
				match(LIKE);
				setState(1115);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1116);
					match(ESCAPE);
					setState(1117);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1120);
				match(IS);
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1121);
					match(NOT);
					}
				}

				setState(1124);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1125);
				match(IS);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1126);
					match(NOT);
					}
				}

				setState(1129);
				match(DISTINCT);
				setState(1130);
				match(FROM);
				setState(1131);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1135);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1137);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1141);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (ASTERISK - 217)) | (1L << (SLASH - 217)) | (1L << (PERCENT - 217)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1142);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1144);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1145);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1146);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1147);
						match(CONCAT);
						setState(1148);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1149);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1150);
						match(AT);
						setState(1151);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SqlBaseParser.PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext operand;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentPathContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_PATH() { return getToken(SqlBaseParser.CURRENT_PATH, 0); }
		public CurrentPathContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1158);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1160);
				identifier();
				setState(1161);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1163);
				match(DOUBLE);
				setState(1164);
				match(PRECISION);
				setState(1165);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1166);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1167);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1169);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1171);
				match(POSITION);
				setState(1172);
				match(T__1);
				setState(1173);
				valueExpression(0);
				setState(1174);
				match(IN);
				setState(1175);
				valueExpression(0);
				setState(1176);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1178);
				match(T__1);
				setState(1179);
				expression();
				setState(1182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1180);
					match(T__3);
					setState(1181);
					expression();
					}
					}
					setState(1184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1186);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1188);
				match(ROW);
				setState(1189);
				match(T__1);
				setState(1190);
				expression();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1191);
					match(T__3);
					setState(1192);
					expression();
					}
					}
					setState(1197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1198);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1200);
				qualifiedName();
				setState(1201);
				match(T__1);
				setState(1202);
				match(ASTERISK);
				setState(1203);
				match(T__2);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1204);
					filter();
					}
					break;
				}
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1207);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1210);
				qualifiedName();
				setState(1211);
				match(T__1);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1212);
						setQuantifier();
						}
						break;
					}
					setState(1215);
					expression();
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1216);
						match(T__3);
						setState(1217);
						expression();
						}
						}
						setState(1222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1225);
					match(ORDER);
					setState(1226);
					match(BY);
					setState(1227);
					sortItem();
					setState(1232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1228);
						match(T__3);
						setState(1229);
						sortItem();
						}
						}
						setState(1234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1237);
				match(T__2);
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1238);
					filter();
					}
					break;
				}
				setState(1245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1241);
						nullTreatment();
						}
					}

					setState(1244);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1247);
				identifier();
				setState(1248);
				match(T__5);
				setState(1249);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1251);
				match(T__1);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1252);
					identifier();
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1253);
						match(T__3);
						setState(1254);
						identifier();
						}
						}
						setState(1259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1262);
				match(T__2);
				setState(1263);
				match(T__5);
				setState(1264);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1265);
				match(T__1);
				setState(1266);
				query();
				setState(1267);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1269);
				match(EXISTS);
				setState(1270);
				match(T__1);
				setState(1271);
				query();
				setState(1272);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1274);
				match(CASE);
				setState(1275);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1276);
					whenClause();
					}
					}
					setState(1279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1281);
					match(ELSE);
					setState(1282);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1285);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1287);
				match(CASE);
				setState(1289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1288);
					whenClause();
					}
					}
					setState(1291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1293);
					match(ELSE);
					setState(1294);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1297);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1299);
				match(CAST);
				setState(1300);
				match(T__1);
				setState(1301);
				expression();
				setState(1302);
				match(AS);
				setState(1303);
				type(0);
				setState(1304);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1306);
				match(TRY_CAST);
				setState(1307);
				match(T__1);
				setState(1308);
				expression();
				setState(1309);
				match(AS);
				setState(1310);
				type(0);
				setState(1311);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				match(ARRAY);
				setState(1314);
				match(T__6);
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1315);
					expression();
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1316);
						match(T__3);
						setState(1317);
						expression();
						}
						}
						setState(1322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1325);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1326);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1327);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1328);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1329);
					match(T__1);
					setState(1330);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1331);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1334);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1335);
					match(T__1);
					setState(1336);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1337);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1340);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1341);
					match(T__1);
					setState(1342);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1343);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1346);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1347);
					match(T__1);
					setState(1348);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1349);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1352);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new CurrentPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1353);
				((CurrentPathContext)_localctx).name = match(CURRENT_PATH);
				}
				break;
			case 32:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1354);
				match(SUBSTRING);
				setState(1355);
				match(T__1);
				setState(1356);
				valueExpression(0);
				setState(1357);
				match(FROM);
				setState(1358);
				valueExpression(0);
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1359);
					match(FOR);
					setState(1360);
					valueExpression(0);
					}
				}

				setState(1363);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1365);
				match(NORMALIZE);
				setState(1366);
				match(T__1);
				setState(1367);
				valueExpression(0);
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1368);
					match(T__3);
					setState(1369);
					normalForm();
					}
				}

				setState(1372);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1374);
				match(EXTRACT);
				setState(1375);
				match(T__1);
				setState(1376);
				identifier();
				setState(1377);
				match(FROM);
				setState(1378);
				valueExpression(0);
				setState(1379);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1381);
				match(T__1);
				setState(1382);
				expression();
				setState(1383);
				match(T__2);
				}
				break;
			case 36:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1385);
				match(GROUPING);
				setState(1386);
				match(T__1);
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1387);
					qualifiedName();
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1388);
						match(T__3);
						setState(1389);
						qualifiedName();
						}
						}
						setState(1394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1397);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1400);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1401);
						match(T__6);
						setState(1402);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1403);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1405);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1406);
						match(T__0);
						setState(1407);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nullTreatment);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				match(IGNORE);
				setState(1414);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				match(RESPECT);
				setState(1416);
				match(NULLS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_string);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				match(UNICODE_STRING);
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1421);
					match(UESCAPE);
					setState(1422);
					match(STRING);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_timeZoneSpecifier);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				match(TIME);
				setState(1428);
				match(ZONE);
				setState(1429);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				match(TIME);
				setState(1431);
				match(ZONE);
				setState(1432);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			_la = _input.LA(1);
			if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (EQ - 209)) | (1L << (NEQ - 209)) | (1L << (LT - 209)) | (1L << (LTE - 209)) | (1L << (GT - 209)) | (1L << (GTE - 209)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(INTERVAL);
			setState(1443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1442);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1445);
			string();
			setState(1446);
			((IntervalContext)_localctx).from = intervalField();
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1447);
				match(TO);
				setState(1448);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (HOUR - 83)) | (1L << (MINUTE - 83)) | (1L << (MONTH - 83)))) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (NFC - 114)) | (1L << (NFD - 114)) | (1L << (NFKC - 114)) | (1L << (NFKD - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowTypeContext extends TypeContext {
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<RowFieldContext> rowField() {
			return getRuleContexts(RowFieldContext.class);
		}
		public RowFieldContext rowField(int i) {
			return getRuleContext(RowFieldContext.class,i);
		}
		public RowTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalTypeContext extends TypeContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublePrecisionTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SqlBaseParser.PRECISION, 0); }
		public DoublePrecisionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoublePrecisionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoublePrecisionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoublePrecisionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LegacyArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericTypeContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public GenericTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateTimeTypeContext extends TypeContext {
		public Token base;
		public Token precision;
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(SqlBaseParser.WITHOUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(SqlBaseParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SqlBaseParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public DateTimeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDateTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDateTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyMapTypeContext extends TypeContext {
		public TypeContext keyType;
		public TypeContext valueType;
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LegacyMapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1456);
				match(ROW);
				setState(1457);
				match(T__1);
				setState(1458);
				rowField();
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1459);
					match(T__3);
					setState(1460);
					rowField();
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1466);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1468);
				match(INTERVAL);
				setState(1469);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1470);
					match(TO);
					setState(1471);
					((IntervalTypeContext)_localctx).to = intervalField();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1474);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1475);
					match(T__1);
					setState(1476);
					((DateTimeTypeContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1477);
					match(T__2);
					}
					break;
				}
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1480);
					match(WITHOUT);
					setState(1481);
					match(TIME);
					setState(1482);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1485);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1486);
					match(T__1);
					setState(1487);
					((DateTimeTypeContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1488);
					match(T__2);
					}
				}

				setState(1491);
				match(WITH);
				setState(1492);
				match(TIME);
				setState(1493);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1494);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1495);
					match(T__1);
					setState(1496);
					((DateTimeTypeContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1497);
					match(T__2);
					}
					break;
				}
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1500);
					match(WITHOUT);
					setState(1501);
					match(TIME);
					setState(1502);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1505);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1506);
					match(T__1);
					setState(1507);
					((DateTimeTypeContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1508);
					match(T__2);
					}
				}

				setState(1511);
				match(WITH);
				setState(1512);
				match(TIME);
				setState(1513);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new DoublePrecisionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1514);
				match(DOUBLE);
				setState(1515);
				match(PRECISION);
				}
				break;
			case 8:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1516);
				match(ARRAY);
				setState(1517);
				match(LT);
				setState(1518);
				type(0);
				setState(1519);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1521);
				match(MAP);
				setState(1522);
				match(LT);
				setState(1523);
				((LegacyMapTypeContext)_localctx).keyType = type(0);
				setState(1524);
				match(T__3);
				setState(1525);
				((LegacyMapTypeContext)_localctx).valueType = type(0);
				setState(1526);
				match(GT);
				}
				break;
			case 10:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1528);
				identifier();
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1529);
					match(T__1);
					setState(1530);
					typeParameter();
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1531);
						match(T__3);
						setState(1532);
						typeParameter();
						}
						}
						setState(1537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1538);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1544);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1545);
					match(ARRAY);
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1546);
						match(T__6);
						setState(1547);
						match(INTEGER_VALUE);
						setState(1548);
						match(T__7);
						}
						break;
					}
					}
					} 
				}
				setState(1555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RowFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RowFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFieldContext rowField() throws RecognitionException {
		RowFieldContext _localctx = new RowFieldContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rowField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1556);
				identifier();
				}
				break;
			}
			setState(1559);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeParameter);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(WHEN);
			setState(1566);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1567);
			match(THEN);
			setState(1568);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(FILTER);
			setState(1571);
			match(T__1);
			setState(1572);
			match(WHERE);
			setState(1573);
			booleanExpression(0);
			setState(1574);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(OVER);
			setState(1577);
			match(T__1);
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1578);
				match(PARTITION);
				setState(1579);
				match(BY);
				setState(1580);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1581);
					match(T__3);
					setState(1582);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1590);
				match(ORDER);
				setState(1591);
				match(BY);
				setState(1592);
				sortItem();
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1593);
					match(T__3);
					setState(1594);
					sortItem();
					}
					}
					setState(1599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1602);
				windowFrame();
				}
			}

			setState(1605);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_windowFrame);
		try {
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1608);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1610);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1612);
				match(BETWEEN);
				setState(1613);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1614);
				match(AND);
				setState(1615);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1617);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1618);
				match(BETWEEN);
				setState(1619);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1620);
				match(AND);
				setState(1621);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_frameBound);
		int _la;
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				match(UNBOUNDED);
				setState(1626);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1627);
				match(UNBOUNDED);
				setState(1628);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				match(CURRENT);
				setState(1630);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1631);
				expression();
				setState(1632);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_explainOption);
		int _la;
		try {
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				match(FORMAT);
				setState(1637);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				match(TYPE);
				setState(1639);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (DISTRIBUTED - 54)) | (1L << (IO - 54)) | (1L << (LOGICAL - 54)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_transactionMode);
		int _la;
		try {
			setState(1647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(ISOLATION);
				setState(1643);
				match(LEVEL);
				setState(1644);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				match(READ);
				setState(1646);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_levelOfIsolation);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				match(READ);
				setState(1650);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
				match(READ);
				setState(1652);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1653);
				match(REPEATABLE);
				setState(1654);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1655);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_callArgument);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				identifier();
				setState(1660);
				match(T__8);
				setState(1661);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathElementContext extends ParserRuleContext {
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
	 
		public PathElementContext() { }
		public void copyFrom(PathElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualifiedArgumentContext extends PathElementContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnqualifiedArgumentContext extends PathElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnqualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnqualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnqualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pathElement);
		try {
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				_localctx = new QualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				identifier();
				setState(1666);
				match(T__0);
				setState(1667);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnqualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathSpecificationContext extends ParserRuleContext {
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSpecificationContext pathSpecification() throws RecognitionException {
		PathSpecificationContext _localctx = new PathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pathSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			pathElement();
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1673);
				match(T__3);
				setState(1674);
				pathElement();
				}
				}
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_privilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			identifier();
			setState(1687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					match(T__0);
					setState(1684);
					identifier();
					}
					} 
				}
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_grantor);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				principal();
				}
				break;
			case CURRENT_USER:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				match(CURRENT_USER);
				}
				break;
			case CURRENT_ROLE:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1692);
				match(CURRENT_ROLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_principal);
		try {
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				identifier();
				}
				break;
			case 2:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(USER);
				setState(1697);
				identifier();
				}
				break;
			case 3:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1698);
				match(ROLE);
				setState(1699);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			identifier();
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1703);
				match(T__3);
				setState(1704);
				identifier();
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifier);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1710);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1712);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1714);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1717);
					match(MINUS);
					}
				}

				setState(1720);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1721);
					match(MINUS);
					}
				}

				setState(1724);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1725);
					match(MINUS);
					}
				}

				setState(1728);
				match(INTEGER_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NEXT() { return getToken(SqlBaseParser.NEXT, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PATH() { return getToken(SqlBaseParser.PATH, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(SqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIES() { return getToken(SqlBaseParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WITHOUT() { return getToken(SqlBaseParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)) | (1L << (ONLY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WITHOUT - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 23:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 32:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 34:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 35:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 45:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ed\u06c8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00a2\n\6\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\6\3\6\5\6\u00ad\n"+
		"\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00bf\n\6\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\5\6\u00c7\n\6\3\6\3\6\5"+
		"\6\u00cb\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3\n\6\3\6\3\6\5\6\u00d7\n"+
		"\6\3\6\5\6\u00da\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e1\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00e8\n\6\f\6\16\6\u00eb\13\6\3\6\3\6\3\6\5\6\u00f0\n\6\3\6\3"+
		"\6\5\6\u00f4\n\6\3\6\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0101\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010a\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011a\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0137\n\6\3\6\3\6\3\6\5\6\u013c\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0142\n\6\3\6\3\6\5\6\u0146\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u014f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u015f\n\6\f\6\16\6\u0162\13\6\5\6\u0164\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u016e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0179"+
		"\n\6\f\6\16\6\u017c\13\6\3\6\3\6\3\6\5\6\u0181\n\6\3\6\3\6\3\6\5\6\u0186"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u018c\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0193\n\6\f"+
		"\6\16\6\u0196\13\6\3\6\3\6\3\6\5\6\u019b\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u01a2"+
		"\n\6\3\6\3\6\3\6\3\6\7\6\u01a8\n\6\f\6\16\6\u01ab\13\6\3\6\3\6\5\6\u01af"+
		"\n\6\3\6\3\6\5\6\u01b3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01bb\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u01c1\n\6\3\6\3\6\3\6\7\6\u01c6\n\6\f\6\16\6\u01c9\13\6"+
		"\3\6\3\6\5\6\u01cd\n\6\3\6\3\6\5\6\u01d1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u01db\n\6\3\6\5\6\u01de\n\6\3\6\3\6\5\6\u01e2\n\6\3\6\5\6\u01e5"+
		"\n\6\3\6\3\6\3\6\3\6\7\6\u01eb\n\6\f\6\16\6\u01ee\13\6\3\6\3\6\5\6\u01f2"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0201\n\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0207\n\6\5\6\u0209\n\6\3\6\3\6\3\6\3\6\5\6\u020f"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u0215\n\6\5\6\u0217\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u021f\n\6\5\6\u0221\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0234\n\6\3\6\3\6\3\6\5\6\u0239\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0240\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u024c\n\6\5\6\u024e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0256\n\6\5"+
		"\6\u0258\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u0268\n\6\f\6\16\6\u026b\13\6\5\6\u026d\n\6\3\6\3\6\5\6\u0271\n\6\3"+
		"\6\3\6\5\6\u0275\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u0285\n\6\f\6\16\6\u0288\13\6\5\6\u028a\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0295\n\6\3\7\5\7\u0298\n\7\3\7\3\7\3\b\3\b\5"+
		"\b\u029e\n\b\3\b\3\b\3\b\7\b\u02a3\n\b\f\b\16\b\u02a6\13\b\3\t\3\t\5\t"+
		"\u02aa\n\t\3\n\3\n\3\n\3\n\5\n\u02b0\n\n\3\n\3\n\5\n\u02b4\n\n\3\n\3\n"+
		"\5\n\u02b8\n\n\3\13\3\13\3\13\3\13\5\13\u02be\n\13\3\f\3\f\3\f\3\f\7\f"+
		"\u02c4\n\f\f\f\16\f\u02c7\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u02d5\n\16\f\16\16\16\u02d8\13\16\5\16\u02da\n\16"+
		"\3\16\3\16\3\16\5\16\u02df\n\16\5\16\u02e1\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u02e8\n\16\3\16\3\16\3\16\3\16\5\16\u02ee\n\16\5\16\u02f0\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02f8\n\17\3\17\3\17\3\17\3\17\5\17"+
		"\u02fe\n\17\3\17\7\17\u0301\n\17\f\17\16\17\u0304\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u030d\n\20\f\20\16\20\u0310\13\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0316\n\20\3\21\3\21\5\21\u031a\n\21\3\21\3\21\5\21\u031e"+
		"\n\21\3\22\3\22\5\22\u0322\n\22\3\22\3\22\3\22\7\22\u0327\n\22\f\22\16"+
		"\22\u032a\13\22\3\22\3\22\3\22\3\22\7\22\u0330\n\22\f\22\16\22\u0333\13"+
		"\22\5\22\u0335\n\22\3\22\3\22\5\22\u0339\n\22\3\22\3\22\3\22\5\22\u033e"+
		"\n\22\3\22\3\22\5\22\u0342\n\22\3\23\5\23\u0345\n\23\3\23\3\23\3\23\7"+
		"\23\u034a\n\23\f\23\16\23\u034d\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0355\n\24\f\24\16\24\u0358\13\24\5\24\u035a\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u0362\n\24\f\24\16\24\u0365\13\24\5\24\u0367\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0370\n\24\f\24\16\24\u0373\13"+
		"\24\3\24\3\24\5\24\u0377\n\24\3\25\3\25\3\25\3\25\7\25\u037d\n\25\f\25"+
		"\16\25\u0380\13\25\5\25\u0382\n\25\3\25\3\25\5\25\u0386\n\25\3\26\3\26"+
		"\5\26\u038a\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0395"+
		"\n\30\3\30\5\30\u0398\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u039f\n\30\3"+
		"\30\5\30\u03a2\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u03b5\n\31\7\31\u03b7\n\31\f"+
		"\31\16\31\u03ba\13\31\3\32\5\32\u03bd\n\32\3\32\3\32\5\32\u03c1\n\32\3"+
		"\32\3\32\5\32\u03c5\n\32\3\32\3\32\5\32\u03c9\n\32\5\32\u03cb\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u03d4\n\33\f\33\16\33\u03d7\13\33"+
		"\3\33\3\33\5\33\u03db\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03e4"+
		"\n\34\3\35\3\35\3\36\3\36\5\36\u03ea\n\36\3\36\3\36\5\36\u03ee\n\36\5"+
		"\36\u03f0\n\36\3\37\3\37\3\37\3\37\7\37\u03f6\n\37\f\37\16\37\u03f9\13"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0407\n \f \16 \u040a\13"+
		" \3 \3 \3 \5 \u040f\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u041a\n \3!\3!\3"+
		"\"\3\"\3\"\5\"\u0421\n\"\3\"\3\"\5\"\u0425\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u042d\n\"\f\"\16\"\u0430\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u043c"+
		"\n#\3#\3#\3#\3#\3#\3#\5#\u0444\n#\3#\3#\3#\3#\3#\7#\u044b\n#\f#\16#\u044e"+
		"\13#\3#\3#\3#\5#\u0453\n#\3#\3#\3#\3#\3#\3#\5#\u045b\n#\3#\3#\3#\3#\5"+
		"#\u0461\n#\3#\3#\5#\u0465\n#\3#\3#\3#\5#\u046a\n#\3#\3#\3#\5#\u046f\n"+
		"#\3$\3$\3$\3$\5$\u0475\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0483"+
		"\n$\f$\16$\u0486\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u04a1\n%\r%\16%\u04a2\3%\3%\3%\3%\3%\3%\3"+
		"%\7%\u04ac\n%\f%\16%\u04af\13%\3%\3%\3%\3%\3%\3%\3%\5%\u04b8\n%\3%\5%"+
		"\u04bb\n%\3%\3%\3%\5%\u04c0\n%\3%\3%\3%\7%\u04c5\n%\f%\16%\u04c8\13%\5"+
		"%\u04ca\n%\3%\3%\3%\3%\3%\7%\u04d1\n%\f%\16%\u04d4\13%\5%\u04d6\n%\3%"+
		"\3%\5%\u04da\n%\3%\5%\u04dd\n%\3%\5%\u04e0\n%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\7%\u04ea\n%\f%\16%\u04ed\13%\5%\u04ef\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\6%\u0500\n%\r%\16%\u0501\3%\3%\5%\u0506\n%\3%\3%\3%\3"+
		"%\6%\u050c\n%\r%\16%\u050d\3%\3%\5%\u0512\n%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0529\n%\f%\16%\u052c\13%\5%"+
		"\u052e\n%\3%\3%\3%\3%\3%\3%\3%\5%\u0537\n%\3%\3%\3%\3%\5%\u053d\n%\3%"+
		"\3%\3%\3%\5%\u0543\n%\3%\3%\3%\3%\5%\u0549\n%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u0554\n%\3%\3%\3%\3%\3%\3%\3%\5%\u055d\n%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0571\n%\f%\16%\u0574\13%\5%\u0576"+
		"\n%\3%\5%\u0579\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0583\n%\f%\16%\u0586\13"+
		"%\3&\3&\3&\3&\5&\u058c\n&\3\'\3\'\3\'\3\'\5\'\u0592\n\'\5\'\u0594\n\'"+
		"\3(\3(\3(\3(\3(\3(\5(\u059c\n(\3)\3)\3*\3*\3+\3+\3,\3,\5,\u05a6\n,\3,"+
		"\3,\3,\3,\5,\u05ac\n,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\7/\u05b8\n/\f/\16"+
		"/\u05bb\13/\3/\3/\3/\3/\3/\3/\5/\u05c3\n/\3/\3/\3/\3/\5/\u05c9\n/\3/\3"+
		"/\3/\5/\u05ce\n/\3/\3/\3/\3/\5/\u05d4\n/\3/\3/\3/\3/\3/\3/\3/\5/\u05dd"+
		"\n/\3/\3/\3/\5/\u05e2\n/\3/\3/\3/\3/\5/\u05e8\n/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0600\n/\f/\16/\u0603"+
		"\13/\3/\3/\5/\u0607\n/\5/\u0609\n/\3/\3/\3/\3/\3/\5/\u0610\n/\7/\u0612"+
		"\n/\f/\16/\u0615\13/\3\60\5\60\u0618\n\60\3\60\3\60\3\61\3\61\5\61\u061e"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u0632\n\64\f\64\16\64\u0635\13\64\5\64"+
		"\u0637\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u063e\n\64\f\64\16\64\u0641"+
		"\13\64\5\64\u0643\n\64\3\64\5\64\u0646\n\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u065a"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0665\n\66\3\67"+
		"\3\67\3\67\3\67\5\67\u066b\n\67\38\38\38\38\38\58\u0672\n8\39\39\39\3"+
		"9\39\39\39\59\u067b\n9\3:\3:\3:\3:\3:\5:\u0682\n:\3;\3;\3;\3;\3;\5;\u0689"+
		"\n;\3<\3<\3<\7<\u068e\n<\f<\16<\u0691\13<\3=\3=\3>\3>\3>\7>\u0698\n>\f"+
		">\16>\u069b\13>\3?\3?\3?\5?\u06a0\n?\3@\3@\3@\3@\3@\5@\u06a7\n@\3A\3A"+
		"\3A\7A\u06ac\nA\fA\16A\u06af\13A\3B\3B\3B\3B\3B\5B\u06b6\nB\3C\5C\u06b9"+
		"\nC\3C\3C\5C\u06bd\nC\3C\3C\5C\u06c1\nC\3C\5C\u06c4\nC\3D\3D\3D\2\b\34"+
		"\60BFH\\E\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\33\4\2"+
		"\33\33\u009a\u009a\4\2\63\63``\4\2KKXX\4\2??YY\3\2\u00a1\u00a2\4\2\16"+
		"\16\u00e2\u00e2\4\2GGss\4\2>>\u00c2\u00c2\4\2\25\25\65\65\4\2GGff\4\2"+
		"\16\16\67\67\4\2\27\27\u00b1\u00b1\3\2\u00d9\u00da\3\2\u00db\u00dd\3\2"+
		"\u00d3\u00d8\5\2\16\16\22\22\u00ad\u00ad\4\2DD\u00bc\u00bc\7\2\61\61U"+
		"Upq\u00a5\u00a5\u00d1\u00d1\3\2tw\4\2HH\u008d\u008d\5\2QQee\u00b5\u00b5"+
		"\6\288aann\u00c7\u00c7\4\2\u0081\u0081\u00d0\u00d0\5\2\64\64\\\\\u00a7"+
		"\u00a7.\2\f\16\20\20\22\23\25\27\32\33\36#((/\61\63\63\65\6589??BBEHJ"+
		"JMQUWYY[[^^`accegiikknqsy}\177\u0081\u0082\u0085\u0085\u0087\u008e\u0090"+
		"\u0093\u0095\u009b\u009d\u009f\u00a1\u00a6\u00a8\u00b1\u00b3\u00b5\u00b7"+
		"\u00bb\u00bd\u00be\u00c0\u00c1\u00c4\u00c5\u00c7\u00c7\u00c9\u00ca\u00ce"+
		"\u00d2\2\u07e4\2\u0088\3\2\2\2\4\u008b\3\2\2\2\6\u008e\3\2\2\2\b\u0091"+
		"\3\2\2\2\n\u0294\3\2\2\2\f\u0297\3\2\2\2\16\u029b\3\2\2\2\20\u02a9\3\2"+
		"\2\2\22\u02ab\3\2\2\2\24\u02b9\3\2\2\2\26\u02bf\3\2\2\2\30\u02ca\3\2\2"+
		"\2\32\u02ce\3\2\2\2\34\u02f1\3\2\2\2\36\u0315\3\2\2\2 \u0317\3\2\2\2\""+
		"\u031f\3\2\2\2$\u0344\3\2\2\2&\u0376\3\2\2\2(\u0385\3\2\2\2*\u0387\3\2"+
		"\2\2,\u0390\3\2\2\2.\u03a1\3\2\2\2\60\u03a3\3\2\2\2\62\u03ca\3\2\2\2\64"+
		"\u03da\3\2\2\2\66\u03dc\3\2\2\28\u03e5\3\2\2\2:\u03e7\3\2\2\2<\u03f1\3"+
		"\2\2\2>\u0419\3\2\2\2@\u041b\3\2\2\2B\u0424\3\2\2\2D\u046e\3\2\2\2F\u0474"+
		"\3\2\2\2H\u0578\3\2\2\2J\u058b\3\2\2\2L\u0593\3\2\2\2N\u059b\3\2\2\2P"+
		"\u059d\3\2\2\2R\u059f\3\2\2\2T\u05a1\3\2\2\2V\u05a3\3\2\2\2X\u05ad\3\2"+
		"\2\2Z\u05af\3\2\2\2\\\u0608\3\2\2\2^\u0617\3\2\2\2`\u061d\3\2\2\2b\u061f"+
		"\3\2\2\2d\u0624\3\2\2\2f\u062a\3\2\2\2h\u0659\3\2\2\2j\u0664\3\2\2\2l"+
		"\u066a\3\2\2\2n\u0671\3\2\2\2p\u067a\3\2\2\2r\u0681\3\2\2\2t\u0688\3\2"+
		"\2\2v\u068a\3\2\2\2x\u0692\3\2\2\2z\u0694\3\2\2\2|\u069f\3\2\2\2~\u06a6"+
		"\3\2\2\2\u0080\u06a8\3\2\2\2\u0082\u06b5\3\2\2\2\u0084\u06c3\3\2\2\2\u0086"+
		"\u06c5\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2"+
		"\u008b\u008c\5@!\2\u008c\u008d\7\2\2\3\u008d\5\3\2\2\2\u008e\u008f\5v"+
		"<\2\u008f\u0090\7\2\2\3\u0090\7\3\2\2\2\u0091\u0092\5\\/\2\u0092\u0093"+
		"\7\2\2\3\u0093\t\3\2\2\2\u0094\u0295\5\f\7\2\u0095\u0096\7\u00c4\2\2\u0096"+
		"\u0295\5\u0082B\2\u0097\u0098\7\u00c4\2\2\u0098\u0099\5\u0082B\2\u0099"+
		"\u009a\7\3\2\2\u009a\u009b\5\u0082B\2\u009b\u0295\3\2\2\2\u009c\u009d"+
		"\7%\2\2\u009d\u00a1\7\u00a3\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7{\2\2"+
		"\u00a0\u00a2\7A\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a6\5z>\2\u00a4\u00a5\7\u00cd\2\2\u00a5\u00a7\5\26\f"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u0295\3\2\2\2\u00a8\u00a9"+
		"\7:\2\2\u00a9\u00ac\7\u00a3\2\2\u00aa\u00ab\7V\2\2\u00ab\u00ad\7A\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\5z>\2\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u0295\3\2\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\7\u00a3\2\2\u00b4\u00b5"+
		"\5z>\2\u00b5\u00b6\7\u0095\2\2\u00b6\u00b7\7\u00ba\2\2\u00b7\u00b8\5\u0082"+
		"B\2\u00b8\u0295\3\2\2\2\u00b9\u00ba\7%\2\2\u00ba\u00be\7\u00b2\2\2\u00bb"+
		"\u00bc\7V\2\2\u00bc\u00bd\7{\2\2\u00bd\u00bf\7A\2\2\u00be\u00bb\3\2\2"+
		"\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\5z>\2\u00c1\u00c3"+
		"\5<\37\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c5\7!\2\2\u00c5\u00c7\5L\'\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c9\7\u00cd\2\2\u00c9\u00cb\5\26\f\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d2\7\24"+
		"\2\2\u00cd\u00d3\5\f\7\2\u00ce\u00cf\7\4\2\2\u00cf\u00d0\5\f\7\2\u00d0"+
		"\u00d1\7\5\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d3\u00d9\3\2\2\2\u00d4\u00d6\7\u00cd\2\2\u00d5\u00d7\7x\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7/"+
		"\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u0295\3\2\2\2\u00db"+
		"\u00dc\7%\2\2\u00dc\u00e0\7\u00b2\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7"+
		"{\2\2\u00df\u00e1\7A\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\5z>\2\u00e3\u00e4\7\4\2\2\u00e4\u00e9\5\20"+
		"\t\2\u00e5\u00e6\7\6\2\2\u00e6\u00e8\5\20\t\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\7\5\2\2\u00ed\u00ee\7!\2\2\u00ee"+
		"\u00f0\5L\'\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00f2\7\u00cd\2\2\u00f2\u00f4\5\26\f\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u0295\3\2\2\2\u00f5\u00f6\7:\2\2\u00f6\u00f9"+
		"\7\u00b2\2\2\u00f7\u00f8\7V\2\2\u00f8\u00fa\7A\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0295\5z>\2\u00fc\u00fd"+
		"\7\\\2\2\u00fd\u00fe\7_\2\2\u00fe\u0100\5z>\2\u00ff\u0101\5<\37\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\f"+
		"\7\2\u0103\u0295\3\2\2\2\u0104\u0105\7\64\2\2\u0105\u0106\7K\2\2\u0106"+
		"\u0109\5z>\2\u0107\u0108\7\u00cc\2\2\u0108\u010a\5B\"\2\u0109\u0107\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u0295\3\2\2\2\u010b\u010c\7\17\2\2\u010c"+
		"\u010d\7\u00b2\2\2\u010d\u010e\5z>\2\u010e\u010f\7\u0095\2\2\u010f\u0110"+
		"\7\u00ba\2\2\u0110\u0111\5z>\2\u0111\u0295\3\2\2\2\u0112\u0113\7!\2\2"+
		"\u0113\u0114\7\u0080\2\2\u0114\u0115\7\u00b2\2\2\u0115\u0116\5z>\2\u0116"+
		"\u0119\7b\2\2\u0117\u011a\5L\'\2\u0118\u011a\7|\2\2\u0119\u0117\3\2\2"+
		"\2\u0119\u0118\3\2\2\2\u011a\u0295\3\2\2\2\u011b\u011c\7\17\2\2\u011c"+
		"\u011d\7\u00b2\2\2\u011d\u011e\5z>\2\u011e\u011f\7\u0095\2\2\u011f\u0120"+
		"\7\37\2\2\u0120\u0121\5\u0082B\2\u0121\u0122\7\u00ba\2\2\u0122\u0123\5"+
		"\u0082B\2\u0123\u0295\3\2\2\2\u0124\u0125\7\17\2\2\u0125\u0126\7\u00b2"+
		"\2\2\u0126\u0127\5z>\2\u0127\u0128\7:\2\2\u0128\u0129\7\37\2\2\u0129\u012a"+
		"\5z>\2\u012a\u0295\3\2\2\2\u012b\u012c\7\17\2\2\u012c\u012d\7\u00b2\2"+
		"\2\u012d\u012e\5z>\2\u012e\u012f\7\f\2\2\u012f\u0130\7\37\2\2\u0130\u0131"+
		"\5\22\n\2\u0131\u0295\3\2\2\2\u0132\u0133\7\20\2\2\u0133\u0136\5z>\2\u0134"+
		"\u0135\7\u00cd\2\2\u0135\u0137\5\26\f\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0295\3\2\2\2\u0138\u013b\7%\2\2\u0139\u013a\7\u0083\2"+
		"\2\u013a\u013c\7\u0097\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7\u00ca\2\2\u013e\u0141\5z>\2\u013f\u0140\7"+
		"!\2\2\u0140\u0142\5L\'\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0144\7\u00a6\2\2\u0144\u0146\t\3\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\24\2\2"+
		"\u0148\u0149\5\f\7\2\u0149\u0295\3\2\2\2\u014a\u014b\7:\2\2\u014b\u014e"+
		"\7\u00ca\2\2\u014c\u014d\7V\2\2\u014d\u014f\7A\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0295\5z>\2\u0151\u0152"+
		"\7\17\2\2\u0152\u0153\7\u00ca\2\2\u0153\u0154\5z>\2\u0154\u0155\7\u0095"+
		"\2\2\u0155\u0156\7\u00ba\2\2\u0156\u0157\5z>\2\u0157\u0295\3\2\2\2\u0158"+
		"\u0159\7\32\2\2\u0159\u015a\5z>\2\u015a\u0163\7\4\2\2\u015b\u0160\5r:"+
		"\2\u015c\u015d\7\6\2\2\u015d\u015f\5r:\2\u015e\u015c\3\2\2\2\u015f\u0162"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\7\5\2\2\u0166\u0295\3\2\2\2\u0167\u0168\7%\2\2\u0168"+
		"\u0169\7\u009d\2\2\u0169\u016d\5\u0082B\2\u016a\u016b\7\u00cd\2\2\u016b"+
		"\u016c\7\r\2\2\u016c\u016e\5|?\2\u016d\u016a\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016e\u0295\3\2\2\2\u016f\u0170\7:\2\2\u0170\u0171\7\u009d\2\2\u0171"+
		"\u0295\5\u0082B\2\u0172\u0173\7N\2\2\u0173\u0174\5\u0080A\2\u0174\u0175"+
		"\7\u00ba\2\2\u0175\u017a\5~@\2\u0176\u0177\7\6\2\2\u0177\u0179\5~@\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u0180\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\u00cd\2\2\u017e"+
		"\u017f\7\r\2\2\u017f\u0181\7\u0082\2\2\u0180\u017d\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0183\7O\2\2\u0183\u0184\7\31\2\2\u0184"+
		"\u0186\5|?\2\u0185\u0182\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0295\3\2\2"+
		"\2\u0187\u018b\7\u009b\2\2\u0188\u0189\7\r\2\2\u0189\u018a\7\u0082\2\2"+
		"\u018a\u018c\7I\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018e\5\u0080A\2\u018e\u018f\7K\2\2\u018f\u0194\5~@\2\u0190"+
		"\u0191\7\6\2\2\u0191\u0193\5~@\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2"+
		"\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019a\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u0198\7O\2\2\u0198\u0199\7\31\2\2\u0199\u019b\5|?\2\u019a"+
		"\u0197\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0295\3\2\2\2\u019c\u019d\7\u00aa"+
		"\2\2\u019d\u01a1\7\u009d\2\2\u019e\u01a2\7\16\2\2\u019f\u01a2\7y\2\2\u01a0"+
		"\u01a2\5\u0082B\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u0295\3\2\2\2\u01a3\u01ae\7N\2\2\u01a4\u01a9\5x=\2\u01a5"+
		"\u01a6\7\6\2\2\u01a6\u01a8\5x=\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2"+
		"\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01af\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ad\7\16\2\2\u01ad\u01af\7\u0090\2\2\u01ae\u01a4\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\7\u0080\2\2\u01b1"+
		"\u01b3\7\u00b2\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\5z>\2\u01b5\u01b6\7\u00ba\2\2\u01b6\u01ba\5~@\2\u01b7"+
		"\u01b8\7\u00cd\2\2\u01b8\u01b9\7N\2\2\u01b9\u01bb\7\u0082\2\2\u01ba\u01b7"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u0295\3\2\2\2\u01bc\u01c0\7\u009b\2"+
		"\2\u01bd\u01be\7N\2\2\u01be\u01bf\7\u0082\2\2\u01bf\u01c1\7I\2\2\u01c0"+
		"\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01cc\3\2\2\2\u01c2\u01c7\5x"+
		"=\2\u01c3\u01c4\7\6\2\2\u01c4\u01c6\5x=\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cd\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cb\7\16\2\2\u01cb\u01cd\7\u0090\2\2\u01cc\u01c2"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\7\u0080\2"+
		"\2\u01cf\u01d1\7\u00b2\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\5z>\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\5~@\2"+
		"\u01d5\u0295\3\2\2\2\u01d6\u01d7\7\u00ac\2\2\u01d7\u01dd\7P\2\2\u01d8"+
		"\u01da\7\u0080\2\2\u01d9\u01db\7\u00b2\2\2\u01da\u01d9\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\5z>\2\u01dd\u01d8\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u0295\3\2\2\2\u01df\u01e1\7B\2\2\u01e0\u01e2\7\20"+
		"\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e5\7\u00c9\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f1"+
		"\3\2\2\2\u01e6\u01e7\7\4\2\2\u01e7\u01ec\5l\67\2\u01e8\u01e9\7\6\2\2\u01e9"+
		"\u01eb\5l\67\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\7\5\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01e6\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u0295\5\n\6\2\u01f4\u01f5\7\u00ac\2\2\u01f5"+
		"\u01f6\7%\2\2\u01f6\u01f7\7\u00b2\2\2\u01f7\u0295\5z>\2\u01f8\u01f9\7"+
		"\u00ac\2\2\u01f9\u01fa\7%\2\2\u01fa\u01fb\7\u00ca\2\2\u01fb\u0295\5z>"+
		"\2\u01fc\u01fd\7\u00ac\2\2\u01fd\u0200\7\u00b3\2\2\u01fe\u01ff\t\4\2\2"+
		"\u01ff\u0201\5z>\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0208"+
		"\3\2\2\2\u0202\u0203\7j\2\2\u0203\u0206\5L\'\2\u0204\u0205\7=\2\2\u0205"+
		"\u0207\5L\'\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2"+
		"\2\2\u0208\u0202\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0295\3\2\2\2\u020a"+
		"\u020b\7\u00ac\2\2\u020b\u020e\7\u00a4\2\2\u020c\u020d\t\4\2\2\u020d\u020f"+
		"\5\u0082B\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0216\3\2\2"+
		"\2\u0210\u0211\7j\2\2\u0211\u0214\5L\'\2\u0212\u0213\7=\2\2\u0213\u0215"+
		"\5L\'\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0210\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0295\3\2\2\2\u0218\u0219\7\u00ac"+
		"\2\2\u0219\u0220\7\36\2\2\u021a\u021b\7j\2\2\u021b\u021e\5L\'\2\u021c"+
		"\u021d\7=\2\2\u021d\u021f\5L\'\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u0221\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0295"+
		"\3\2\2\2\u0222\u0223\7\u00ac\2\2\u0223\u0224\7 \2\2\u0224\u0225\t\4\2"+
		"\2\u0225\u0295\5z>\2\u0226\u0227\7\u00ac\2\2\u0227\u0228\7\u00af\2\2\u0228"+
		"\u0229\7I\2\2\u0229\u0295\5z>\2\u022a\u022b\7\u00ac\2\2\u022b\u022c\7"+
		"\u00af\2\2\u022c\u022d\7I\2\2\u022d\u022e\7\4\2\2\u022e\u022f\5\"\22\2"+
		"\u022f\u0230\7\5\2\2\u0230\u0295\3\2\2\2\u0231\u0233\7\u00ac\2\2\u0232"+
		"\u0234\7(\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0238\7\u009e\2\2\u0236\u0237\t\4\2\2\u0237\u0239\5\u0082B"+
		"\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0295\3\2\2\2\u023a\u023b"+
		"\7\u00ac\2\2\u023b\u023c\7\u009d\2\2\u023c\u023f\7P\2\2\u023d\u023e\t"+
		"\4\2\2\u023e\u0240\5\u0082B\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2"+
		"\u0240\u0295\3\2\2\2\u0241\u0242\7\66\2\2\u0242\u0295\5z>\2\u0243\u0244"+
		"\7\65\2\2\u0244\u0295\5z>\2\u0245\u0246\7\u00ac\2\2\u0246\u024d\7M\2\2"+
		"\u0247\u0248\7j\2\2\u0248\u024b\5L\'\2\u0249\u024a\7=\2\2\u024a\u024c"+
		"\5L\'\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u0247\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0295\3\2\2\2\u024f\u0250\7\u00ac"+
		"\2\2\u0250\u0257\7\u00a9\2\2\u0251\u0252\7j\2\2\u0252\u0255\5L\'\2\u0253"+
		"\u0254\7=\2\2\u0254\u0256\5L\'\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2"+
		"\2\u0256\u0258\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0295"+
		"\3\2\2\2\u0259\u025a\7\u00aa\2\2\u025a\u025b\7\u00a9\2\2\u025b\u025c\5"+
		"z>\2\u025c\u025d\7\u00d3\2\2\u025d\u025e\5@!\2\u025e\u0295\3\2\2\2\u025f"+
		"\u0260\7\u0098\2\2\u0260\u0261\7\u00a9\2\2\u0261\u0295\5z>\2\u0262\u0263"+
		"\7\u00ae\2\2\u0263\u026c\7\u00bb\2\2\u0264\u0269\5n8\2\u0265\u0266\7\6"+
		"\2\2\u0266\u0268\5n8\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u0264\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0295\3\2\2\2\u026e\u0270\7\""+
		"\2\2\u026f\u0271\7\u00cf\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0295\3\2\2\2\u0272\u0274\7\u009f\2\2\u0273\u0275\7\u00cf\2\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0295\3\2\2\2\u0276\u0277\7\u008f\2"+
		"\2\u0277\u0278\5\u0082B\2\u0278\u0279\7K\2\2\u0279\u027a\5\n\6\2\u027a"+
		"\u0295\3\2\2\2\u027b\u027c\7\62\2\2\u027c\u027d\7\u008f\2\2\u027d\u0295"+
		"\5\u0082B\2\u027e\u027f\7@\2\2\u027f\u0289\5\u0082B\2\u0280\u0281\7\u00c6"+
		"\2\2\u0281\u0286\5@!\2\u0282\u0283\7\6\2\2\u0283\u0285\5@!\2\u0284\u0282"+
		"\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u0280\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u0295\3\2\2\2\u028b\u028c\7\66\2\2\u028c\u028d\7[\2\2\u028d"+
		"\u0295\5\u0082B\2\u028e\u028f\7\66\2\2\u028f\u0290\7\u0087\2\2\u0290\u0295"+
		"\5\u0082B\2\u0291\u0292\7\u00aa\2\2\u0292\u0293\7\u008b\2\2\u0293\u0295"+
		"\5v<\2\u0294\u0094\3\2\2\2\u0294\u0095\3\2\2\2\u0294\u0097\3\2\2\2\u0294"+
		"\u009c\3\2\2\2\u0294\u00a8\3\2\2\2\u0294\u00b2\3\2\2\2\u0294\u00b9\3\2"+
		"\2\2\u0294\u00db\3\2\2\2\u0294\u00f5\3\2\2\2\u0294\u00fc\3\2\2\2\u0294"+
		"\u0104\3\2\2\2\u0294\u010b\3\2\2\2\u0294\u0112\3\2\2\2\u0294\u011b\3\2"+
		"\2\2\u0294\u0124\3\2\2\2\u0294\u012b\3\2\2\2\u0294\u0132\3\2\2\2\u0294"+
		"\u0138\3\2\2\2\u0294\u014a\3\2\2\2\u0294\u0151\3\2\2\2\u0294\u0158\3\2"+
		"\2\2\u0294\u0167\3\2\2\2\u0294\u016f\3\2\2\2\u0294\u0172\3\2\2\2\u0294"+
		"\u0187\3\2\2\2\u0294\u019c\3\2\2\2\u0294\u01a3\3\2\2\2\u0294\u01bc\3\2"+
		"\2\2\u0294\u01d6\3\2\2\2\u0294\u01df\3\2\2\2\u0294\u01f4\3\2\2\2\u0294"+
		"\u01f8\3\2\2\2\u0294\u01fc\3\2\2\2\u0294\u020a\3\2\2\2\u0294\u0218\3\2"+
		"\2\2\u0294\u0222\3\2\2\2\u0294\u0226\3\2\2\2\u0294\u022a\3\2\2\2\u0294"+
		"\u0231\3\2\2\2\u0294\u023a\3\2\2\2\u0294\u0241\3\2\2\2\u0294\u0243\3\2"+
		"\2\2\u0294\u0245\3\2\2\2\u0294\u024f\3\2\2\2\u0294\u0259\3\2\2\2\u0294"+
		"\u025f\3\2\2\2\u0294\u0262\3\2\2\2\u0294\u026e\3\2\2\2\u0294\u0272\3\2"+
		"\2\2\u0294\u0276\3\2\2\2\u0294\u027b\3\2\2\2\u0294\u027e\3\2\2\2\u0294"+
		"\u028b\3\2\2\2\u0294\u028e\3\2\2\2\u0294\u0291\3\2\2\2\u0295\13\3\2\2"+
		"\2\u0296\u0298\5\16\b\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\5\32\16\2\u029a\r\3\2\2\2\u029b\u029d\7\u00cd"+
		"\2\2\u029c\u029e\7\u0094\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a4\5*\26\2\u02a0\u02a1\7\6\2\2\u02a1\u02a3\5*"+
		"\26\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\17\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\5\22\n"+
		"\2\u02a8\u02aa\5\24\13\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\21\3\2\2\2\u02ab\u02ac\5\u0082B\2\u02ac\u02af\5\\/\2\u02ad\u02ae\7{\2"+
		"\2\u02ae\u02b0\7|\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3"+
		"\3\2\2\2\u02b1\u02b2\7!\2\2\u02b2\u02b4\5L\'\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b6\7\u00cd\2\2\u02b6\u02b8"+
		"\5\26\f\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\23\3\2\2\2\u02b9"+
		"\u02ba\7j\2\2\u02ba\u02bd\5z>\2\u02bb\u02bc\t\5\2\2\u02bc\u02be\7\u0091"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\25\3\2\2\2\u02bf\u02c0"+
		"\7\4\2\2\u02c0\u02c5\5\30\r\2\u02c1\u02c2\7\6\2\2\u02c2\u02c4\5\30\r\2"+
		"\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7\5\2\2\u02c9"+
		"\27\3\2\2\2\u02ca\u02cb\5\u0082B\2\u02cb\u02cc\7\u00d3\2\2\u02cc\u02cd"+
		"\5@!\2\u02cd\31\3\2\2\2\u02ce\u02d9\5\34\17\2\u02cf\u02d0\7\u0084\2\2"+
		"\u02d0\u02d1\7\31\2\2\u02d1\u02d6\5 \21\2\u02d2\u02d3\7\6\2\2\u02d3\u02d5"+
		"\5 \21\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02cf\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02e0\3\2\2\2\u02db\u02dc\7\177\2\2\u02dc"+
		"\u02de\7\u00e2\2\2\u02dd\u02df\t\6\2\2\u02de\u02dd\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02ef\3\2\2\2\u02e2\u02e3\7k\2\2\u02e3\u02f0\t\7\2\2\u02e4\u02e5\7E\2"+
		"\2\u02e5\u02e7\t\b\2\2\u02e6\u02e8\7\u00e2\2\2\u02e7\u02e6\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ed\t\6\2\2\u02ea\u02ee\7\u0081"+
		"\2\2\u02eb\u02ec\7\u00cd\2\2\u02ec\u02ee\7\u00b7\2\2\u02ed\u02ea\3\2\2"+
		"\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02e2\3\2\2\2\u02ef\u02e4"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\33\3\2\2\2\u02f1\u02f2\b\17\1\2\u02f2"+
		"\u02f3\5\36\20\2\u02f3\u0302\3\2\2\2\u02f4\u02f5\f\4\2\2\u02f5\u02f7\7"+
		"]\2\2\u02f6\u02f8\5,\27\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u0301\5\34\17\5\u02fa\u02fb\f\3\2\2\u02fb\u02fd\t"+
		"\t\2\2\u02fc\u02fe\5,\27\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0301\5\34\17\4\u0300\u02f4\3\2\2\2\u0300\u02fa\3"+
		"\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\35\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0316\5\"\22\2\u0306\u0307\7\u00b2"+
		"\2\2\u0307\u0316\5z>\2\u0308\u0309\7\u00c8\2\2\u0309\u030e\5@!\2\u030a"+
		"\u030b\7\6\2\2\u030b\u030d\5@!\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2"+
		"\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0316\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0311\u0312\7\4\2\2\u0312\u0313\5\32\16\2\u0313\u0314\7\5\2\2"+
		"\u0314\u0316\3\2\2\2\u0315\u0305\3\2\2\2\u0315\u0306\3\2\2\2\u0315\u0308"+
		"\3\2\2\2\u0315\u0311\3\2\2\2\u0316\37\3\2\2\2\u0317\u0319\5@!\2\u0318"+
		"\u031a\t\n\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031d\3\2"+
		"\2\2\u031b\u031c\7~\2\2\u031c\u031e\t\13\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e!\3\2\2\2\u031f\u0321\7\u00a7\2\2\u0320\u0322\5,\27"+
		"\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0328"+
		"\5.\30\2\u0324\u0325\7\6\2\2\u0325\u0327\5.\30\2\u0326\u0324\3\2\2\2\u0327"+
		"\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0334\3\2"+
		"\2\2\u032a\u0328\3\2\2\2\u032b\u032c\7K\2\2\u032c\u0331\5\60\31\2\u032d"+
		"\u032e\7\6\2\2\u032e\u0330\5\60\31\2\u032f\u032d\3\2\2\2\u0330\u0333\3"+
		"\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0334\u032b\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2"+
		"\2\2\u0336\u0337\7\u00cc\2\2\u0337\u0339\5B\"\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033d\3\2\2\2\u033a\u033b\7R\2\2\u033b\u033c\7\31"+
		"\2\2\u033c\u033e\5$\23\2\u033d\u033a\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u0340\7T\2\2\u0340\u0342\5B\"\2\u0341\u033f\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342#\3\2\2\2\u0343\u0345\5,\27\2\u0344\u0343"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034b\5&\24\2\u0347"+
		"\u0348\7\6\2\2\u0348\u034a\5&\24\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c%\3\2\2\2\u034d\u034b"+
		"\3\2\2\2\u034e\u0377\5(\25\2\u034f\u0350\7\u00a0\2\2\u0350\u0359\7\4\2"+
		"\2\u0351\u0356\5@!\2\u0352\u0353\7\6\2\2\u0353\u0355\5@!\2\u0354\u0352"+
		"\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u0351\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u035b\3\2\2\2\u035b\u0377\7\5\2\2\u035c\u035d\7\'\2\2\u035d"+
		"\u0366\7\4\2\2\u035e\u0363\5@!\2\u035f\u0360\7\6\2\2\u0360\u0362\5@!\2"+
		"\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u035e\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0377\7\5\2\2\u0369\u036a\7S"+
		"\2\2\u036a\u036b\7\u00ab\2\2\u036b\u036c\7\4\2\2\u036c\u0371\5(\25\2\u036d"+
		"\u036e\7\6\2\2\u036e\u0370\5(\25\2\u036f\u036d\3\2\2\2\u0370\u0373\3\2"+
		"\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373"+
		"\u0371\3\2\2\2\u0374\u0375\7\5\2\2\u0375\u0377\3\2\2\2\u0376\u034e\3\2"+
		"\2\2\u0376\u034f\3\2\2\2\u0376\u035c\3\2\2\2\u0376\u0369\3\2\2\2\u0377"+
		"\'\3\2\2\2\u0378\u0381\7\4\2\2\u0379\u037e\5@!\2\u037a\u037b\7\6\2\2\u037b"+
		"\u037d\5@!\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0379"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0386\7\5\2\2\u0384"+
		"\u0386\5@!\2\u0385\u0378\3\2\2\2\u0385\u0384\3\2\2\2\u0386)\3\2\2\2\u0387"+
		"\u0389\5\u0082B\2\u0388\u038a\5<\37\2\u0389\u0388\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\7\24\2\2\u038c\u038d\7\4\2\2"+
		"\u038d\u038e\5\f\7\2\u038e\u038f\7\5\2\2\u038f+\3\2\2\2\u0390\u0391\t"+
		"\f\2\2\u0391-\3\2\2\2\u0392\u0397\5@!\2\u0393\u0395\7\24\2\2\u0394\u0393"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\5\u0082B"+
		"\2\u0397\u0394\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03a2\3\2\2\2\u0399\u039a"+
		"\5H%\2\u039a\u039b\7\3\2\2\u039b\u039e\7\u00db\2\2\u039c\u039d\7\24\2"+
		"\2\u039d\u039f\5<\37\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a2"+
		"\3\2\2\2\u03a0\u03a2\7\u00db\2\2\u03a1\u0392\3\2\2\2\u03a1\u0399\3\2\2"+
		"\2\u03a1\u03a0\3\2\2\2\u03a2/\3\2\2\2\u03a3\u03a4\b\31\1\2\u03a4\u03a5"+
		"\5\66\34\2\u03a5\u03b8\3\2\2\2\u03a6\u03b4\f\4\2\2\u03a7\u03a8\7&\2\2"+
		"\u03a8\u03a9\7d\2\2\u03a9\u03b5\5\66\34\2\u03aa\u03ab\5\62\32\2\u03ab"+
		"\u03ac\7d\2\2\u03ac\u03ad\5\60\31\2\u03ad\u03ae\5\64\33\2\u03ae\u03b5"+
		"\3\2\2\2\u03af\u03b0\7r\2\2\u03b0\u03b1\5\62\32\2\u03b1\u03b2\7d\2\2\u03b2"+
		"\u03b3\5\66\34\2\u03b3\u03b5\3\2\2\2\u03b4\u03a7\3\2\2\2\u03b4\u03aa\3"+
		"\2\2\2\u03b4\u03af\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03a6\3\2\2\2\u03b7"+
		"\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\61\3\2\2"+
		"\2\u03ba\u03b8\3\2\2\2\u03bb\u03bd\7Z\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03cb\3\2\2\2\u03be\u03c0\7h\2\2\u03bf\u03c1\7\u0086\2"+
		"\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03cb\3\2\2\2\u03c2\u03c4"+
		"\7\u009c\2\2\u03c3\u03c5\7\u0086\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3"+
		"\2\2\2\u03c5\u03cb\3\2\2\2\u03c6\u03c8\7L\2\2\u03c7\u03c9\7\u0086\2\2"+
		"\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03bc"+
		"\3\2\2\2\u03ca\u03be\3\2\2\2\u03ca\u03c2\3\2\2\2\u03ca\u03c6\3\2\2\2\u03cb"+
		"\63\3\2\2\2\u03cc\u03cd\7\u0080\2\2\u03cd\u03db\5B\"\2\u03ce\u03cf\7\u00c6"+
		"\2\2\u03cf\u03d0\7\4\2\2\u03d0\u03d5\5\u0082B\2\u03d1\u03d2\7\6\2\2\u03d2"+
		"\u03d4\5\u0082B\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3"+
		"\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03d9\7\5\2\2\u03d9\u03db\3\2\2\2\u03da\u03cc\3\2\2\2\u03da\u03ce\3\2"+
		"\2\2\u03db\65\3\2\2\2\u03dc\u03e3\5:\36\2\u03dd\u03de\7\u00b4\2\2\u03de"+
		"\u03df\58\35\2\u03df\u03e0\7\4\2\2\u03e0\u03e1\5@!\2\u03e1\u03e2\7\5\2"+
		"\2\u03e2\u03e4\3\2\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\67"+
		"\3\2\2\2\u03e5\u03e6\t\r\2\2\u03e69\3\2\2\2\u03e7\u03ef\5> \2\u03e8\u03ea"+
		"\7\24\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2"+
		"\u03eb\u03ed\5\u0082B\2\u03ec\u03ee\5<\37\2\u03ed\u03ec\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef\u03f0\3\2"+
		"\2\2\u03f0;\3\2\2\2\u03f1\u03f2\7\4\2\2\u03f2\u03f7\5\u0082B\2\u03f3\u03f4"+
		"\7\6\2\2\u03f4\u03f6\5\u0082B\2\u03f5\u03f3\3\2\2\2\u03f6\u03f9\3\2\2"+
		"\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03fa\u03fb\7\5\2\2\u03fb=\3\2\2\2\u03fc\u041a\5z>\2\u03fd\u03fe"+
		"\7\4\2\2\u03fe\u03ff\5\f\7\2\u03ff\u0400\7\5\2\2\u0400\u041a\3\2\2\2\u0401"+
		"\u0402\7\u00c3\2\2\u0402\u0403\7\4\2\2\u0403\u0408\5@!\2\u0404\u0405\7"+
		"\6\2\2\u0405\u0407\5@!\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u0408\3\2"+
		"\2\2\u040b\u040e\7\5\2\2\u040c\u040d\7\u00cd\2\2\u040d\u040f\7\u0085\2"+
		"\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u041a\3\2\2\2\u0410\u0411"+
		"\7g\2\2\u0411\u0412\7\4\2\2\u0412\u0413\5\f\7\2\u0413\u0414\7\5\2\2\u0414"+
		"\u041a\3\2\2\2\u0415\u0416\7\4\2\2\u0416\u0417\5\60\31\2\u0417\u0418\7"+
		"\5\2\2\u0418\u041a\3\2\2\2\u0419\u03fc\3\2\2\2\u0419\u03fd\3\2\2\2\u0419"+
		"\u0401\3\2\2\2\u0419\u0410\3\2\2\2\u0419\u0415\3\2\2\2\u041a?\3\2\2\2"+
		"\u041b\u041c\5B\"\2\u041cA\3\2\2\2\u041d\u041e\b\"\1\2\u041e\u0420\5F"+
		"$\2\u041f\u0421\5D#\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0425"+
		"\3\2\2\2\u0422\u0423\7{\2\2\u0423\u0425\5B\"\5\u0424\u041d\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0425\u042e\3\2\2\2\u0426\u0427\f\4\2\2\u0427\u0428\7\21"+
		"\2\2\u0428\u042d\5B\"\5\u0429\u042a\f\3\2\2\u042a\u042b\7\u0083\2\2\u042b"+
		"\u042d\5B\"\4\u042c\u0426\3\2\2\2\u042c\u0429\3\2\2\2\u042d\u0430\3\2"+
		"\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042fC\3\2\2\2\u0430\u042e"+
		"\3\2\2\2\u0431\u0432\5P)\2\u0432\u0433\5F$\2\u0433\u046f\3\2\2\2\u0434"+
		"\u0435\5P)\2\u0435\u0436\5R*\2\u0436\u0437\7\4\2\2\u0437\u0438\5\f\7\2"+
		"\u0438\u0439\7\5\2\2\u0439\u046f\3\2\2\2\u043a\u043c\7{\2\2\u043b\u043a"+
		"\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\7\30\2\2"+
		"\u043e\u043f\5F$\2\u043f\u0440\7\21\2\2\u0440\u0441\5F$\2\u0441\u046f"+
		"\3\2\2\2\u0442\u0444\7{\2\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\7X\2\2\u0446\u0447\7\4\2\2\u0447\u044c\5@!"+
		"\2\u0448\u0449\7\6\2\2\u0449\u044b\5@!\2\u044a\u0448\3\2\2\2\u044b\u044e"+
		"\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044f\u0450\7\5\2\2\u0450\u046f\3\2\2\2\u0451\u0453\7{"+
		"\2\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0455\7X\2\2\u0455\u0456\7\4\2\2\u0456\u0457\5\f\7\2\u0457\u0458\7\5"+
		"\2\2\u0458\u046f\3\2\2\2\u0459\u045b\7{\2\2\u045a\u0459\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\7j\2\2\u045d\u0460\5F$"+
		"\2\u045e\u045f\7=\2\2\u045f\u0461\5F$\2\u0460\u045e\3\2\2\2\u0460\u0461"+
		"\3\2\2\2\u0461\u046f\3\2\2\2\u0462\u0464\7b\2\2\u0463\u0465\7{\2\2\u0464"+
		"\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u046f\7|"+
		"\2\2\u0467\u0469\7b\2\2\u0468\u046a\7{\2\2\u0469\u0468\3\2\2\2\u0469\u046a"+
		"\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7\67\2\2\u046c\u046d\7K\2\2\u046d"+
		"\u046f\5F$\2\u046e\u0431\3\2\2\2\u046e\u0434\3\2\2\2\u046e\u043b\3\2\2"+
		"\2\u046e\u0443\3\2\2\2\u046e\u0452\3\2\2\2\u046e\u045a\3\2\2\2\u046e\u0462"+
		"\3\2\2\2\u046e\u0467\3\2\2\2\u046fE\3\2\2\2\u0470\u0471\b$\1\2\u0471\u0475"+
		"\5H%\2\u0472\u0473\t\16\2\2\u0473\u0475\5F$\6\u0474\u0470\3\2\2\2\u0474"+
		"\u0472\3\2\2\2\u0475\u0484\3\2\2\2\u0476\u0477\f\5\2\2\u0477\u0478\t\17"+
		"\2\2\u0478\u0483\5F$\6\u0479\u047a\f\4\2\2\u047a\u047b\t\16\2\2\u047b"+
		"\u0483\5F$\5\u047c\u047d\f\3\2\2\u047d\u047e\7\u00de\2\2\u047e\u0483\5"+
		"F$\4\u047f\u0480\f\7\2\2\u0480\u0481\7\26\2\2\u0481\u0483\5N(\2\u0482"+
		"\u0476\3\2\2\2\u0482\u0479\3\2\2\2\u0482\u047c\3\2\2\2\u0482\u047f\3\2"+
		"\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"G\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0488\b%\1\2\u0488\u0579\7|\2\2\u0489"+
		"\u0579\5V,\2\u048a\u048b\5\u0082B\2\u048b\u048c\5L\'\2\u048c\u0579\3\2"+
		"\2\2\u048d\u048e\79\2\2\u048e\u048f\7\u008e\2\2\u048f\u0579\5L\'\2\u0490"+
		"\u0579\5\u0084C\2\u0491\u0579\5T+\2\u0492\u0579\5L\'\2\u0493\u0579\7\u00e1"+
		"\2\2\u0494\u0579\7\7\2\2\u0495\u0496\7\u008c\2\2\u0496\u0497\7\4\2\2\u0497"+
		"\u0498\5F$\2\u0498\u0499\7X\2\2\u0499\u049a\5F$\2\u049a\u049b\7\5\2\2"+
		"\u049b\u0579\3\2\2\2\u049c\u049d\7\4\2\2\u049d\u04a0\5@!\2\u049e\u049f"+
		"\7\6\2\2\u049f\u04a1\5@!\2\u04a0\u049e\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\7\5"+
		"\2\2\u04a5\u0579\3\2\2\2\u04a6\u04a7\7\u00a1\2\2\u04a7\u04a8\7\4\2\2\u04a8"+
		"\u04ad\5@!\2\u04a9\u04aa\7\6\2\2\u04aa\u04ac\5@!\2\u04ab\u04a9\3\2\2\2"+
		"\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0"+
		"\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b1\7\5\2\2\u04b1\u0579\3\2\2\2\u04b2"+
		"\u04b3\5z>\2\u04b3\u04b4\7\4\2\2\u04b4\u04b5\7\u00db\2\2\u04b5\u04b7\7"+
		"\5\2\2\u04b6\u04b8\5d\63\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04ba\3\2\2\2\u04b9\u04bb\5f\64\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2"+
		"\2\2\u04bb\u0579\3\2\2\2\u04bc\u04bd\5z>\2\u04bd\u04c9\7\4\2\2\u04be\u04c0"+
		"\5,\27\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04c6\5@!\2\u04c2\u04c3\7\6\2\2\u04c3\u04c5\5@!\2\u04c4\u04c2\3\2\2\2"+
		"\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04ca"+
		"\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04bf\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04d5\3\2\2\2\u04cb\u04cc\7\u0084\2\2\u04cc\u04cd\7\31\2\2\u04cd\u04d2"+
		"\5 \21\2\u04ce\u04cf\7\6\2\2\u04cf\u04d1\5 \21\2\u04d0\u04ce\3\2\2\2\u04d1"+
		"\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d6\3\2"+
		"\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04cb\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d9\7\5\2\2\u04d8\u04da\5d\63\2\u04d9\u04d8\3\2"+
		"\2\2\u04d9\u04da\3\2\2\2\u04da\u04df\3\2\2\2\u04db\u04dd\5J&\2\u04dc\u04db"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\5f\64\2\u04df"+
		"\u04dc\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u0579\3\2\2\2\u04e1\u04e2\5\u0082"+
		"B\2\u04e2\u04e3\7\b\2\2\u04e3\u04e4\5@!\2\u04e4\u0579\3\2\2\2\u04e5\u04ee"+
		"\7\4\2\2\u04e6\u04eb\5\u0082B\2\u04e7\u04e8\7\6\2\2\u04e8\u04ea\5\u0082"+
		"B\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb"+
		"\u04ec\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04e6\3\2"+
		"\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7\5\2\2\u04f1"+
		"\u04f2\7\b\2\2\u04f2\u0579\5@!\2\u04f3\u04f4\7\4\2\2\u04f4\u04f5\5\f\7"+
		"\2\u04f5\u04f6\7\5\2\2\u04f6\u0579\3\2\2\2\u04f7\u04f8\7A\2\2\u04f8\u04f9"+
		"\7\4\2\2\u04f9\u04fa\5\f\7\2\u04fa\u04fb\7\5\2\2\u04fb\u0579\3\2\2\2\u04fc"+
		"\u04fd\7\34\2\2\u04fd\u04ff\5@!\2\u04fe\u0500\5b\62\2\u04ff\u04fe\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"\u0505\3\2\2\2\u0503\u0504\7;\2\2\u0504\u0506\5@!\2\u0505\u0503\3\2\2"+
		"\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7<\2\2\u0508\u0579"+
		"\3\2\2\2\u0509\u050b\7\34\2\2\u050a\u050c\5b\62\2\u050b\u050a\3\2\2\2"+
		"\u050c\u050d\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0511"+
		"\3\2\2\2\u050f\u0510\7;\2\2\u0510\u0512\5@!\2\u0511\u050f\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7<\2\2\u0514\u0579\3\2"+
		"\2\2\u0515\u0516\7\35\2\2\u0516\u0517\7\4\2\2\u0517\u0518\5@!\2\u0518"+
		"\u0519\7\24\2\2\u0519\u051a\5\\/\2\u051a\u051b\7\5\2\2\u051b\u0579\3\2"+
		"\2\2\u051c\u051d\7\u00bd\2\2\u051d\u051e\7\4\2\2\u051e\u051f\5@!\2\u051f"+
		"\u0520\7\24\2\2\u0520\u0521\5\\/\2\u0521\u0522\7\5\2\2\u0522\u0579\3\2"+
		"\2\2\u0523\u0524\7\23\2\2\u0524\u052d\7\t\2\2\u0525\u052a\5@!\2\u0526"+
		"\u0527\7\6\2\2\u0527\u0529\5@!\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2"+
		"\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052a"+
		"\3\2\2\2\u052d\u0525\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0579\7\n\2\2\u0530\u0579\5\u0082B\2\u0531\u0579\7)\2\2\u0532\u0536\7"+
		",\2\2\u0533\u0534\7\4\2\2\u0534\u0535\7\u00e2\2\2\u0535\u0537\7\5\2\2"+
		"\u0536\u0533\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0579\3\2\2\2\u0538\u053c"+
		"\7-\2\2\u0539\u053a\7\4\2\2\u053a\u053b\7\u00e2\2\2\u053b\u053d\7\5\2"+
		"\2\u053c\u0539\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0579\3\2\2\2\u053e\u0542"+
		"\7l\2\2\u053f\u0540\7\4\2\2\u0540\u0541\7\u00e2\2\2\u0541\u0543\7\5\2"+
		"\2\u0542\u053f\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0579\3\2\2\2\u0544\u0548"+
		"\7m\2\2\u0545\u0546\7\4\2\2\u0546\u0547\7\u00e2\2\2\u0547\u0549\7\5\2"+
		"\2\u0548\u0545\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0579\3\2\2\2\u054a\u0579"+
		"\7.\2\2\u054b\u0579\7*\2\2\u054c\u054d\7\u00b0\2\2\u054d\u054e\7\4\2\2"+
		"\u054e\u054f\5F$\2\u054f\u0550\7K\2\2\u0550\u0553\5F$\2\u0551\u0552\7"+
		"I\2\2\u0552\u0554\5F$\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u0556\7\5\2\2\u0556\u0579\3\2\2\2\u0557\u0558\7z"+
		"\2\2\u0558\u0559\7\4\2\2\u0559\u055c\5F$\2\u055a\u055b\7\6\2\2\u055b\u055d"+
		"\5Z.\2\u055c\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u055f\7\5\2\2\u055f\u0579\3\2\2\2\u0560\u0561\7C\2\2\u0561\u0562\7\4"+
		"\2\2\u0562\u0563\5\u0082B\2\u0563\u0564\7K\2\2\u0564\u0565\5F$\2\u0565"+
		"\u0566\7\5\2\2\u0566\u0579\3\2\2\2\u0567\u0568\7\4\2\2\u0568\u0569\5@"+
		"!\2\u0569\u056a\7\5\2\2\u056a\u0579\3\2\2\2\u056b\u056c\7S\2\2\u056c\u0575"+
		"\7\4\2\2\u056d\u0572\5z>\2\u056e\u056f\7\6\2\2\u056f\u0571\5z>\2\u0570"+
		"\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2"+
		"\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u056d\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\7\5\2\2\u0578\u0487\3\2"+
		"\2\2\u0578\u0489\3\2\2\2\u0578\u048a\3\2\2\2\u0578\u048d\3\2\2\2\u0578"+
		"\u0490\3\2\2\2\u0578\u0491\3\2\2\2\u0578\u0492\3\2\2\2\u0578\u0493\3\2"+
		"\2\2\u0578\u0494\3\2\2\2\u0578\u0495\3\2\2\2\u0578\u049c\3\2\2\2\u0578"+
		"\u04a6\3\2\2\2\u0578\u04b2\3\2\2\2\u0578\u04bc\3\2\2\2\u0578\u04e1\3\2"+
		"\2\2\u0578\u04e5\3\2\2\2\u0578\u04f3\3\2\2\2\u0578\u04f7\3\2\2\2\u0578"+
		"\u04fc\3\2\2\2\u0578\u0509\3\2\2\2\u0578\u0515\3\2\2\2\u0578\u051c\3\2"+
		"\2\2\u0578\u0523\3\2\2\2\u0578\u0530\3\2\2\2\u0578\u0531\3\2\2\2\u0578"+
		"\u0532\3\2\2\2\u0578\u0538\3\2\2\2\u0578\u053e\3\2\2\2\u0578\u0544\3\2"+
		"\2\2\u0578\u054a\3\2\2\2\u0578\u054b\3\2\2\2\u0578\u054c\3\2\2\2\u0578"+
		"\u0557\3\2\2\2\u0578\u0560\3\2\2\2\u0578\u0567\3\2\2\2\u0578\u056b\3\2"+
		"\2\2\u0579\u0584\3\2\2\2\u057a\u057b\f\21\2\2\u057b\u057c\7\t\2\2\u057c"+
		"\u057d\5F$\2\u057d\u057e\7\n\2\2\u057e\u0583\3\2\2\2\u057f\u0580\f\17"+
		"\2\2\u0580\u0581\7\3\2\2\u0581\u0583\5\u0082B\2\u0582\u057a\3\2\2\2\u0582"+
		"\u057f\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585I\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\7W\2\2\u0588\u058c"+
		"\7~\2\2\u0589\u058a\7\u0099\2\2\u058a\u058c\7~\2\2\u058b\u0587\3\2\2\2"+
		"\u058b\u0589\3\2\2\2\u058cK\3\2\2\2\u058d\u0594\7\u00df\2\2\u058e\u0591"+
		"\7\u00e0\2\2\u058f\u0590\7\u00bf\2\2\u0590\u0592\7\u00df\2\2\u0591\u058f"+
		"\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u058d\3\2\2\2\u0593"+
		"\u058e\3\2\2\2\u0594M\3\2\2\2\u0595\u0596\7\u00b8\2\2\u0596\u0597\7\u00d2"+
		"\2\2\u0597\u059c\5V,\2\u0598\u0599\7\u00b8\2\2\u0599\u059a\7\u00d2\2\2"+
		"\u059a\u059c\5L\'\2\u059b\u0595\3\2\2\2\u059b\u0598\3\2\2\2\u059cO\3\2"+
		"\2\2\u059d\u059e\t\20\2\2\u059eQ\3\2\2\2\u059f\u05a0\t\21\2\2\u05a0S\3"+
		"\2\2\2\u05a1\u05a2\t\22\2\2\u05a2U\3\2\2\2\u05a3\u05a5\7^\2\2\u05a4\u05a6"+
		"\t\16\2\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2"+
		"\u05a7\u05a8\5L\'\2\u05a8\u05ab\5X-\2\u05a9\u05aa\7\u00ba\2\2\u05aa\u05ac"+
		"\5X-\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05acW\3\2\2\2\u05ad\u05ae"+
		"\t\23\2\2\u05aeY\3\2\2\2\u05af\u05b0\t\24\2\2\u05b0[\3\2\2\2\u05b1\u05b2"+
		"\b/\1\2\u05b2\u05b3\7\u00a1\2\2\u05b3\u05b4\7\4\2\2\u05b4\u05b9\5^\60"+
		"\2\u05b5\u05b6\7\6\2\2\u05b6\u05b8\5^\60\2\u05b7\u05b5\3\2\2\2\u05b8\u05bb"+
		"\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb"+
		"\u05b9\3\2\2\2\u05bc\u05bd\7\5\2\2\u05bd\u0609\3\2\2\2\u05be\u05bf\7^"+
		"\2\2\u05bf\u05c2\5X-\2\u05c0\u05c1\7\u00ba\2\2\u05c1\u05c3\5X-\2\u05c2"+
		"\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u0609\3\2\2\2\u05c4\u05c8\7\u00b9"+
		"\2\2\u05c5\u05c6\7\4\2\2\u05c6\u05c7\7\u00e2\2\2\u05c7\u05c9\7\5\2\2\u05c8"+
		"\u05c5\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cd\3\2\2\2\u05ca\u05cb\7\u00ce"+
		"\2\2\u05cb\u05cc\7\u00b8\2\2\u05cc\u05ce\7\u00d2\2\2\u05cd\u05ca\3\2\2"+
		"\2\u05cd\u05ce\3\2\2\2\u05ce\u0609\3\2\2\2\u05cf\u05d3\7\u00b9\2\2\u05d0"+
		"\u05d1\7\4\2\2\u05d1\u05d2\7\u00e2\2\2\u05d2\u05d4\7\5\2\2\u05d3\u05d0"+
		"\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\7\u00cd\2"+
		"\2\u05d6\u05d7\7\u00b8\2\2\u05d7\u0609\7\u00d2\2\2\u05d8\u05dc\7\u00b8"+
		"\2\2\u05d9\u05da\7\4\2\2\u05da\u05db\7\u00e2\2\2\u05db\u05dd\7\5\2\2\u05dc"+
		"\u05d9\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e1\3\2\2\2\u05de\u05df\7\u00ce"+
		"\2\2\u05df\u05e0\7\u00b8\2\2\u05e0\u05e2\7\u00d2\2\2\u05e1\u05de\3\2\2"+
		"\2\u05e1\u05e2\3\2\2\2\u05e2\u0609\3\2\2\2\u05e3\u05e7\7\u00b8\2\2\u05e4"+
		"\u05e5\7\4\2\2\u05e5\u05e6\7\u00e2\2\2\u05e6\u05e8\7\5\2\2\u05e7\u05e4"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\7\u00cd\2"+
		"\2\u05ea\u05eb\7\u00b8\2\2\u05eb\u0609\7\u00d2\2\2\u05ec\u05ed\79\2\2"+
		"\u05ed\u0609\7\u008e\2\2\u05ee\u05ef\7\23\2\2\u05ef\u05f0\7\u00d5\2\2"+
		"\u05f0\u05f1\5\\/\2\u05f1\u05f2\7\u00d7\2\2\u05f2\u0609\3\2\2\2\u05f3"+
		"\u05f4\7o\2\2\u05f4\u05f5\7\u00d5\2\2\u05f5\u05f6\5\\/\2\u05f6\u05f7\7"+
		"\6\2\2\u05f7\u05f8\5\\/\2\u05f8\u05f9\7\u00d7\2\2\u05f9\u0609\3\2\2\2"+
		"\u05fa\u0606\5\u0082B\2\u05fb\u05fc\7\4\2\2\u05fc\u0601\5`\61\2\u05fd"+
		"\u05fe\7\6\2\2\u05fe\u0600\5`\61\2\u05ff\u05fd\3\2\2\2\u0600\u0603\3\2"+
		"\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603"+
		"\u0601\3\2\2\2\u0604\u0605\7\5\2\2\u0605\u0607\3\2\2\2\u0606\u05fb\3\2"+
		"\2\2\u0606\u0607\3\2\2\2\u0607\u0609\3\2\2\2\u0608\u05b1\3\2\2\2\u0608"+
		"\u05be\3\2\2\2\u0608\u05c4\3\2\2\2\u0608\u05cf\3\2\2\2\u0608\u05d8\3\2"+
		"\2\2\u0608\u05e3\3\2\2\2\u0608\u05ec\3\2\2\2\u0608\u05ee\3\2\2\2\u0608"+
		"\u05f3\3\2\2\2\u0608\u05fa\3\2\2\2\u0609\u0613\3\2\2\2\u060a\u060b\f\4"+
		"\2\2\u060b\u060f\7\23\2\2\u060c\u060d\7\t\2\2\u060d\u060e\7\u00e2\2\2"+
		"\u060e\u0610\7\n\2\2\u060f\u060c\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0612"+
		"\3\2\2\2\u0611\u060a\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613"+
		"\u0614\3\2\2\2\u0614]\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0618\5\u0082"+
		"B\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619"+
		"\u061a\5\\/\2\u061a_\3\2\2\2\u061b\u061e\7\u00e2\2\2\u061c\u061e\5\\/"+
		"\2\u061d\u061b\3\2\2\2\u061d\u061c\3\2\2\2\u061ea\3\2\2\2\u061f\u0620"+
		"\7\u00cb\2\2\u0620\u0621\5@!\2\u0621\u0622\7\u00b6\2\2\u0622\u0623\5@"+
		"!\2\u0623c\3\2\2\2\u0624\u0625\7F\2\2\u0625\u0626\7\4\2\2\u0626\u0627"+
		"\7\u00cc\2\2\u0627\u0628\5B\"\2\u0628\u0629\7\5\2\2\u0629e\3\2\2\2\u062a"+
		"\u062b\7\u0088\2\2\u062b\u0636\7\4\2\2\u062c\u062d\7\u0089\2\2\u062d\u062e"+
		"\7\31\2\2\u062e\u0633\5@!\2\u062f\u0630\7\6\2\2\u0630\u0632\5@!\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2"+
		"\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0636\u062c\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u0642\3\2\2\2\u0638\u0639\7\u0084\2\2\u0639\u063a"+
		"\7\31\2\2\u063a\u063f\5 \21\2\u063b\u063c\7\6\2\2\u063c\u063e\5 \21\2"+
		"\u063d\u063b\3\2\2\2\u063e\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640"+
		"\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0642\u0638\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0645\3\2\2\2\u0644\u0646\5h\65\2\u0645\u0644\3\2"+
		"\2\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\7\5\2\2\u0648"+
		"g\3\2\2\2\u0649\u064a\7\u0092\2\2\u064a\u065a\5j\66\2\u064b\u064c\7\u00a2"+
		"\2\2\u064c\u065a\5j\66\2\u064d\u064e\7\u0092\2\2\u064e\u064f\7\30\2\2"+
		"\u064f\u0650\5j\66\2\u0650\u0651\7\21\2\2\u0651\u0652\5j\66\2\u0652\u065a"+
		"\3\2\2\2\u0653\u0654\7\u00a2\2\2\u0654\u0655\7\30\2\2\u0655\u0656\5j\66"+
		"\2\u0656\u0657\7\21\2\2\u0657\u0658\5j\66\2\u0658\u065a\3\2\2\2\u0659"+
		"\u0649\3\2\2\2\u0659\u064b\3\2\2\2\u0659\u064d\3\2\2\2\u0659\u0653\3\2"+
		"\2\2\u065ai\3\2\2\2\u065b\u065c\7\u00c0\2\2\u065c\u0665\7\u008d\2\2\u065d"+
		"\u065e\7\u00c0\2\2\u065e\u0665\7H\2\2\u065f\u0660\7(\2\2\u0660\u0665\7"+
		"\u00a1\2\2\u0661\u0662\5@!\2\u0662\u0663\t\25\2\2\u0663\u0665\3\2\2\2"+
		"\u0664\u065b\3\2\2\2\u0664\u065d\3\2\2\2\u0664\u065f\3\2\2\2\u0664\u0661"+
		"\3\2\2\2\u0665k\3\2\2\2\u0666\u0667\7J\2\2\u0667\u066b\t\26\2\2\u0668"+
		"\u0669\7\u00be\2\2\u0669\u066b\t\27\2\2\u066a\u0666\3\2\2\2\u066a\u0668"+
		"\3\2\2\2\u066bm\3\2\2\2\u066c\u066d\7c\2\2\u066d\u066e\7i\2\2\u066e\u0672"+
		"\5p9\2\u066f\u0670\7\u0093\2\2\u0670\u0672\t\30\2\2\u0671\u066c\3\2\2"+
		"\2\u0671\u066f\3\2\2\2\u0672o\3\2\2\2\u0673\u0674\7\u0093\2\2\u0674\u067b"+
		"\7\u00c1\2\2\u0675\u0676\7\u0093\2\2\u0676\u067b\7#\2\2\u0677\u0678\7"+
		"\u0096\2\2\u0678\u067b\7\u0093\2\2\u0679\u067b\7\u00a8\2\2\u067a\u0673"+
		"\3\2\2\2\u067a\u0675\3\2\2\2\u067a\u0677\3\2\2\2\u067a\u0679\3\2\2\2\u067b"+
		"q\3\2\2\2\u067c\u0682\5@!\2\u067d\u067e\5\u0082B\2\u067e\u067f\7\13\2"+
		"\2\u067f\u0680\5@!\2\u0680\u0682\3\2\2\2\u0681\u067c\3\2\2\2\u0681\u067d"+
		"\3\2\2\2\u0682s\3\2\2\2\u0683\u0684\5\u0082B\2\u0684\u0685\7\3\2\2\u0685"+
		"\u0686\5\u0082B\2\u0686\u0689\3\2\2\2\u0687\u0689\5\u0082B\2\u0688\u0683"+
		"\3\2\2\2\u0688\u0687\3\2\2\2\u0689u\3\2\2\2\u068a\u068f\5t;\2\u068b\u068c"+
		"\7\6\2\2\u068c\u068e\5t;\2\u068d\u068b\3\2\2\2\u068e\u0691\3\2\2\2\u068f"+
		"\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690w\3\2\2\2\u0691\u068f\3\2\2\2"+
		"\u0692\u0693\t\31\2\2\u0693y\3\2\2\2\u0694\u0699\5\u0082B\2\u0695\u0696"+
		"\7\3\2\2\u0696\u0698\5\u0082B\2\u0697\u0695\3\2\2\2\u0698\u069b\3\2\2"+
		"\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a{\3\2\2\2\u069b\u0699"+
		"\3\2\2\2\u069c\u06a0\5~@\2\u069d\u06a0\7.\2\2\u069e\u06a0\7+\2\2\u069f"+
		"\u069c\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u069e\3\2\2\2\u06a0}\3\2\2\2"+
		"\u06a1\u06a7\5\u0082B\2\u06a2\u06a3\7\u00c5\2\2\u06a3\u06a7\5\u0082B\2"+
		"\u06a4\u06a5\7\u009d\2\2\u06a5\u06a7\5\u0082B\2\u06a6\u06a1\3\2\2\2\u06a6"+
		"\u06a2\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7\177\3\2\2\2\u06a8\u06ad\5\u0082"+
		"B\2\u06a9\u06aa\7\6\2\2\u06aa\u06ac\5\u0082B\2\u06ab\u06a9\3\2\2\2\u06ac"+
		"\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u0081\3\2"+
		"\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b6\7\u00e5\2\2\u06b1\u06b6\7\u00e7\2"+
		"\2\u06b2\u06b6\5\u0086D\2\u06b3\u06b6\7\u00e8\2\2\u06b4\u06b6\7\u00e6"+
		"\2\2\u06b5\u06b0\3\2\2\2\u06b5\u06b1\3\2\2\2\u06b5\u06b2\3\2\2\2\u06b5"+
		"\u06b3\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6\u0083\3\2\2\2\u06b7\u06b9\7\u00da"+
		"\2\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba"+
		"\u06c4\7\u00e3\2\2\u06bb\u06bd\7\u00da\2\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd"+
		"\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c4\7\u00e4\2\2\u06bf\u06c1\7\u00da"+
		"\2\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2"+
		"\u06c4\7\u00e2\2\2\u06c3\u06b8\3\2\2\2\u06c3\u06bc\3\2\2\2\u06c3\u06c0"+
		"\3\2\2\2\u06c4\u0085\3\2\2\2\u06c5\u06c6\t\32\2\2\u06c6\u0087\3\2\2\2"+
		"\u00e2\u00a1\u00a6\u00ac\u00b0\u00be\u00c2\u00c6\u00ca\u00d2\u00d6\u00d9"+
		"\u00e0\u00e9\u00ef\u00f3\u00f9\u0100\u0109\u0119\u0136\u013b\u0141\u0145"+
		"\u014e\u0160\u0163\u016d\u017a\u0180\u0185\u018b\u0194\u019a\u01a1\u01a9"+
		"\u01ae\u01b2\u01ba\u01c0\u01c7\u01cc\u01d0\u01da\u01dd\u01e1\u01e4\u01ec"+
		"\u01f1\u0200\u0206\u0208\u020e\u0214\u0216\u021e\u0220\u0233\u0238\u023f"+
		"\u024b\u024d\u0255\u0257\u0269\u026c\u0270\u0274\u0286\u0289\u0294\u0297"+
		"\u029d\u02a4\u02a9\u02af\u02b3\u02b7\u02bd\u02c5\u02d6\u02d9\u02de\u02e0"+
		"\u02e7\u02ed\u02ef\u02f7\u02fd\u0300\u0302\u030e\u0315\u0319\u031d\u0321"+
		"\u0328\u0331\u0334\u0338\u033d\u0341\u0344\u034b\u0356\u0359\u0363\u0366"+
		"\u0371\u0376\u037e\u0381\u0385\u0389\u0394\u0397\u039e\u03a1\u03b4\u03b8"+
		"\u03bc\u03c0\u03c4\u03c8\u03ca\u03d5\u03da\u03e3\u03e9\u03ed\u03ef\u03f7"+
		"\u0408\u040e\u0419\u0420\u0424\u042c\u042e\u043b\u0443\u044c\u0452\u045a"+
		"\u0460\u0464\u0469\u046e\u0474\u0482\u0484\u04a2\u04ad\u04b7\u04ba\u04bf"+
		"\u04c6\u04c9\u04d2\u04d5\u04d9\u04dc\u04df\u04eb\u04ee\u0501\u0505\u050d"+
		"\u0511\u052a\u052d\u0536\u053c\u0542\u0548\u0553\u055c\u0572\u0575\u0578"+
		"\u0582\u0584\u058b\u0591\u0593\u059b\u05a5\u05ab\u05b9\u05c2\u05c8\u05cd"+
		"\u05d3\u05dc\u05e1\u05e7\u0601\u0606\u0608\u060f\u0613\u0617\u061d\u0633"+
		"\u0636\u063f\u0642\u0645\u0659\u0664\u066a\u0671\u067a\u0681\u0688\u068f"+
		"\u0699\u069f\u06a6\u06ad\u06b5\u06b8\u06bc\u06c0\u06c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}