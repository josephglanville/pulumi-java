// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SharingProfileGroupResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharingProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharingProfileResponse Empty = new SharingProfileResponse();

    @InputImport(name="groups", required=true)
    private final List<SharingProfileGroupResponse> groups;

    public List<SharingProfileGroupResponse> getGroups() {
        return this.groups;
    }

    @InputImport(name="permissions")
    private final @Nullable String permissions;

    public Optional<String> getPermissions() {
        return this.permissions == null ? Optional.empty() : Optional.ofNullable(this.permissions);
    }

    public SharingProfileResponse(
        List<SharingProfileGroupResponse> groups,
        @Nullable String permissions) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.permissions = permissions;
    }

    private SharingProfileResponse() {
        this.groups = List.of();
        this.permissions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SharingProfileGroupResponse> groups;
        private @Nullable String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.permissions = defaults.permissions;
        }

        public Builder setGroups(List<SharingProfileGroupResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setPermissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }

        public SharingProfileResponse build() {
            return new SharingProfileResponse(groups, permissions);
        }
    }
}
