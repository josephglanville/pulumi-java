// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.JobPigConfigLoggingConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPigConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPigConfigGetArgs Empty = new JobPigConfigGetArgs();

    /**
     * Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    @InputImport(name="continueOnFailure")
      private final @Nullable Input<Boolean> continueOnFailure;

    public Input<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Input.empty() : this.continueOnFailure;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @InputImport(name="jarFileUris")
      private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    @InputImport(name="loggingConfig")
      private final @Nullable Input<JobPigConfigLoggingConfigGetArgs> loggingConfig;

    public Input<JobPigConfigLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * Conflicts with `query_list`
     * 
     */
    @InputImport(name="queryFileUri")
      private final @Nullable Input<String> queryFileUri;

    public Input<String> getQueryFileUri() {
        return this.queryFileUri == null ? Input.empty() : this.queryFileUri;
    }

    /**
     * The list of SQL queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    @InputImport(name="queryLists")
      private final @Nullable Input<List<String>> queryLists;

    public Input<List<String>> getQueryLists() {
        return this.queryLists == null ? Input.empty() : this.queryLists;
    }

    /**
     * Mapping of query variable names to values (equivalent to the Spark SQL command: `SET name="value";`).
     * 
     */
    @InputImport(name="scriptVariables")
      private final @Nullable Input<Map<String,String>> scriptVariables;

    public Input<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Input.empty() : this.scriptVariables;
    }

    public JobPigConfigGetArgs(
        @Nullable Input<Boolean> continueOnFailure,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<JobPigConfigLoggingConfigGetArgs> loggingConfig,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> queryFileUri,
        @Nullable Input<List<String>> queryLists,
        @Nullable Input<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryLists = queryLists;
        this.scriptVariables = scriptVariables;
    }

    private JobPigConfigGetArgs() {
        this.continueOnFailure = Input.empty();
        this.jarFileUris = Input.empty();
        this.loggingConfig = Input.empty();
        this.properties = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryLists = Input.empty();
        this.scriptVariables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPigConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> continueOnFailure;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<JobPigConfigLoggingConfigGetArgs> loggingConfig;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> queryFileUri;
        private @Nullable Input<List<String>> queryLists;
        private @Nullable Input<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPigConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setContinueOnFailure(@Nullable Input<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Input.ofNullable(continueOnFailure);
            return this;
        }

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<JobPigConfigLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable JobPigConfigLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setQueryFileUri(@Nullable Input<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Input.ofNullable(queryFileUri);
            return this;
        }

        public Builder setQueryLists(@Nullable Input<List<String>> queryLists) {
            this.queryLists = queryLists;
            return this;
        }

        public Builder setQueryLists(@Nullable List<String> queryLists) {
            this.queryLists = Input.ofNullable(queryLists);
            return this;
        }

        public Builder setScriptVariables(@Nullable Input<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }

        public Builder setScriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Input.ofNullable(scriptVariables);
            return this;
        }
        public JobPigConfigGetArgs build() {
            return new JobPigConfigGetArgs(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryLists, scriptVariables);
        }
    }
}
