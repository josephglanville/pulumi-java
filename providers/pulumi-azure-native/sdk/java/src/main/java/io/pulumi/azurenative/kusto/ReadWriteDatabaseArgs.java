// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadWriteDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReadWriteDatabaseArgs Empty = new ReadWriteDatabaseArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    @InputImport(name="hotCachePeriod")
      private final @Nullable Output<String> hotCachePeriod;

    public Output<String> getHotCachePeriod() {
        return this.hotCachePeriod == null ? Output.empty() : this.hotCachePeriod;
    }

    /**
     * Kind of the database
     * Expected value is 'ReadWrite'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    @InputImport(name="softDeletePeriod")
      private final @Nullable Output<String> softDeletePeriod;

    public Output<String> getSoftDeletePeriod() {
        return this.softDeletePeriod == null ? Output.empty() : this.softDeletePeriod;
    }

    public ReadWriteDatabaseArgs(
        Output<String> clusterName,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> hotCachePeriod,
        Output<String> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> softDeletePeriod) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.databaseName = databaseName;
        this.hotCachePeriod = hotCachePeriod;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.softDeletePeriod = softDeletePeriod;
    }

    private ReadWriteDatabaseArgs() {
        this.clusterName = Output.empty();
        this.databaseName = Output.empty();
        this.hotCachePeriod = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.softDeletePeriod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadWriteDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> hotCachePeriod;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> softDeletePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadWriteDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.databaseName = defaults.databaseName;
    	      this.hotCachePeriod = defaults.hotCachePeriod;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.softDeletePeriod = defaults.softDeletePeriod;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }

        public Builder hotCachePeriod(@Nullable Output<String> hotCachePeriod) {
            this.hotCachePeriod = hotCachePeriod;
            return this;
        }

        public Builder hotCachePeriod(@Nullable String hotCachePeriod) {
            this.hotCachePeriod = Output.ofNullable(hotCachePeriod);
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder softDeletePeriod(@Nullable Output<String> softDeletePeriod) {
            this.softDeletePeriod = softDeletePeriod;
            return this;
        }

        public Builder softDeletePeriod(@Nullable String softDeletePeriod) {
            this.softDeletePeriod = Output.ofNullable(softDeletePeriod);
            return this;
        }
        public ReadWriteDatabaseArgs build() {
            return new ReadWriteDatabaseArgs(clusterName, databaseName, hotCachePeriod, kind, location, resourceGroupName, softDeletePeriod);
        }
    }
}
