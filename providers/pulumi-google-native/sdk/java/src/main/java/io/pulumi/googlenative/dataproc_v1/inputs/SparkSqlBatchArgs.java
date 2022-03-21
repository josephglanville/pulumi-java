// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for running Apache Spark SQL (https://spark.apache.org/sql/) queries as a batch workload.
 * 
 */
public final class SparkSqlBatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkSqlBatchArgs Empty = new SparkSqlBatchArgs();

    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Output.empty() : this.jarFileUris;
    }

    /**
     * The HCFS URI of the script that contains Spark SQL queries to execute.
     * 
     */
    @Import(name="queryFileUri", required=true)
      private final Output<String> queryFileUri;

    public Output<String> getQueryFileUri() {
        return this.queryFileUri;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
     * 
     */
    @Import(name="queryVariables")
      private final @Nullable Output<Map<String,String>> queryVariables;

    public Output<Map<String,String>> getQueryVariables() {
        return this.queryVariables == null ? Output.empty() : this.queryVariables;
    }

    public SparkSqlBatchArgs(
        @Nullable Output<List<String>> jarFileUris,
        Output<String> queryFileUri,
        @Nullable Output<Map<String,String>> queryVariables) {
        this.jarFileUris = jarFileUris;
        this.queryFileUri = Objects.requireNonNull(queryFileUri, "expected parameter 'queryFileUri' to be non-null");
        this.queryVariables = queryVariables;
    }

    private SparkSqlBatchArgs() {
        this.jarFileUris = Output.empty();
        this.queryFileUri = Output.empty();
        this.queryVariables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> jarFileUris;
        private Output<String> queryFileUri;
        private @Nullable Output<Map<String,String>> queryVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryVariables = defaults.queryVariables;
        }

        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Output.ofNullable(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder queryFileUri(Output<String> queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }
        public Builder queryFileUri(String queryFileUri) {
            this.queryFileUri = Output.of(Objects.requireNonNull(queryFileUri));
            return this;
        }
        public Builder queryVariables(@Nullable Output<Map<String,String>> queryVariables) {
            this.queryVariables = queryVariables;
            return this;
        }
        public Builder queryVariables(@Nullable Map<String,String> queryVariables) {
            this.queryVariables = Output.ofNullable(queryVariables);
            return this;
        }        public SparkSqlBatchArgs build() {
            return new SparkSqlBatchArgs(jarFileUris, queryFileUri, queryVariables);
        }
    }
}
