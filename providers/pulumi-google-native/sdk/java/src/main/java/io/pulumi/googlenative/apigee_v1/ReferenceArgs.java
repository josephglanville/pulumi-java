// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReferenceArgs Empty = new ReferenceArgs();

    /**
     * Optional. A human-readable description of this reference.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
     */
    @Import(name="refers", required=true)
      private final Output<String> refers;

    public Output<String> getRefers() {
        return this.refers;
    }

    /**
     * The type of resource referred to by this reference. Valid values are 'KeyStore' or 'TrustStore'.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    public ReferenceArgs(
        @Nullable Output<String> description,
        Output<String> environmentId,
        @Nullable Output<String> name,
        Output<String> organizationId,
        Output<String> refers,
        @Nullable Output<String> resourceType) {
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.refers = Objects.requireNonNull(refers, "expected parameter 'refers' to be non-null");
        this.resourceType = resourceType;
    }

    private ReferenceArgs() {
        this.description = Output.empty();
        this.environmentId = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
        this.refers = Output.empty();
        this.resourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> environmentId;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private Output<String> refers;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.refers = defaults.refers;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder refers(Output<String> refers) {
            this.refers = Objects.requireNonNull(refers);
            return this;
        }
        public Builder refers(String refers) {
            this.refers = Output.of(Objects.requireNonNull(refers));
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }        public ReferenceArgs build() {
            return new ReferenceArgs(description, environmentId, name, organizationId, refers, resourceType);
        }
    }
}
