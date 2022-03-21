// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * ARN of the App Runner service.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
     * 
     */
    @Import(name="autoScalingConfigurationArn")
      private final @Nullable Output<String> autoScalingConfigurationArn;

    public Output<String> getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn == null ? Output.empty() : this.autoScalingConfigurationArn;
    }

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Output<ServiceEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * 
     */
    @Import(name="healthCheckConfiguration")
      private final @Nullable Output<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration;

    public Output<ServiceHealthCheckConfigurationGetArgs> getHealthCheckConfiguration() {
        return this.healthCheckConfiguration == null ? Output.empty() : this.healthCheckConfiguration;
    }

    /**
     * The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * 
     */
    @Import(name="instanceConfiguration")
      private final @Nullable Output<ServiceInstanceConfigurationGetArgs> instanceConfiguration;

    public Output<ServiceInstanceConfigurationGetArgs> getInstanceConfiguration() {
        return this.instanceConfiguration == null ? Output.empty() : this.instanceConfiguration;
    }

    /**
     * An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
     * 
     */
    @Import(name="serviceId")
      private final @Nullable Output<String> serviceId;

    public Output<String> getServiceId() {
        return this.serviceId == null ? Output.empty() : this.serviceId;
    }

    /**
     * Name of the service.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    /**
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
     * 
     */
    @Import(name="serviceUrl")
      private final @Nullable Output<String> serviceUrl;

    public Output<String> getServiceUrl() {
        return this.serviceUrl == null ? Output.empty() : this.serviceUrl;
    }

    /**
     * The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     * 
     */
    @Import(name="sourceConfiguration")
      private final @Nullable Output<ServiceSourceConfigurationGetArgs> sourceConfiguration;

    public Output<ServiceSourceConfigurationGetArgs> getSourceConfiguration() {
        return this.sourceConfiguration == null ? Output.empty() : this.sourceConfiguration;
    }

    /**
     * The current state of the App Runner service.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ServiceState(
        @Nullable Output<String> arn,
        @Nullable Output<String> autoScalingConfigurationArn,
        @Nullable Output<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Output<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration,
        @Nullable Output<ServiceInstanceConfigurationGetArgs> instanceConfiguration,
        @Nullable Output<String> serviceId,
        @Nullable Output<String> serviceName,
        @Nullable Output<String> serviceUrl,
        @Nullable Output<ServiceSourceConfigurationGetArgs> sourceConfiguration,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
        this.encryptionConfiguration = encryptionConfiguration;
        this.healthCheckConfiguration = healthCheckConfiguration;
        this.instanceConfiguration = instanceConfiguration;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceUrl = serviceUrl;
        this.sourceConfiguration = sourceConfiguration;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ServiceState() {
        this.arn = Output.empty();
        this.autoScalingConfigurationArn = Output.empty();
        this.encryptionConfiguration = Output.empty();
        this.healthCheckConfiguration = Output.empty();
        this.instanceConfiguration = Output.empty();
        this.serviceId = Output.empty();
        this.serviceName = Output.empty();
        this.serviceUrl = Output.empty();
        this.sourceConfiguration = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> autoScalingConfigurationArn;
        private @Nullable Output<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Output<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration;
        private @Nullable Output<ServiceInstanceConfigurationGetArgs> instanceConfiguration;
        private @Nullable Output<String> serviceId;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<String> serviceUrl;
        private @Nullable Output<ServiceSourceConfigurationGetArgs> sourceConfiguration;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoScalingConfigurationArn = defaults.autoScalingConfigurationArn;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.healthCheckConfiguration = defaults.healthCheckConfiguration;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder autoScalingConfigurationArn(@Nullable Output<String> autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = autoScalingConfigurationArn;
            return this;
        }
        public Builder autoScalingConfigurationArn(@Nullable String autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = Output.ofNullable(autoScalingConfigurationArn);
            return this;
        }
        public Builder encryptionConfiguration(@Nullable Output<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable ServiceEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder healthCheckConfiguration(@Nullable Output<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }
        public Builder healthCheckConfiguration(@Nullable ServiceHealthCheckConfigurationGetArgs healthCheckConfiguration) {
            this.healthCheckConfiguration = Output.ofNullable(healthCheckConfiguration);
            return this;
        }
        public Builder instanceConfiguration(@Nullable Output<ServiceInstanceConfigurationGetArgs> instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }
        public Builder instanceConfiguration(@Nullable ServiceInstanceConfigurationGetArgs instanceConfiguration) {
            this.instanceConfiguration = Output.ofNullable(instanceConfiguration);
            return this;
        }
        public Builder serviceId(@Nullable Output<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = Output.ofNullable(serviceId);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }
        public Builder serviceUrl(@Nullable Output<String> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder serviceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = Output.ofNullable(serviceUrl);
            return this;
        }
        public Builder sourceConfiguration(@Nullable Output<ServiceSourceConfigurationGetArgs> sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }
        public Builder sourceConfiguration(@Nullable ServiceSourceConfigurationGetArgs sourceConfiguration) {
            this.sourceConfiguration = Output.ofNullable(sourceConfiguration);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public ServiceState build() {
            return new ServiceState(arn, autoScalingConfigurationArn, encryptionConfiguration, healthCheckConfiguration, instanceConfiguration, serviceId, serviceName, serviceUrl, sourceConfiguration, status, tags, tagsAll);
        }
    }
}
