// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.JobPigConfigLoggingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPigConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPigConfigArgs Empty = new JobPigConfigArgs();

    /**
     * Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    @Import(name="continueOnFailure")
      private final @Nullable Output<Boolean> continueOnFailure;

    public Output<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Output.empty() : this.continueOnFailure;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Output.empty() : this.jarFileUris;
    }

    @Import(name="loggingConfig")
      private final @Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig;

    public Output<JobPigConfigLoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    @Import(name="queryFileUri")
      private final @Nullable Output<String> queryFileUri;

    public Output<String> getQueryFileUri() {
        return this.queryFileUri == null ? Output.empty() : this.queryFileUri;
    }

    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    @Import(name="queryLists")
      private final @Nullable Output<List<String>> queryLists;

    public Output<List<String>> getQueryLists() {
        return this.queryLists == null ? Output.empty() : this.queryLists;
    }

    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
     */
    @Import(name="scriptVariables")
      private final @Nullable Output<Map<String,String>> scriptVariables;

    public Output<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Output.empty() : this.scriptVariables;
    }

    public JobPigConfigArgs(
        @Nullable Output<Boolean> continueOnFailure,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<List<String>> queryLists,
        @Nullable Output<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryLists = queryLists;
        this.scriptVariables = scriptVariables;
    }

    private JobPigConfigArgs() {
        this.continueOnFailure = Output.empty();
        this.jarFileUris = Output.empty();
        this.loggingConfig = Output.empty();
        this.properties = Output.empty();
        this.queryFileUri = Output.empty();
        this.queryLists = Output.empty();
        this.scriptVariables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPigConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> continueOnFailure;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<List<String>> queryLists;
        private @Nullable Output<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPigConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Output.ofNullable(continueOnFailure);
            return this;
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
        public Builder loggingConfig(@Nullable Output<JobPigConfigLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable JobPigConfigLoggingConfigArgs loggingConfig) {
            this.loggingConfig = Output.ofNullable(loggingConfig);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }
        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Output.ofNullable(queryFileUri);
            return this;
        }
        public Builder queryLists(@Nullable Output<List<String>> queryLists) {
            this.queryLists = queryLists;
            return this;
        }
        public Builder queryLists(@Nullable List<String> queryLists) {
            this.queryLists = Output.ofNullable(queryLists);
            return this;
        }
        public Builder queryLists(String... queryLists) {
            return queryLists(List.of(queryLists));
        }
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }
        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Output.ofNullable(scriptVariables);
            return this;
        }        public JobPigConfigArgs build() {
            return new JobPigConfigArgs(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryLists, scriptVariables);
        }
    }
}
