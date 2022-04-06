// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.aws.quicksight.inputs.DataSourceParametersAmazonElasticsearchArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAthenaArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAuroraPostgresqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersAwsIotAnalyticsArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersJiraArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMariaDbArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersMysqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersOracleArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPostgresqlArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersPrestoArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRdsArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersRedshiftArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersS3Args;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersServiceNowArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSnowflakeArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSparkArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersSqlServerArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTeradataArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersTwitterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersArgs Empty = new DataSourceParametersArgs();

    /**
     * Parameters for connecting to Amazon Elasticsearch.
     * 
     */
    @Import(name="amazonElasticsearch")
      private final @Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch;

    public Output<DataSourceParametersAmazonElasticsearchArgs> getAmazonElasticsearch() {
        return this.amazonElasticsearch == null ? Output.empty() : this.amazonElasticsearch;
    }

    /**
     * Parameters for connecting to Athena.
     * 
     */
    @Import(name="athena")
      private final @Nullable Output<DataSourceParametersAthenaArgs> athena;

    public Output<DataSourceParametersAthenaArgs> getAthena() {
        return this.athena == null ? Output.empty() : this.athena;
    }

    /**
     * Parameters for connecting to Aurora MySQL.
     * 
     */
    @Import(name="aurora")
      private final @Nullable Output<DataSourceParametersAuroraArgs> aurora;

    public Output<DataSourceParametersAuroraArgs> getAurora() {
        return this.aurora == null ? Output.empty() : this.aurora;
    }

    /**
     * Parameters for connecting to Aurora Postgresql.
     * 
     */
    @Import(name="auroraPostgresql")
      private final @Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql;

    public Output<DataSourceParametersAuroraPostgresqlArgs> getAuroraPostgresql() {
        return this.auroraPostgresql == null ? Output.empty() : this.auroraPostgresql;
    }

    /**
     * Parameters for connecting to AWS IOT Analytics.
     * 
     */
    @Import(name="awsIotAnalytics")
      private final @Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics;

    public Output<DataSourceParametersAwsIotAnalyticsArgs> getAwsIotAnalytics() {
        return this.awsIotAnalytics == null ? Output.empty() : this.awsIotAnalytics;
    }

    /**
     * Parameters for connecting to Jira.
     * 
     */
    @Import(name="jira")
      private final @Nullable Output<DataSourceParametersJiraArgs> jira;

    public Output<DataSourceParametersJiraArgs> getJira() {
        return this.jira == null ? Output.empty() : this.jira;
    }

    /**
     * Parameters for connecting to MariaDB.
     * 
     */
    @Import(name="mariaDb")
      private final @Nullable Output<DataSourceParametersMariaDbArgs> mariaDb;

    public Output<DataSourceParametersMariaDbArgs> getMariaDb() {
        return this.mariaDb == null ? Output.empty() : this.mariaDb;
    }

    /**
     * Parameters for connecting to MySQL.
     * 
     */
    @Import(name="mysql")
      private final @Nullable Output<DataSourceParametersMysqlArgs> mysql;

    public Output<DataSourceParametersMysqlArgs> getMysql() {
        return this.mysql == null ? Output.empty() : this.mysql;
    }

    /**
     * Parameters for connecting to Oracle.
     * 
     */
    @Import(name="oracle")
      private final @Nullable Output<DataSourceParametersOracleArgs> oracle;

    public Output<DataSourceParametersOracleArgs> getOracle() {
        return this.oracle == null ? Output.empty() : this.oracle;
    }

    /**
     * Parameters for connecting to Postgresql.
     * 
     */
    @Import(name="postgresql")
      private final @Nullable Output<DataSourceParametersPostgresqlArgs> postgresql;

    public Output<DataSourceParametersPostgresqlArgs> getPostgresql() {
        return this.postgresql == null ? Output.empty() : this.postgresql;
    }

    /**
     * Parameters for connecting to Presto.
     * 
     */
    @Import(name="presto")
      private final @Nullable Output<DataSourceParametersPrestoArgs> presto;

    public Output<DataSourceParametersPrestoArgs> getPresto() {
        return this.presto == null ? Output.empty() : this.presto;
    }

    /**
     * Parameters for connecting to RDS.
     * 
     */
    @Import(name="rds")
      private final @Nullable Output<DataSourceParametersRdsArgs> rds;

    public Output<DataSourceParametersRdsArgs> getRds() {
        return this.rds == null ? Output.empty() : this.rds;
    }

    /**
     * Parameters for connecting to Redshift.
     * 
     */
    @Import(name="redshift")
      private final @Nullable Output<DataSourceParametersRedshiftArgs> redshift;

    public Output<DataSourceParametersRedshiftArgs> getRedshift() {
        return this.redshift == null ? Output.empty() : this.redshift;
    }

    /**
     * Parameters for connecting to S3.
     * 
     */
    @Import(name="s3")
      private final @Nullable Output<DataSourceParametersS3Args> s3;

    public Output<DataSourceParametersS3Args> getS3() {
        return this.s3 == null ? Output.empty() : this.s3;
    }

    /**
     * Parameters for connecting to ServiceNow.
     * 
     */
    @Import(name="serviceNow")
      private final @Nullable Output<DataSourceParametersServiceNowArgs> serviceNow;

    public Output<DataSourceParametersServiceNowArgs> getServiceNow() {
        return this.serviceNow == null ? Output.empty() : this.serviceNow;
    }

    /**
     * Parameters for connecting to Snowflake.
     * 
     */
    @Import(name="snowflake")
      private final @Nullable Output<DataSourceParametersSnowflakeArgs> snowflake;

    public Output<DataSourceParametersSnowflakeArgs> getSnowflake() {
        return this.snowflake == null ? Output.empty() : this.snowflake;
    }

    /**
     * Parameters for connecting to Spark.
     * 
     */
    @Import(name="spark")
      private final @Nullable Output<DataSourceParametersSparkArgs> spark;

    public Output<DataSourceParametersSparkArgs> getSpark() {
        return this.spark == null ? Output.empty() : this.spark;
    }

    /**
     * Parameters for connecting to SQL Server.
     * 
     */
    @Import(name="sqlServer")
      private final @Nullable Output<DataSourceParametersSqlServerArgs> sqlServer;

    public Output<DataSourceParametersSqlServerArgs> getSqlServer() {
        return this.sqlServer == null ? Output.empty() : this.sqlServer;
    }

    /**
     * Parameters for connecting to Teradata.
     * 
     */
    @Import(name="teradata")
      private final @Nullable Output<DataSourceParametersTeradataArgs> teradata;

    public Output<DataSourceParametersTeradataArgs> getTeradata() {
        return this.teradata == null ? Output.empty() : this.teradata;
    }

    /**
     * Parameters for connecting to Twitter.
     * 
     */
    @Import(name="twitter")
      private final @Nullable Output<DataSourceParametersTwitterArgs> twitter;

    public Output<DataSourceParametersTwitterArgs> getTwitter() {
        return this.twitter == null ? Output.empty() : this.twitter;
    }

    public DataSourceParametersArgs(
        @Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch,
        @Nullable Output<DataSourceParametersAthenaArgs> athena,
        @Nullable Output<DataSourceParametersAuroraArgs> aurora,
        @Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql,
        @Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics,
        @Nullable Output<DataSourceParametersJiraArgs> jira,
        @Nullable Output<DataSourceParametersMariaDbArgs> mariaDb,
        @Nullable Output<DataSourceParametersMysqlArgs> mysql,
        @Nullable Output<DataSourceParametersOracleArgs> oracle,
        @Nullable Output<DataSourceParametersPostgresqlArgs> postgresql,
        @Nullable Output<DataSourceParametersPrestoArgs> presto,
        @Nullable Output<DataSourceParametersRdsArgs> rds,
        @Nullable Output<DataSourceParametersRedshiftArgs> redshift,
        @Nullable Output<DataSourceParametersS3Args> s3,
        @Nullable Output<DataSourceParametersServiceNowArgs> serviceNow,
        @Nullable Output<DataSourceParametersSnowflakeArgs> snowflake,
        @Nullable Output<DataSourceParametersSparkArgs> spark,
        @Nullable Output<DataSourceParametersSqlServerArgs> sqlServer,
        @Nullable Output<DataSourceParametersTeradataArgs> teradata,
        @Nullable Output<DataSourceParametersTwitterArgs> twitter) {
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

    private DataSourceParametersArgs() {
        this.amazonElasticsearch = Output.empty();
        this.athena = Output.empty();
        this.aurora = Output.empty();
        this.auroraPostgresql = Output.empty();
        this.awsIotAnalytics = Output.empty();
        this.jira = Output.empty();
        this.mariaDb = Output.empty();
        this.mysql = Output.empty();
        this.oracle = Output.empty();
        this.postgresql = Output.empty();
        this.presto = Output.empty();
        this.rds = Output.empty();
        this.redshift = Output.empty();
        this.s3 = Output.empty();
        this.serviceNow = Output.empty();
        this.snowflake = Output.empty();
        this.spark = Output.empty();
        this.sqlServer = Output.empty();
        this.teradata = Output.empty();
        this.twitter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch;
        private @Nullable Output<DataSourceParametersAthenaArgs> athena;
        private @Nullable Output<DataSourceParametersAuroraArgs> aurora;
        private @Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql;
        private @Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics;
        private @Nullable Output<DataSourceParametersJiraArgs> jira;
        private @Nullable Output<DataSourceParametersMariaDbArgs> mariaDb;
        private @Nullable Output<DataSourceParametersMysqlArgs> mysql;
        private @Nullable Output<DataSourceParametersOracleArgs> oracle;
        private @Nullable Output<DataSourceParametersPostgresqlArgs> postgresql;
        private @Nullable Output<DataSourceParametersPrestoArgs> presto;
        private @Nullable Output<DataSourceParametersRdsArgs> rds;
        private @Nullable Output<DataSourceParametersRedshiftArgs> redshift;
        private @Nullable Output<DataSourceParametersS3Args> s3;
        private @Nullable Output<DataSourceParametersServiceNowArgs> serviceNow;
        private @Nullable Output<DataSourceParametersSnowflakeArgs> snowflake;
        private @Nullable Output<DataSourceParametersSparkArgs> spark;
        private @Nullable Output<DataSourceParametersSqlServerArgs> sqlServer;
        private @Nullable Output<DataSourceParametersTeradataArgs> teradata;
        private @Nullable Output<DataSourceParametersTwitterArgs> twitter;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersArgs defaults) {
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

        public Builder amazonElasticsearch(@Nullable Output<DataSourceParametersAmazonElasticsearchArgs> amazonElasticsearch) {
            this.amazonElasticsearch = amazonElasticsearch;
            return this;
        }
        public Builder amazonElasticsearch(@Nullable DataSourceParametersAmazonElasticsearchArgs amazonElasticsearch) {
            this.amazonElasticsearch = Output.ofNullable(amazonElasticsearch);
            return this;
        }
        public Builder athena(@Nullable Output<DataSourceParametersAthenaArgs> athena) {
            this.athena = athena;
            return this;
        }
        public Builder athena(@Nullable DataSourceParametersAthenaArgs athena) {
            this.athena = Output.ofNullable(athena);
            return this;
        }
        public Builder aurora(@Nullable Output<DataSourceParametersAuroraArgs> aurora) {
            this.aurora = aurora;
            return this;
        }
        public Builder aurora(@Nullable DataSourceParametersAuroraArgs aurora) {
            this.aurora = Output.ofNullable(aurora);
            return this;
        }
        public Builder auroraPostgresql(@Nullable Output<DataSourceParametersAuroraPostgresqlArgs> auroraPostgresql) {
            this.auroraPostgresql = auroraPostgresql;
            return this;
        }
        public Builder auroraPostgresql(@Nullable DataSourceParametersAuroraPostgresqlArgs auroraPostgresql) {
            this.auroraPostgresql = Output.ofNullable(auroraPostgresql);
            return this;
        }
        public Builder awsIotAnalytics(@Nullable Output<DataSourceParametersAwsIotAnalyticsArgs> awsIotAnalytics) {
            this.awsIotAnalytics = awsIotAnalytics;
            return this;
        }
        public Builder awsIotAnalytics(@Nullable DataSourceParametersAwsIotAnalyticsArgs awsIotAnalytics) {
            this.awsIotAnalytics = Output.ofNullable(awsIotAnalytics);
            return this;
        }
        public Builder jira(@Nullable Output<DataSourceParametersJiraArgs> jira) {
            this.jira = jira;
            return this;
        }
        public Builder jira(@Nullable DataSourceParametersJiraArgs jira) {
            this.jira = Output.ofNullable(jira);
            return this;
        }
        public Builder mariaDb(@Nullable Output<DataSourceParametersMariaDbArgs> mariaDb) {
            this.mariaDb = mariaDb;
            return this;
        }
        public Builder mariaDb(@Nullable DataSourceParametersMariaDbArgs mariaDb) {
            this.mariaDb = Output.ofNullable(mariaDb);
            return this;
        }
        public Builder mysql(@Nullable Output<DataSourceParametersMysqlArgs> mysql) {
            this.mysql = mysql;
            return this;
        }
        public Builder mysql(@Nullable DataSourceParametersMysqlArgs mysql) {
            this.mysql = Output.ofNullable(mysql);
            return this;
        }
        public Builder oracle(@Nullable Output<DataSourceParametersOracleArgs> oracle) {
            this.oracle = oracle;
            return this;
        }
        public Builder oracle(@Nullable DataSourceParametersOracleArgs oracle) {
            this.oracle = Output.ofNullable(oracle);
            return this;
        }
        public Builder postgresql(@Nullable Output<DataSourceParametersPostgresqlArgs> postgresql) {
            this.postgresql = postgresql;
            return this;
        }
        public Builder postgresql(@Nullable DataSourceParametersPostgresqlArgs postgresql) {
            this.postgresql = Output.ofNullable(postgresql);
            return this;
        }
        public Builder presto(@Nullable Output<DataSourceParametersPrestoArgs> presto) {
            this.presto = presto;
            return this;
        }
        public Builder presto(@Nullable DataSourceParametersPrestoArgs presto) {
            this.presto = Output.ofNullable(presto);
            return this;
        }
        public Builder rds(@Nullable Output<DataSourceParametersRdsArgs> rds) {
            this.rds = rds;
            return this;
        }
        public Builder rds(@Nullable DataSourceParametersRdsArgs rds) {
            this.rds = Output.ofNullable(rds);
            return this;
        }
        public Builder redshift(@Nullable Output<DataSourceParametersRedshiftArgs> redshift) {
            this.redshift = redshift;
            return this;
        }
        public Builder redshift(@Nullable DataSourceParametersRedshiftArgs redshift) {
            this.redshift = Output.ofNullable(redshift);
            return this;
        }
        public Builder s3(@Nullable Output<DataSourceParametersS3Args> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable DataSourceParametersS3Args s3) {
            this.s3 = Output.ofNullable(s3);
            return this;
        }
        public Builder serviceNow(@Nullable Output<DataSourceParametersServiceNowArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }
        public Builder serviceNow(@Nullable DataSourceParametersServiceNowArgs serviceNow) {
            this.serviceNow = Output.ofNullable(serviceNow);
            return this;
        }
        public Builder snowflake(@Nullable Output<DataSourceParametersSnowflakeArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }
        public Builder snowflake(@Nullable DataSourceParametersSnowflakeArgs snowflake) {
            this.snowflake = Output.ofNullable(snowflake);
            return this;
        }
        public Builder spark(@Nullable Output<DataSourceParametersSparkArgs> spark) {
            this.spark = spark;
            return this;
        }
        public Builder spark(@Nullable DataSourceParametersSparkArgs spark) {
            this.spark = Output.ofNullable(spark);
            return this;
        }
        public Builder sqlServer(@Nullable Output<DataSourceParametersSqlServerArgs> sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public Builder sqlServer(@Nullable DataSourceParametersSqlServerArgs sqlServer) {
            this.sqlServer = Output.ofNullable(sqlServer);
            return this;
        }
        public Builder teradata(@Nullable Output<DataSourceParametersTeradataArgs> teradata) {
            this.teradata = teradata;
            return this;
        }
        public Builder teradata(@Nullable DataSourceParametersTeradataArgs teradata) {
            this.teradata = Output.ofNullable(teradata);
            return this;
        }
        public Builder twitter(@Nullable Output<DataSourceParametersTwitterArgs> twitter) {
            this.twitter = twitter;
            return this;
        }
        public Builder twitter(@Nullable DataSourceParametersTwitterArgs twitter) {
            this.twitter = Output.ofNullable(twitter);
            return this;
        }        public DataSourceParametersArgs build() {
            return new DataSourceParametersArgs(amazonElasticsearch, athena, aurora, auroraPostgresql, awsIotAnalytics, jira, mariaDb, mysql, oracle, postgresql, presto, rds, redshift, s3, serviceNow, snowflake, spark, sqlServer, teradata, twitter);
        }
    }
}