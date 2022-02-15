// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha2.enums.MembershipInfrastructureType;
import io.pulumi.googlenative.gkehub_v1alpha2.inputs.AuthorityArgs;
import io.pulumi.googlenative.gkehub_v1alpha2.inputs.MembershipEndpointArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    @InputImport(name="authority")
    private final @Nullable Input<AuthorityArgs> authority;

    public Input<AuthorityArgs> getAuthority() {
        return this.authority == null ? Input.empty() : this.authority;
    }

    @InputImport(name="endpoint")
    private final @Nullable Input<MembershipEndpointArgs> endpoint;

    public Input<MembershipEndpointArgs> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    @InputImport(name="externalId")
    private final @Nullable Input<String> externalId;

    public Input<String> getExternalId() {
        return this.externalId == null ? Input.empty() : this.externalId;
    }

    @InputImport(name="infrastructureType")
    private final @Nullable Input<MembershipInfrastructureType> infrastructureType;

    public Input<MembershipInfrastructureType> getInfrastructureType() {
        return this.infrastructureType == null ? Input.empty() : this.infrastructureType;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="membershipId", required=true)
    private final Input<String> membershipId;

    public Input<String> getMembershipId() {
        return this.membershipId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public MembershipArgs(
        @Nullable Input<AuthorityArgs> authority,
        @Nullable Input<MembershipEndpointArgs> endpoint,
        @Nullable Input<String> externalId,
        @Nullable Input<MembershipInfrastructureType> infrastructureType,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        Input<String> membershipId,
        @Nullable Input<String> project) {
        this.authority = authority;
        this.endpoint = endpoint;
        this.externalId = externalId;
        this.infrastructureType = infrastructureType;
        this.labels = labels;
        this.location = location;
        this.membershipId = Objects.requireNonNull(membershipId, "expected parameter 'membershipId' to be non-null");
        this.project = project;
    }

    private MembershipArgs() {
        this.authority = Input.empty();
        this.endpoint = Input.empty();
        this.externalId = Input.empty();
        this.infrastructureType = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.membershipId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorityArgs> authority;
        private @Nullable Input<MembershipEndpointArgs> endpoint;
        private @Nullable Input<String> externalId;
        private @Nullable Input<MembershipInfrastructureType> infrastructureType;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private Input<String> membershipId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.externalId = defaults.externalId;
    	      this.infrastructureType = defaults.infrastructureType;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.membershipId = defaults.membershipId;
    	      this.project = defaults.project;
        }

        public Builder setAuthority(@Nullable Input<AuthorityArgs> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable AuthorityArgs authority) {
            this.authority = Input.ofNullable(authority);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<MembershipEndpointArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable MembershipEndpointArgs endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setExternalId(@Nullable Input<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = Input.ofNullable(externalId);
            return this;
        }

        public Builder setInfrastructureType(@Nullable Input<MembershipInfrastructureType> infrastructureType) {
            this.infrastructureType = infrastructureType;
            return this;
        }

        public Builder setInfrastructureType(@Nullable MembershipInfrastructureType infrastructureType) {
            this.infrastructureType = Input.ofNullable(infrastructureType);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setMembershipId(Input<String> membershipId) {
            this.membershipId = Objects.requireNonNull(membershipId);
            return this;
        }

        public Builder setMembershipId(String membershipId) {
            this.membershipId = Input.of(Objects.requireNonNull(membershipId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public MembershipArgs build() {
            return new MembershipArgs(authority, endpoint, externalId, infrastructureType, labels, location, membershipId, project);
        }
    }
}