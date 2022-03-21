// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery;

import io.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckConfigArgs;
import io.pulumi.aws.servicediscovery.inputs.ServiceHealthCheckCustomConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * The description of the service.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    @Import(name="dnsConfig")
      private final @Nullable Output<ServiceDnsConfigArgs> dnsConfig;

    public Output<ServiceDnsConfigArgs> getDnsConfig() {
        return this.dnsConfig == null ? Output.empty() : this.dnsConfig;
    }

    /**
     * A boolean that indicates all instances should be deleted from the service so that the service can be destroyed without error. These instances are not recoverable.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    @Import(name="healthCheckConfig")
      private final @Nullable Output<ServiceHealthCheckConfigArgs> healthCheckConfig;

    public Output<ServiceHealthCheckConfigArgs> getHealthCheckConfig() {
        return this.healthCheckConfig == null ? Output.empty() : this.healthCheckConfig;
    }

    /**
     * A complex type that contains settings for ECS managed health checks.
     * 
     */
    @Import(name="healthCheckCustomConfig")
      private final @Nullable Output<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig;

    public Output<ServiceHealthCheckCustomConfigArgs> getHealthCheckCustomConfig() {
        return this.healthCheckCustomConfig == null ? Output.empty() : this.healthCheckCustomConfig;
    }

    /**
     * The name of the service.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @Import(name="namespaceId")
      private final @Nullable Output<String> namespaceId;

    public Output<String> getNamespaceId() {
        return this.namespaceId == null ? Output.empty() : this.namespaceId;
    }

    /**
     * A map of tags to assign to the service. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ServiceArgs(
        @Nullable Output<String> description,
        @Nullable Output<ServiceDnsConfigArgs> dnsConfig,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<ServiceHealthCheckConfigArgs> healthCheckConfig,
        @Nullable Output<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> namespaceId,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.dnsConfig = dnsConfig;
        this.forceDestroy = forceDestroy;
        this.healthCheckConfig = healthCheckConfig;
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        this.name = name;
        this.namespaceId = namespaceId;
        this.tags = tags;
    }

    private ServiceArgs() {
        this.description = Output.empty();
        this.dnsConfig = Output.empty();
        this.forceDestroy = Output.empty();
        this.healthCheckConfig = Output.empty();
        this.healthCheckCustomConfig = Output.empty();
        this.name = Output.empty();
        this.namespaceId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<ServiceDnsConfigArgs> dnsConfig;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<ServiceHealthCheckConfigArgs> healthCheckConfig;
        private @Nullable Output<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespaceId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.healthCheckCustomConfig = defaults.healthCheckCustomConfig;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder dnsConfig(@Nullable Output<ServiceDnsConfigArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public Builder dnsConfig(@Nullable ServiceDnsConfigArgs dnsConfig) {
            this.dnsConfig = Output.ofNullable(dnsConfig);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder healthCheckConfig(@Nullable Output<ServiceHealthCheckConfigArgs> healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public Builder healthCheckConfig(@Nullable ServiceHealthCheckConfigArgs healthCheckConfig) {
            this.healthCheckConfig = Output.ofNullable(healthCheckConfig);
            return this;
        }
        public Builder healthCheckCustomConfig(@Nullable Output<ServiceHealthCheckCustomConfigArgs> healthCheckCustomConfig) {
            this.healthCheckCustomConfig = healthCheckCustomConfig;
            return this;
        }
        public Builder healthCheckCustomConfig(@Nullable ServiceHealthCheckCustomConfigArgs healthCheckCustomConfig) {
            this.healthCheckCustomConfig = Output.ofNullable(healthCheckCustomConfig);
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
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = Output.ofNullable(namespaceId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(description, dnsConfig, forceDestroy, healthCheckConfig, healthCheckCustomConfig, name, namespaceId, tags);
        }
    }
}
