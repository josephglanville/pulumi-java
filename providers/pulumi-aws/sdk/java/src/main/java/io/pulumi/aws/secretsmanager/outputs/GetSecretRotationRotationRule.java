// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSecretRotationRotationRule {
    private final Integer automaticallyAfterDays;

    @CustomType.Constructor
    private GetSecretRotationRotationRule(@CustomType.Parameter("automaticallyAfterDays") Integer automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    public Integer getAutomaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretRotationRotationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer automaticallyAfterDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretRotationRotationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticallyAfterDays = defaults.automaticallyAfterDays;
        }

        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
            return this;
        }        public GetSecretRotationRotationRule build() {
            return new GetSecretRotationRotationRule(automaticallyAfterDays);
        }
    }
}