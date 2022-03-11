// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ExternalVpnGatewayInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalVpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayArgs Empty = new ExternalVpnGatewayArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of interfaces on this external VPN gateway.
     * Structure is documented below.
     * 
     */
    @InputImport(name="interfaces")
      private final @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces;

    public Output<List<ExternalVpnGatewayInterfaceArgs>> getInterfaces() {
        return this.interfaces == null ? Output.empty() : this.interfaces;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Indicates the redundancy type of this external VPN gateway
     * Possible values are `FOUR_IPS_REDUNDANCY`, `SINGLE_IP_INTERNALLY_REDUNDANT`, and `TWO_IPS_REDUNDANCY`.
     * 
     */
    @InputImport(name="redundancyType")
      private final @Nullable Output<String> redundancyType;

    public Output<String> getRedundancyType() {
        return this.redundancyType == null ? Output.empty() : this.redundancyType;
    }

    public ExternalVpnGatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> redundancyType) {
        this.description = description;
        this.interfaces = interfaces;
        this.name = name;
        this.project = project;
        this.redundancyType = redundancyType;
    }

    private ExternalVpnGatewayArgs() {
        this.description = Output.empty();
        this.interfaces = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.redundancyType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> redundancyType;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.interfaces = defaults.interfaces;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.redundancyType = defaults.redundancyType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder interfaces(@Nullable Output<List<ExternalVpnGatewayInterfaceArgs>> interfaces) {
            this.interfaces = interfaces;
            return this;
        }

        public Builder interfaces(@Nullable List<ExternalVpnGatewayInterfaceArgs> interfaces) {
            this.interfaces = Output.ofNullable(interfaces);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder redundancyType(@Nullable Output<String> redundancyType) {
            this.redundancyType = redundancyType;
            return this;
        }

        public Builder redundancyType(@Nullable String redundancyType) {
            this.redundancyType = Output.ofNullable(redundancyType);
            return this;
        }
        public ExternalVpnGatewayArgs build() {
            return new ExternalVpnGatewayArgs(description, interfaces, name, project, redundancyType);
        }
    }
}
