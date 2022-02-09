// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobAgentArgs Empty = new JobAgentArgs();

    @InputImport(name="databaseId", required=true)
    private final Input<String> databaseId;

    public Input<String> getDatabaseId() {
        return this.databaseId;
    }

    @InputImport(name="jobAgentName")
    private final @Nullable Input<String> jobAgentName;

    public Input<String> getJobAgentName() {
        return this.jobAgentName == null ? Input.empty() : this.jobAgentName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public JobAgentArgs(
        Input<String> databaseId,
        @Nullable Input<String> jobAgentName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.jobAgentName = jobAgentName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private JobAgentArgs() {
        this.databaseId = Input.empty();
        this.jobAgentName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseId;
        private @Nullable Input<String> jobAgentName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setDatabaseId(Input<String> databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }

        public Builder setDatabaseId(String databaseId) {
            this.databaseId = Input.of(Objects.requireNonNull(databaseId));
            return this;
        }

        public Builder setJobAgentName(@Nullable Input<String> jobAgentName) {
            this.jobAgentName = jobAgentName;
            return this;
        }

        public Builder setJobAgentName(@Nullable String jobAgentName) {
            this.jobAgentName = Input.ofNullable(jobAgentName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public JobAgentArgs build() {
            return new JobAgentArgs(databaseId, jobAgentName, location, resourceGroupName, serverName, sku, tags);
        }
    }
}
