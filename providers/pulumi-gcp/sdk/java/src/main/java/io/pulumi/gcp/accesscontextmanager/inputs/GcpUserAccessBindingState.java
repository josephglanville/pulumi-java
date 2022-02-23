// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GcpUserAccessBindingState extends io.pulumi.resources.ResourceArgs {

    public static final GcpUserAccessBindingState Empty = new GcpUserAccessBindingState();

    /**
     * Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
     * 
     */
    @InputImport(name="accessLevels")
      private final @Nullable Input<String> accessLevels;

    public Input<String> getAccessLevels() {
        return this.accessLevels == null ? Input.empty() : this.accessLevels;
    }

    /**
     * Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
     * 
     */
    @InputImport(name="groupKey")
      private final @Nullable Input<String> groupKey;

    public Input<String> getGroupKey() {
        return this.groupKey == null ? Input.empty() : this.groupKey;
    }

    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Required. ID of the parent organization.
     * 
     */
    @InputImport(name="organizationId")
      private final @Nullable Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId == null ? Input.empty() : this.organizationId;
    }

    public GcpUserAccessBindingState(
        @Nullable Input<String> accessLevels,
        @Nullable Input<String> groupKey,
        @Nullable Input<String> name,
        @Nullable Input<String> organizationId) {
        this.accessLevels = accessLevels;
        this.groupKey = groupKey;
        this.name = name;
        this.organizationId = organizationId;
    }

    private GcpUserAccessBindingState() {
        this.accessLevels = Input.empty();
        this.groupKey = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpUserAccessBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessLevels;
        private @Nullable Input<String> groupKey;
        private @Nullable Input<String> name;
        private @Nullable Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpUserAccessBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.groupKey = defaults.groupKey;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setAccessLevels(@Nullable Input<String> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder setAccessLevels(@Nullable String accessLevels) {
            this.accessLevels = Input.ofNullable(accessLevels);
            return this;
        }

        public Builder setGroupKey(@Nullable Input<String> groupKey) {
            this.groupKey = groupKey;
            return this;
        }

        public Builder setGroupKey(@Nullable String groupKey) {
            this.groupKey = Input.ofNullable(groupKey);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(@Nullable Input<String> organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder setOrganizationId(@Nullable String organizationId) {
            this.organizationId = Input.ofNullable(organizationId);
            return this;
        }
        public GcpUserAccessBindingState build() {
            return new GcpUserAccessBindingState(accessLevels, groupKey, name, organizationId);
        }
    }
}
