// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayPrivateLinkIpConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private Link Configuration on an application gateway.
 * 
 */
public final class ApplicationGatewayPrivateLinkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayPrivateLinkConfigurationArgs Empty = new ApplicationGatewayPrivateLinkConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * An array of application gateway private link ip configurations.
     * 
     */
    @InputImport(name="ipConfigurations")
      private final @Nullable Input<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations;

    public Input<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
    }

    /**
     * Name of the private link configuration that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApplicationGatewayPrivateLinkConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations,
        @Nullable Input<String> name) {
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
    }

    private ApplicationGatewayPrivateLinkConfigurationArgs() {
        this.id = Input.empty();
        this.ipConfigurations = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPrivateLinkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPrivateLinkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpConfigurations(@Nullable Input<List<ApplicationGatewayPrivateLinkIpConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<ApplicationGatewayPrivateLinkIpConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
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
        public ApplicationGatewayPrivateLinkConfigurationArgs build() {
            return new ApplicationGatewayPrivateLinkConfigurationArgs(id, ipConfigurations, name);
        }
    }
}
