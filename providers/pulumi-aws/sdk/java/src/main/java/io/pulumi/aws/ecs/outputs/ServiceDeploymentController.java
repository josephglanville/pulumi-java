// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceDeploymentController {
    /**
     * Type of deployment controller. Valid values: `CODE_DEPLOY`, `ECS`, `EXTERNAL`. Default: `ECS`.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ServiceDeploymentController(@CustomType.Parameter("type") @Nullable String type) {
        this.type = type;
    }

    /**
     * Type of deployment controller. Valid values: `CODE_DEPLOY`, `ECS`, `EXTERNAL`. Default: `ECS`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentController defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentController defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ServiceDeploymentController build() {
            return new ServiceDeploymentController(type);
        }
    }
}
