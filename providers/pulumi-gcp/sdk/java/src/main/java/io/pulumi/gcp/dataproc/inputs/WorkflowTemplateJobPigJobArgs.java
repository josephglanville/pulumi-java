// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobLoggingConfigArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobQueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPigJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPigJobArgs Empty = new WorkflowTemplateJobPigJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
      private final @Nullable Output<Boolean> continueOnFailure;

    public Output<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Output.empty() : this.continueOnFailure;
    }

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
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<WorkflowTemplateJobPigJobLoggingConfigArgs> loggingConfig;

    public Output<WorkflowTemplateJobPigJobLoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri")
      private final @Nullable Output<String> queryFileUri;

    public Output<String> getQueryFileUri() {
        return this.queryFileUri == null ? Output.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
      private final @Nullable Output<WorkflowTemplateJobPigJobQueryListArgs> queryList;

    public Output<WorkflowTemplateJobPigJobQueryListArgs> getQueryList() {
        return this.queryList == null ? Output.empty() : this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name="value";`).
     * 
     */
    @Import(name="scriptVariables")
      private final @Nullable Output<Map<String,String>> scriptVariables;

    public Output<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Output.empty() : this.scriptVariables;
    }

    public WorkflowTemplateJobPigJobArgs(
        @Nullable Output<Boolean> continueOnFailure,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<WorkflowTemplateJobPigJobLoggingConfigArgs> loggingConfig,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<WorkflowTemplateJobPigJobQueryListArgs> queryList,
        @Nullable Output<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private WorkflowTemplateJobPigJobArgs() {
        this.continueOnFailure = Output.empty();
        this.jarFileUris = Output.empty();
        this.loggingConfig = Output.empty();
        this.properties = Output.empty();
        this.queryFileUri = Output.empty();
        this.queryList = Output.empty();
        this.scriptVariables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPigJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> continueOnFailure;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<WorkflowTemplateJobPigJobLoggingConfigArgs> loggingConfig;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<WorkflowTemplateJobPigJobQueryListArgs> queryList;
        private @Nullable Output<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPigJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
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
        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobPigJobLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable WorkflowTemplateJobPigJobLoggingConfigArgs loggingConfig) {
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
        public Builder queryList(@Nullable Output<WorkflowTemplateJobPigJobQueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }
        public Builder queryList(@Nullable WorkflowTemplateJobPigJobQueryListArgs queryList) {
            this.queryList = Output.ofNullable(queryList);
            return this;
        }
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }
        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Output.ofNullable(scriptVariables);
            return this;
        }        public WorkflowTemplateJobPigJobArgs build() {
            return new WorkflowTemplateJobPigJobArgs(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
