// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UptimeCheckConfigResourceGroup {
    /**
     * The group of resources being monitored. Should be the `name` of a group
     * 
     */
    private final @Nullable String groupId;
    /**
     * The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    private final @Nullable String resourceType;

    @CustomType.Constructor
    private UptimeCheckConfigResourceGroup(
        @CustomType.Parameter("groupId") @Nullable String groupId,
        @CustomType.Parameter("resourceType") @Nullable String resourceType) {
        this.groupId = groupId;
        this.resourceType = resourceType;
    }

    /**
     * The group of resources being monitored. Should be the `name` of a group
     * 
    */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigResourceGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }        public UptimeCheckConfigResourceGroup build() {
            return new UptimeCheckConfigResourceGroup(groupId, resourceType);
        }
    }
}
