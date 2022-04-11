// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details the service to which the subnet is delegated.
 * 
 */
public final class DelegationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelegationArgs Empty = new DelegationArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a subnet. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the service to whom the subnet should be delegated (e.g. Microsoft.Sql/servers).
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public DelegationArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> serviceName,
        @Nullable Output<String> type) {
        this.id = id;
        this.name = name;
        this.serviceName = serviceName;
        this.type = type;
    }

    private DelegationArgs() {
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelegationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelegationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.serviceName = defaults.serviceName;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public DelegationArgs build() {
            return new DelegationArgs(id, name, serviceName, type);
        }
    }
}
