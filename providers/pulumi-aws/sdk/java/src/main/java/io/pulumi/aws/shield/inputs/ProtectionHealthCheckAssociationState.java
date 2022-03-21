// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionHealthCheckAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionHealthCheckAssociationState Empty = new ProtectionHealthCheckAssociationState();

    /**
     * The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
     * 
     */
    @Import(name="healthCheckArn")
      private final @Nullable Output<String> healthCheckArn;

    public Output<String> getHealthCheckArn() {
        return this.healthCheckArn == null ? Output.empty() : this.healthCheckArn;
    }

    /**
     * The ID of the protected resource.
     * 
     */
    @Import(name="shieldProtectionId")
      private final @Nullable Output<String> shieldProtectionId;

    public Output<String> getShieldProtectionId() {
        return this.shieldProtectionId == null ? Output.empty() : this.shieldProtectionId;
    }

    public ProtectionHealthCheckAssociationState(
        @Nullable Output<String> healthCheckArn,
        @Nullable Output<String> shieldProtectionId) {
        this.healthCheckArn = healthCheckArn;
        this.shieldProtectionId = shieldProtectionId;
    }

    private ProtectionHealthCheckAssociationState() {
        this.healthCheckArn = Output.empty();
        this.shieldProtectionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionHealthCheckAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> healthCheckArn;
        private @Nullable Output<String> shieldProtectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionHealthCheckAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckArn = defaults.healthCheckArn;
    	      this.shieldProtectionId = defaults.shieldProtectionId;
        }

        public Builder healthCheckArn(@Nullable Output<String> healthCheckArn) {
            this.healthCheckArn = healthCheckArn;
            return this;
        }
        public Builder healthCheckArn(@Nullable String healthCheckArn) {
            this.healthCheckArn = Output.ofNullable(healthCheckArn);
            return this;
        }
        public Builder shieldProtectionId(@Nullable Output<String> shieldProtectionId) {
            this.shieldProtectionId = shieldProtectionId;
            return this;
        }
        public Builder shieldProtectionId(@Nullable String shieldProtectionId) {
            this.shieldProtectionId = Output.ofNullable(shieldProtectionId);
            return this;
        }        public ProtectionHealthCheckAssociationState build() {
            return new ProtectionHealthCheckAssociationState(healthCheckArn, shieldProtectionId);
        }
    }
}
