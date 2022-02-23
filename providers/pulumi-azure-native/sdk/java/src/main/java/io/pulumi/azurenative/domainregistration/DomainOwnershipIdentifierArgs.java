// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainOwnershipIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainOwnershipIdentifierArgs Empty = new DomainOwnershipIdentifierArgs();

    /**
     * Name of domain.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of identifier.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Ownership Id.
     * 
     */
    @InputImport(name="ownershipId")
      private final @Nullable Input<String> ownershipId;

    public Input<String> getOwnershipId() {
        return this.ownershipId == null ? Input.empty() : this.ownershipId;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DomainOwnershipIdentifierArgs(
        Input<String> domainName,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> ownershipId,
        Input<String> resourceGroupName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.kind = kind;
        this.name = name;
        this.ownershipId = ownershipId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DomainOwnershipIdentifierArgs() {
        this.domainName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.ownershipId = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainOwnershipIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownershipId;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainOwnershipIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.ownershipId = defaults.ownershipId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setOwnershipId(@Nullable Input<String> ownershipId) {
            this.ownershipId = ownershipId;
            return this;
        }

        public Builder setOwnershipId(@Nullable String ownershipId) {
            this.ownershipId = Input.ofNullable(ownershipId);
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
        public DomainOwnershipIdentifierArgs build() {
            return new DomainOwnershipIdentifierArgs(domainName, kind, name, ownershipId, resourceGroupName);
        }
    }
}
