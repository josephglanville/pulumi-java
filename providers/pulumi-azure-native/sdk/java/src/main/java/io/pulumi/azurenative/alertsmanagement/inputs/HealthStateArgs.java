// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.enums.HealthStateName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the health state to alert on and the corresponding severity
 * 
 */
public final class HealthStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthStateArgs Empty = new HealthStateArgs();

    /**
     * Health state name
     * 
     */
    @Import(name="healthStateName", required=true)
      private final Output<Either<String,HealthStateName>> healthStateName;

    public Output<Either<String,HealthStateName>> getHealthStateName() {
        return this.healthStateName;
    }

    /**
     * Severity of alert fired
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Double> severity;

    public Output<Double> getSeverity() {
        return this.severity;
    }

    public HealthStateArgs(
        Output<Either<String,HealthStateName>> healthStateName,
        Output<Double> severity) {
        this.healthStateName = Objects.requireNonNull(healthStateName, "expected parameter 'healthStateName' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
    }

    private HealthStateArgs() {
        this.healthStateName = Codegen.empty();
        this.severity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,HealthStateName>> healthStateName;
        private Output<Double> severity;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStateName = defaults.healthStateName;
    	      this.severity = defaults.severity;
        }

        public Builder healthStateName(Output<Either<String,HealthStateName>> healthStateName) {
            this.healthStateName = Objects.requireNonNull(healthStateName);
            return this;
        }
        public Builder healthStateName(Either<String,HealthStateName> healthStateName) {
            this.healthStateName = Output.of(Objects.requireNonNull(healthStateName));
            return this;
        }
        public Builder severity(Output<Double> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder severity(Double severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }        public HealthStateArgs build() {
            return new HealthStateArgs(healthStateName, severity);
        }
    }
}
