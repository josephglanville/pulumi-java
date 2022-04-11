// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppRelayServiceConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppRelayServiceConnectionSlotArgs Empty = new WebAppRelayServiceConnectionSlotArgs();

    @Import(name="biztalkUri")
      private final @Nullable Output<String> biztalkUri;

    public Output<String> getBiztalkUri() {
        return this.biztalkUri == null ? Codegen.empty() : this.biztalkUri;
    }

    @Import(name="entityConnectionString")
      private final @Nullable Output<String> entityConnectionString;

    public Output<String> getEntityConnectionString() {
        return this.entityConnectionString == null ? Codegen.empty() : this.entityConnectionString;
    }

    @Import(name="entityName")
      private final @Nullable Output<String> entityName;

    public Output<String> getEntityName() {
        return this.entityName == null ? Codegen.empty() : this.entityName;
    }

    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname == null ? Codegen.empty() : this.hostname;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    @Import(name="resourceConnectionString")
      private final @Nullable Output<String> resourceConnectionString;

    public Output<String> getResourceConnectionString() {
        return this.resourceConnectionString == null ? Codegen.empty() : this.resourceConnectionString;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Codegen.empty() : this.resourceType;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will create or update a hybrid connection for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> getSlot() {
        return this.slot;
    }

    public WebAppRelayServiceConnectionSlotArgs(
        @Nullable Output<String> biztalkUri,
        @Nullable Output<String> entityConnectionString,
        @Nullable Output<String> entityName,
        @Nullable Output<String> hostname,
        @Nullable Output<String> kind,
        Output<String> name,
        @Nullable Output<Integer> port,
        @Nullable Output<String> resourceConnectionString,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceType,
        Output<String> slot) {
        this.biztalkUri = biztalkUri;
        this.entityConnectionString = entityConnectionString;
        this.entityName = entityName;
        this.hostname = hostname;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = port;
        this.resourceConnectionString = resourceConnectionString;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceType = resourceType;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppRelayServiceConnectionSlotArgs() {
        this.biztalkUri = Codegen.empty();
        this.entityConnectionString = Codegen.empty();
        this.entityName = Codegen.empty();
        this.hostname = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.port = Codegen.empty();
        this.resourceConnectionString = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceType = Codegen.empty();
        this.slot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppRelayServiceConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> biztalkUri;
        private @Nullable Output<String> entityConnectionString;
        private @Nullable Output<String> entityName;
        private @Nullable Output<String> hostname;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> resourceConnectionString;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceType;
        private Output<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppRelayServiceConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biztalkUri = defaults.biztalkUri;
    	      this.entityConnectionString = defaults.entityConnectionString;
    	      this.entityName = defaults.entityName;
    	      this.hostname = defaults.hostname;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.resourceConnectionString = defaults.resourceConnectionString;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceType = defaults.resourceType;
    	      this.slot = defaults.slot;
        }

        public Builder biztalkUri(@Nullable Output<String> biztalkUri) {
            this.biztalkUri = biztalkUri;
            return this;
        }
        public Builder biztalkUri(@Nullable String biztalkUri) {
            this.biztalkUri = Codegen.ofNullable(biztalkUri);
            return this;
        }
        public Builder entityConnectionString(@Nullable Output<String> entityConnectionString) {
            this.entityConnectionString = entityConnectionString;
            return this;
        }
        public Builder entityConnectionString(@Nullable String entityConnectionString) {
            this.entityConnectionString = Codegen.ofNullable(entityConnectionString);
            return this;
        }
        public Builder entityName(@Nullable Output<String> entityName) {
            this.entityName = entityName;
            return this;
        }
        public Builder entityName(@Nullable String entityName) {
            this.entityName = Codegen.ofNullable(entityName);
            return this;
        }
        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Codegen.ofNullable(hostname);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder resourceConnectionString(@Nullable Output<String> resourceConnectionString) {
            this.resourceConnectionString = resourceConnectionString;
            return this;
        }
        public Builder resourceConnectionString(@Nullable String resourceConnectionString) {
            this.resourceConnectionString = Codegen.ofNullable(resourceConnectionString);
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
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Codegen.ofNullable(resourceType);
            return this;
        }
        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }        public WebAppRelayServiceConnectionSlotArgs build() {
            return new WebAppRelayServiceConnectionSlotArgs(biztalkUri, entityConnectionString, entityName, hostname, kind, name, port, resourceConnectionString, resourceGroupName, resourceType, slot);
        }
    }
}
