// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ProtectionHealthCheckAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionHealthCheckAssociationArgs Empty = new ProtectionHealthCheckAssociationArgs();

    /**
     * The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
     * 
     */
    @InputImport(name="healthCheckArn", required=true)
      private final Output<String> healthCheckArn;

    public Output<String> getHealthCheckArn() {
        return this.healthCheckArn;
    }

    /**
     * The ID of the protected resource.
     * 
     */
    @InputImport(name="shieldProtectionId", required=true)
      private final Output<String> shieldProtectionId;

    public Output<String> getShieldProtectionId() {
        return this.shieldProtectionId;
    }

    public ProtectionHealthCheckAssociationArgs(
        Output<String> healthCheckArn,
        Output<String> shieldProtectionId) {
        this.healthCheckArn = Objects.requireNonNull(healthCheckArn, "expected parameter 'healthCheckArn' to be non-null");
        this.shieldProtectionId = Objects.requireNonNull(shieldProtectionId, "expected parameter 'shieldProtectionId' to be non-null");
    }

    private ProtectionHealthCheckAssociationArgs() {
        this.healthCheckArn = Output.empty();
        this.shieldProtectionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionHealthCheckAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> healthCheckArn;
        private Output<String> shieldProtectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionHealthCheckAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckArn = defaults.healthCheckArn;
    	      this.shieldProtectionId = defaults.shieldProtectionId;
        }

        public Builder healthCheckArn(Output<String> healthCheckArn) {
            this.healthCheckArn = Objects.requireNonNull(healthCheckArn);
            return this;
        }

        public Builder healthCheckArn(String healthCheckArn) {
            this.healthCheckArn = Output.of(Objects.requireNonNull(healthCheckArn));
            return this;
        }

        public Builder shieldProtectionId(Output<String> shieldProtectionId) {
            this.shieldProtectionId = Objects.requireNonNull(shieldProtectionId);
            return this;
        }

        public Builder shieldProtectionId(String shieldProtectionId) {
            this.shieldProtectionId = Output.of(Objects.requireNonNull(shieldProtectionId));
            return this;
        }
        public ProtectionHealthCheckAssociationArgs build() {
            return new ProtectionHealthCheckAssociationArgs(healthCheckArn, shieldProtectionId);
        }
    }
}
