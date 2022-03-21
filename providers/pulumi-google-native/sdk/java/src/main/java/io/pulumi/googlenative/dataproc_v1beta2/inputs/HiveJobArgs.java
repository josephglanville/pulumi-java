// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Hive (https://hive.apache.org/) queries on YARN.
 * 
 */
public final class HiveJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final HiveJobArgs Empty = new HiveJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
      private final @Nullable Output<Boolean> continueOnFailure;

    public Output<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Output.empty() : this.continueOnFailure;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Output.empty() : this.jarFileUris;
    }

    /**
     * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains Hive queries.
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
      private final @Nullable Output<QueryListArgs> queryList;

    public Output<QueryListArgs> getQueryList() {
        return this.queryList == null ? Output.empty() : this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";).
     * 
     */
    @Import(name="scriptVariables")
      private final @Nullable Output<Map<String,String>> scriptVariables;

    public Output<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Output.empty() : this.scriptVariables;
    }

    public HiveJobArgs(
        @Nullable Output<Boolean> continueOnFailure,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> queryFileUri,
        @Nullable Output<QueryListArgs> queryList,
        @Nullable Output<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private HiveJobArgs() {
        this.continueOnFailure = Output.empty();
        this.jarFileUris = Output.empty();
        this.properties = Output.empty();
        this.queryFileUri = Output.empty();
        this.queryList = Output.empty();
        this.scriptVariables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> continueOnFailure;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> queryFileUri;
        private @Nullable Output<QueryListArgs> queryList;
        private @Nullable Output<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
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
        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }
        public Builder queryList(@Nullable QueryListArgs queryList) {
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
        }        public HiveJobArgs build() {
            return new HiveJobArgs(continueOnFailure, jarFileUris, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
