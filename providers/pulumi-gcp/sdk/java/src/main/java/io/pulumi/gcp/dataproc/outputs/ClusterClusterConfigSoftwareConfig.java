// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfigSoftwareConfig {
    /**
     * The Cloud Dataproc image version to use
     * for the cluster - this controls the sets of software versions
     * installed onto the nodes when you create clusters. If not specified, defaults to the
     * latest version. For a list of valid versions see
     * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
     * 
     */
    private final @Nullable String imageVersion;
    /**
     * The set of optional components to activate on the cluster.
     * Accepted values are:
     * * ANACONDA
     * * DRUID
     * * FLINK
     * * HBASE
     * * HIVE_WEBHCAT
     * * JUPYTER
     * * PRESTO
     * * RANGER
     * * SOLR
     * * ZEPPELIN
     * * ZOOKEEPER
     * 
     */
    private final @Nullable List<String> optionalComponents;
    /**
     * A list of override and additional properties (key/value pairs)
     * used to modify various aspects of the common configuration files used when creating
     * a cluster. For a list of valid properties please see
     * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
     * 
     */
    private final @Nullable Map<String,String> overrideProperties;
    private final @Nullable Map<String,Object> properties;

    @CustomType.Constructor
    private ClusterClusterConfigSoftwareConfig(
        @CustomType.Parameter("imageVersion") @Nullable String imageVersion,
        @CustomType.Parameter("optionalComponents") @Nullable List<String> optionalComponents,
        @CustomType.Parameter("overrideProperties") @Nullable Map<String,String> overrideProperties,
        @CustomType.Parameter("properties") @Nullable Map<String,Object> properties) {
        this.imageVersion = imageVersion;
        this.optionalComponents = optionalComponents;
        this.overrideProperties = overrideProperties;
        this.properties = properties;
    }

    /**
     * The Cloud Dataproc image version to use
     * for the cluster - this controls the sets of software versions
     * installed onto the nodes when you create clusters. If not specified, defaults to the
     * latest version. For a list of valid versions see
     * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
     * 
    */
    public Optional<String> getImageVersion() {
        return Optional.ofNullable(this.imageVersion);
    }
    /**
     * The set of optional components to activate on the cluster.
     * Accepted values are:
     * * ANACONDA
     * * DRUID
     * * FLINK
     * * HBASE
     * * HIVE_WEBHCAT
     * * JUPYTER
     * * PRESTO
     * * RANGER
     * * SOLR
     * * ZEPPELIN
     * * ZOOKEEPER
     * 
    */
    public List<String> getOptionalComponents() {
        return this.optionalComponents == null ? List.of() : this.optionalComponents;
    }
    /**
     * A list of override and additional properties (key/value pairs)
     * used to modify various aspects of the common configuration files used when creating
     * a cluster. For a list of valid properties please see
     * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
     * 
    */
    public Map<String,String> getOverrideProperties() {
        return this.overrideProperties == null ? Map.of() : this.overrideProperties;
    }
    public Map<String,Object> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageVersion;
        private @Nullable List<String> optionalComponents;
        private @Nullable Map<String,String> overrideProperties;
        private @Nullable Map<String,Object> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersion = defaults.imageVersion;
    	      this.optionalComponents = defaults.optionalComponents;
    	      this.overrideProperties = defaults.overrideProperties;
    	      this.properties = defaults.properties;
        }

        public Builder imageVersion(@Nullable String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public Builder optionalComponents(@Nullable List<String> optionalComponents) {
            this.optionalComponents = optionalComponents;
            return this;
        }
        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }
        public Builder overrideProperties(@Nullable Map<String,String> overrideProperties) {
            this.overrideProperties = overrideProperties;
            return this;
        }
        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = properties;
            return this;
        }        public ClusterClusterConfigSoftwareConfig build() {
            return new ClusterClusterConfigSoftwareConfig(imageVersion, optionalComponents, overrideProperties, properties);
        }
    }
}
