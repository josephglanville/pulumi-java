// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.ServiceAwsVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    @InputImport(name="awsvpcConfiguration")
      private final @Nullable Input<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration;

    public Input<ServiceAwsVpcConfigurationArgs> getAwsvpcConfiguration() {
        return this.awsvpcConfiguration == null ? Input.empty() : this.awsvpcConfiguration;
    }

    public ServiceNetworkConfigurationArgs(@Nullable Input<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    private ServiceNetworkConfigurationArgs() {
        this.awsvpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsvpcConfiguration = defaults.awsvpcConfiguration;
        }

        public Builder setAwsvpcConfiguration(@Nullable Input<ServiceAwsVpcConfigurationArgs> awsvpcConfiguration) {
            this.awsvpcConfiguration = awsvpcConfiguration;
            return this;
        }

        public Builder setAwsvpcConfiguration(@Nullable ServiceAwsVpcConfigurationArgs awsvpcConfiguration) {
            this.awsvpcConfiguration = Input.ofNullable(awsvpcConfiguration);
            return this;
        }
        public ServiceNetworkConfigurationArgs build() {
            return new ServiceNetworkConfigurationArgs(awsvpcConfiguration);
        }
    }
}
