// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersJiraGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersOracleGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRdsGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersS3GetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSparkGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataGetArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersGetArgs Empty = new DataSourceParametersGetArgs();

    /**
     * Parameters for connecting to Amazon Elasticsearch.
     * 
     */
    @Import(name="amazonElasticsearch")
      private final @Nullable Output<DataSourceParametersAmazonElasticsearchGetArgs> amazonElasticsearch;

    public Output<DataSourceParametersAmazonElasticsearchGetArgs> getAmazonElasticsearch() {
        return this.amazonElasticsearch == null ? Codegen.empty() : this.amazonElasticsearch;
    }

    /**
     * Parameters for connecting to Athena.
     * 
     */
    @Import(name="athena")
      private final @Nullable Output<DataSourceParametersAthenaGetArgs> athena;

    public Output<DataSourceParametersAthenaGetArgs> getAthena() {
        return this.athena == null ? Codegen.empty() : this.athena;
    }

    /**
     * Parameters for connecting to Aurora MySQL.
     * 
     */
    @Import(name="aurora")
      private final @Nullable Output<DataSourceParametersAuroraGetArgs> aurora;

    public Output<DataSourceParametersAuroraGetArgs> getAurora() {
        return this.aurora == null ? Codegen.empty() : this.aurora;
    }

    /**
     * Parameters for connecting to Aurora Postgresql.
     * 
     */
    @Import(name="auroraPostgresql")
      private final @Nullable Output<DataSourceParametersAuroraPostgresqlGetArgs> auroraPostgresql;

    public Output<DataSourceParametersAuroraPostgresqlGetArgs> getAuroraPostgresql() {
        return this.auroraPostgresql == null ? Codegen.empty() : this.auroraPostgresql;
    }

    /**
     * Parameters for connecting to AWS IOT Analytics.
     * 
     */
    @Import(name="awsIotAnalytics")
      private final @Nullable Output<DataSourceParametersAwsIotAnalyticsGetArgs> awsIotAnalytics;

    public Output<DataSourceParametersAwsIotAnalyticsGetArgs> getAwsIotAnalytics() {
        return this.awsIotAnalytics == null ? Codegen.empty() : this.awsIotAnalytics;
    }

    /**
     * Parameters for connecting to Jira.
     * 
     */
    @Import(name="jira")
      private final @Nullable Output<DataSourceParametersJiraGetArgs> jira;

    public Output<DataSourceParametersJiraGetArgs> getJira() {
        return this.jira == null ? Codegen.empty() : this.jira;
    }

    /**
     * Parameters for connecting to MariaDB.
     * 
     */
    @Import(name="mariaDb")
      private final @Nullable Output<DataSourceParametersMariaDbGetArgs> mariaDb;

    public Output<DataSourceParametersMariaDbGetArgs> getMariaDb() {
        return this.mariaDb == null ? Codegen.empty() : this.mariaDb;
    }

    /**
     * Parameters for connecting to MySQL.
     * 
     */
    @Import(name="mysql")
      private final @Nullable Output<DataSourceParametersMysqlGetArgs> mysql;

    public Output<DataSourceParametersMysqlGetArgs> getMysql() {
        return this.mysql == null ? Codegen.empty() : this.mysql;
    }

    /**
     * Parameters for connecting to Oracle.
     * 
     */
    @Import(name="oracle")
      private final @Nullable Output<DataSourceParametersOracleGetArgs> oracle;

    public Output<DataSourceParametersOracleGetArgs> getOracle() {
        return this.oracle == null ? Codegen.empty() : this.oracle;
    }

    /**
     * Parameters for connecting to Postgresql.
     * 
     */
    @Import(name="postgresql")
      private final @Nullable Output<DataSourceParametersPostgresqlGetArgs> postgresql;

    public Output<DataSourceParametersPostgresqlGetArgs> getPostgresql() {
        return this.postgresql == null ? Codegen.empty() : this.postgresql;
    }

    /**
     * Parameters for connecting to Presto.
     * 
     */
    @Import(name="presto")
      private final @Nullable Output<DataSourceParametersPrestoGetArgs> presto;

    public Output<DataSourceParametersPrestoGetArgs> getPresto() {
        return this.presto == null ? Codegen.empty() : this.presto;
    }

    /**
     * Parameters for connecting to RDS.
     * 
     */
    @Import(name="rds")
      private final @Nullable Output<DataSourceParametersRdsGetArgs> rds;

    public Output<DataSourceParametersRdsGetArgs> getRds() {
        return this.rds == null ? Codegen.empty() : this.rds;
    }

    /**
     * Parameters for connecting to Redshift.
     * 
     */
    @Import(name="redshift")
      private final @Nullable Output<DataSourceParametersRedshiftGetArgs> redshift;

    public Output<DataSourceParametersRedshiftGetArgs> getRedshift() {
        return this.redshift == null ? Codegen.empty() : this.redshift;
    }

    /**
     * Parameters for connecting to S3.
     * 
     */
    @Import(name="s3")
      private final @Nullable Output<DataSourceParametersS3GetArgs> s3;

    public Output<DataSourceParametersS3GetArgs> getS3() {
        return this.s3 == null ? Codegen.empty() : this.s3;
    }

    /**
     * Parameters for connecting to ServiceNow.
     * 
     */
    @Import(name="serviceNow")
      private final @Nullable Output<DataSourceParametersServiceNowGetArgs> serviceNow;

    public Output<DataSourceParametersServiceNowGetArgs> getServiceNow() {
        return this.serviceNow == null ? Codegen.empty() : this.serviceNow;
    }

    /**
     * Parameters for connecting to Snowflake.
     * 
     */
    @Import(name="snowflake")
      private final @Nullable Output<DataSourceParametersSnowflakeGetArgs> snowflake;

    public Output<DataSourceParametersSnowflakeGetArgs> getSnowflake() {
        return this.snowflake == null ? Codegen.empty() : this.snowflake;
    }

    /**
     * Parameters for connecting to Spark.
     * 
     */
    @Import(name="spark")
      private final @Nullable Output<DataSourceParametersSparkGetArgs> spark;

    public Output<DataSourceParametersSparkGetArgs> getSpark() {
        return this.spark == null ? Codegen.empty() : this.spark;
    }

    /**
     * Parameters for connecting to SQL Server.
     * 
     */
    @Import(name="sqlServer")
      private final @Nullable Output<DataSourceParametersSqlServerGetArgs> sqlServer;

    public Output<DataSourceParametersSqlServerGetArgs> getSqlServer() {
        return this.sqlServer == null ? Codegen.empty() : this.sqlServer;
    }

    /**
     * Parameters for connecting to Teradata.
     * 
     */
    @Import(name="teradata")
      private final @Nullable Output<DataSourceParametersTeradataGetArgs> teradata;

    public Output<DataSourceParametersTeradataGetArgs> getTeradata() {
        return this.teradata == null ? Codegen.empty() : this.teradata;
    }

    /**
     * Parameters for connecting to Twitter.
     * 
     */
    @Import(name="twitter")
      private final @Nullable Output<DataSourceParametersTwitterGetArgs> twitter;

    public Output<DataSourceParametersTwitterGetArgs> getTwitter() {
        return this.twitter == null ? Codegen.empty() : this.twitter;
    }

    public DataSourceParametersGetArgs(
        @Nullable Output<DataSourceParametersAmazonElasticsearchGetArgs> amazonElasticsearch,
        @Nullable Output<DataSourceParametersAthenaGetArgs> athena,
        @Nullable Output<DataSourceParametersAuroraGetArgs> aurora,
        @Nullable Output<DataSourceParametersAuroraPostgresqlGetArgs> auroraPostgresql,
        @Nullable Output<DataSourceParametersAwsIotAnalyticsGetArgs> awsIotAnalytics,
        @Nullable Output<DataSourceParametersJiraGetArgs> jira,
        @Nullable Output<DataSourceParametersMariaDbGetArgs> mariaDb,
        @Nullable Output<DataSourceParametersMysqlGetArgs> mysql,
        @Nullable Output<DataSourceParametersOracleGetArgs> oracle,
        @Nullable Output<DataSourceParametersPostgresqlGetArgs> postgresql,
        @Nullable Output<DataSourceParametersPrestoGetArgs> presto,
        @Nullable Output<DataSourceParametersRdsGetArgs> rds,
        @Nullable Output<DataSourceParametersRedshiftGetArgs> redshift,
        @Nullable Output<DataSourceParametersS3GetArgs> s3,
        @Nullable Output<DataSourceParametersServiceNowGetArgs> serviceNow,
        @Nullable Output<DataSourceParametersSnowflakeGetArgs> snowflake,
        @Nullable Output<DataSourceParametersSparkGetArgs> spark,
        @Nullable Output<DataSourceParametersSqlServerGetArgs> sqlServer,
        @Nullable Output<DataSourceParametersTeradataGetArgs> teradata,
        @Nullable Output<DataSourceParametersTwitterGetArgs> twitter) {
        this.amazonElasticsearch = amazonElasticsearch;
        this.athena = athena;
        this.aurora = aurora;
        this.auroraPostgresql = auroraPostgresql;
        this.awsIotAnalytics = awsIotAnalytics;
        this.jira = jira;
        this.mariaDb = mariaDb;
        this.mysql = mysql;
        this.oracle = oracle;
        this.postgresql = postgresql;
        this.presto = presto;
        this.rds = rds;
        this.redshift = redshift;
        this.s3 = s3;
        this.serviceNow = serviceNow;
        this.snowflake = snowflake;
        this.spark = spark;
        this.sqlServer = sqlServer;
        this.teradata = teradata;
        this.twitter = twitter;
    }

    private DataSourceParametersGetArgs() {
        this.amazonElasticsearch = Codegen.empty();
        this.athena = Codegen.empty();
        this.aurora = Codegen.empty();
        this.auroraPostgresql = Codegen.empty();
        this.awsIotAnalytics = Codegen.empty();
        this.jira = Codegen.empty();
        this.mariaDb = Codegen.empty();
        this.mysql = Codegen.empty();
        this.oracle = Codegen.empty();
        this.postgresql = Codegen.empty();
        this.presto = Codegen.empty();
        this.rds = Codegen.empty();
        this.redshift = Codegen.empty();
        this.s3 = Codegen.empty();
        this.serviceNow = Codegen.empty();
        this.snowflake = Codegen.empty();
        this.spark = Codegen.empty();
        this.sqlServer = Codegen.empty();
        this.teradata = Codegen.empty();
        this.twitter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceParametersAmazonElasticsearchGetArgs> amazonElasticsearch;
        private @Nullable Output<DataSourceParametersAthenaGetArgs> athena;
        private @Nullable Output<DataSourceParametersAuroraGetArgs> aurora;
        private @Nullable Output<DataSourceParametersAuroraPostgresqlGetArgs> auroraPostgresql;
        private @Nullable Output<DataSourceParametersAwsIotAnalyticsGetArgs> awsIotAnalytics;
        private @Nullable Output<DataSourceParametersJiraGetArgs> jira;
        private @Nullable Output<DataSourceParametersMariaDbGetArgs> mariaDb;
        private @Nullable Output<DataSourceParametersMysqlGetArgs> mysql;
        private @Nullable Output<DataSourceParametersOracleGetArgs> oracle;
        private @Nullable Output<DataSourceParametersPostgresqlGetArgs> postgresql;
        private @Nullable Output<DataSourceParametersPrestoGetArgs> presto;
        private @Nullable Output<DataSourceParametersRdsGetArgs> rds;
        private @Nullable Output<DataSourceParametersRedshiftGetArgs> redshift;
        private @Nullable Output<DataSourceParametersS3GetArgs> s3;
        private @Nullable Output<DataSourceParametersServiceNowGetArgs> serviceNow;
        private @Nullable Output<DataSourceParametersSnowflakeGetArgs> snowflake;
        private @Nullable Output<DataSourceParametersSparkGetArgs> spark;
        private @Nullable Output<DataSourceParametersSqlServerGetArgs> sqlServer;
        private @Nullable Output<DataSourceParametersTeradataGetArgs> teradata;
        private @Nullable Output<DataSourceParametersTwitterGetArgs> twitter;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonElasticsearch = defaults.amazonElasticsearch;
    	      this.athena = defaults.athena;
    	      this.aurora = defaults.aurora;
    	      this.auroraPostgresql = defaults.auroraPostgresql;
    	      this.awsIotAnalytics = defaults.awsIotAnalytics;
    	      this.jira = defaults.jira;
    	      this.mariaDb = defaults.mariaDb;
    	      this.mysql = defaults.mysql;
    	      this.oracle = defaults.oracle;
    	      this.postgresql = defaults.postgresql;
    	      this.presto = defaults.presto;
    	      this.rds = defaults.rds;
    	      this.redshift = defaults.redshift;
    	      this.s3 = defaults.s3;
    	      this.serviceNow = defaults.serviceNow;
    	      this.snowflake = defaults.snowflake;
    	      this.spark = defaults.spark;
    	      this.sqlServer = defaults.sqlServer;
    	      this.teradata = defaults.teradata;
    	      this.twitter = defaults.twitter;
        }

        public Builder amazonElasticsearch(@Nullable Output<DataSourceParametersAmazonElasticsearchGetArgs> amazonElasticsearch) {
            this.amazonElasticsearch = amazonElasticsearch;
            return this;
        }
        public Builder amazonElasticsearch(@Nullable DataSourceParametersAmazonElasticsearchGetArgs amazonElasticsearch) {
            this.amazonElasticsearch = Codegen.ofNullable(amazonElasticsearch);
            return this;
        }
        public Builder athena(@Nullable Output<DataSourceParametersAthenaGetArgs> athena) {
            this.athena = athena;
            return this;
        }
        public Builder athena(@Nullable DataSourceParametersAthenaGetArgs athena) {
            this.athena = Codegen.ofNullable(athena);
            return this;
        }
        public Builder aurora(@Nullable Output<DataSourceParametersAuroraGetArgs> aurora) {
            this.aurora = aurora;
            return this;
        }
        public Builder aurora(@Nullable DataSourceParametersAuroraGetArgs aurora) {
            this.aurora = Codegen.ofNullable(aurora);
            return this;
        }
        public Builder auroraPostgresql(@Nullable Output<DataSourceParametersAuroraPostgresqlGetArgs> auroraPostgresql) {
            this.auroraPostgresql = auroraPostgresql;
            return this;
        }
        public Builder auroraPostgresql(@Nullable DataSourceParametersAuroraPostgresqlGetArgs auroraPostgresql) {
            this.auroraPostgresql = Codegen.ofNullable(auroraPostgresql);
            return this;
        }
        public Builder awsIotAnalytics(@Nullable Output<DataSourceParametersAwsIotAnalyticsGetArgs> awsIotAnalytics) {
            this.awsIotAnalytics = awsIotAnalytics;
            return this;
        }
        public Builder awsIotAnalytics(@Nullable DataSourceParametersAwsIotAnalyticsGetArgs awsIotAnalytics) {
            this.awsIotAnalytics = Codegen.ofNullable(awsIotAnalytics);
            return this;
        }
        public Builder jira(@Nullable Output<DataSourceParametersJiraGetArgs> jira) {
            this.jira = jira;
            return this;
        }
        public Builder jira(@Nullable DataSourceParametersJiraGetArgs jira) {
            this.jira = Codegen.ofNullable(jira);
            return this;
        }
        public Builder mariaDb(@Nullable Output<DataSourceParametersMariaDbGetArgs> mariaDb) {
            this.mariaDb = mariaDb;
            return this;
        }
        public Builder mariaDb(@Nullable DataSourceParametersMariaDbGetArgs mariaDb) {
            this.mariaDb = Codegen.ofNullable(mariaDb);
            return this;
        }
        public Builder mysql(@Nullable Output<DataSourceParametersMysqlGetArgs> mysql) {
            this.mysql = mysql;
            return this;
        }
        public Builder mysql(@Nullable DataSourceParametersMysqlGetArgs mysql) {
            this.mysql = Codegen.ofNullable(mysql);
            return this;
        }
        public Builder oracle(@Nullable Output<DataSourceParametersOracleGetArgs> oracle) {
            this.oracle = oracle;
            return this;
        }
        public Builder oracle(@Nullable DataSourceParametersOracleGetArgs oracle) {
            this.oracle = Codegen.ofNullable(oracle);
            return this;
        }
        public Builder postgresql(@Nullable Output<DataSourceParametersPostgresqlGetArgs> postgresql) {
            this.postgresql = postgresql;
            return this;
        }
        public Builder postgresql(@Nullable DataSourceParametersPostgresqlGetArgs postgresql) {
            this.postgresql = Codegen.ofNullable(postgresql);
            return this;
        }
        public Builder presto(@Nullable Output<DataSourceParametersPrestoGetArgs> presto) {
            this.presto = presto;
            return this;
        }
        public Builder presto(@Nullable DataSourceParametersPrestoGetArgs presto) {
            this.presto = Codegen.ofNullable(presto);
            return this;
        }
        public Builder rds(@Nullable Output<DataSourceParametersRdsGetArgs> rds) {
            this.rds = rds;
            return this;
        }
        public Builder rds(@Nullable DataSourceParametersRdsGetArgs rds) {
            this.rds = Codegen.ofNullable(rds);
            return this;
        }
        public Builder redshift(@Nullable Output<DataSourceParametersRedshiftGetArgs> redshift) {
            this.redshift = redshift;
            return this;
        }
        public Builder redshift(@Nullable DataSourceParametersRedshiftGetArgs redshift) {
            this.redshift = Codegen.ofNullable(redshift);
            return this;
        }
        public Builder s3(@Nullable Output<DataSourceParametersS3GetArgs> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable DataSourceParametersS3GetArgs s3) {
            this.s3 = Codegen.ofNullable(s3);
            return this;
        }
        public Builder serviceNow(@Nullable Output<DataSourceParametersServiceNowGetArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }
        public Builder serviceNow(@Nullable DataSourceParametersServiceNowGetArgs serviceNow) {
            this.serviceNow = Codegen.ofNullable(serviceNow);
            return this;
        }
        public Builder snowflake(@Nullable Output<DataSourceParametersSnowflakeGetArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }
        public Builder snowflake(@Nullable DataSourceParametersSnowflakeGetArgs snowflake) {
            this.snowflake = Codegen.ofNullable(snowflake);
            return this;
        }
        public Builder spark(@Nullable Output<DataSourceParametersSparkGetArgs> spark) {
            this.spark = spark;
            return this;
        }
        public Builder spark(@Nullable DataSourceParametersSparkGetArgs spark) {
            this.spark = Codegen.ofNullable(spark);
            return this;
        }
        public Builder sqlServer(@Nullable Output<DataSourceParametersSqlServerGetArgs> sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public Builder sqlServer(@Nullable DataSourceParametersSqlServerGetArgs sqlServer) {
            this.sqlServer = Codegen.ofNullable(sqlServer);
            return this;
        }
        public Builder teradata(@Nullable Output<DataSourceParametersTeradataGetArgs> teradata) {
            this.teradata = teradata;
            return this;
        }
        public Builder teradata(@Nullable DataSourceParametersTeradataGetArgs teradata) {
            this.teradata = Codegen.ofNullable(teradata);
            return this;
        }
        public Builder twitter(@Nullable Output<DataSourceParametersTwitterGetArgs> twitter) {
            this.twitter = twitter;
            return this;
        }
        public Builder twitter(@Nullable DataSourceParametersTwitterGetArgs twitter) {
            this.twitter = Codegen.ofNullable(twitter);
            return this;
        }        public DataSourceParametersGetArgs build() {
            return new DataSourceParametersGetArgs(amazonElasticsearch, athena, aurora, auroraPostgresql, awsIotAnalytics, jira, mariaDb, mysql, oracle, postgresql, presto, rds, redshift, s3, serviceNow, snowflake, spark, sqlServer, teradata, twitter);
        }
    }
}
