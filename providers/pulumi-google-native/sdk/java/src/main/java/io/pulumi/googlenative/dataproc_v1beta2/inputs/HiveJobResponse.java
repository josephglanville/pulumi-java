// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache Hive (https://hive.apache.org/) queries on YARN.
 * 
 */
public final class HiveJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final HiveJobResponse Empty = new HiveJobResponse();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure", required=true)
      private final Boolean continueOnFailure;

    public Boolean getContinueOnFailure() {
        return this.continueOnFailure;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
     * 
     */
    @Import(name="jarFileUris", required=true)
      private final List<String> jarFileUris;

    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }

    /**
     * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    /**
     * The HCFS URI of the script that contains Hive queries.
     * 
     */
    @Import(name="queryFileUri", required=true)
      private final String queryFileUri;

    public String getQueryFileUri() {
        return this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList", required=true)
      private final QueryListResponse queryList;

    public QueryListResponse getQueryList() {
        return this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";).
     * 
     */
    @Import(name="scriptVariables", required=true)
      private final Map<String,String> scriptVariables;

    public Map<String,String> getScriptVariables() {
        return this.scriptVariables;
    }

    public HiveJobResponse(
        Boolean continueOnFailure,
        List<String> jarFileUris,
        Map<String,String> properties,
        String queryFileUri,
        QueryListResponse queryList,
        Map<String,String> scriptVariables) {
        this.continueOnFailure = Objects.requireNonNull(continueOnFailure, "expected parameter 'continueOnFailure' to be non-null");
        this.jarFileUris = Objects.requireNonNull(jarFileUris, "expected parameter 'jarFileUris' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.queryFileUri = Objects.requireNonNull(queryFileUri, "expected parameter 'queryFileUri' to be non-null");
        this.queryList = Objects.requireNonNull(queryList, "expected parameter 'queryList' to be non-null");
        this.scriptVariables = Objects.requireNonNull(scriptVariables, "expected parameter 'scriptVariables' to be non-null");
    }

    private HiveJobResponse() {
        this.continueOnFailure = null;
        this.jarFileUris = List.of();
        this.properties = Map.of();
        this.queryFileUri = null;
        this.queryList = null;
        this.scriptVariables = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean continueOnFailure;
        private List<String> jarFileUris;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;
        private Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder continueOnFailure(Boolean continueOnFailure) {
            this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
            return this;
        }
        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder queryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }
        public Builder queryList(QueryListResponse queryList) {
            this.queryList = Objects.requireNonNull(queryList);
            return this;
        }
        public Builder scriptVariables(Map<String,String> scriptVariables) {
            this.scriptVariables = Objects.requireNonNull(scriptVariables);
            return this;
        }        public HiveJobResponse build() {
            return new HiveJobResponse(continueOnFailure, jarFileUris, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
